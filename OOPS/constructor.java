public class constructor {
    public static void main (String args[]){
        Student s1= new Student("Sanskar");
        System.out.println(s1.name);
        
    }


}

class Student{
    String name;
    int UID;
    
    Student(String name){
        this.name=name;

    }
}