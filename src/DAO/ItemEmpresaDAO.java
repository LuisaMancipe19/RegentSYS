/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexionBD;
import DTO.ItemEmpresaDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Auxfacturacion
 */
public class ItemEmpresaDAO {
    private ConexionBD conexion;
    
    public ItemEmpresaDAO(){
        conexion =new ConexionBD();
    }
    
    public boolean insertarTarifa (ItemEmpresaDTO ItemEmpresaDTO){
        String cadenaSQL = "insert into regentSYS.item_empresa (id_item, id_empresa, Tarifas)" + 
                           " VALUES ('"+ItemEmpresaDTO.getIditem()+"','"+ItemEmpresaDTO.getIdEmpresa()+"', '"+ItemEmpresaDTO.getValor()+"')";
        System.out.println(" cadenaSQL "+cadenaSQL);
        return conexion.executeUpdateStatement(cadenaSQL); 
    } 
    
    public boolean actualizarTarifa(ItemEmpresaDTO ItemEmpresaDTO){
        String cadenaSQL = "update regentSYS.item_empresa set Tarifas = '"+ItemEmpresaDTO.getValor()+"' where Codigo_item = '"+ItemEmpresaDTO.getIditem()+"' and id_empresa = '"+ItemEmpresaDTO.getIdEmpresa()+"' "; 
        System.out.println(" cadenaSQL "+cadenaSQL);
        return conexion.executeUpdateStatement(cadenaSQL);
    }
    
     public ItemEmpresaDTO consultarTarifa(String Codigo) {
        String cadenaSQL = "select * from seminario.tarifas where Codigo = '"+Codigo+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        ItemEmpresaDTO ItemEmpresaDTO = null;
        try{
            while(resultadoConsulta.next()){
                ItemEmpresaDTO = new ItemEmpresaDTO();
                ItemEmpresaDTO.setIditem(resultadoConsulta.getInt("id_item"));
                ItemEmpresaDTO.setIdEmpresa(resultadoConsulta.getInt("id_empresa"));
                ItemEmpresaDTO.setValor(resultadoConsulta.getString("Tarifas"));             
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase ItemEmpresaDAO "+ex.getMessage());
        }
        return ItemEmpresaDTO;
    }
     
     public List<ItemEmpresaDTO> consultarlistatarifa() {
        String cadenaSQL = "select * from regentSYS.estado";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        List<ItemEmpresaDTO> listaItemEmpresaDTO = new ArrayList<>();
        try{
            while(resultadoConsulta.next()){
                ItemEmpresaDTO ItemEmpresaDTO = new ItemEmpresaDTO();
                ItemEmpresaDTO.setIditem(resultadoConsulta.getInt("id_tarifa"));
                ItemEmpresaDTO.setIditem(resultadoConsulta.getInt("id_item"));
                ItemEmpresaDTO.setIdEmpresa(resultadoConsulta.getInt("id_empresa"));
                ItemEmpresaDTO.setValor(resultadoConsulta.getString("Tarifas"));
                listaItemEmpresaDTO.add(ItemEmpresaDTO);
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase EstadoDAO "+ex.getMessage());
        }
        return listaItemEmpresaDTO; 
    }
     
}
