/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoentornos;

/**
 *
 * @author Daniel MP
 * @version version 1.0
 */
public class Linterna {
    
    private boolean encendido;

    public Linterna() {
        this.encendido = false;
    }
    
    public void encender(){
        System.out.println("Mucha luz!");
        this.setEncendido(true);
    }
    
    public void apagar (){
        System.out.println("Se va la luz");
        this.setEncendido(false);
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    } 
    
}
