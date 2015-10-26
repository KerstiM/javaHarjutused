package teema1;
import java.util.Scanner;
import java.util.Random;

import static com.sun.activation.registries.LogSupport.log;

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
        Scanner kasutajaSisestus = new Scanner(System.in);          //scanner kasutaja sisestuseks

        int sisend;
        System.out.println("Kull või kiri? Kull (1), kiri (2)");
        sisend = kasutajaSisestus.nextInt();

        int r2 = (int) (2*Math.random()+1);                         // genereerib suvalise arvu, kuidas täpselt toimib, ei tea.
        System.out.println("Viskan münti ja tulemus on: "+r2);
        if (r2 == sisend){
            System.out.println("Sinu võit!");
        } else {
            System.out.println("Kahjuks kaotasid :(");
        }
        */

        /**Ülesanne 2
        Scanner kasutajaSisestus = new Scanner(System.in);          //scanner kasutaja sisestuseks

        int sisend;
        System.out.println("Palun sisesta inimeste arv");
        sisend = kasutajaSisestus.nextInt();
        int valjund = (int) (Math.random() *sisend +1);
        System.out.println("Sulle genereeritud suvaline arv on "+ valjund);
        */


        //Ülesanne 3

        Scanner taringumang = new Scanner(System.in);               //scanner kasutaja sisendiks
        boolean uuesti = true;                                      //boolen (jah või ei) - mängu korduse jaoks

        int nousolek;
        System.out.println("Tere! Mängime täringu mängu! Alustamiseks kirjuta ekraanile 1");
        nousolek = taringumang.nextInt();

        int diceOne ;
        int diceTwo;
        int diceSum1;
        int diceThree;
        int diceFour;
        int diceSum2;

        while (uuesti){
           /** int at1 = r.nextInt(6) + 1; //genereerib esimese täringu arvutile, 1-6 silma
            int at2 = r.nextInt(6) + 1; //genereerib teise täringu arvutile, 1-6 silma
            int kt1 = r.nextInt(6) + 1; //genereerib esimese täringu kasutajale, 1-6 silma
            int kt2 = r.nextInt(6) + 1; //genereerib teise täringu kasutajale, 1-6 silma */


            for(int i =0; i<2; i++) {
            }
            diceOne = (int)(6*Math.random() +1);
            diceTwo = (int)(6*Math.random() +1);
            diceSum1 = diceOne + diceTwo;
            System.out.println(diceOne);
            System.out.println(diceTwo);
            System.out.println("Sinu täringuvisete summa " + diceSum1);

            for(int i =0; i<2; i++) {
            }
            diceThree = (int)(6*Math.random() +1);
            diceFour = (int)(6*Math.random() +1);
            diceSum2 = diceThree + diceFour;
            System.out.println(diceThree);
            System.out.println(diceFour);
            System.out.println("Minu täringuvisete summa " + diceSum2);

            if (diceSum1 < diceSum2){
                System.out.println("Minu võit!");
            }else if (diceSum1 == diceSum2){
                System.out.println("Viik");
            } else {
                System.out.println("Sinu võit");

                System.out.println("Kas arvad uuesti? (jah/ei)");
                String vastus = taringumang.next();
            if (vastus.equals("ei")){
                uuesti = false;
            }
        }

        }
    }
}









