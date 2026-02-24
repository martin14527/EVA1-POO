
public class TELE {

    public static final String APAGADO = "apagado";
    private boolean prendido;
    private int volumen;
    private int canal;

    public TELE() {
        prendido = false;
        volumen = 10;
        canal = 1;
    }

    // encender/apagar
    public void encenderApagar() {
        prendido = !prendido;
    }

    // subir volumen
    public void subirVolumen() {
        if (!prendido) return;
        if(prendido==false){
        System.out.print("la television esta apagado, sin volumen");
        } 
        else {
        volumen++;
    }
    }
    // bajar volumen
    public void bajarVolumen() {
        if (!prendido) return;
        if (!prendido) return;
        if(prendido==false){
        System.out.print("la television esta apagada, sin volumen");
        } 
        else {
        volumen--;
    }
    }
    // subir canal
    public void subirCanal() {
        if (!prendido) return;

        canal++;

        if (canal > 100) {
            canal = 0;
        }
    }

    // bajar canal
    public void bajarCanal() {
        if (!prendido) return;

        canal--;

        if (canal < 0) {
            canal = 100;
        }
    }

    // mostrar estado
    public void mostrarEstado() {
        if(prendido==false){
            
            
        System.out.println("Estado: apagado ");
        
       
        }else{
        System.out.println("Estado prendido ");
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
                }
    }
}




  