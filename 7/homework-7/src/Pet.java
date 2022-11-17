import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public abstract class Pet {
    private Species species = Species.UNKNOWN;
    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet<String> habits;

    public Pet(String nickname, int age, int trickLevel, HashSet<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet(String nickname){
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

    public HashSet<String> getHabits() {
        return habits;
    }

    public void setSpecies(Species species) {
        this.species = species;
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

    public void setHabits(HashSet<String> habits) {
        this.habits = habits;
    }

    public void eat(){
        System.out.println("Я кушаю!");
    }
    public abstract void respond();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && species == pet.species && nickname.equals(pet.nickname) && habits.equals(pet.habits);
    }

    @Override
    protected void finalize() {
        System.out.println(this + "removed");
    }


    @Override
    public int hashCode() {
        return Objects.hash(species, nickname, age, trickLevel, habits);
    }
}
