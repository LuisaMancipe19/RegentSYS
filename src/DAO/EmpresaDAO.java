/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexionBD;
import DTO.EmpresaDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmpresaDAO {
    private ConexionBD conexion;
    
    public EmpresaDAO(){
        conexion =new ConexionBD();
    }
    
    public boolean insertarEmpresa (EmpresaDTO EmpresaDTO){
        String cadenaSQL = "insert into regentSYS.empresa (Nit_empresa,Descripcion_empresa,id_estado)" + 
                           " VALUES ('"+EmpresaDTO.getNit()+"','"+EmpresaDTO.getDescripcion()+"','"+EmpresaDTO.getIdEstado()+"')";
        System.out.println(" cadenaSQL "+cadenaSQL);
        return conexion.executeUpdateStatement(cadenaSQL); 
    }

    
    public boolean actualizarEmpresa (EmpresaDTO EmpresaDTO){
       String cadenaSQL = "update regentSYS.empresa set Nit_empresa = '"+EmpresaDTO.getNit()+"', Descripcion_empresa = '"+EmpresaDTO.getDescripcion()+"',id_estado = '"+EmpresaDTO.getIdEstado()+"'  where Nit_empresa = '"+EmpresaDTO.getNit()+"' ";
       System.out.println(" cadenaSQL "+cadenaSQL);
       return conexion.executeUpdateStatement(cadenaSQL); 
    }
    
    
    public EmpresaDTO consultarEmpresa(String Numeronit) {
        String cadenaSQL = "select * from regentSYS.empresa Descripcion_empresa where '"+Numeronit+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        EmpresaDTO EmpresaDTO = null;
        try{
            while(resultadoConsulta.next()){
                EmpresaDTO = new EmpresaDTO();
                EmpresaDTO.setIdEmpresa(resultadoConsulta.getString("id_empresa"));
                EmpresaDTO.setNit(resultadoConsulta.getString("Nit_empresa"));
                EmpresaDTO.setDescripcion(resultadoConsulta.getString("Descripcion_Empresa"));
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase EmpresaDAO "+ex.getMessage());
        }
        return EmpresaDTO;
    }


    public List<EmpresaDTO> consultarListaEmpresa() {
         String cadenaSQL = "select * from regentSYS.empresa";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        List<EmpresaDTO> listaEmpresaDTO = new ArrayList<>();
        try{
            while(resultadoConsulta.next()){
                EmpresaDTO EmpresaDTO = new EmpresaDTO();
                EmpresaDTO.setIdEmpresa(resultadoConsulta.getString("id_empresa"));
                EmpresaDTO.setNit(resultadoConsulta.getString("Nit_empresa"));
                EmpresaDTO.setDescripcion(resultadoConsulta.getString("Descripcion_empresa"));
                listaEmpresaDTO.add(EmpresaDTO);
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase EmpresaDAO "+ex.getMessage());
        }
        return listaEmpresaDTO; }
    }


    
