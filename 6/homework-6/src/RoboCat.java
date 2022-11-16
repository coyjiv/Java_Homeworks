public class RoboCat extends Pet implements IPet{
    public RoboCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    public RoboCat(String nickname) {
        super(nickname);
    }

    public RoboCat() {
    }

    public void respond(){
        System.out.println("10001111 11100000 10101000 10100010 10100101 11100010 00101100 00100000 11100101 10101110 10100111 11101111 10101000 10101101 00101110");
        System.out.printf("Я - %s. Я соскучился!", this.getNickname());
    }
    public void foul(){
        System.out.println("*PROTECTED*");
    }
}
