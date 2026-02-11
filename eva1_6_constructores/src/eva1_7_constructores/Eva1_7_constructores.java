/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author anoni
 */
public class Eva1_7_constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PERSONA P = new PERSONA();
       P.imprimirdatos(); //P se usa para "llamar" tus atributos
       
        P.imprimirdatos();

        P = new PERSONA("JUAN", "PEREZ", "50");
        P.imprimirdatos();

    }
    
}
