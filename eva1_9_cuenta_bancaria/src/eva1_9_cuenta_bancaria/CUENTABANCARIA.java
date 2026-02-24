
package eva1_9_cuenta_bancaria;

public class CUENTABANCARIA {

    String titular;
    double monto;
    int operaciones;

    // Constructor por defecto
    public CUENTABANCARIA() {
        this.titular = "MGVL";
        this.monto = 5000;
    }

    // Constructor con parámetros (sobrecarga)
    public CUENTABANCARIA(String titular, double monto) {
        this.titular = titular;
        this.monto = monto;
    }

    // Método para ingresar dinero
    public void ingresar(double monto) {
        this.monto += monto;
    }

    // Método para retirar dinero
    public void retirar(double monto) {
        this.monto -= monto;
        if (monto>0){
 
        
        }
    }

    // Mostrar datos
    public void imprimirdatos() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + monto);
    }
}

