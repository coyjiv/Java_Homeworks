import java.util.HashSet;

public class Dog extends Pet implements IPet{
    public Dog(String nickname, int age, int trickLevel, HashSet<String> habits) {
        super(nickname, age, trickLevel, habits);
    }

    public Dog(String nickname) {
        super(nickname);
    }

    public Dog() {
    }

    public void respond(){
        System.out.printf("Гав-гав, Привет, хозяин. Я - %s. Я соскучился!", this.getNickname());
    }
    public void foul(){
        System.out.println("Кусать подушку очень весело...");
    }
}
