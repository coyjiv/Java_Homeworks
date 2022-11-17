import java.util.HashMap;

public final class Men extends Human{
    public Men(String name, String surname, int year, int iq, Family family, HashMap<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, family, schedule);
    }

    public Men(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Men(String name, String surname, int year, Family family) {
        super(name, surname, year, family);
    }

    public Men() {
    }

    public void greetPet(){
        System.out.println("Привет, дружок");
    }
    public void repairCar(){
        System.out.println("Пойду что-ли чинить свою тарантайку...");
    }
}
