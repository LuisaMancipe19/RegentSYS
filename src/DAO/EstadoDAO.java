/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexionBD;
import DTO.EstadoDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Auxfacturacion
 */
public class EstadoDAO {
    private ConexionBD conexion;
    
    public EstadoDAO(){
        conexion =new ConexionBD();
    }
    
        public boolean insertarEstado (EstadoDTO EstadoDTO){
        String cadenaSQL = "insert into regentSYS.estado (Descripcion_estado, Criterio_estado" +
                           " VALUES ('"+EstadoDTO.getDescripcionEstado()+"', '"+EstadoDTO.getCriterioEstado()+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        return conexion.executeUpdateStatement(cadenaSQL);
    }
        
        public EstadoDTO consultarEstado (String Descripcion) {
        String cadenaSQL = "select * from regentSYS.estado where Descripcion_estado = '"+Descripcion+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        EstadoDTO EstadoDTO = null;
        try{
            while(resultadoConsulta.next()){
                EstadoDTO = new EstadoDTO();
                EstadoDTO.setDescripcionEstado(resultadoConsulta.getString("id_estado"));
                EstadoDTO.setDescripcionEstado(resultadoConsulta.getString("Descripcion_estado"));
                EstadoDTO.setCriterioEstado(resultadoConsulta.getBoolean("Criterio_estado"));
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase EstadoDAO "+ex.getMessage());
        }
        return EstadoDTO;
    }  
    
        public List<EstadoDTO> consultarlistaEstado() {
        String cadenaSQL = "select * from regentSYS.estado";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        List<EstadoDTO> listaEstadoDTO = new ArrayList<>();
        try{
            while(resultadoConsulta.next()){
                EstadoDTO EstadoDTO = new EstadoDTO();
                EstadoDTO.setIdEstado(resultadoConsulta.getInt("id_estado"));
                EstadoDTO.setDescripcionEstado(resultadoConsulta.getString("Descripcion_estado"));
                EstadoDTO.setCriterioEstado(resultadoConsulta.getBoolean("Criterio_estado"));
                listaEstadoDTO.add(EstadoDTO);
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase EstadoDAO "+ex.getMessage());
        }
        return listaEstadoDTO; 
    }
}
