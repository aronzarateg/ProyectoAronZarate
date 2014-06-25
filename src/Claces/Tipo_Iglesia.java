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
public class Tipo_Iglesia {
    private int itti;
    private String nom_tipo;

    public Tipo_Iglesia() {
    }

    public Tipo_Iglesia(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }

    public int getItti() {
        return itti;
    }

    public void setItti(int itti) {
        this.itti = itti;
    }

    public String getNom_tipo() {
        return nom_tipo;
    }

    public void setNom_tipo(String nom_tipo) {
        this.nom_tipo = nom_tipo;
    }
     public static Tipo_Iglesia loadTipoIglesia(ResultSet rs) throws SQLException{
    Tipo_Iglesia igle = new Tipo_Iglesia();
    igle.setItti(rs.getInt("idtipo_iglesia"));
    igle.setNom_tipo(rs.getString("tipo_iglesia"));
   
   return igle;
    
    }
    
}