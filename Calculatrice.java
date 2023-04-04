import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;
        // Boucle "while" pour afficher le menu principal tant que l'utilisateur ne décide pas de quitter
        while (continuer) {
            System.out.println("*********************************************************");
            System.out.println("Menu:");
            System.out.println("1. Calculer");
            System.out.println("2. Convertir");
            System.out.println("3. Quitter");
            System.out.print("Entrez votre choix: ");
            int choix = scanner.nextInt();
            // Instruction "switch" pour effectuer une action en fonction du choix de l'utilisateur
            switch (choix) {
                case 1:
                    calculer();
                    break;
                case 2:
                    convertir();
                    break;
                case 3:
                    continuer = false;
                    break;
                default: // Si le choix de l'utilisateur ne correspond à aucun des cas précédents, on affiche un message d'erreur
                    System.out.println("Choix invalide.");
            }
        }
    }
// Définition de la méthode "calculer()"
    public static void calculer() {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;
        while (continuer) {
            System.out.println("*********************************************************");
            System.out.println("Menu de calcul:");
            System.out.println("1. Addition, soustraction, multiplication, division");
            System.out.println("2. Racine carrée");
            System.out.println("3. Puissance");
            System.out.println("4. Modulo");
            System.out.println("5. Factoriel");
            System.out.println("6. Retour au menu principal");
            System.out.print("Entrez votre choix: ");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.print("Entrez le premier nombre: ");
                    double a = scanner.nextDouble();
                    System.out.print("Entrez l'opérateur (+, -, *, /): ");
                    String operateur = scanner.next();
                    System.out.print("Entrez le deuxième nombre: ");
                    double b = scanner.nextDouble();
                    double resultat;
                    switch (operateur) {
                        case "+":
                            resultat = a + b;
                            break;
                        case "-":
                            resultat = a - b;
                            break;
                        case "*":
                            resultat = a * b;
                            break;
                        case "/":
                            resultat = a / b;
                            break;
                        default:
                            System.out.println("Opérateur invalide.");
                            return;
                    }
                    System.out.println(a + " " + operateur + " " + b + " = " + resultat);
                    break;
                case 2:
                    System.out.print("Entrez un nombre: ");
                    double x = scanner.nextDouble();
                    double racineCarree = Math.sqrt(x);
                    System.out.println("La racine carrée de " + x + " est " + racineCarree);
                    break;
                case 3:
                    System.out.print("Entrez la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Entrez l'exposant: ");
                    double exposant = scanner.nextDouble();
                    double result = 1;
                    double puissance;
    for (int i = 0; i < Math.abs(exposant); i++) { //Math.abs(exposant) renvoie la valeur absolue de la variable exposant
        result *= base;
    }
    puissance = exposant >= 0 ? result : 1 / result; //(condition) ? (valeur si vrai) : (valeur si faux)
                    
                    System.out.println(base + " à la puissance " + exposant + " est " + puissance);
                    break;
                case 4:
                    System.out.print("Entrez le dividende: ");
                    int dividende = scanner.nextInt();
                    System.out.print("Entrez le diviseur: ");
                    int diviseur = scanner.nextInt();
                    int modulo = dividende % diviseur;
                    System.out.println(dividende + " modulo " + diviseur + " est " + modulo);
                    break;
                case 5:
                    System.out.print("Entrez un nombre entier positif: ");
                    int n = scanner.nextInt();
                    int factoriel = 1;
                    for (int i = 1; i <= n; i++) {
                        factoriel *= i;
                    }
                    System.out.println(n + "! est " + factoriel);
                    break;
                case 6:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
// Définition de la méthode "convertir()"
    public static void convertir() {
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;
        while (continuer) {
            System.out.println("*********************************************************");
            System.out.println("Menu de conversion:");
            System.out.println("1. Degré Celsius en Fahrenheit");
            System.out.println("2. Décimal en binaire");
            System.out.println("3. Mètres en kilomètres");
            System.out.println("4. Retour au menu principal");
            System.out.print("Entrez votre choix: ");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.print("Entrez la température en degré Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = celsius * 9/5 + 32;
                    System.out.println(celsius + " C° = " + fahrenheit + " F°");
                    break;
                case 2:
                    System.out.print("Entrez un nombre décimal: ");
                    int decimal = scanner.nextInt();
                    String binaire = "";
                    int n=decimal;
                    while (n > 0) {
        binaire = (n % 2) + binaire;
        n /= 2;
    }
                    System.out.println(decimal + " en décimal = " + binaire + " en binaire");
                    break;
                case 3:
                    System.out.print("Entrez une distance en mètres: ");
                    double metres = scanner.nextDouble();
                    double kilometres = metres / 1000;
                    System.out.println(metres + " mètres = " + kilometres + " kilomètres");
                    break;
                case 4:
                    continuer = false;
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }
}
