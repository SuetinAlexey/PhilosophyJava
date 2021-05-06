// Использование "инициализации экземпляра" для выполнения
// конструирования в анонимном внутреннем классе.

public class Parcel10 {
    public Destination destination(final String dest, final Float price){
        return new Destination() {
            private int cost;
            // инициализация экземпляра для каждого объекта
            {
                cost = Math.round(price);
                if (cost > 100 )
                    System.out.println("Превышение бюджета");
            }
            private String label = dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }
    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Танзания", 101.395F);
        System.out.println(d.readLabel());
    }
}
