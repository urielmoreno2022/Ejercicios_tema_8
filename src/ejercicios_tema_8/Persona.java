
package ejercicios_tema_8;

/**
 *
 * @author Uriel
 */
public class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
   
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setEdad(40);
        persona.setTelefono("3004005050");
        System.out.println("La persona se llama: " + persona.getNombre());
        System.out.println("Su edad es: " + persona.getEdad());
        System.out.println("Su numero telefonico es: " + persona.getTelefono() );
    }
    
}
