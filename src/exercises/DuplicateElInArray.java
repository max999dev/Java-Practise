package exercises;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElInArray {
    // how to find the duplicate elements in an array
    public static void main(String[] args) {


        String[] prLanguages = {"Java", "Python", "JavaScript", "C", "Java", "C"};
        // Compare each element
        for (int i = 0; i < prLanguages.length; i++) {
            for (int j = i + 1; j < prLanguages.length; j++) {
                if (prLanguages[i].equals(prLanguages[j])) {
                   // System.out.println("duplicate element is " + prLanguages[i]);
                }
            }
        }
        // using hashSet
//        Set<String> store = new HashSet<>();
//
//        for (String language : prLanguages) {
//            if (!store.add(language)) {
//                //System.out.println("The duplicate is " + language);
//            }
//        }
//        System.out.println(store);
//       // using hashMap
//        Map<String,Integer> storeMap = new HashMap<>();
//
//        for(String name : prLanguages){
//            Integer count = storeMap.get(name);
//            if(count == null){
//                storeMap.put(name,1);
//            }else{
//                storeMap.put(name,++ count);
//            }
//        }
//        // get the values from this hashmap
//        Set<Map.Entry<String,Integer>> entrySet = storeMap.entrySet();
    }
}
