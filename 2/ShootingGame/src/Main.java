import java.lang.Math;
import java.util.*;
class Main{
    public static void main(String args[]){
        String [][] gameMap = {
                {"-","-","-","-","-"},
                {"-","-","-","-","-"},
                {"-","-","-","-","-"},
                {"-","-","-","-","-"},
                {"-","-","-","-","-"},
        };
        int [] randomGoal = {(int)(Math.ceil(Math.random()*gameMap.length)), (int)(Math.ceil(Math.random()*gameMap.length))};

        System.out.println("All set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);
        boolean isGame = true;

        while(isGame){
            System.out.println("Let's try to find the target. Enter X coordinate (from 1 to 5)");
            int x = 0,y=0;
            while(!scanner.hasNextInt() ){
                System.out.println("Oops, it seems that you've entered not a number, please, try again!");
                scanner.next();
            }

            if(scanner.hasNextInt()){
                x = scanner.nextInt()-1;
                while(x<0 || x>5 ){
                    System.out.println("Incorrect diapason!");
                    System.out.println("Let's try again. Enter X coordinate (from 1 to 5)");
                    x = scanner.nextInt()-1;
                }

                System.out.println("Very good. Now enter the Y coordinate (from 1 to 5 from UP to DOWN)");
                    y = scanner.nextInt()-1;
                while(y<0 || y>5 ){
                    System.out.println("Incorrect diapason!");
                    System.out.println("Let's try again. Enter the Y coordinate (from 1 to 5 from UP to DOWN)");
                    y = scanner.nextInt()-1;
                }

                    if(x == randomGoal[1] && y == randomGoal[0]){
                        System.out.println("You have won!");
                        gameMap[y][x] = "x";
                        String []stringArr = Arrays.deepToString(gameMap).split("],", 6);
                        System.out.println("  1, 2, 3, 4, 5");
                        int counter = 1;
                        for(String str: stringArr){
                            str = str.replace("[","");
                            System.out.println(counter+":"+str);
                            counter++;
                        }
                        isGame = false;

                    }
                    else{
                        gameMap[y][x] = "*";
                        String []stringArr = Arrays.deepToString(gameMap).split("],", 6);
                        int counter = 1;
                        System.out.println("  1, 2, 3, 4, 5");
                        for(String str: stringArr){
                            String newStr = str.replace("[","").replace("]","");
                            System.out.println(counter+":"+newStr);
                            counter++;

                        }
                    }

            }
        };
    }
}