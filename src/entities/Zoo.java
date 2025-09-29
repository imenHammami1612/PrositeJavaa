package entities;
public class Zoo {
    // instruction 5
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrCages;
    private int nbrAnimals;
    private final int NBR_CAGES = 25;
    
    
 public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("⚠️ Le nom du zoo ne peut pas être vide. Valeur remplacée par 'ZooSansNom'.");
            this.name = "ZooSansNom";
        } else {
            this.name = name;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrCages() {
        return nbrCages;
    }

    public void setNbrCages(int nbrCages) {
        this.nbrCages = nbrCages;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }













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

    
    //inst10: ajouter animal
            public boolean addAnimal(Animal animal) {
                if (isZooFull()) {
                    System.out.println("le zoo est plein ");
                    return false;
                }
                if (searchAnimal(animal) != -1) {
                    System.out.println("l'animal existe déjà ");
                    return false;
                }
                animals[nbrAnimals++] = animal;
                System.out.println("animal ajouté avec succès ");
                return true;
            }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
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