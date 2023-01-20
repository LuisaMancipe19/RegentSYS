/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexionBD;
import DTO.TipoItemDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Auxfacturacion
 */
public class TipoItemDAO {
    private ConexionBD conexion;
    
    public TipoItemDAO(){
        conexion =new ConexionBD();
    }
    
    public boolean insertarTipoItem (TipoItemDTO TipoItemDTO){
        String cadenaSQL = "insert into regentSYS.tipo_item (Descripcion_tipo)" + 
                           " VALUES ('"+TipoItemDTO.getDescripcion()+"')";
        System.out.println(" cadenaSQL "+cadenaSQL);
        return conexion.executeUpdateStatement(cadenaSQL); 
    }
    
    public TipoItemDTO consultarItem(String tipoItem) {
        String cadenaSQL = "select * from regentSYS.tipo_item where Descripcion_tipo= '"+tipoItem+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        TipoItemDTO TipoItemDTO = null;
        try{
            while(resultadoConsulta.next()){
                TipoItemDTO = new TipoItemDTO();
                TipoItemDTO.setDescripcion(resultadoConsulta.getString("Descripcion_tipo"));
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase TipoItemDAO "+ex.getMessage());
        }
        return TipoItemDTO;
    }
    
        public List<TipoItemDTO> consultarListaItem() {
         String cadenaSQL = "select * from regentSYS.tipo_item";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        List<TipoItemDTO> listaTipoItemDTO = new ArrayList<>();
        try{
            while(resultadoConsulta.next()){
                TipoItemDTO TipoItemDTO = new TipoItemDTO();
                TipoItemDTO.setTipoItem(resultadoConsulta.getInt("id_tipoItem"));
                TipoItemDTO.setDescripcion(resultadoConsulta.getString("Descripcion_tipo"));
                listaTipoItemDTO.add(TipoItemDTO);
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase TipoItemDAO "+ex.getMessage());
        }
        return listaTipoItemDTO; }
    
    
}
