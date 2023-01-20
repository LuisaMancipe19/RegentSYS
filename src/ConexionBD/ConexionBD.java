



package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ConexionBD {
   
    Connection con;
    Statement stmt;
    ResultSet sr;

    
   
    public ConexionBD(){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/regentSYS","root","190226");
            System.out.println("conectado");
        }catch (Exception e){
            System.out.println("error no se conecto a la base de datos" + e);
        }
    }
    
    public static void main(String[] args) {
       ConexionBD cn=new ConexionBD();
        }
    
    public boolean executeUpdateStatement(String cad) {
        int r = 0;
        try {
            stmt = con.createStatement();
            r = stmt.executeUpdate(cad);
            System.out.println("Actualizacion realizada... " + r);
            stmt.close();
            return true;
        } catch (Exception ex) {
            System.out.println("No se pudo ejecutar la grabacion... " + ex);
            JOptionPane.showMessageDialog(null, "Se ha generado un error dado por: " + ex, "Critical Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    
     public ResultSet executeQueryStatement(String cad) {
        ResultSet res = null;
        try {
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            res = stmt.executeQuery(cad);
            System.out.println("Consulta realizada...");
        } catch (Exception ex) {
            System.out.println("No se pudo ejectuar la consulta... " + ex);
        }
        return res;
    }
     
     
    }
