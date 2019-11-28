package main.app.generic;

import java.util.ArrayList;

public class General<T> {
    // T stands for "Type"
    private ArrayList<T> t;
    String name;

    public General(ArrayList<T> t , String nome){
        this.name = nome;
        this.t = t;
    }

    public void set(ArrayList<T> t) { this.t = t; }
    public ArrayList<T> get() { return t; }
}