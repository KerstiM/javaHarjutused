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

        //kullKiri();
        //liisk();
        taringuMang();
    }
    //Ülesanne 1
        public static void kullKiri() {
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
        }
    //Ülesanne 2
        public static void liisk() {
            Scanner kasutajaSisestus = new Scanner(System.in);          //scanner kasutaja sisestuseks
            int sisend;
            System.out.println("Palun sisesta inimeste arv");
            sisend = kasutajaSisestus.nextInt();
            int valjund = (int) (Math.random() *sisend +1);
            System.out.println("Sulle genereeritud suvaline arv on "+ valjund);
            }

    //Ülesanne 3 vol 2

    public static void taringuMang(){
        boolean uuesti = true;                              //boolean (jah või ei) - mängu korduse jaoks
        Random r = new Random();                            //uus random igal mängul
        int diceOne = r.nextInt(6) + 1 ;                    //genereerib esimese täringu kasutajale, 1-6 silma
        int diceTwo = r.nextInt(6) + 1 ;                    //genereerib teise täringu kasutajale, 1-6 silma
        int diceThree = r.nextInt(6) + 1;                   //genereerib esimese täringu arvutile, 1-6 silma
        int diceFour = r.nextInt(6) + 1;                    //genereerib teise täringu arvutile, 1-6 silma

        while (uuesti) {                                     //while käib booleani juurde.
            Scanner sisend = new Scanner(System.in);
            System.out.println("Sinu täringuvisked " + diceOne + " ja " + diceTwo);
            System.out.println("Sinu täringuvisete summa = " + (diceOne + diceTwo));
            System.out.println();
            System.out.println("Minu täringuvisked " + diceThree + " ja " + diceFour);
            System.out.println("Minu täringuvisete summa " + (diceThree + diceFour));
            System.out.println();

            if ((diceOne + diceTwo) > (diceThree + diceFour)) {
                System.out.println("Sinu võit, palju õnne!");
            } else if ((diceOne + diceTwo) == (diceThree + diceFour)) {
                System.out.println("Viik!");
            } else {
                System.out.println("Mina võitsin! Ajeee");
                System.out.println();
            }
            System.out.println("Kas mängime veel? (jah/ei)");
            String vastus = sisend.next();
            if (vastus.equals("ei")){
                uuesti = false;
            }
        }
    }
}









