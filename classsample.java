public class ClassSample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        System.out.println("Name: " + myDog.name);
        System.out.println("Breed: " + myDog.breed);
        System.out.println("Age: " + myDog.age);
        System.out.println("Color: " + myDog.color);
        myDog.barks();
    }
}

class Dog {
    public String name = "Charlie";
    public String breed = "Labrador";
    public int age = 3;
    public String color = "Black";

    public void barks() {
        System.out.println("The dog barks");
    }
}