public class Animal {
    // instruction 5 
    String family;
    String name;
    int age;
    boolean isMammal;

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