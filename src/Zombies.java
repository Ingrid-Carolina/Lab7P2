/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class Zombies extends Entidad{

    public Zombies() {
    super();
    }

    public Zombies(String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
    }

    
    @Override
    public String toString() {
        return "Zombies{" + '}';
    }
  
}
