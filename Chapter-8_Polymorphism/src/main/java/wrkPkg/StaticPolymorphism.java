package wrkPkg;

class StaticSupper {
    public static String staticGet() {
        return "Базовая версия staticGet()";
    }
    public String dynamicGet() {
        return "Базовая версия dynamicGet";
    }
}

class StaticSub extends StaticSupper {
    public static String staticGet() {
        return "Производная версия staticGet";
    }
    public String dynamicGet() {
        return "Производная версия dynamicGet";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSupper sup = new StaticSub(); // восходящее преобразование
        System.out.println(sup.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
