import java.util.Arrays;
import java.util.Objects;

public class Family {
    Human mother;
    Human father;
    Human[] children;
    Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.mother.setFamily(this);
        this.father.setFamily(this);
        this.children = new Human[0];
    }

    public String getPetNickname(){
        return this.pet.getNickname();
    }
    public int getPetTrickeryLevel(){
        return this.pet.getTrickeryLevel();
    }
    public String getPetSpecies(){
        return this.pet.getSpecies();
    }
    public int getPetAge(){
        return this.pet.getAge();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public void addChild(Human child){
        child.setFamily(this);
        if(this.children.length == 0){
            this.children = new Human[]{child};
        }
        else{
            Human[] copy = new Human[children.length+1];
            System.arraycopy(children, 0, copy, 0, children.length);
            copy[copy.length-1] = child;
            children = copy;
        }
    }
    public boolean deleteChild(int index){
        if(children.length == 0){
            return false;
        }
        Human[] copy = Arrays.copyOf(children, children.length-1);
        for(int i=0, k=0;i<children.length;i++){
            if(i!=index && k< copy.length){
                copy[k]=children[i];
                k++;
            }
        }
        children = copy;
        return true;
    }
    public int countFamily(){
        int count = 0;
        for (Human child : this.children) {
            if (child != null) {
                count += 1;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.toString() +
                ", father=" + father.toString() +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return mother.equals(family.mother) && father.equals(family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }
}
