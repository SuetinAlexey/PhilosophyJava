package wrkPkg;

import wrkPkg.Instrument;
import wrkPkg.Note;

class Stringed extends Instrument {
    public void play(Note n) {
        System.out.println("wrkPkg.Stringed.play()" + n);
    }
}

public class Music2 {
}
