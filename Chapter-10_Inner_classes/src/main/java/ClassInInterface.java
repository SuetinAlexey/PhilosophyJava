// Классы внутри интерфейсов

public interface ClassInInterface {
    void howdy();
    class test implements ClassInInterface{
        public void howdy(){
            System.out.println("Привет!");
        }
        public static void main(String[] args){
            new test().howdy();
        }
    }
}
