
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalasDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegistrarSala(Salas sl){
        String sql = "INSERT INTO salas(nombre, mesas) VALUES (?,?)";
        try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setString(1, sl.getNombre());
           ps.setInt(2, sl.getMesas());
           ps.execute();
           return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public List Listar(){
        List<Salas> Lista = new ArrayList();
        String sql = "SELECT * FROM salas";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                Salas sl = new Salas();
                sl.setId(rs.getInt("id"));
                sl.setNombre(rs.getString("nombre"));
                sl.setMesas(rs.getInt("mesas"));
                Lista.add(sl);
            }
            
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return Lista;
    }
    
    public boolean Eliminar(int id){
        String sql = "DELETE FROM salas WHERE id = ? ";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public boolean Modificar(Salas sl){
        String sql = "UPDATE salas SET nombre=?, mesas=? WHERE id=?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, sl.getNombre());
            ps.setInt(2, sl.getMesas());
            ps.setInt(3, sl.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
}
