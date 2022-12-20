import java.util.*;
// %1$b
public class StudentQuizGrades {

    private Map<String, List<Integer>> students = new HashMap<>();

    public void studentAverageGrade(String studentName) {
        double average = 0;
        int count = 0;

        for (Integer p: students.get(studentName)){
            average += p;
            count += 1;
        }

        System.out.println(studentName + "'s average grade is:");
        System.out.println(average/count);

        }

    public void studentGrades(String studentName){
        System.out.println(students.get(studentName));

    }

    public void remove(String studentName){
        students.remove(studentName);
    }

    public void view(){
        System.out.println(students);
    }

    public void add(){
        UserIO object = new IO();
        while (true) {
            String studentName = object.readString("Enter Students Name");
            List<Integer> gradeList = new ArrayList<>();
            while (true) {
                int grade = object.readInt("Enter Grade", 0, 100);
                gradeList.add(grade);
                int enterAgain = object.readInt("Enter 1 to enter another grade. Enter any other digit to exit");
                if (enterAgain == 1) continue;
                break;
            }
            int enterAgain = object.readInt("Enter 1 to enter another student. Enter any other digit to exit");
            students.put(studentName, gradeList);
            if (enterAgain == 1) continue;
            break;
    }
    }
        public void classAverageGrades(){
            Set<String> keys = students.keySet();
            for (String s: keys){
                double average = 0;
                int count = 0;
                for (int i=0;i<students.get(s).size();i++){
                    average +=  students.get(s).get(i);
                    count += 1;
                }
                System.out.println(s + "'s average grade is:");
                average = average/count;
                System.out.println(average);

            }

        }

}


