package interfaceprocessor;

public abstract class StringProcessor implements Processor {
    public String name(){
        return getClass().getSimpleName();
    }
    public abstract String process();
    public static String s = "If she weighs the same as a duck, she's made of wood";
    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
    }
}
