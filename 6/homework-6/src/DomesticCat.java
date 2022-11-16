public class DomesticCat extends Pet implements IPet{
    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
    }

    public DomesticCat(String nickname) {
        super(nickname);
    }

    public DomesticCat() {
    }

    public void respond(){
        System.out.printf("Мур, привет, мур, хозяин. Я - %s. Я соскучился!", this.getNickname());
    }
    public void foul(){
        System.out.println("Интересно, как эта кружка с водой будет выглядеть на полу...");
    }
}
