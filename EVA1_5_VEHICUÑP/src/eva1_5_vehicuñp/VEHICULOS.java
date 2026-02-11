/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_vehicuñp;
public class VEHICULOS {
    //atributos 
   private String marca;
   private String modelo;
   private String año;
   private String color;
   private double precio;
   private int kilometrajes;
   //comportamiento
   
   public String getmarca(){
       return marca;
   }
   public void setmarca (String valor){
       marca=valor;
   }
    public String getmodelo(){
       return marca;
   }
   public void setmodelo (String valor){
       modelo=valor;
   }
    public String getaño(){
       return año;
   }
   public void setaño (String valor){
       año=valor;
   }
    public String getcolor(){
       return marca;
   }
   public void setcolor (String valor){
       color=valor;
       
   }
    public double precio(){
       return precio;
   }
   public void setprecio (double valor){
       precio=valor;
   }
   public int getkilometrajes(){
       return kilometrajes;
   }
   public void setkilometrajes (int valor){
       kilometrajes=valor;
   }
   
   public void imprimirdatos(  ){
            System.out.println("datos del vehiculo");
               System.out.println("marca" + marca );
        System.out.println("año" + año);
         System.out.println("color" + color);
         
                    
                    
   }
}
