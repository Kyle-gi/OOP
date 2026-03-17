package fileWriter;

import java.util.Random;

public class Persona {
    private String nombre;
    private String nif;

    public Persona(String nombre, String nif){
        this.nif =nif;
        this.nombre = nombre;
    }

    public Persona(){
        Random rand = new Random();
        nombre = Constantes.NOMBRES[rand.nextInt(Constantes.NOMBRES.length)];
        nif = String.valueOf(rand.nextLong(1000000)) + (char)(rand.nextInt(54, 65));
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
