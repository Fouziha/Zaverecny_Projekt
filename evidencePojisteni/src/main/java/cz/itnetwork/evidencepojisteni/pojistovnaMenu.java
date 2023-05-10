
package cz.itnetwork.evidencepojisteni;

import java.util.Scanner;

public class pojistovnaMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EvidencePojisteni pojisteni = new EvidencePojisteni();

        while (true) {
            System.out.println("Vyberte operaci:");
            System.out.println("1 - Vytvoření pojištěného");
            System.out.println("2 - Zobrazení seznamu všech pojištěných");
            System.out.println("3 - Vyhledání pojištěného podle jména a příjmení");
            System.out.println("4 - Konec programu");

            int operation = scanner.nextInt();

            if (operation == 4) {
                break;
            }

            switch (operation) {
                case 1:
                    pojisteni.VytvoritPojisteneho();
                    break;
                case 2:
                    pojisteni.VypsatPojistene();
                    break;
                case 3:
                    pojisteni.VyhledatPojisteneho();
                    break;
                default:
                    System.out.println("Neplatná operace");
                    break;
            }
        }

        scanner.close();
    }
}
