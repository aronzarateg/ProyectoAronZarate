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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aron
 */
public class IgelsiaDAO {
     private Connection cx;
     private Statement st;
    private ResultSet rs;
    private String sql;
    int op=0;
    public ArrayList<Iglesia> ListarIglesia()
    {
        ArrayList<Iglesia> lista= new ArrayList();
            try {
            cx=Conexxion.getConexion();
            sql="SELECT* FROM iglesia";
            st=cx.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                 Iglesia d = new Iglesia();
                d.setIdiglesia(rs.getInt("idiglesia"));
                d.setIddistrito(rs.getInt("iddistrito"));
                d.setIdtipoiglesia(rs.getInt("idtipo_iglesia"));
                d.setIglesia(rs.getString("iglesia"));
                 d.setCuenta(rs.getInt("cuenta"));
                lista.add(d);
                //lista.add(Iglesia.loadIglesia(rs));
                
            }
        } catch (Exception e) {
            Logger.getLogger(DistritoDAO.class.getName()).log(Level.SEVERE, null, e);
        }
            return lista;
    }
     public int registrarIglesia(int idd, int idti, String nom, int cuenta){
        int idp = maxidIglesia() + 1;
    sql = "INSERT INTO iglesia VALUES('"+idp+"','"+idd+"',"
            + "'"+idti+"','"+nom+"','"+cuenta+"')";
        try {
            cx = Conexxion.getConexion();
            st = cx.createStatement();
            op = st.executeUpdate(sql);
        } catch (SQLException e) {
        }
    return op;
    }
     
    public int maxidIglesia(){
    int v =0;
    sql = "SELECT MAX(idiglesia) AS id FROM iglesia";
        try {
            cx = Conexxion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                    v = rs.getInt("id");
                }
        } catch (SQLException e) {
        }
    return v;
    }
    public int modificarIglesia(int iddistrito,int idiglesia,int idtipoIglesia, String iglesia,int cuenta){//ingresar tres valores y comprarlos con el id
    sql="UPDATE iglesia set iddistrito='"+iddistrito+"', idtipo_iglesia='"+idtipoIglesia+"',iglesia='"+iglesia+"',cuenta='"+cuenta+"' WHERE idiglesia='"+idiglesia+"'";
       
        try {
            cx = Conexxion.getConexion();
            st = cx.createStatement();
            op = st.executeUpdate(sql);
        } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    return op;
    }
}
