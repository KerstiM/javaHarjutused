package teema1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */
public class Peamurdja3_laevad {
    public static void main(String[] args){

        int[][] lauarida1 = {0, 1, 0, 1, 1};
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <10 ; j++) {
                lauarida1[i][j]=0;
            }
        }
        int pakkumata = Array.getLength(lauarida1);


        while (pakkumata > 0) {
            System.out.println("laua hetkeseis: " + Arrays.toString(lauarida1));


            Scanner kasutaja = new Scanner(System.in);
            System.out.println("Sisesta number 0-4");
            int sisestus = kasutaja.nextInt();


            System.out.println(pakkumata);

        /*
        0 tyhi
        1 laev
        2 pakutud tyhi
        3 pakutud pihtas

         */

            if (lauarida1[sisestus] == 0) {
                System.out.println("Panid mööda!");
                lauarida1[sisestus] = 2;
                pakkumata--;


            }
            else if (lauarida1[sisestus] == 1) {
                System.out.println("Said pihta!");
                lauarida1[sisestus] = 3;
                pakkumata--;

            }
            else {
                System.out.println("Juba pakutud koht, proovi uuesti");
            }
        }

    }

}
