package arrays;

public class Array_as_function_argument {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }

    }
    public static void main(String args[]){
        int marks []={67,68,69};
        update(marks);
        for(int i=0;i<marks.length;i++){
            System.out.println("marks: "+marks[i]);

        }
        System.out.print(marks.length);

    }
}
