public class Fish extends Pet {
    public Fish(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    public Fish(String nickname) {
        super(nickname);
    }

    public Fish() {
    }

    public void respond() {
        System.out.printf("Буль-буль. Я - %s.", this.getNickname());
    }
}
