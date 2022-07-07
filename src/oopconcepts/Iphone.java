package oopconcepts;

public class Iphone {
    int price;
    String color;
    String storage;
    String camPixel;
    String version;

    public Iphone(int price, String color, String storage, String camPixel, String version) {
        this.price = price;
        this.color = color;
        this.storage = storage;
        this.camPixel = camPixel;
        this.version = version;
    }

    Iphone() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void photo(){
        System.out.println("Good");
    }
    public void sound(){
        System.out.println("10db");
    }
}
