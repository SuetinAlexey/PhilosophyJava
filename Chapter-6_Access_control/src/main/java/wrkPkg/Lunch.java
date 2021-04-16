package wrkPkg;
// спецификаторы доступа для классов
// Использование конструкторов объявленных private,
// делает класс недоступным при создании объектов

import javax.xml.parsers.SAXParser;

class  Soup1 {
    private Soup1(){}
    //Разрешаем создание объектов в статическом методе:
    public static Soup1 makeSoup(){
        return new Soup1();
    }
}

class Soup2 {
    private Soup2(){}
    // Создаем один статический объект
    // и по требованию возвращщаем ссылку на него.
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }
    public void f(){};
}

public class Lunch {
    void testPrivate(){
        // Запрещено, так как конструктор объявлен приватным
        //Soup1 soup1 = new Soup1();
    }
    void testStatic(){
        Soup1 soup1 = Soup1.makeSoup();
    }
    void testSingleton(){
        Soup2.access().f();
    }
}
