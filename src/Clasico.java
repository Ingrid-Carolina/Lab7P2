/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author incah
 */
public class Clasico extends Zombies {
    int anosE;
    String bandera;
    String Dirrecion;

    public Clasico() {
        super();
    }

    public Clasico(int anosE, String bandera, String Dirrecion) {
        this.anosE = anosE;
        this.bandera = bandera;
        this.Dirrecion = Dirrecion;
    }

    public Clasico(int anosE, String bandera, String Dirrecion, String nombre, int ataque, int vida) {
        super(nombre, ataque, vida);
        this.anosE = anosE;
        this.bandera = bandera;
        this.Dirrecion = Dirrecion;
    }

    public int getAnosE() {
        return anosE;
    }

    public void setAnosE(int anosE) {
        this.anosE = anosE;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public String getDirrecion() {
        return Dirrecion;
    }

    public void setDirrecion(String Dirrecion) {
        this.Dirrecion = Dirrecion;
    }

    @Override
    public String toString() {
        return "Clasico{" +super.toString()+ "anosE=" + anosE + ", bandera=" + bandera + ", Dirrecion=" + Dirrecion + '}';
    }
    
}
