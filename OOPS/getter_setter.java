public class getter_setter{
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.getColor());

    


    }
}

class Pen {
    String color;
    int tip;

    // Fixed the case sensitivity typo here (newColor -> newcolor)

    String getColor(){
        return this.color;
    }

    void setColor(String newcolor) {
        color = newcolor; 
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
