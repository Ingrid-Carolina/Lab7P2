/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class Defensa extends plantas {
    private int altura;
    private int dureza;
    private int peso;

    public Defensa() {
    }

    public Defensa(int altura, int dureza, int peso, String rango, String nombre, int ataque, int vida) {
        super(rango, nombre, ataque, vida);
        this.altura = altura;
        this.dureza = dureza;
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Defensa{" + "/nombre="+ getNombre()+ " /Ataque= "+ getAtaque()+" /Vida= "+ getVida()+  " /Rango= "+ getRango()+" /altura= " + altura + " /dureza=" + dureza + " /peso=" + peso + '}';
    }

   
    
}
