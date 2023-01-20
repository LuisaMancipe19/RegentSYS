/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConexionBD.ConexionBD;
import DTO.EmpresaDTO;
import DTO.UsuariosDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Auxfacturacion
 */
public class UsuariosDAO {
    private ConexionBD conexion;
    
    public UsuariosDAO(){
        conexion =new ConexionBD();
    }
    
    public boolean insertarPersona (UsuariosDTO UsuariosDTO){
        String cadenaSQL = "insert into regentSYS.usuarios (id_tipoDocumento, Documento, Nombre1, Nombre2, Apellido1, Apellido2, Usuario,Contraseña, id_estado)" + 
                           " VALUES ( '"+UsuariosDTO.getIdTipoDocumento()+"','"+UsuariosDTO.getDocumento()+"', '"+UsuariosDTO.getNombre1()+"', '"+UsuariosDTO.getNombre2()+"', '"+UsuariosDTO.getApellido1()+"', '"+UsuariosDTO.getApellido2()+"', '"+UsuariosDTO.getUsuario()+"','"+UsuariosDTO.getContraseña()+"', '"+UsuariosDTO.getIdEstado()+"')";
        System.out.println(" cadenaSQL "+cadenaSQL);
        return conexion.executeUpdateStatement(cadenaSQL); 
    } 
    
    public boolean actualizarPersona (UsuariosDTO UsuariosDTO){
        String cadenaSQL = "update regentSYS.usuarios set id_tipoDocumento = '"+UsuariosDTO.getIdTipoDocumento()+"', Documento = '"+UsuariosDTO.getDocumento()+"', Nombre1 = '"+UsuariosDTO.getNombre1()+"', Nombre2 = '"+UsuariosDTO.getNombre2()+"',Apellido1 = '"+UsuariosDTO.getApellido1()+"',Apellido2 = '"+UsuariosDTO.getApellido2()+"', id_estado = '"+UsuariosDTO.getIdEstado()+"' where Documento = '"+UsuariosDTO.getDocumento()+"'"; 
        System.out.println(" cadenaSQL "+cadenaSQL);
        return conexion.executeUpdateStatement(cadenaSQL);
    }
    
    public UsuariosDTO consultarPersona(String documento) {
        String cadenaSQL = "select * from regentSYS.usuarios where Documento = '"+documento+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        UsuariosDTO UsuariosDTO = null;
        try{
            while(resultadoConsulta.next()){
                UsuariosDTO = new UsuariosDTO();
                UsuariosDTO.setIdTipoDocumento(resultadoConsulta.getInt("id_tipoDocumento"));
                UsuariosDTO.setDocumento(resultadoConsulta.getString("Documento"));
                UsuariosDTO.setNombre1(resultadoConsulta.getString("Nombre1"));
                UsuariosDTO.setNombre2(resultadoConsulta.getString("Nombre2"));
                UsuariosDTO.setApellido1(resultadoConsulta.getString("Apellido1"));
                UsuariosDTO.setApellido2(resultadoConsulta.getString("Apellido2"));
                UsuariosDTO.setUsuario(resultadoConsulta.getString("Usuario"));
                UsuariosDTO.setUsuario(resultadoConsulta.getString("Contraseña"));
                UsuariosDTO.setIdEstado(resultadoConsulta.getInt("id_estado"));
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase UsuariosDTO "+ex.getMessage());
        }
        return UsuariosDTO;
    }
    
    public List<UsuariosDTO> consultarListaPersona() {
         String cadenaSQL = "select * from regentSYS.usuarios";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        List<UsuariosDTO> listaUsuariosDTO = new ArrayList<>();
        try{
            while(resultadoConsulta.next()){
                UsuariosDTO UsuariosDTO = new UsuariosDTO();
                UsuariosDTO.setIdTipoDocumento(resultadoConsulta.getInt("id_tipoDocumento"));
                UsuariosDTO.setDocumento(resultadoConsulta.getString("Documento"));
                UsuariosDTO.setNombre1(resultadoConsulta.getString("Nombre1"));
                UsuariosDTO.setNombre2(resultadoConsulta.getString("Nombre2"));
                UsuariosDTO.setApellido1(resultadoConsulta.getString("Apellido1"));
                UsuariosDTO.setApellido2(resultadoConsulta.getString("Apellido2"));
                UsuariosDTO.setUsuario(resultadoConsulta.getString("Usuario"));
                UsuariosDTO.setUsuario(resultadoConsulta.getString("Contraseña"));
                UsuariosDTO.setIdEstado(resultadoConsulta.getInt("id_estado"));
                listaUsuariosDTO.add(UsuariosDTO);
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase UsuariosDTO "+ex.getMessage());
        }
        return listaUsuariosDTO; 
    }

    public UsuariosDTO consultarLogin (String usuario ,String contraseña) {
        String cadenaSQL = "select usuarios.usuario, usuarios.Contraseña, usuarios.id_estado from usuarios where usuarios.usuario = '"+usuario+"' and usuarios.Contraseña = '"+contraseña+"' ";  
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        UsuariosDTO UsuariosDTO = null;
        try{
            while(resultadoConsulta.next()){
                UsuariosDTO = new UsuariosDTO();
                UsuariosDTO.setUsuario(resultadoConsulta.getString("Usuario"));
                UsuariosDTO.setContraseña(resultadoConsulta.getString("Contraseña"));
                UsuariosDTO.setIdestado(resultadoConsulta.getString("id_estado"));
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase LoginDAO "+ex.getMessage());
        }
        return UsuariosDTO;
    }
    public boolean actualizarLogin (UsuariosDTO UsuariosDTO){
        String cadenaSQL = "update regentSYS.usuarios set Contraseña = '"+UsuariosDTO.getContraseña()+"' where Usuario = '"+UsuariosDTO.getUsuario()+"'"; 
        System.out.println(" cadenaSQL "+cadenaSQL);
        return conexion.executeUpdateStatement(cadenaSQL);
    }
    
    /*
    public UsuariosDTO consultaEstadoUsuario(String usuario)  {
        String cadenaSQL = "usuarios.id_estado, usuarios.usuario from usuarios where usuarios.usuario = '"+usuario+"'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
        UsuariosDTO UsuariosDTO = null;
        try{
            while(resultadoConsulta.next()){
                UsuariosDTO = new UsuariosDTO();
                UsuariosDTO.setIdEstado(resultadoConsulta.getInt("id_estado"));
                UsuariosDTO.setUsuario(resultadoConsulta.getString("Usuario"));
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar de la clase LoginDAO "+ex.getMessage());
        }
        return UsuariosDTO;
    }
    */
}
