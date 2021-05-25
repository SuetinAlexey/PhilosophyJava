package holding;

import java.util.*;

class Snow {};
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}

public class AsListInference {
    public static void main(String[] args){
        List<Snow> show2 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        // не откомпилируется (но у меня компилируется)
        List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
        // У Collection addAll() проблем нет:
        List<Snow> snow3 = new ArrayList<Snow>();
        Collections.addAll(snow3, new Light(), new Heavy());

        // подсказка с явным указанием типа
        List<Snow> snow4 = Arrays.<Snow>asList( new Light(), new Heavy());
    }

}
