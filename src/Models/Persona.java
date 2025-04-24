package Models;

public class Persona {
    private String nombre;
    private int edad;
    private Direccion direccion;
    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
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
    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public int getCodigoDireccion() {
        return direccion.getCodigo();
    }

    public boolean equalsByCodigoDireccion(Persona otraPersona) {
        //boolean resp = getCodigoDireccion() > otraPersona.getCodigoDireccion();
        boolean resp = this.getCodigoDireccion() > otraPersona.getCodigoDireccion();
        return resp;
    }
    public boolean equalsByCodigoDireccion(int codigoDireccion) {
        return getCodigoDireccion() == codigoDireccion;
    }

    @Override
    public String toString() {
        return "Persona [Nombre: " + nombre + ", Edad: " + edad + ", Dirección: " + direccion + "]";
    }
}
