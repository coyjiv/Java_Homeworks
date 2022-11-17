import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {

        String[][] schedule = new String[][]{{DayOfWeek.MONDAY.name(), "work"}, {DayOfWeek.THURSDAY.name(), "gym"}, {DayOfWeek.WEDNESDAY.name(), "cafe"}, {DayOfWeek.THURSDAY.name(), "free time"}, {DayOfWeek.FRIDAY.name(), "go to pharmacy"}, {DayOfWeek.SATURDAY.name(), "visit doctor"}, {DayOfWeek.SUNDAY.name(), "visit gallery"}};
        Pet pet = new DomesticCat("Masya", 6, 100, new HashSet<String>(Arrays.asList("eat", "sleep")));
        Human mother = new Women("Alexandra", "Belyk", 35);
        Human father = new Men("Igor", "Belyk", 40);
        Human child = new Human("Katya", "Belyk", 1);
        Human child2 = new Human("Oleg", "Belyk", 12);
        Human child3 = new Human("Petro", "Belyk", 22);
        Human child4 = new Human("Dmytro", "Belyk", 17);
        Human child5 = new Human("Petya", "Belyk", 19);
        Human child6 = new Human("Olya", "Belyk", 2);

        Family family = new Family(mother, father);
        family.addPet(pet);
        System.out.println(family.toString());
        family.addChild(child);
        family.addChild(child2);
        family.addChild(child3);
        family.addChild(child4);
        family.addChild(child5);
        family.addChild(child6);
        System.out.println("children added");
        System.out.println(family.toString());
        System.out.println(new Dog("dogger" ).toString());
        System.out.println("Family count: "+family.countFamily());
        family.deleteChild(0);
        family.deleteChild(2);
        family.deleteChild(4);
        family.deleteChild(3);
        System.out.println(family.toString());

        JUnitCore runner = new JUnitCore();
        Result result = runner.run(TestRunner.class);
        System.out.println("run tests: " + result.getRunCount());
        System.out.println("failed tests: " + result.getFailureCount());
        System.out.println("ignored tests: " + result.getIgnoreCount());
        System.out.println("success: " + result.wasSuccessful());
    }
}