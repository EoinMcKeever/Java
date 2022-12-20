//hashmap extends AbstractMap
//Treemap extends abstractMap

import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        TreeMap<String,String> dict = new TreeMap<String, String> ();
        dict.put("Brave", "ready to face");
        dict.put("Brave2", "ready to face2");
        dict.put("Brave3", "ready to face3");
        System.out.println(dict);
        for(String word: dict.descendingKeySet()) {
            System.out.println(word);
        }
    }
}
