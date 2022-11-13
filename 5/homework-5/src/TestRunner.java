import org.junit.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestRunner {
    private Human mother;
    private Human father;
    private Human child;
    private Human child2;
    private Family family;
    private Pet pet;
    @Before
    public void init(){
        mother = new Human("Alexandra", "Belyk", 35);
        father = new Human("Igor", "Belyk", 40);
        child = new Human("Katya", "Belyk", 1);
        child2 = new Human("Oleg", "Belyk", 12);
        family = new Family(mother, father);
        family.addChild(child);
        pet = new Pet(Species.FISH,"Leyla" );
    }
    @After
    public void tearDown() {
        mother = null;
        father = null;
        family = null;
        pet = null;
        child = null;
        child2 = null;
    }

    @Test
    public void testToString() {
        assertEquals("Human{" +
                "name='" + "Alexandra" + '\'' +
                ", surname='" + "Belyk" + '\'' +
                '}', mother.toString() );
    }

    @Test
    public void deleteChildTestIndex(){
        Family family = new Family(mother, father);
        int expectLength = 1;
        family.addChild(child);
        family.addChild(child);
        family.deleteChild(0);
        int actualLength = family.getCountChildren();
        assertEquals(expectLength, actualLength);
    }

    @Test
    public void deleteChildTestObj(){

        Family family = new Family(mother, father);
        int expectLength = 1;
        family.addChild(child);
        family.addChild(child2);
        assertTrue(family.deleteChild(child));
        int actualLength = family.getCountChildren();
        assertEquals(expectLength, actualLength);
    }
    @Test
    public void getCountFamily() {
        Family family = new Family(mother, father);
        family.addChild(child);
        family.addChild(child2);
        int actualCount = family.countFamily();
        Assert.assertEquals(4, actualCount);
    }


}
