package wrkPkg;

import javax.xml.soap.SAAJResult;

class Art {
    Art() {
        System.out.println("Конструктор Art");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Конструктор Drawing");
    }
}

public class Cartoon {
    public Cartoon() {
        System.out.println("Конструктор Cartoon");
    }
    public static void main(String[] args){
        Cartoon x = new Cartoon();
    }
}
