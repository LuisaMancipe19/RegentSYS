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
public class TipoItemDTO {
    
    private int id_tipoItem;
    private String Descripcion;
    
    public TipoItemDTO(){
    }
    
    public int getTipoItem(){
        return id_tipoItem;
    }
    
    public void setTipoItem(int id_tipoItem){
        this.id_tipoItem = id_tipoItem;
    }
    
    public String getDescripcion(){
        return Descripcion;
    }
    
    public void setDescripcion (String Descripcion){
        this.Descripcion = Descripcion;
    }
}
