package fileWriter;

import java.util.ArrayList;

public class Database {
    private ArrayList<Persona>  personas;


    public Database(ArrayList<Persona> personas){
        this.personas = personas;
    }

    public Database(){
        this(20);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
}
