package CLASSROOM;

import java.util.ArrayList;

public class main_Classroom {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
            items.add("One");
            items.add("Two");
            items.add("Three");
        for (int i = 0;
             i < items.size(); i++) {
            System.out.println(items.get(i));
        }

        items.remove(2);
        for (String str: items) {
            System.out.println(str);
        }
    }

}
