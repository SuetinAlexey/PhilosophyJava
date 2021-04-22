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
}
