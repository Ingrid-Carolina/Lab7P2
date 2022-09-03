/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class plantas extends Entidad{
 String rango;

    public plantas() {
    
    }

    public plantas(String rango) {
        this.rango = rango;
    }

    public plantas(String rango, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "plantas{" + "rango=" + rango + '}';
    }

    
   
    
   
}
