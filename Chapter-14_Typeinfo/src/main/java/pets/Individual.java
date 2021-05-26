package pets;

public class Individual {
    private static long counter = 0;
    private final long id = counter++;
    private String name;
    public Individual() {};
    public Individual(String name) {
        this.name = name;
    }
    public String toString(){
        return getClass().getSimpleName()+(name == null ? " ": " " + name );
    }
    public long id(){return id;}

}
