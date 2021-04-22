package wrkPkg;
// Нисходящее преобразование и динамическое определение типов

class Useful {
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful {
    public void f() {}
    public void g() {}
    public void u() {}
    public void v() {}
    public void w() {}
}

public class RTTI {
    public static void main(String[] args){
        Useful[] x = {
                new Useful(),
                new MoreUseful()};
        x[0].f();
        x[1].g();
        //x[1].u(); метод не найден в классе Useful
        ((MoreUseful)x[1]).u(); // ниcходящее преобразование
        //((MoreUseful)x[0]).u(); // Происходит исключение
    }

}

