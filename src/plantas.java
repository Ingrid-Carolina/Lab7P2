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

    public plantas() {
    super();
    }

    public plantas(String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
    }

   
   

    @Override
    public String toString() {
        return "plantas{" + '}';
    }

}
