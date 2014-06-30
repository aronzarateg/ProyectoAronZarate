/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Claces.Iglesia;
import Claces.Tipo_Iglesia;
import Conexion.Conexxion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aron
 *///ARON ZARATE GONZALES
public class TipoIglesiaDAO
{
     private Connection cx;
     private Statement st;
    private ResultSet rs;
    private String sql;
    public ArrayList<Tipo_Iglesia> ListarTipo_Iglesia()
    {
        ArrayList<Tipo_Iglesia> lista= new ArrayList();
            try {
            cx=Conexxion.getConexion();
            sql="SELECT* FROM tipo_iglesia";
            st=cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                     Tipo_Iglesia d = new Tipo_Iglesia ();
                d.setIdti(rs.getInt("idtipo_iglesia"));
                d.setNom_tipo(rs.getString("tipo_iglesia"));
               
                lista.add(d);
                //lista.add(Tipo_Iglesia.loadTipoIglesia(rs));
                
            }
        } catch (Exception e) {
            Logger.getLogger(DistritoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
            return lista;
    }
    public int idTipoIglesia(String nom)
    {
        int id=0;
        sql="SELECT * FROM  tipo_iglesia WHERE tipo_iglesia='"+nom+"' ";
        try {
            cx=Conexxion.getConexion();
           
            st=cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
               id=rs.getInt("idtipo_iglesia");
            }
            
        } catch (SQLException e) {
            
        }

        return id;
    }
     
    
}
