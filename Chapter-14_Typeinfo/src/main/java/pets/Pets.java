package pets;

import java.util.ArrayList;
import java.util.List;

public class Pets extends PetCreator{
    public Pets() {}
    // public List<Class<? extends Pet>> types(){return super.types();};
    public List<Class<? extends Pet>> types() {return types;}
    private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
    public ArrayList<Pet> arrayList(int size) {return super.arrayList(size);}

    // додумать!!!!
}
