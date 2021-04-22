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

}
