// Доступ к объекту внешнего класса

public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }
    public class Inner {
        public DotThis outer(){
            return DotThis.this; // ссылка на объект внешнего класса
            // "this" без уточнения соответсвует объекту Inner
        }
    }
    public Inner inner(){
        return new Inner();
    }
    public static void main(String[] args){
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();

    }
}
