import java.util.Arrays;
import java.util.Scanner;

public class TaskPlanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";

        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";

        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to work; watch a show";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "draw a painting";

        schedule[4][0] = "Thursday";
        schedule[4][1] = "go to the gym";

        schedule[5][0] = "Friday";
        schedule[5][1] = "play the guitar";

        schedule[6][0] = "Saturday";
        schedule[6][1] = "go to the gym";

        boolean isRunning = true;
        while(isRunning){
            System.out.println("Please, input the day of the week:");
            String day;
            day = capitalize(scanner.nextLine().trim());
            switch (day){
                case "Monday" :
                    System.out.println("Your tasks for Monday: " + schedule[1][1]);
                    break;
                case "Tuesday":
                    System.out.println("Your tasks for Tuesday: " + schedule[2][1]);
                    break;
                case "Wednesday":
                    System.out.println("Your tasks for Wednesday: " + schedule[3][1]);
                    break;
                case "Thursday":
                    System.out.println("Your tasks for Thursday: " + schedule[4][1]);
                    break;
                case "Friday":
                    System.out.println("Your tasks for Friday: " + schedule[5][1]);
                    break;
                case "Saturday":
                    System.out.println("Your tasks for Saturday: " + schedule[6][1]);
                    break;
                case "Sunday":
                    System.out.println("Your tasks for Sunday: " + schedule[0][1]);
                    break;
                case "exit":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    break;
            }
        }
        System.out.println(Arrays.deepToString(schedule));
    }
    public static String capitalize(String str)
    {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
