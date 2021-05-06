// Вложенные классы могут обращаться ко всем членам
// всех уровней классов, в которые они вложены.

class MNA{
    private void f(){
        System.out.println("MNA f()");
    }
    class A{
        private void g(){
            System.out.println("MNA.A g()");
        }
        public class B{
            void h(){
                System.out.println("MNA.A.B h()");
                g();
                f();
            }
        }
    }
}

public class MultiNestingAccess {
    public static void main(String[] args){
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
