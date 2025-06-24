import java.math.BigInteger;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            parametreA(10, 4);
            parametreA(1000, 100000);
        } catch (Exception e) {
            System.out.println(e);
        }


        int somme = add(3, 4);
        System.out.println(somme);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");
        System.out.println("Je sais pas");

        String userName = myObj.nextLine();  // Read user input


        String concat = concat("Hello ", userName);
        System.out.println(concat);


        ////////////////

        Cheval cheval = new Cheval(4, "Hidalgo", "Gris", 1.10);
        Cheval cheval2 = new Cheval(3, "Eclair", "Brun");

        System.out.println("NB PATTES " + (cheval2.nbPattes + cheval.nbPattes));

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String concat(String a, String b) {
        return a + b;

    }

    public static void parametreA(int valeurMin, int valeurMax) throws Exception {
        BigInteger somme = BigInteger.valueOf(0);
        if (valeurMax <= valeurMin) {
            throw new Exception("Erreur");
        }
        for (int i = valeurMin; i <= valeurMax; i++) {

            if (i % 2 == 0) {
                somme = somme.add(BigInteger.valueOf(i));

            }

        }
        System.out.println("La somme des nombres pairs de " + valeurMin + " à " + valeurMax + " est " + somme);
    }
}