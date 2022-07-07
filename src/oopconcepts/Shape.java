
package oopconcepts;

public class Shape {
    public void area(int a){
        System.out.println(a*a);        //Polimorphism
    }
    
    public void area(int a , int b){
        System.out.println(a*b);
    }
    
    public void area(int a , int b , int c){
        System.out.println(a*b*c);
    }
}
