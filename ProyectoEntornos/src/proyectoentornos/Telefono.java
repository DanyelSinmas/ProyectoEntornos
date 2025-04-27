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
public abstract class Telefono {
    /**
     * PUK generado aleatoriamente a la hora de crear el teléfono
     */
    private final String PUK;
    /**
     * Precio del teléfono, mas alto o bajo dependiendo del modelo
     */
    private double precio;
    /**
     * Color del modelo, se debe pasar como parámetro en el constructor
     */
    private String color;
    /**
     * Batería del modelo, la carga máxima es 100
     */
    private int bateria;
    /**
     * Indica el modelo del teléfono, puede ser android o Pijiphone
     */
    private String marca;
    /**
     * Cuenta el número de llamadas del teléfono en particular
     */
    private int llamadas;
    /**
     * Cuenta todas las llamadas en general de todos los teléfonos (independientemente de su marca)
     */
    private static int numeroTotalLLamadas;
    /**
     * Accesorio externo que se puede implementar después
     */
    Linterna linternita;
    
    /**
     * Constructor, con varios parámetros preestablecidos
     * @param colorIn
     * @param precioIn
     * @param marca 
     */
    public Telefono(String colorIn, double precioIn, String marca) {
        this.color = colorIn;
        this.PUK = "" + (int) Math.floor(Math.random() * 100000000);
        this.precio = precioIn;
        this.bateria = 0;
    }
    
    /**
     * Método abstracto que se define en las hijas
     */
    public abstract void cargar();
    /**
     * Getter para conocer el puk del teléfono
     * @return 
     */
    public String getPuk() {
        return PUK;
    }
    /**
     * Getter para conocer el precio del teléfono
     * @return 
     */
    public double getPrecio() {
        return precio;
    }
 
    /**
     * Getter para conocer el color de teléfono
     * @return 
     */
    public String getColor() {
        return color;
    }

    /**
     * Getter para conocer la batería actual del teléfono
     * @return 
     */
    public int getBateria() {
        return bateria;
    }

    /**
     * Getter para conocer la marca del teléfono
     * @return 
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Getter para conocer la linterna del teléfono
     * @return 
     */
    public Linterna getLinternita() {
        return linternita;
    }
    /**
     * Setter para añadir la linterna al teléfono
     * @param linternita 
     */
    public void setLinternita(Linterna linternita) {
        this.linternita = linternita;
    }
    
    /**
     * Método para llamar, en el pijiphone se añaden unas lineas de voz extra
     */
    public void llamar() {
        System.out.println("Piiiiii piiiiiiiiii");
        this.esperar(3);
        System.out.println("--Conversacion Privada--");
        this.esperar(4);
        System.out.println("pi pi pi pi pi");
        this.setLlamadas(this.getLlamadas() + 1);
        Telefono.setNumeroTotalLLamadas(Telefono.getNumeroTotalLLamadas() + 1);
    }

    /**
     * Setter para aumentar el número total de llamadas
     * @param numeroTotalLLamadas 
     */
    public static void setNumeroTotalLLamadas(int numeroTotalLLamadas) {
        Telefono.numeroTotalLLamadas = numeroTotalLLamadas;
    }

    /**
     * Getter para conocer el número total de llamadas
     * @return 
     */
    public static int getNumeroTotalLLamadas() {
        return numeroTotalLLamadas;
    }
    
    /**
     * Getter para conocer el número de llamdas del teléfono en particular
     * @return 
     */
    public int getLlamadas() {
        return llamadas;
    }


    
    /**
    * Este metodo sirve para esperar
    * @param segundos numero de segundos de espera
    */
    void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    /**
     * Setter para aumentar el número de llamadas del teléfono en particular
     * @param i 
     */
    private void setLlamadas(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Setter para añadir la carga al teléfono
     * @param bateria 
     */
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }
    
    

}
