class Student{
    private String name;
    private int age;
    private int marks;


//getter to read value
public String getname(){
    return name;
}
//setter to write  name
public void setname(String name){
    this.name=name;
}

//getter fo age 
public int getage(){
    return age;
}
//setter for age
public void setage(int age){
    this.age=age;
}

//getter for marks
public int getmarks(){
    return marks;
}
//setter for marks
public void setmarks(int marks){
    if(marks>=0&&marks<=100){
    this.marks=marks;
    }else{
        System.out.println("invalid marks");
    }
}
}
public class Encapsulation{
    public static void main(String[] args) {
        
        Student s = new Student();
        s.setname("praveen");
        s.setage(23);
        s.setmarks(100);

        System.out.println("the name is "+s.getname());
        System.out.println("the age is "+s.getage());
        System.out.println("the marks is "+s.getmarks());

    }
}