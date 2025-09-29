public class Zoo {
    // instruction 5
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    int nbrAnimals;
    //inst14
    final int NBR_CAGES = 25;
    
    
    // instruction 6 : Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
        this.nbrAnimals = 0;
    }

    

    public Zoo() {

    }

    // instruction 8 : Méthode pour afficher les infs du zoo
    public void displayZoo() {
        System.out.println("Zoo: " + name);
        System.out.println("Ville: " + city);
        System.out.println("Nombre de cages: " + nbrCages);

       System.out.println("Nombre d'animaux: " + nbrAnimals);

    }

    // instruction 9 :affichage direct
    public String toString() {
        return "Zoo: " + name + ", Ville: " + city + ", nombre de cages: " + nbrCages;
    }

    
    //instruction10: ajouter animal
    public boolean addAnimal(Animal animal) {

        if (nbrAnimals >= nbrCages) {
            System.out.println("zoo est plein .");
            return false;
        }

        //inst12 
        if (searchAnimal(animal) != -1) {
            System.out.println("existe deja ");
            return false;
        }
        
        animals[nbrAnimals] = animal;
        nbrAnimals++; 
        
        System.out.println("animal ajouter avec succee");
        return true;
    }



    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equalsIgnoreCase(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    //inst13 : supprimer animal

        public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index == -1) {
            System.out.println("Animal non trouvé dans le zoo.");
            return false;
        }

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;

        System.out.println("Animal supprimé avec succès !");
        return true;
    }
 
    //ins15 : Vérifier si le zoo est plein
    public boolean isZooFull() {
        return nbrAnimals >= NBR_CAGES;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals) {
            return z1;
        } else {
            return z2;
        }
    }
}