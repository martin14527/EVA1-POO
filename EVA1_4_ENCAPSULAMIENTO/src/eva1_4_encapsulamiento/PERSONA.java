/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_encapsulamiento;

public class PERSONA {
    String nombre;
      String apellidos;
     int edad;
     char genero;
     public String getNombre(){
       return nombre;
     //constructores
     //comportamiento //get es para leer, set para modificar
     }
}
public void setnombre(String valor){
    nombre = valor;
}
public void getapellidos(String valor){
    return apellidos;
}
public void setgenero(char valor){
        genero=valor
        }
public void setedad(int valor){
        genero=valor
        }
}
public void imprimirdatos()[]{
 System.out.println("Edad " + "nombre");
  System.out.println("apellidos " + "nombre");
   System.out.println("genero " + "nombre");
    System.out.println("nombre" + "nombre");
}