package fileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("Kyle");
        list.add("Luna");
        list.add("Dani");
        list.add("Alvaro");
        System.out.println(list);
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) == 'A'){
                System.out.println();
            }
        }
    }
}
