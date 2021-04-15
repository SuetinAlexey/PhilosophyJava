package wrkPkg;

// При вызове конструктора для создания объекта
// Window выводится сообщение:

class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1); // Перед конструктором
    House (){
        //Показывает, что выполняется конструктор
        System.out.println("House() ");
        w3 = new Window(33); // Повторная инициализация w3
    }
    Window w2 = new Window(2); // После конструктора
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(33);
}




public class OrderOfInitialization {
}
