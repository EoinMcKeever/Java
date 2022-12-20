import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StateCapitalApp {


    public static void main(String[] args) throws Exception {
        Map<String, Capital> stateCapitals = new HashMap<>();
        Scanner sc = new Scanner(
                new BufferedReader(new FileReader("States.txt")));
// go through the file line by line
        while (sc.hasNextLine()) {
            int i = 1;
            String currentLine = sc.nextLine();
            String[] splitList = currentLine.split("::");
            stateCapitals.put(splitList[0], new Capital(splitList[1],splitList[2],splitList[3]));
        }

        for(String s : stateCapitals.keySet()){
            System.out.println(s + " :State     " + stateCapitals.get(s).getName() + " :Name     " + stateCapitals.get(s).getPopulation() + " :Population     " +
                    stateCapitals.get(s).getSquareMileage() + " :Square Mileage");



        }

        System.out.println(stateCapitals.size());

    }
}
