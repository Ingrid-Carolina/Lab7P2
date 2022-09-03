/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class Disparo extends plantas {
    private String proyectil;
    private String Color;

    public Disparo() {
    }

    public Disparo(String proyectil, String Color, String rango, String nombre, int ataque, int vida) {
        super(rango, nombre, ataque, vida);
        this.proyectil = proyectil;
        this.Color = Color;
    }

    public String getProyectil() {
        return proyectil;
    }

    public void setProyectil(String proyectil) {
        this.proyectil = proyectil;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Disparo{"+ "/nombre="+ getNombre()+ " /Ataque= "+ getAtaque()+" /Vida= "+ getVida()+ " /Rango= "+ getRango()+ " /proyectil=" + proyectil + " /Color=" + Color + '}';
    }

    

    
    
}
