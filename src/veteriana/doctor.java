package veteriana;
public class doctor {
    
    private int id_doctor;
    private String nombre;
    private String especialidad;
    private String telefono;


    public doctor(int id_doctor, String nombre, String especialidad, String telefono) {
        this.id_doctor = id_doctor;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.telefono = telefono;
    }


    public int getId_doctor() {
        return id_doctor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getTelefono() {
        return telefono;
    }



}
