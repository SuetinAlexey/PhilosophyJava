//Локальные внутренние классы

interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;
    Counter getCounter(final String name){
        // локальный внутренний класс
        class LocalCounter implements Counter{
            public LocalCounter(){
                // У локального внутреннего класса может быть собственный конструктор.
                System.out.println("LocalCounter()");
            }
            public int next(){
                System.out.println(name); // неизменный аргумент
                return count++;
            }
        }
        return new LocalCounter();
    }
    // то же самое с анонимным внутренним классом
    Counter getCounter2(final String name){
        return new Counter() {
            // Анонимный внутренний класс не может содержать именованного конструктора,
            // только инициализатор экземпляра
            {
                System.out.println("Counter()");
            }
            @Override
            public int next() {
                System.out.println(name); // неизменный аргумент
                return count++;
            }
        };
    }
    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Локальный"),
                c2 = lic.getCounter2("Анонимный");
        for (int i = 0; i < 5; i++)
            System.out.println(c1.next());
        for (int i=0; i<5; i++)
            System.out.println(c2.next());
    }
}
