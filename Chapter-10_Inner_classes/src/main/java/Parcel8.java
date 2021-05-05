// вызов конструктора с аргументом
public class Parcel8 {
    public Wrapping wrapping(int x){
        //вызов конструктора базового класса
        return new Wrapping(x){// передача аргументов конструктору
            public int value(){
                return super.value()*47;
            }
        };
    }
    public static void main(String[] args){
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
        System.out.println(w.value());
    }
}
