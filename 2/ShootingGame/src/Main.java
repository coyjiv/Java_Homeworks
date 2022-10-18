import java.lang.Math;
import java.util.*;
class Main{
    public static void main(String args[]){
        String [][] gameMap = {
                {"0","1","2","3","4","5"},
                {"1","-","-","-","-","-"},
                {"2","-","-","-","-","-"},
                {"3","-","-","-","-","-"},
                {"4","-","-","-","-","-"},
                {"5","-","-","-","-","-"},
        };
        int [] randomGoal = {(int)(Math.ceil(Math.random()*gameMap.length)), (int)(Math.ceil(Math.random()*gameMap.length))};

        System.out.println("All set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);
        boolean isGame = true;

        while(isGame){
            System.out.println("Let's try to find the target. Enter vertical coordinate (from 1 to 5)");

            if(scanner.hasNextInt()){
                int x = scanner.nextInt();
                if(x>5 || x<1){
                    System.out.println("Incorrect diapason");
                    x = scanner.nextInt();
                }

                System.out.println("Very good. Now enter the horizontal coordinate (from 1 to 5)");
                int y;
                if(!scanner.hasNextInt()){
                    System.out.println("Oops, it seems that you've entered incorrect number, please, try again!");
                    scanner.next();
                }
                else{
                    y = scanner.nextInt();
                    if(y>5 || y<1){
                        System.out.println("Incorrect diapason");
                       y = scanner.nextInt();
                    }

                    if(y == randomGoal[0] && x == randomGoal[1]){
                        System.out.println("You have won!");
                        gameMap[x][y] = "x";
                        String []stringArr = Arrays.deepToString(gameMap).split("],", 6);

                        for(String str: stringArr){
                            System.out.println(str);
                        }
                        isGame = false;

                    }
                    else{
                        gameMap[x][y] = "*";
                        String []stringArr = Arrays.deepToString(gameMap).split("],", 6);

                        for(String str: stringArr){
                            System.out.println(str);
                        }
                    }
                }
            }










        };
    }
}