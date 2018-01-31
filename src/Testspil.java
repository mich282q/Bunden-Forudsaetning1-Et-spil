import javafx.scene.paint.Color;
import java.util.Random;

    public class Testspil {
        private static int[][] coinCoordinates = {
                {4, 4},
                {6, 5},
                {4, 8},
        };


        public Testspil() {
        }

        public static String getCoins() {
            String debugTekst = "";
            Random random = new Random();

            for (int i = 0; i < 3; i++) {
                debugTekst = debugTekst + coinCoordinates[i][0]*40 + "," + coinCoordinates[i][1]*40 ;
                System.out.println(debugTekst);
                debugTekst = "";
                // Her er eksempler på farver
                // System.out.println(Color.BLUEVIOLET);
                // System.out.println(Color.BLUE);
                // System.out.println(Color.color(0.9, 0.0, 0));
                // Nu laver vi en random farve
                System.out.println((Color.color(Math.random(), Math.random(), Math.random())));
            }

            return debugTekst;
        }


        public static int[][] getCoinCoordinates() {
            return coinCoordinates;
        }

        public static void setCoinCoordinates(int[][] coinCoordinates) {
            Testspil.coinCoordinates = coinCoordinates;
        }

        public static void main(String[] args) {
            Testspil.getCoins();
        }

    }
