import java.util.*;
import java.util.stream.Collectors;

public class Family {
    Human mother;
    Human father;
    ArrayList<Human> children;
    HashSet<Pet> pets = new HashSet<Pet>();

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.mother.setFamily(this);
        this.father.setFamily(this);
        this.children = new ArrayList<Human>();
    }

    public String getPetNickname(Pet pet) {
        return pet.getNickname();
    }

    public int getPetTrickeryLevel(Pet pet) {
        return pet.getTrickeryLevel();
    }

    public String getPetSpecies(Pet pet) {
        return pet.getSpecies().name();
    }

    public int getPetAge(Pet pet) {
        return pet.getAge();
    }

    public void addPet(Pet newPet) {
        if (newPet != null) {
            pets.add(newPet);
        }
    }
    public void removePet(Pet pet){
        this.pets.add(pet);
    }
    public void setPets(HashSet<Pet> pets) {
        this.pets = pets;
    }

    public void addChild(Human child) {
        child.setFamily(this);
        children.add(child);
    }

    public void deleteChild(int index) {
        if (children.size()-1>index) {
            children.remove(index);
        }
    }

    public boolean deleteChild(Human child) {
        return children.remove(child);
    }

    public ArrayList<Human> getChildren() {
        return this.children;
    }

    public int countFamily() {
        int count = 2;
        for (Human child : this.children) {
            count += 1;
        }
        return count;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.toString() +
                ", father=" + father.toString() +
                ", children=" + children.stream().map(Object::toString)
                .collect(Collectors.joining(", ")) +
                ", pet=" + pets +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) && father.equals(family.father) && children.equals(family.children) && Objects.equals(pets, family.pets);
    }

    @Override
    protected void finalize() {
        System.out.println(this + "removed");
    }

    @Override
    public int hashCode() {
        return Objects.hash(mother, father, children, pets);
    }

    public int getCountChildren() {
        return this.children.size();
    }
}
