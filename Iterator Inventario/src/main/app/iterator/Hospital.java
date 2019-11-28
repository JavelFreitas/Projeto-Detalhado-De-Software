package main.app.iterator;

import java.util.ArrayList;

public class Hospital implements Agregador{
    ArrayList<Paciente> pacientes;

    public Hospital(){
        this.pacientes = new ArrayList<Paciente>(); 
    }

    public IteradorPaciente criarIterador() {
        return new IteradorPaciente(this.pacientes);
    }
    
} 