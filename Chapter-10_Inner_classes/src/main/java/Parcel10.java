// Использование "инициализации экземпляра" для выполнения
// конструирования в анонимном внутреннем классе.

public class Parcell0 {
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
}
