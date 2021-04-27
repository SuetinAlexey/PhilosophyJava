//Использование нескольких интерфейсов.

interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

class ActionCharacte {
    public void fight() {};
}

class Hero extends ActionCharacte
  implements CanFight, CanSwim, CanFly {
    public void swim() {};
    public void fly() {};
}

public class Adventure {
    public static void t(CanFight x){
        x.fight();
    }
    public static void u(CanSwim x){
        x.swim();
    }
    public static void v(CanFly x){
        x.fly();
    }
    public static void w(ActionCharacte x){
        x.fight();
    }
    public static void main(String[] args){
        Hero h = new Hero();
        t(h); // Используем объект в качестве типа CanFight
        u(h); // Используем объект в качестве типа CanSwim
        v(h); // Используем объект в качестве типа CanFly
        w(h); // Используем объект в качестве ActionCharacter
    }
}
