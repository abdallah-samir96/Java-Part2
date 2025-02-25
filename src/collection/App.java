package collection;

import java.util.*;


public class App {
    public static void main(String[] args) {

/*
        List<Integer> list = new LinkedList<>();
        list.add(100);
        list.add(200);
        list.add(300);

        for (Integer item: list) {
            System.out.println(item);
        }
*/

        /*
        Set<String> set = new HashSet<>();
        set.add("Hello");
        set.add("Hello");
        set.add("Hello");
        set.add("Hello");
        set.add("World");
        for (String item: set) {
            System.out.println(item);
        }


         */

        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("5", "onec");
        map.put("2", "two");


        for (String item: map.keySet()) {
            System.out.println(item);
        }


        User user = new User("Abdallah", "abc");

        List<User> users = new ArrayList<>();
        users.add(user);


    }
}
class User{
    String name;
    String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}