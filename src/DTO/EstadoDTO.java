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
public class EstadoDTO {
    
    private int id_estado;
    private boolean Criterio_estado;
    private String Descripcion;
    
    
    public EstadoDTO(){
    }

    public int getIdEstado (){
        return id_estado;
    }
    public void setIdEstado (int id_estado){
        this.id_estado = id_estado;
    }

    public String getDescripcionEstado(){
        return Descripcion;
    }
    public void setDescripcionEstado(String Descripcion){
        this.Descripcion = Descripcion;
    }
   
    public boolean getCriterioEstado(){
        return Criterio_estado;
    }
    public void setCriterioEstado(boolean Criterio_estado){
        this.Criterio_estado = Criterio_estado;
    }
}
