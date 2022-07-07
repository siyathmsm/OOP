package oopconcepts;

public class Student {
   private int id;
   private String name;
   private int grade;
   private String address;
   private int maths;
   private int science;

    public Student(int id, String name, int grade, String address, int maths, int science) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.address = address;
        this.maths = maths;
        this.science = science;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }
    
   
}
