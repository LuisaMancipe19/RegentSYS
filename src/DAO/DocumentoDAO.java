/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexionBD;
import DTO.DocumentoDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Auxfacturacion
 */
public class DocumentoDAO {
    private ConexionBD conexion;
    
    public DocumentoDAO(){
        conexion =new ConexionBD();
    }
    
    public boolean insertarTipoDocumento (DocumentoDTO DocumentoDTO){
        String cadenaSQL = "insert into regentSYS.documento (Abreviatura_documento, Descripcion_documento" +
                           " VALUES '"+DocumentoDTO.getAbreviatura()+"', '"+DocumentoDTO.getdescripcionDocumento()+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        return conexion.executeUpdateStatement(cadenaSQL);
    }
    
    public DocumentoDTO consultarTipoDocumento (String Descripcion) {
        String cadenaSQL = "select * from regentSYS.documento where Descripcion_documento = '"+Descripcion+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        DocumentoDTO DocumentoDTO = null;
        try{
            while(resultadoConsulta.next()){
                DocumentoDTO = new DocumentoDTO();
                DocumentoDTO.setIdDocumento(resultadoConsulta.getInt("id_tipoDocumento"));
                DocumentoDTO.settipoDocumento(resultadoConsulta.getString("Abreviatura_documento"));
                DocumentoDTO.setdescripcionDocumento(resultadoConsulta.getString("Descripcion_documento"));
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase DocumentoDAO "+ex.getMessage());
        }
        return DocumentoDTO;
    }
    
        public List<DocumentoDTO> consultarlistaTipoDocumento() {
        String cadenaSQL = "select * from regentSYS.documento";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        List<DocumentoDTO> listaDocumentoDTO = new ArrayList<>();
        try{
            while(resultadoConsulta.next()){
                DocumentoDTO DocumentoDTO = new DocumentoDTO();
                DocumentoDTO.setIdDocumento(resultadoConsulta.getInt("id_tipoDocumento"));
                DocumentoDTO.settipoDocumento(resultadoConsulta.getString("Abreviatura_documento"));
                DocumentoDTO.setdescripcionDocumento(resultadoConsulta.getString("Descripcion_documento"));
                listaDocumentoDTO.add(DocumentoDTO);
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase DocumentoDAO "+ex.getMessage());
        }
        return listaDocumentoDTO; 
    }
        
        
}
