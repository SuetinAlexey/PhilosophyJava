package classprocessor;


class Person {
    public void eat(Apple aplle) {
        Apple peeled = aplle.getPeeled();
        System.out.println("Yummy");
    }
}

class Peller {
    static Apple peel(Apple apple) {
        return apple;
    }
}

class Apple {
    Apple getPeeled(){
        return Peller.peel(this);
    }
}

public class App {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }
}
