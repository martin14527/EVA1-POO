package EVA_12_;

public class EVA_12_{

    public static void main(String[] args) {

        temperatura temp = new temperatura();

        System.out.println("50 C = " + temp.celsiusafarenheit(50) + " F");
        System.out.println("50 F = " + temp.farenheitacelsius(50) + " C");
    }

    // clase interna
    static class temperatura {

        public static double celsiusafarenheit(double celsius) {
            double resu;
            resu = celsius * (9.0 / 5.0) + 32;
            return resu;
        }

        public static double celsiusakelvin(double celsius) {
            double resu;
            resu = celsius + 273.15;
            return resu;
        }

        public static double kelvinacelsius(double kelvin) {
            double resu;
            resu = kelvin - 273.15;
            return resu;
        }

        public static double farenheitakelvin(double farenheit) {
            double resu;
            resu = (farenheit - 32) * 5.0 / 9.0 + 273.15;
            return resu;
        }

        public static double farenheitacelsius(double farenheit) {
            double resu;
            resu = (5.0 / 9.0) * (farenheit - 32);
            return resu;
        }
    }
}

