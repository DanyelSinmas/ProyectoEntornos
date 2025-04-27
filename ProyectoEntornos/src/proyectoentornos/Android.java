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
public class Android extends Telefono {

    public Android(String colorIn) {
        super(colorIn, 200, "&-roid");

    }

    /**
     * 
     * Este método permite ejecutar el paint
     */
    public void pintar() {
        try {
            ProcessBuilder proceso = new ProcessBuilder("mspaint.exe");
            proceso.start();
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

    }
    
    /**
     * 
     * Este método carga la batería del teléfono
     */
    @Override
    public void cargar() {
        int carga = 0;
        carga = (this.getBateria()/3) + 20;
        this.setBateria(carga);
    }


}
