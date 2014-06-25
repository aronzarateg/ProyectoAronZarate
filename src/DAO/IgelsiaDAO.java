/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Claces.Iglesia;
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
public class IgelsiaDAO {
     private Connection cx;
     private Statement st;
    private ResultSet rs;
    private String sql;
    public ArrayList<Iglesia> ListarDistrito()
    {
        ArrayList<Iglesia> lista= new ArrayList();
            try {
            cx=Conexxion.getConexion();
            sql="SELECT* FROM iglesia";
            st=cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                lista.add(Iglesia.loadIglesia(rs));
                
            }
        } catch (Exception e) {
            Logger.getLogger(DistritoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
            return lista;
    }
    
}
