package teema1;

import java.util.Scanner;
/**
 * 1. Kirjutada meetod, mis tagastab parameetrina etteantud arvu kuubi.
 * 2. Kirjutada meetod, mis saab parameetritena kaks arvu (vahemiku) ning
 *    tagastab kasutaja sisestatud arvu, juhul kui see on lubatud vahemikus.
 *    Senikaua, kui kasutaja sisestab midagi ebasobivat, käseb meetod kasutajal
 *    arvu uuesti sisestada.
 */
public class Harjutus2_meetodid {

    public static void main(String[] args) {

     //1. ülesanne (kasutaja sisestus: http://www.homeandlearn.co.uk/java/user_input.html)

        /**Scanner kasutajaSisestus = new Scanner(System.in); //kasutaja sisestuse registreerib scanner. Selleks import java.util.Scanner; tehakse täpselt class´i üles.

        int arv;
        System.out.println("Sisesta täisarv: "); //kasutajal palutakse sisetada arv
        arv = kasutajaSisestus.nextInt(); //next aitab kasutaja sisestust saada. kasutaja sisestus muudetakse intiks(teksti puhul stringiks)
        System.out.println(tostaKuupi(arv)); //tagastatakse arvu kuup, mis on arvutatud tostaKuupi
    }*/
        kasutajaSisestus("Sisesta täisarv:", 1, 99); //vahemik ???
    }
    public static void kasutajaSisestus(String kysimus, int min, int max) {

        boolean arvVahemikus = false;
        while (!arvVahemikus) {
            Scanner sisend = new Scanner(System.in);

            System.out.println(kysimus);
            int arv = sisend.nextInt();
            if (arv <= min) {
                System.out.println("Sisesta suurem arv");
            }
            else {
                if (arv >= max) {
                    System.out.println("Sisesta väiksem arv");
                } else {
                        System.out.println("Oled vahemikus");
                        arvVahemikus = true;
                }
            }
        }
    }

    private static int tostaKuupi(int arv) {
        return (int) Math.pow(arv, 3);
    }
}