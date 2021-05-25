package holding;

import java.util.Arrays;
import java.util.List;

class Snow {};
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
    public static void main(String[] args){
        List<Snow> show2 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        // не откомпилируется
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
    }

}
