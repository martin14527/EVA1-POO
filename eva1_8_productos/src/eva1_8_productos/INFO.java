
package eva1_8_productos;
public class INFO {
        String nombres;
        String marca;
        String unidad;
        String precio;
        String cantidad;
        public INFO(){
    nombres="se";
    marca= "T";
    unidad=("s");
    precio=("500");
    cantidad=("34");        
    } 
        
  public INFO(String nombres, String marcas, String unidad, String precio, String cantidad){ //se llama sobrecarga, sirve para diferenciar, un metodo tiene 2 funciones, no es igual () a (int s) 
    this.nombres=nombres;
    this.marca=marca; 
    this.marca=marca;
    this.unidad=unidad;
    this.unidad=unidad;
    this.cantidad=cantidad;
            
    }
public String getnombres() {
      this.nombres=nombres;
    }

    public void setnombres(String valor) {
      this.nombres =nombres;
    }

    public String getmarca() {
        this.marca= marca;
    }

    public void setmarca (String valor) {
        marca = valor;
    }

    public String getunidad() {
        return unidad;
    }

    public void setunidad(String valor) {
      unidad = valor;
    }

    public String getprecio() {
        return precio;
    }

    public void setprecio(String valor) {
        precio = valor;
    }

    public    String   getcantidad() {
        return cantidad;
    }
     public void setcantidad(   String   valor) {
        cantidad = valor;
    }

    public void imprimirdatos() {
        System.out.println("Sistema de alta y baja de productos");
        System.out.println("nombres " + nombres);
        System.out.println("unidad        ¿ se vende por pieza? o ¿por mayoreo?"  + unidad);
        System.out.println("precio del producto: " + precio);
        System.out.println("cantidad del producto " + cantidad);
    }
    
    public double calcularmonto(){
    return cantidad*precio;
    }
}

