// При использовании конкретных или абстрактных классов
// внутренние классы предоставляют единственный способ
// провести "множественное наследование реализации".

package innerclasses;

class D{}
abstract class E{
    void tst(){
        System.out.println("Class E");
    }
}
class Z extends D{
    E makeE(){
        return new E() { };
    }
}

public class MultiImplementation {
    static void takesD(D d) {}
    static void takesE(E e) {
        System.out.println("takesE");
    }
    public static void main(String[] args){
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
        E e = z.makeE();
        e.tst();

    }
}