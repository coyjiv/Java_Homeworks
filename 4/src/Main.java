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
//        Human mother1 = new Human("Alexandra", "Belyk", 23);
//        Human father1 = new Human("Igor", "Belyk", 20);
//        Family family1 = new Family(mother1, father1);
//        System.out.println(family1.toString());
//        family1.addChild(new Human("Malysh", "Djo", 5));
//        family1.addChild(new Human("Petya", "Stilet", 5));
//        System.out.println(family1.toString());

        String[][] schedule = new String[][]{{"Monday", "work"}, {"Tuesday", "gym"}, {"Wednesday", "cafe"}, {"Thursday", "free time"}, {"Friday", "go to pharmacy"}, {"Saturday", "visit doctor"}, {"Sunday", "visit gallery"}};
        Pet pet = new Pet("cat", "Masya", 6, 100, new String[]{"eat", "sleep"});
        Human mother = new Human("Alexandra", "Belyk", 35);
        Human father = new Human("Igor", "Belyk", 40);
        Human child = new Human("Katya", "Belyk", 1);
        Human child2 = new Human("Oleg", "Belyk", 12);
        Human child3 = new Human("Petro", "Belyk", 22);
        Human child4 = new Human("Dmytro", "Belyk", 17);
        Human child5 = new Human("Petya", "Belyk", 19);
        Human child6 = new Human("Olya", "Belyk", 2);

        Family family = new Family(mother, father);
        family.setPet(pet);
        System.out.println(family.toString());
        family.addChild(child);
        family.addChild(child2);
        family.addChild(child3);
        family.addChild(child4);
        family.addChild(child5);
        family.addChild(child6);
        System.out.println("children added");
        System.out.println(family.toString());

        System.out.println("Family count: "+family.countFamily());
        family.deleteChild(0);
        family.deleteChild(2);
        family.deleteChild(4);
        family.deleteChild(3);
        System.out.println(family.toString());
    }
}