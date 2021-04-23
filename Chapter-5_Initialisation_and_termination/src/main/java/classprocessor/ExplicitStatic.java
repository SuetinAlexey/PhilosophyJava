package classprocessor;

class Cup {
    Cup(int marker){
        System.out.println("Cup("+marker+")");
    }
    void f(int marker){
        System.out.println("f("+marker+")");
    }
}

class Cups {
    static Cup Cup1;
    static Cup Cup2;
    static {
        Cup1 = new Cup(1);
        Cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Insaid main()");
        Cups.Cup1.f(99);
    }
    static Cups cups1 = new Cups();

}
