/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_cuenta_bancaria;

/**
 *
 * @author anoni
 */
public class Eva1_9_cuenta_bancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CUENTABANCARIA c = new  CUENTABANCARIA("MGVL," ,5000);
       
        
        if(c.monto>5000){
        System.out.print("fondos insuficientes");
        }
        else{
         c.imprimirdatos();
        }
       
      
        }
    }
    

