/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Auxfacturacion
 */
public class ItemDTO {
    
    
    //private int id_item;
    private String Codigo_item;
    private String Descripcion;
    private int id_tipoItem;
    private int id_estado;
    int id_item;    
    String id_Items= id_item+"";
    
    
    
    public ItemDTO(){
    }
    
    public String getIditem(){
        return id_Items;
    }
    public void  setIditem(String id_Items){
        this.id_Items = id_Items;
    }
    
    
    public int getIdItem(){
        return id_item;
    }
    public void  setIdItem(int id_item){
        this.id_item = id_item;
    }
   
    public String getCodigoItem(){
        return Codigo_item;
    }
    public void setCodigo(String Codigo_item){
        this.Codigo_item = Codigo_item;
    }
    
    public String getDescripcion(){
        return Descripcion;
    }
    public void setDescripcion(String Descripcion){
       this.Descripcion = Descripcion;
    }
    
    public int getIdEstado(){
        return id_estado;
    }
    public void setIdEstado(int id_estado){
        this.id_estado = id_estado;
    }
    
    public int getIdTipoItem(){
        return id_tipoItem;
    }
    public void setIdTipoItem(int id_tipoItem){
        this.id_tipoItem = id_tipoItem;
    }
}
