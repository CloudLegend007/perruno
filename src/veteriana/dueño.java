
package veteriana;
public class dueño {
    public int getId_dueño() {
        return id_dueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }
    private int id_dueño;
    private String nombre;
    private String apellido;
    private String dni;
    
       public dueño(int id_dueño, String nombre, String apellido, String dni) {
        this.id_dueño = id_dueño;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

}
