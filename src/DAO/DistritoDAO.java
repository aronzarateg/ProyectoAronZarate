/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Claces.Distrito;
import Conexion.Conexxion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aron
 */
public class DistritoDAO 
{
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    public ArrayList<Distrito> ListarDistrito()
    {
        ArrayList<Distrito> lista= new ArrayList();
            try {
            cx=Conexxion.getConexion();
            sql="SELECT* FROM distrito";
            st=cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                Distrito d = new Distrito();
                d.setIddistrito(rs.getInt("iddistrito"));
                d.setIdregion(rs.getInt("idregion"));
                d.setDistrito(rs.getString("distrito"));
                d.setEstado(rs.getString("estado"));
                //lista.add(Distrito.loadDistrito(rs));
                lista.add(d);
                
            }
        } catch (Exception e) {
            Logger.getLogger(DistritoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
            return lista;
    }
    public int idDistrito(String nom)
    {
        int id=0;
        sql="SELECT * FROM  distrito WHERE distrito='"+nom+"' ";
        try {
            cx=Conexxion.getConexion();
           
            st=cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
               id=rs.getInt("iddistrito");
            }
            
        } catch (Exception e) {
        }

        return id;
    }
    
}
