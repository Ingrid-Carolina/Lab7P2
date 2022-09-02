/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class comida extends Zombies{
    String comida;

    public comida(String comida) {
        this.comida = comida;
    }

    public comida(String comida, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.comida = comida;
    }

    public comida() {
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    @Override
    public String toString() {
        return  comida ;
    }
    
}
