package app;

import java.util.ArrayList;


public class IteradorConcreto implements Iterador {

    ArrayList<Integer> lista;
    int atual;

    public IteradorConcreto(){
        this.lista = new ArrayList<Integer>();
        atual = -1;
    }

    public Integer procurar(int procuravel){
        try {
            Integer achado = this.lista.get((procuravel));
            return achado;
        } catch (IndexOutOfBoundsException naoExiste) {
            System.out.println("Index "+ procuravel + " fora de alcance");
            return new Integer(-1);
        }
        
    }

    public void setAtual(int atual) {
        this.atual = atual;
    }

    public int getAtual() {
        return procurar(atual);
    }

    public void proximo() {
        setAtual(procurar(atual));
    }

    public void anterior() {
        setAtual(procurar(atual-1));
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }

    public void setlista(ArrayList<Integer> lista) {
        this.lista = lista;
    }

    public void mostrarLista(){
        for (Integer elemento : lista) {
            System.out.println(elemento);

        }
    }

    public void adicionarElemento(int novoInteiro) {
        if(atual == -1){
            atual = 0;
        }
        lista.add(novoInteiro);
    }
    
}