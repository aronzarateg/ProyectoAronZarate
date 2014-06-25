/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Claces;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aron
 */
public class Iglesia {
    private int idiglesia;
    private int iddistrito;
    private int idtipoiglesia;
    private String iglesia;
    private int cuenta;

    public Iglesia() {
    }

    public Iglesia(int iddistrito, int idtipoiglesia, String iglesia, int cuenta) {
        this.iddistrito = iddistrito;
        this.idtipoiglesia = idtipoiglesia;
        this.iglesia = iglesia;
        this.cuenta = cuenta;
    }

    public int getIdiglesia() {
        return idiglesia;
    }

    public void setIdiglesia(int idiglesia) {
        this.idiglesia = idiglesia;
    }

    public int getIddistrito() {
        return iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public int getIdtipoiglesia() {
        return idtipoiglesia;
    }

    public void setIdtipoiglesia(int idtipoiglesia) {
        this.idtipoiglesia = idtipoiglesia;
    }

    public String getIglesia() {
        return iglesia;
    }

    public void setIglesia(String iglesia) {
        this.iglesia = iglesia;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    public static Iglesia loadIglesia(ResultSet rs) throws SQLException{//sele adiciona la metodo
        //poruqe  es una consulta de la base de datos.
    Iglesia igle = new Iglesia();
    igle.setIdiglesia(rs.getInt("idiglesia"));
    igle.setIddistrito(rs.getInt("iddistrito"));
     igle.setIdtipoiglesia(rs.getInt("idtipo_iglesia"));
    igle.setIglesia(rs.getString("iglesia"));
    igle.setCuenta(rs.getInt("cuenta"));
   return igle;
    
    }
}
