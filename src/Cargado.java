
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class Cargado extends Zombies {
    int tama;
    int edad;
    int enojo;
    String persona;

    public Cargado() {
    }

    public Cargado(int tama, int edad, int enojo, String persona, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.tama = tama;
        this.edad = edad;
        this.enojo = enojo;
        this.persona = persona;
    }

    Cargado(int tam, int edad, int enojo, DefaultListModel modelo, String nombre, int ataque, int vida) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getTama() {
        return tama;
    }

    public void setTama(int tama) {
        this.tama = tama;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEnojo() {
        return enojo;
    }

    public void setEnojo(int enojo) {
        this.enojo = enojo;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Cargado{" + "/nombre="+ getNombre()+ " /Ataque= "+ getAtaque()+" /Vida= "+ getVida()+ "/tama= " + tama + " /edad=" + edad + " /enojo=" + enojo + " /persona=" + persona + '}';
    }

    
}
