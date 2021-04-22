package wrkPkg;

class Percussion extends Instrument{
    void play(Note n) {
        System.out.println("Percusion.play() " + n);
    }
    String what() {
        return "Percussion";
    }
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}

class Woodwind extends Wind {
    void play(Note n) {
        System.out.println("Woodwind.play " + n);
    }
    String what(){
        return "Woodwind";
    }
}

public class Music3 {
    // работа метода не зависит от фактического типа объекта
    // поэтому типы, доставленные в систему, будут работать правильно
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e){
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args){
        // восходящее преобразование при добавлении в массив:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
