/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class Explosiva extends plantas {
    private int explosion;

    public Explosiva() {
    }

    public Explosiva(int explosion, String rango, String nombre, int ataque, int vida) {
        super(rango, nombre, ataque, vida);
        this.explosion = explosion;
    }

    public int getExplosion() {
        return explosion;
    }

    public void setExplosion(int explosion) {
        this.explosion = explosion;
    }

    @Override
    public String toString() {
        return "Explosiva{" + "/nombre="+ getNombre()+ " /Ataque= "+ getAtaque()+" /Vida= "+ getVida()+  " /Rango= "+ getRango()+" /explosion= " + explosion + '}';
    }

    
   
    
}
