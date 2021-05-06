// Пример конкретного приложения на основе системы
// управления, все находится в одном классе. Внутренние
// классы дают возможность инкапсулировать различную
// функциональность для каждого отдельного события,

package сontroller;

public class GreenhouseControls extends Controller{
    private boolean light = false;
    public class LightOn extends Event{
        public LightOn(long delayTime) {
            super(delayTime);
        }
        public void action(){
            // Поместите сюда код управления оборудованием
            // выполняющий непосредственное включение света
            light = true;
        }
        public String toString() {
            return "Свет включен";
        }
    }
    public class LightOff extends Event{
        public LightOff(long delayTime) {
            super(delayTime);
        }
        public void action(){
            // Поместите сюда код управления оборудованием
            // выполняющий выключение света
            light = false;
        }
        public String toString(){
            return "Свет выключен";
        }
    private boolean water = false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime) {
            super(delayTime);
        }
        public void action(){
            // Здесь размещается код управления оборудованием
            water = true;
        }
        public String toString(){
            return "Полив включен";
        }
    }


    }



}
