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
public class DocumentoDTO {
    
    private int id_documento;
    private String Abreviatura;
    private String descripcionDocumento;
    
    
    public DocumentoDTO(){
    }
    
    public int getIdDocumento(){
        return id_documento;
    }
    public void setIdDocumento(int id_documento){
        this.id_documento = id_documento;
    }
    
    
    public String getAbreviatura(){
        return Abreviatura;
    }
    public void settipoDocumento(String abreviatura){
        this.Abreviatura = abreviatura;
    }
    
    
    
    public String getdescripcionDocumento(){
        return descripcionDocumento;
    }
    public void setdescripcionDocumento(String descripcionDocumento){
        this.descripcionDocumento = descripcionDocumento;
    }
}
