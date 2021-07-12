package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {

// add method is used to add elements to an arrayList
        List list = new ArrayList();
        list.add("Max");
        list.add("Mariia");
        //System.out.println(list);

        // remove method is used to remove el from an arraylist
        list.remove("Max");
        // System.out.println(list);

        list.size(); // returns the int of how many el currently in array list

        list.clear(); // will remove all elements from arraylist

        // Adding elements from array to arrayList
        String[] names = {"Max", "Mariia", "John", "Jack"};
        ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList(names));
        // System.out.println(listOfNames);

        // checking if certain element is present in arrayList
        LearnArrayList.addNameToTheList("Marusea");
    }

    // checking if certain element is present in arrayList
    public static void addNameToTheList(String name) {
        ArrayList<String> names = new ArrayList<>();
        if (!names.contains(name)){
            System.out.println("Name is added to the list");
            names.add(name);
        }else {
            System.out.println("Name is in the list");
        }
        System.out.println(names);
    }
}
