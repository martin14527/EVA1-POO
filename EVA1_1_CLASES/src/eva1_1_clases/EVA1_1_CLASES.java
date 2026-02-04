
package eva1_1_clases;

public class EVA1_1_CLASES {
    public static void main(String[] args) {
        //una clase sirve para crear un objeto?
        //declara un identificador del tipo de la clase
        Persona persona1;
        //instancia el objeto
        persona1=new Persona();
        Persona perso2=new Persona();
    }
    // una referencia almacena la direccion/informacion de variables
    //para usar una direccion se usan los , (persol.
   persona1.apelllido = "vallejo";
   persona1.nombre = "Guillermo";
    persona1.edad = 30;
}
    class public Persona{
//estado--> datos (variables)
String nombre;
String apellido;
int edad;
    
//comportamiento --> metodos
void impimir(){
    System.out.println("nombre" + nombre);
    System.out.println("apellido" + apellido);
    System.out.println("edad" + edad);
}

    }