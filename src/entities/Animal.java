package entities;
public class Animal {
    // instruction 5 
 private String family;
private String name;
private int age;
private boolean isMammal;


 public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("age negatif non accepte");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }






















    public Animal() {

    }
    // instruction 6 : constructeur parametree
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }


    // instruction 8 : mmeth affichage les infos dun animal
    public void displayAnimal() {
        System.out.println("animal: " + name);
        System.out.println("famille: " + family);
        System.out.println("age: " + age + " ans");
        System.out.println("mammifère: " + (isMammal ? "Oui" : "Non"));
    }

    // instruction 9 : Méthode toString 
    public String toString() {
        return "Animal: " + name + ", Famille: " + family +
                ", Age: " + age + " ans, Mammifère: " + (isMammal ? "Oui" : "Non");
    }
}