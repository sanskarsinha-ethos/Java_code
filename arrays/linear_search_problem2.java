package arrays;

public class linear_search_problem2 {
    public static String menusearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return key+" is present at index: "+i;
            }
        }
        return "false";
    }
    public static void main(String args[]){
        String menu[]={"pizza","pasta","burger","Samose"};
        String key= "burger";
        String answer=menusearch(menu,key);
        if(answer.equals("false")){
            System.out.println(key+" is not present in the menu");
        }else{
            System.out.println(answer);
        }
        }
    }
