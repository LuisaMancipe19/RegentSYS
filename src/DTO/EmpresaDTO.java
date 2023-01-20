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
public class EmpresaDTO {


    //private String id_empresa;
    private String Nit;
    private String Descripcion;
    private int id_estado;
    int id_empresa;    
    String id_empresas = id_empresa+"";
    
    
    public EmpresaDTO(){
    }
    
    public int getIdempresa(){
        return id_empresa;
    }
    public void setIdempresa (int id_empresa){
        this.id_empresa = id_empresa;
    }
    
    
    public String getIdEmpresa (){
        return id_empresas;
    }
    public void setIdEmpresa (String id_empresa){
        this.id_empresas = id_empresa;
    }
    
    
    public String getNit (){
        return Nit;
    }
    public void setNit (String Nit){
        this.Nit = Nit;
    }
    
    
    public String getDescripcion (){
        return Descripcion;
    }
    public void setDescripcion (String Descripcion){
        this.Descripcion = Descripcion;
    }
  
    
    
    public int getIdEstado (){
        return id_estado;
    }
    public void setIdEstado (int id_estado){
        this.id_estado = id_estado;
    }
    
}
