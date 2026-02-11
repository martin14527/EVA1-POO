
package eva1_7_constructores;
public class PERSONA {
  private String nombre;
    private String apellido;
      private String edad;
    public PERSONA(){
    nombre="se";
    apellido= "T";
    edad=("s");
            
    } 
    public PERSONA(String nombre, String edad, String apellido){ //se llama sobrecarga, sirve para diferenciar, un metodo tiene 2 funciones, no es igual () a (int s) 
    this.nombre=nombre;
    this.edad=edad; 
    this.apellido=apellido;
            
    }
     
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String valor) {
        nombre= valor;
    }

    public String getapellido() {
        return apellido ;
    }

    public void setedad(String valor) {
        edad= valor;
    }

    public String getedad() {
        return edad;
    }
    public void imprimirdatos() {
        System.out.println("datos de la persona");
        System.out.println("nombre : " + nombre);
        System.out.println("apellido " + apellido);
        System.out.println("edad" + edad );
}
}
