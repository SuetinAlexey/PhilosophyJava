package wrkPkg;

class Supper {
    public int field = 0;
    public int getField() {
        return field;
    }
}

class Sub extends Supper {
    public int field = 1;
    public int getField(){
        return field;
    }
    public int getSupperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Supper sup = new Sub(); // upcast
        System.out.println("sup.field = " + sup.field + ", sup.GetField = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " + sub.field + ", sub.GetField = " + sub.getField() +
                ", sub.getSupperField() = " + sub.getSupperField());
    }
}
