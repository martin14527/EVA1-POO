package EVA1_11_STATIC;

public class EVA1_11_STATIC {

    public static void main(String[] args) {

        System.out.print("pi = " + Math.PI);
        System.out.println("valor aleatorio = " + Math.random());
        System.out.println("CLASE MATEMATICAS");

        class matematicas {
            public static final double PI = 3.14159;
        }

        matematicas mate = new matematicas();
        System.out.print("PI prueba 1 = " + matematicas.PI); // el static crea lo declarado, sin objetos
    }

    // no se puede Math mate = new Math();
}