package interfaceprocessor;

public abstract class StringProcessor implements Processor {
    public String name(){ return getClass().getSimpleName(); }
    public abstract String process(Object input);
    public static String s = "If she weighs the same as a duck, she's made of wood";
    public static void main(String[] args) {
        Apply.process1(new Upcase(), s);
        Apply.process1(new DownCase(), s);
    }
}

class Upcase extends StringProcessor {
    public String process (Object input) { // ковариантный возвращаемый тип
        return ((String)input).toUpperCase();
    }
}

class DownCase extends StringProcessor {
    public String process (Object input) {
        return ((String)input).toLowerCase();
    }
}