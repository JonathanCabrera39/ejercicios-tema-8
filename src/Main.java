public class Main {
    public static void main(String[] args) {
        Persona madre = new Persona();
        madre.setEdadPersona(50);
        madre.setNombre("Estela");
        madre.setTelefono(553421);


        Persona padre = new Persona();
        padre.setEdadPersona(55);
        padre.setNombre("Raul");
        padre.setTelefono(884536);

        Persona hijo = new Persona();
        hijo.setEdadPersona(25);
        hijo.setNombre("Alberto");
        hijo.setTelefono(446198);

        System.out.println("Nombre:"+ madre.getNombre()+" edad:"+madre.getEdadPersona()+" telefono:"+madre.getTelefono());
        System.out.println("Nombre:"+padre.getNombre()+" edad:"+padre.getEdadPersona()+" telefono:"+ padre.getTelefono());
        System.out.println("Nombre:"+hijo.getNombre()+" edad:"+hijo.getEdadPersona() +" telefono:"+ hijo.getTelefono());
    }
}
class Persona{
    private int edadPersona;
    private String nombre;
    private int telefono;


    public void setEdadPersona(int edadPersona){
        this.edadPersona = edadPersona;
    }

    public int getEdadPersona(){
       return this.edadPersona = edadPersona;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }

    public int getTelefono(){
        return this.telefono = telefono;
    }

}