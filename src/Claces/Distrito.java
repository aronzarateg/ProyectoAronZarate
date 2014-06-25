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
 *///ARON ZARATE GONZALES
public class Distrito 
{
    private int iddistrito;
    private int idregion;
    private String distrito;
    private String estado;

    public Distrito() {
    }

    public Distrito(int idregion, String distrito, String estado) {
        this.idregion = idregion;
        this.distrito = distrito;
        this.estado = estado;
    }

    public int getIddistrito() {
        return iddistrito;
    }

    public void setIddistrito(int iddistrito) {
        this.iddistrito = iddistrito;
    }

    public int getIdregion() {
        return idregion;
    }

    public void setIdregion(int idregion) {
        this.idregion = idregion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public static Distrito loadDistrito(ResultSet rs) throws SQLException{//sele adiciona la metodo
        //poruqe  es una consulta de la base de datos.
    Distrito d = new Distrito();
    d.setIddistrito(rs.getInt("iddistrito"));
    d.setIdregion(rs.getInt("idregion"));
    d.setDistrito(rs.getString("distrito"));
    d.setEstado(rs.getString("estado"));
    return d;
    
    }
}
