import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {};
        String [][] questions = {{"When did the World War II begin? (year)", "1939"}, {"When the first version of HTML was written?", "1993"}, {"At what year Apple showed first iPhone?", "2007"}, {"At what year USA dropped an atomic bomb on Hiroshima and Nagasaki", "1945"}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        boolean isGameRunning = true;
//        int randomNumber = (int)(Math.random()*100);
        int randomNumber = (int)(Math.random()* questions.length);
        int year = parseInt(questions[randomNumber][1]);
        String question = questions[randomNumber][0];

        System.out.println("Let the game begin!");
        System.out.println(question);
        while(isGameRunning){
            System.out.println("Please, enter your guess: ");
            if(scanner.hasNextInt()){
                int enteredNum = scanner.nextInt();
                numbers = addX(numbers.length, numbers, enteredNum);
                if(enteredNum<year){
                    System.out.println("Your number is too small. Please, try again.");
                }
                else if(enteredNum>year){
                    System.out.println("Your number is too big. Please, try again.");
                }
                else if(enteredNum == year){
                    System.out.println("Congratulations, " + name + "!");
                    Arrays.sort(numbers);
                    System.out.println("Your numbers: " + Arrays.toString(numbers));
                    isGameRunning = false;
                }
            }
            else{
                System.out.println("Oops! It seems that you've entered not a number, please, try again!");
                scanner.next();
            }
        }
    }
    public static int[] addX(int n, int arr[], int x)
    {
        int i;

        int[] newarr = new int[n + 1];

        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }

}