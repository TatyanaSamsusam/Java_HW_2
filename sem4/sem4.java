package sem4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class sem4 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        LinkedList<Integer> ids = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean exit = true;
            while(exit) {
            System.out.println("enter a name: ");
            String str = scanner.nextLine();
            System.out.println("enter an age: ");
            int i = scanner.nextInt();
            name.add(str);
            age.add(i);
            System.out.println("user id: "+ name.get(name.size()-1).hashCode());
            System.out.println("want to quit? (y/n)");
            scanner.nextLine(); 
            String ex = scanner.nextLine();
            if (ex.equals("y")){
                exit = false;
            }
        }
        for (int i = 0; i < name.size(); i++) {
            ids.add(i);
        }
        for (int id : ids) {
            System.out.println("name: " + name.get(id) + " age: " + age.get(id) + " id: " + name.get(id).hashCode());
        }
        
        System.out.println("users below 40: ");
        int i = 0;
        while(i<name.size()) {
            int a = age.get(i);
            if (a<40) {
                System.out.println("name: " + name.get(i) + " age: " + age.get(i) + " id: " + name.get(i).hashCode());
            }
            i++;
        } 
    }
}
