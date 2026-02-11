/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_vehicuñp;

/**
 *
 * @author anoni
 */
public class EVA1_5_VEHICUÑP {
    public static void main(String[] args) {
        
        VEHICULOS  vehiculo = new  VEHICULOS (); //tiene que tener el mimso nombre que la clase
       vehiculo.setmarca("ford");
       vehiculo.setmodelo("mustang");
       vehiculo.setaño("1998");
       vehiculo.setcolor("azul");
        vehiculo.setkilometrajes(10000);
         vehiculo.setprecio(500000);
         vehiculo.imprimirdatos();
    VEHICULOS[] agencia = new VEHICULOS [10];
       for(int i = 0; i<agencia.length; i++){
           agencia[i] = new  VEHICULOS();
           agencia[i].setmarca("ford");
           agencia[i].setmodelo("mustang");
           agencia[i].setaño("1990");
           agencia[i].setcolor("aziñ");
           agencia[i].setprecio(1000000);
           agencia[i].setkilometrajes(0);
           
           
       }
    }
    
}
