package veteriana;
public class mascota {

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    private int id_mascota;
    private String nombre;
    private String raza;
    private String color;
    private String sexo;

    public int getId_mascota() {
        return id_mascota;
    }
public mascota(int id_mascota, String nombre, String raza, String color, String sexo) {
        this.id_mascota = id_mascota;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.sexo = sexo;
    }
    
}
