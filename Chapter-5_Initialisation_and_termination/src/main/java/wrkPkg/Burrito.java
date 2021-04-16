package wrkPkg;

enum Speciness {
    NOT, MILD, MEDIUM, HOT, FLAMING
}

public class Burrito {
    Speciness degree;

    public Burrito(Speciness degree) { //конструктор
        this.degree = degree;
    }

    public void describe() {
        System.out.print("This burrito is ");
        switch (degree) {
            case HOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot.");
                break;
            case NOT:
            case FLAMING:
            default:
                System.out.println("maybe to hot.");
        }
    }

    public static void main(String[] args) {
        Burrito
                plain = new Burrito(Speciness.NOT),
                greenChile = new Burrito(Speciness.MEDIUM),
                jalapeno = new Burrito(Speciness.HOT);
        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
