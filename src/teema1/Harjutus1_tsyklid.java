package teema1;

        import java.util.ArrayList;
        import java.util.Arrays;

/**
 * Kasutades tsükleid, lahendada järgmised ülesanded:
 * 1. Trükkida ekraanile numbrid 10 kuni 1
 * 2. Trükkida ekraanile paaritud arvud vahemikus 0 kuni 10
 * 3. Trükkida ekraanile selline tabel:
 *    0 1 2 3 4 5 6 7 8 9
 *    1 2 3 4 5 6 7 8 9 0
 *    2 3 4 5 6 7 8 9 0 1
 *    3 4 5 6 7 8 9 0 1 2
 *    4 5 6 7 8 9 0 1 2 3
 *    5 6 7 8 9 0 1 2 3 4
 *    6 7 8 9 0 1 2 3 4 5
 *    7 8 9 0 1 2 3 4 5 6
 *    8 9 0 1 2 3 4 5 6 7
 *    9 0 1 2 3 4 5 6 7 8
 */
public class Harjutus1_tsyklid {
    public static void main(String[] args) {

        /**int  l = 10; //Print 10 - 1 v1
         while (l > 0) {
         System.out.print(l + " ");
         l = l - 1;
         }
         */

        for (int l = 10; l>0; l--) { //Print 10 - 1 v2
            System.out.println(l + " ");
        }

        System.out.print("\n");
        for (int l = 1; l<=10; l=l+2) {  //Print paaritud v1
            System.out.print(l + " ");
        }

        System.out.print("\n");
        for (int l = 0; l<5; l++) { //Print paaritud v2
            System.out.print(2*l+1 + " ");
        }

        System.out.print("\n");
        System.out.print("\n");


        for (int i = 0; i < 10; i++) { //annab rea
            for (int a = 0; a < 10; a++) { //annab veeru
                int tabel = i + a; // tekitab tabeli
                if (tabel >= 10) {  //kui number on üle 10,ne siis lahtuab 10, jõuab tagasi algusesse
                    tabel = tabel - 10;
                }
                System.out.print(tabel + " "); //prindib tabeli ja paneb numbrite vahele tühikud
            }
            System.out.println(); //prindib iga rea eraldi reale
        }
    }
}






