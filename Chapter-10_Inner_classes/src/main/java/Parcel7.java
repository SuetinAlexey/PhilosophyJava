// Возвращение экземпляра анонимного внутреннего класса.

public class Parcel7 {
    public Contents contents() {
        return new Contents() { // вставка определения класса
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }
}
