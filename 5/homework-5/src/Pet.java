import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String [] habits;

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet(Species species, String nickname){
        this.species = species;
        this.nickname = nickname;
    }
    public Pet(){

    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public Species getSpecies(){
        return this.species;
    }

    public int getTrickeryLevel() {
        return trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setSpecies(String species) {
        this.species = Species.valueOf(species);
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat(){
        System.out.println("Я кушаю!");
    }
    public void respond(){
        System.out.printf("Привет, хозяин. Я - %s. Я соскучился!", this.nickname);
    }
    public void foul(){
        System.out.println("Нужно хорошо замести следы...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits);
    }

    @Override
    protected void finalize() {
        System.out.println(this + "removed");
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    @Override
    public String toString(){
        Pet pet = new Pet(this.species, this.nickname, this.age, this.trickLevel, this.habits);
        return this.species+ "{nickname='"+this.nickname+"', age="+this.age+", trickLevel="+this.trickLevel+", habits="+ Arrays.toString(this.habits)+"}";
    }
}
