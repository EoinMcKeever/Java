import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class States {
    public static void main(String[] args) throws Exception{
        Map<String, String> stateCapitals = new HashMap<>();
        Scanner sc = new Scanner(
                new BufferedReader(new FileReader("States.txt")));
// go through the file line by line
        while (sc.hasNextLine()) {
            String currentLine = sc.nextLine();
            String[] splitList = currentLine.split("::");
            stateCapitals.put(splitList[0],splitList[1]);

        }
        System.out.println(stateCapitals.keySet());
        System.out.println(stateCapitals.size());


    }

}
