package teema1;
import java.util.Scanner;
import java.util.Random;

/**
 * Juhuslikkus
 *
 * 1. Kirjutada mäng kull ja kiri.
 *    Programm küsib kasutajalt: kas kull või kiri? "Viskab" mündi ja
 *    teatab, kas kasutaja arvas õigesti või mitte.
 *    Vihje: ära hakka jändama Stringidega, küsi kasutajalt number.
 *
 * 2. Kirjutada liisu tõmbamise programm.
 *    Küsida kasutajalt inimeste arv. Väljastada juhuslik number vahemikus 1
 *    kuni arv (kaasaarvatud).
 *    NB! Kontrollida, et töötab õigesti: st. öeldes mitu korda järjest
 *    arvuks 3, peab võimalike vastuste hulgas olema nii ühtesid, kahtesid kui kolmi.
 *
 * 3. Kirjutada täringumäng:
 *    Programm viskab kaks täringut mängijale ja kaks täringut endale
 *    (arvutile), arvutab mõlema mängija silmade summad ja teatab,
 *    kellel oli rohkem.
 */


public class Harjutus3_Juhuslikkus {
    public static void main(String[] args) {
        /** Ülesanne 1
        Scanner kasutajaSisestus = new Scanner(System.in); //scanner kasutaja sisestuseks

        int sisend;
        System.out.println("Kull või kiri? Kui arvad, et kull, kirjuta 1, kui arvad, et kiri, kirjuta 2.");
        sisend = kasutajaSisestus.nextInt();

        int r2 = (int) (2*Math.random()+1); // genereerib suvalise arvu, kuidas täpselt toimib, ei tea.
        System.out.println("Viskan münti ja tulemus on: "+r2);
        if (r2 == sisend){
            System.out.println("Sinu võit!");
        } else {
            System.out.println("Kahjuks kaotasid :(");
        }
        */
        //Ülesanne 2
        Scanner kasutajaSisestus = new Scanner(System.in); //scanner kasutaja sisestuseks

        int sisend;
        System.out.println("Palun sisesta inimeste arv");
        sisend = kasutajaSisestus.nextInt();
        int valjund = (int) (Math.random() *sisend +1);
        System.out.println("Sulle genereeritud suvaline arv on "+ valjund);


    }
}


