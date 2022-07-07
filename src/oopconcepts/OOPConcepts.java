package oopconcepts;
public class OOPConcepts {
public static void main(String[] args) {
        Student std1 = new Student(1 , "Siyath" , 13 , "Trinco" , 95 , 90);
        Student std2 = new Student(2 , "Suhail" , 10 , "Colombo" , 90 , 80);
        
       // System.out.println(std1.getScience() + std1.getMaths());
       std1.setMaths(100);        //update variable
       System.out.println(std1.getMaths());
       
       //getters setters get set are the encapsulation methods
    }
    
}
