/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoentornos;

/**
 *
 * @author Daniel MP
 * @version version 1.0
 * @see Telefono Clase madre de la que hereda 
 */
public class Pijiphone extends Telefono {
    
    private Gps gpsPijo;
    
    public Pijiphone(String colorIn) {
        super(colorIn, 700,"Pijiphone");
        this.gpsPijo = new Gps();
    }

    /**
     * Método que añade los mensajes extras del pijiphone
     */
    @Override
    public void llamar() {
        System.out.println("Esta conversacion será grabada");
        super.llamar();
        System.out.println("Esta conversacion se ha grabado");
    }

    /**
     * Método que sirve para cargar el teléfono
     */
    @Override
    public void cargar() {
        this.setBateria(this.getBateria() + 70);
        if(this.getBateria() > 100){
            this.setBateria(100);
        }
    }
    
}
