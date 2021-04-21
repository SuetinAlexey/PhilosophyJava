package wrkPkg;

class Engine {
    public void start() {}; // запустить
    public void rev() {}; // переключить
    public void stop() {}; // остановить
}

// колесо
class Wheel{
    public void inflate (int psi) {} //накачать
}

// окно
class Window{
    public void rollup() {}; // поднять
    public void rolldown() {}; // опустить
}

// дверь
class Door {
    public Window window = new Window(); // окно двери
    public void open() {}; // открыть
    public void close() {}; // закрыть
}

// машина
public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
        left = new Door(),
        right = new Door();
    public Car() {
        for (int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }
    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
    }

}
