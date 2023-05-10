
package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;
import java.util.Scanner;

public class EvidencePojisteni {
    private ArrayList<Pojisteny> pojisteni = new ArrayList<>();

    public void VytvoritPojisteneho() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadejte jméno:");
        String Jmeno = scanner.nextLine();

        System.out.println("Zadejte příjmení:");
        String Prijmeni = scanner.nextLine();

        System.out.println("Zadejte věk:");
        int Vek = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Zadejte telefonní číslo:");
        String Tel = scanner.nextLine();

        Pojisteny pojisteny = new Pojisteny(Jmeno, Prijmeni, Vek, Tel);
        pojisteni.add(pojisteny);

        System.out.println("DATA byla ulozena. Pokracujte libovolnou klavesou...");
        scanner.nextLine();
    }
    
    public void VypsatPojistene(){
        Scanner scanner = new Scanner(System.in);
    if(pojisteni.isEmpty()){
    System.out.println("Zadni pojistenych nenalezeni");
    
    }else {
        System.out.println("Seznam pojistenych:");
        for (Pojisteny pojisteny : pojisteni){
            System.out.println(pojisteny);
            
            }
        }
    System.out.println("Vypis vsech pojistenych vyse. Pokracujte libovolnou klavesou...");
    scanner.nextLine();
    }
    
    public void VyhledatPojisteneho() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadejte jméno hledaného pojištěného:");
        String Jmeno = scanner.nextLine();

        System.out.println("Zadejte příjmení hledaného pojištěného:");
        String Prijmeni = scanner.nextLine();

        boolean found = false;

        for (Pojisteny pojisteny : pojisteni) {
            if (pojisteny.getJmeno().equals(Jmeno) && pojisteny.getPrijmeni().equals(Prijmeni)) {
                System.out.println("Pojištěný nalezen:");
                System.out.println(pojisteny);
                found = true;
                System.out.println("Vypis hledaneho pojisteneho vyse. Pokracujte libovolnou klavesou...");
                scanner.nextLine();
                
                break;
            }
        }

        if (!found) {
            System.out.println("Pojištěný nenalezen. Pokracujte libovolnou klavesou...");
            scanner.nextLine();
        }
}
}


