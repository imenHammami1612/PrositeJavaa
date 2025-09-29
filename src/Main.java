import java.util.Scanner;

import entities.Animal;
import entities.Zoo;

public class Main {
    public static void main(String[] args) {

        ZooManagement zoo = new ZooManagement();

        //afficher les infos initiales
        System.out.println("les infos initials :");
        zoo.afficherInfo();

        Scanner sc = new Scanner(System.in);

        // demmander newname
        System.out.print("saisir le nom du zoo : ");
        String nouveauNom = sc.nextLine();


        // demmander nbcages
        System.out.print("saisir le nombre de cages : ");
                System.out.print("saisir le nombre de cages : ");

        int nouveauNbrCages = sc.nextInt();



        // mettre à jour les informations du zoo
        zoo.setZooName(nouveauNom);
        zoo.setNbrCages(nouveauNbrCages);

        // afficher les informations mises à jour
        System.out.println("informations mise ajour :");
        zoo.afficherInfo();

        sc.close();

     //prosit2

        // Instruction 5 : Créer deux objets
        System.out.println("\nInstruction 5 :");

        // Créer un animal
        Animal lion = new Animal("sauvage", "lucky", 5, true);
     

        // Créer un zoo
                Zoo myZoo = new Zoo("Mon Zoo", "Tunis", 20);

     
        System.out.println("creation des objet sans constructeurparame done");

        // Instruction 6 : Créer des animaux avec le constructeur paramétré
        System.out.println("\nInstruction 6:");
        Animal chat = new Animal("chats", "snow", 10, true);
        Animal chien = new Animal("chiens", "alfa", 3, true);
        System.out.println(" créer des animaux avec le constructeur paramétré done");

        // remarque :Sans constructeur 5 lignes par animal or que avec le constructeur on a besoin 1ligne
        //plus lisible et mois de code

        // Instruction 8 : Utiliser la méthode displayZoo()
        System.out.println("\nInstruction 8 :avec display");

        myZoo.displayZoo();

        System.out.println("\nInstruction 8 :sans display");

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

     // affiche la référence mémoire car en n'apas definie la methode tosting

        // Instruction 9 : Affichage direct fonctionne grâce à toString()
        System.out.println("\nInstruction 9 :");
        lion.displayAnimal();


        // Affichage direct des animaux
        System.out.println("Affichage direct:");
        System.out.println(lion);
        System.out.println(chat);
        System.out.println(chien);
    

        //prosit 3

     // INSTRUCTION 10 : Test addAnimal
        Zoo monZoo = new Zoo("Zoo Echkil", "Tunis", 3);

     // Ajout
        monZoo.addAnimal(lion);
        monZoo.addAnimal(chat);
        monZoo.addAnimal(chien);

        // Affichage zoo
        monZoo.displayZoo();

        // Suppression
        monZoo.removeAnimal(chat);
        monZoo.displayZoo();

        // Comparaison
        Zoo zoo2 = new Zoo("Zoo Bizerte", "Bizerte", 5);
        zoo2.addAnimal(new Animal("Oiseaux", "Perroquet", 1, false));
        Zoo plusGros = Zoo.comparerZoo(monZoo, zoo2);
        System.out.println("\nZoo avec le plus d'animaux : " + plusGros.getName());

        sc.close();
    }

    }