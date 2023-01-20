/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexionBD;
import DTO.ItemDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Auxfacturacion
 */
public class ItemDAO {
    private ConexionBD conexion;
    
    public ItemDAO(){
        conexion =new ConexionBD();
    }
    
    public boolean insertarItem (ItemDTO ItemDTO){
    String cadenaSQL = "insert into regentSYS.item (Codigo_item, Descripcion_item, id_tipoItem, id_estado)" +
                          " VALUES ('"+ItemDTO.getCodigoItem()+"', '"+ItemDTO.getDescripcion()+"', '"+ItemDTO.getIdTipoItem()+"', '"+ItemDTO.getIdEstado()+"')";
    System.out.println(" cadenaSQL "+cadenaSQL);    
    return conexion.executeUpdateStatement(cadenaSQL);    
    }
    
    public boolean actualizarItem (ItemDTO ItemDTO){
        String cadenaSQL = "update regentSYS.item set Codigo_item = '"+ItemDTO.getCodigoItem()+"', Descripcion_item = '"+ItemDTO.getDescripcion()+"',id_tipoItem = '"+ItemDTO.getIdTipoItem()+"', id_estado = '"+ItemDTO.getIdEstado()+"' where Codigo_item = '"+ItemDTO.getCodigoItem()+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        return conexion.executeUpdateStatement(cadenaSQL);
    }
    
    public ItemDTO consultarItem(String Codigo) {
        String cadenaSQL = "select * from regentSYS.item where Codigo_item = '"+Codigo+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        ItemDTO ItemDTO = null;
        try{
            while(resultadoConsulta.next()){
                ItemDTO = new ItemDTO();
                ItemDTO.setIditem(resultadoConsulta.getString("id_item"));
                ItemDTO.setCodigo(resultadoConsulta.getString("Codigo_item"));
                ItemDTO.setDescripcion(resultadoConsulta.getString("Descripcion_item"));
                ItemDTO.setIdTipoItem(resultadoConsulta.getInt("id_tipoItem"));
                ItemDTO.setIdEstado(resultadoConsulta.getInt("id_estado"));
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase ItemDAO "+ex.getMessage());
        }
        return ItemDTO;
    }
    
    public List<ItemDTO> consultarListaItems() {
         String cadenaSQL = "select * from regentSYS.item";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        List<ItemDTO> listaItemDTO = new ArrayList<>();
        try{
            while(resultadoConsulta.next()){
                ItemDTO ItemDTO = new ItemDTO();
                ItemDTO.setCodigo(resultadoConsulta.getString("Codigo_item"));
                ItemDTO.setDescripcion(resultadoConsulta.getString("Descripcion_item"));
                ItemDTO.setIdTipoItem(resultadoConsulta.getInt("id_tipoItem"));
                ItemDTO.setIdEstado(resultadoConsulta.getInt("id_estado"));
                listaItemDTO.add(ItemDTO);
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase ItemDAO "+ex.getMessage());
        }
        return listaItemDTO; 
    }

}
