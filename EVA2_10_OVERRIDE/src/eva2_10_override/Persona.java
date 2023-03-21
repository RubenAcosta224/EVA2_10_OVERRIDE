/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_10_override;

/**
 *
 * @author invitado
 */
public class Persona{
    private String nombre;
    private int edad;



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }
    Persona(){
        this.nombre = "---";
        this.edad = 0;
    }

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        //no estamos invocando al metdo sobreescrito de la clase, lo reemplazamos de la superclase
        String cade="Datos:\n"
                +"Nombre: "+nombre+"\n"+
                "Edad: "+edad;
        
        return cade;
    }
}
