package eva1_13_formulas;

public class EVA1_13_FORMULAS {

    public static void main(String[] args) {
                                                       //ese 5 es el valor que le metes 
        System.out.println("cuadrado " +  AREAS.cuadrado(5)); //lamar al metodo 
        System.out.println("rectangulo " +  AREAS.rectangulo(10, 4));
        System.out.println("triangulo " +  AREAS.triangulo(8, 6));
        System.out.println("circulo  " +  AREAS.circulo(3));
        System.out.println("rombo  " +   AREAS.rombo(12, 6));
        System.out.println("trapecio  " +   AREAS.trapecio(10, 6, 4));
    }

    static class AREAS{

        public static double cuadrado(double lado) {
            return lado * lado;
            
        }  

        public static double rectangulo(double base, double altura) {
            return base * altura;
        }

        public static double triangulo(double base, double altura ) {
            
            return (base * altura) / 2;
        }

        public static double circulo (double radio) {
            return Math.PI * radio * radio;
        }

        public static double rombo(double D1, double D2) {
            return (D1 * D2) / 2;
        }

        public static double trapecio(double B, double b, double h) {
            return ((B + b)*h)/2;
        }
    }
}


