package interfaceprocessor;

public class Apply {
    public static void process1 (Processor p, Object s){
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(s));
    }
}
