public class sample1 {
    public static void main(String args[]) {
        Pen p1 = new Pen(); /// created a pen object called p1
        Student s1 = new Student();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(4);
        System.out.println(p1.tip);
    }
}

class Pen {
    String color;
    int tip;

    // Fixed the case sensitivity typo here (newColor -> newcolor)
    void setColor(String newcolor) {
        color = newcolor; 
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    int cllass; // Kept your custom spelling to avoid conflicting with the 'class' keyword

    void setAge(int newAge) {
        age = newAge;
    }

    void setClass(int newClass) {
        cllass = newClass;
    }
}