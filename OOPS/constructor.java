public class constructor {
    public static void main (String args[]){
        Student s1= new Student();
        // System.out.println(s1.name);
        
    }


}

class Student{
    String name;
    int UID;
    
    Student(){
       System.out.println("No paramterized constructor is being called");

    }
}