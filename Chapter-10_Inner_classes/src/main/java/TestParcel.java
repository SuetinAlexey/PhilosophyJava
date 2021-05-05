class Parcel4 {
    private class PContents implements Contents{
        private int i = 11;
        public int value() {
            return i;
        }
    }
    protected class PDestionation implements Destination {
        private String label;
        private PDestionation(String whereTo) {
            label = whereTo;
        }
        public String readLabel() {
            return label;
        }
    }
    public Destination destination(String s){
       return new PDestionation(s);
    }
    public Contents contents() {
        return new PContents();
    }
}

public class TestParcel {
    public static void main(String args[]){
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Танзания");
        //обращение к закрытому класу невозможно
        //Parcel4.PContents pc = p.new PContents();
        System.out.println(d.readLabel());
        System.out.println(c.value());
    }
}
