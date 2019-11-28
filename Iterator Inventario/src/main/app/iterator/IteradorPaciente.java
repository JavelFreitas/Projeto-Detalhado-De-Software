package main.app.iterator;

import java.util.ArrayList;

public class IteradorPaciente implements Iterador{
    Object[] pacientes;
    int posicao;
    public IteradorPaciente(ArrayList<Paciente> paciente){
        this.pacientes = paciente.toArray();
        this.posicao = 0;
    }

    public boolean temProximo() {
        if(posicao >= 0){
            return true;
        }
        return false;
        
    }

    public Paciente proximo(){
        Paciente pac = (Paciente) this.pacientes[posicao];
        posicao+=3;
        return pac;
    }

    public Object intercala(Object[] pac, int ini, int fim) {
        Object pac1 = new Object();
        Object pac2 = new Object();


        for (int i = ini; i < meio; i++)  pac1[i] = pac[i+1];
        for (int i = 0; i < pac.length; i++) {
            
        }

        return pac;
    }

    public void mergeSort(Object[] pac, int ini, int fim) {
        if(ini < fim){
            int meio = (fim - ini)/2;
            mergeSort(pac, ini, meio);
            mergeSort(pac, meio+1, fim);
            intercala(pac, ini, fim);    
        }
        


    }


    
}