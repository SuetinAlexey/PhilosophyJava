package wrkPkg;

enum  Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument{
    public void play(Note n) {
        System.out.println("wrkPkg.Instrument.play()");
    }
}

// объекты wrkPkg.Wind также являются объектами wrkPkg.Instrument,
// поскольку имеют тот же интерфейс:
class Wind extends Instrument {
    public void play(Note n){
        System.out.println("wrkPkg.Wind.play() " + n);
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
