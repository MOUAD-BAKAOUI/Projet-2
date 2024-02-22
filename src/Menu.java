import java.util.*;
public class Menu {

    PoupeeRusse poup1 = new PoupeeRusse("", 0);
    PoupeeRusse poup2 = new PoupeeRusse("", 0);
    PoupeeRusse poup3 = new PoupeeRusse("", 0);
    static Scanner scanner = new Scanner(System.in);
    // ANSI escape codes for colors



    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.menuInterface();
    }
    public void menuInterface() {


        int Choix;
        do {
            System.out.println("| ------------- Menu----------------- |");
            System.out.println("|-------------------------------------|");
            System.out.println("|      1. Ajouter un poupée.          |");
            System.out.println("|      2. Afficher les poupée.        |");
            System.out.println("|      3. Commencer le jeu.           |");
            System.out.println("|      4. Quitter le jeu.             |");
            System.out.println("|----------------------------------- -|");
            System.out.print("          Entrez un choix : " );
            Choix = scanner.nextInt();
            switch (Choix) {
                case 1:
                    System.out.println("Ajouter la poupée numéro 1");

                    System.out.println("Entrez le nom de la poupée:");
                    Scanner input=new Scanner(System.in);
                    String nom=input.nextLine();
                    poup1.setNom(nom);
                    //Scanner Nom = scanner.nextLine();
                    System.out.println("Entrez la taille de la poupée :");
                    int taille = input.nextInt();
                    poup1.setTaille(taille);
                    System.out.println("Poupées ajoutées avec succès !");
                    ////////////////////////////////////////////

                    System.out.println("Ajouter la poupée numéro 2");
                    System.out.println("Entrez le nom de la poupée:");
                    nom=input.next();
                    poup2.setNom(nom);
                    //Scanner Nom = scanner.nextLine();
                    System.out.println("Entrez la taille de la poupée :");
                    taille = input.nextInt();
                    poup2.setTaille(taille);
                    System.out.println("Poupées ajoutées avec succès !");
                    System.out.println("Ajouter la poupée numéro 3");

                    System.out.println("Entrez le nom de la poupée:");

                    nom=input.next();
                    poup3.setNom(nom);
                    //Scanner Nom = scanner.nextLine();
                    System.out.println("Entrez la taille de la poupée :");
                    taille = input.nextInt();
                    poup3.setTaille(taille);
                    System.out.println("Poupées ajoutées avec succès !");
                    //  poup3.ajouterPoupees();
                    break;
                case 2:
                    System.out.println("  La liste des poupées disponible   ");
                    System.out.println("------------------------------------");
                    System.out.println("| ------    Poupée Russe 1    ------ |\n");
                    poup1.afficherPoupees();
                    System.out.println("| ------    Poupée Russe 2    ------ |\n");
                    poup2.afficherPoupees();
                    System.out.println("| ------    Poupée Russe 3    ------ |\n");
                    poup3.afficherPoupees();
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println(" Quitté  ");
                    break;
                default:
                    System.out.println("      Entrez un choix valid !       ");
                    break;
            }
        } while (Choix != 4);

    }
}