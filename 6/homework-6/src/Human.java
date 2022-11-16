import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    String[][] schedule;

    public Human(String name, String surname, int year, int iq, Family family, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.family = family;
        this.schedule = schedule;
    }
    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }
    public Human(String name, String surname, int year, Family family){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.family = family;
    }
    public Human(){

    }
    public String getFullName(){
        return this.name+" "+this.surname;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setFamily(Family family){
        this.family = family;
    }
    public void setSchedule(String [][] schedule){
        this.schedule = schedule;
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public void greetPet(){
        System.out.printf("Привет, %s", this.family.getPetNickname());
    }
    public void describePet(){
        String trickeryLevel = this.family.getPetTrickeryLevel()>50?"очень хитрый":"почти не хитрый";

        System.out.println("У меня есть "+this.family.getPetSpecies()+ ", ему "+this.family.getPetAge()+" он " + trickeryLevel);
    }

    @Override
    protected void finalize() {
        System.out.println(this + "removed");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && name.equals(human.name) && surname.equals(human.surname) && family.equals(human.family) && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, family);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }
}
