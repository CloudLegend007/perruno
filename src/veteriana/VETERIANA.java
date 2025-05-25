package veteriana;

public class VETERIANA {
    public static void main(String[] args) {
    mascota perro1 = new mascota(1,"pepe","bulldog","moteado","hembra");
    
        System.out.println( perro1.getId_mascota());
        System.out.println( perro1.getNombre());
        System.out.println( perro1.getRaza());
        System.out.println( perro1.getColor());
        System.out.println( perro1.getSexo());
        
        
        
    dueño adulto1 = new dueño(1,"Juan","Ruiz","s46755501");
    
        System.out.println( adulto1.getId_dueño());
        System.out.println( adulto1.getNombre());
        System.out.println( adulto1.getApellido());
        System.out.println( adulto1.getDni());
        
        
    doctor doctor1 = new doctor(1,"Carlos","cirujano","915107777");
    
        System.out.println( doctor1.getId_doctor());
        System.out.println( doctor1.getNombre());
        System.out.println( doctor1.getEspecialidad());
        System.out.println( doctor1.getTelefono());
     
    }


            
}
