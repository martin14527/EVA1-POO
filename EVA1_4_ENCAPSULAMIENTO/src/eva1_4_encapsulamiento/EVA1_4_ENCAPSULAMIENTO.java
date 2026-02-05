package eva1_4_encapsulamiento;
public class EVA1_4_ENCAPSULAMIENTO {

    public static void main(String[] args) {
        PERSONA persona = new PERSONA();
        persona.nombre = "juan";
        persona.edad =-500;
        persona.setnombre("memo");
        persona.setapellidos("vallejo");
        System.out.println("Edad " + persona.getapellidos);
        System.out.println("Edad " + persona.getgenero);
        System.out.println("Edad " + persona.edad);
        System.out.println("Edad " + persona.getapellidos);
        System.out.println("Edad " + persona.getapellidos);
        persona.imprimirdatos();
    }
    
}
