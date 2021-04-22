package wrkPkg;

enum  Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument{
    void play(Note n) {
        System.out.println("Instrument.play()" + n);
    }
    String what() {
        return "Instrument";
    }
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}

// объекты wrkPkg.Wind также являются объектами wrkPkg.Instrument,
// поскольку имеют тот же интерфейс:
class Wind extends Instrument {
    void play(Note n){
        System.out.println("Wind.play() " + n);
    }
    String what() {
        return "Wind";
    }
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}

// наследование и восходящее преобразование
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args){
        Wind flute = new Wind();
        tune(flute);
    }
}
