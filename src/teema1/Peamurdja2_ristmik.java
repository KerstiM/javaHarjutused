package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.PAREM, primaryStage);
        Foor foor4 = new Foor(Foor.VASAK, primaryStage);

        int kordus = 0;
        while (kordus < 10) {
            //vertikaal(foor1);
            //vertikaal(foor2);

            horisontaal(foor3);
            horisontaal(foor4);
            kordus++;
        }



    }


    public void vertikaal (Foor foor) {
        foor.vahetaRohelist();
        rohelisestPunaseks(foor);
        punasestRoheliseks(foor);
    }

    public void horisontaal (Foor foor) {
        foor.vahetaPunast();
        punasestRoheliseks(foor);
        rohelisestPunaseks(foor);
    }

    public void rohelisestPunaseks(Foor foor) {
        foor.vahetaRohelist();
        /*foor.paus(0.5);
        foor.vahetaRohelist();
        foor.paus(.5);
        foor.vahetaRohelist();
        foor.paus(.5);
        foor.vahetaRohelist();
        foor.paus(.5);
        foor.vahetaRohelist();*/
        vilgutaRohelist(foor);
        foor.vahetaKollast();
        foor.paus(1);
        foor.vahetaKollast();
        foor.vahetaPunast();
        foor.paus(1);
    }



    public void punasestRoheliseks(Foor foor) {

        foor.vahetaKollast();
        foor.paus(2);
        foor.vahetaPunast();
        foor.vahetaKollast();
        foor.vahetaRohelist();
        foor.paus(1);

    }

    private void vilgutaRohelist(Foor foor) {
        int vilgutus = 0;
        while (vilgutus < 3) {
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(.5);
            foor.vahetaRohelist();
            foor.paus(.5);
            foor.vahetaRohelist();
            foor.paus(.5);
            vilgutus++;
        }

    }

}
