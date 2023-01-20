/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Auxfacturacion
 */
public class UsuariosDTO {
 
    
    private int id_usuario;
    private int id_tipoDocumento;
    private String Documento;
    private String Nombre1;
    private String Nombre2;
    private String Apellido1;
    private String Apellido2;
    private String Usuario;
    private String Contraseña;
    int id_estado;   
    String id_estados = id_estado+"";
    
    public UsuariosDTO(){
    }
    
    public int getIdTipoUsuario(){
        return id_usuario;
    }
    public void setIdTipoUsuario(int id_usuario){
        this.id_usuario = id_usuario;
    }
    
    public int getIdTipoDocumento(){
        return id_tipoDocumento;
    }
    public void setIdTipoDocumento(int id_tipoDocumento){
        this.id_tipoDocumento = id_tipoDocumento;
    }
    
    public String getDocumento(){
        return Documento;
    }
    public void setDocumento(String Documento){
        this.Documento = Documento;
    }
    
    public String getNombre1(){
        return Nombre1;
    }
    public void setNombre1(String Nombre1){
        this.Nombre1 = Nombre1;
    }
    
    public String getNombre2(){
        return Nombre2;
    }
    public void setNombre2(String Nombre2){
        this.Nombre2 = Nombre2;
    }
    
    public String getApellido1(){
        return Apellido1;
    }
    public void setApellido1(String Apellido1){
        this.Apellido1 = Apellido1;
    }
    
    public String getApellido2(){
        return Apellido2;
    }
    public void setApellido2(String Apellido2){
        this.Apellido2 = Apellido2;
    }
    
    public String getUsuario(){
        return Usuario;
    }
    public void setUsuario(String Usuario){
        this.Usuario = Usuario;
    }
    
    public String getContraseña(){
        return Contraseña;
    }
    public void setContraseña(String Contraseña){
        this.Contraseña = Contraseña;
    }
    
    public int getIdEstado(){
        return id_estado;
    }
    public void setIdEstado(int id_estado){
        this.id_estado = id_estado;
    }
    
    public String getIdestado (){
        return id_estados;
    }
    public void setIdestado (String id_estados){
        this.id_estados = id_estados;
    }
}
