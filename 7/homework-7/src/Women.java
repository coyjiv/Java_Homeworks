import java.util.HashMap;

public final class Women extends  Human{
    public Women(String name, String surname, int year, int iq, Family family, HashMap<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, family, schedule);
    }

    public Women(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Women(String name, String surname, int year, Family family) {
        super(name, surname, year, family);
    }


    public void greetPet(){
        System.out.println("А кто у нас такая бусечка маленькая?");
    }
    public void makeup(){
        System.out.println("Самое время навести красоту...");
    }
}
