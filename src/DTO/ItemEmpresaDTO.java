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
public class ItemEmpresaDTO {
    
    
    private int id_tarifas;
    private int id_item;
    private int id_empresa;
    private String Valor;
    
    
    public ItemEmpresaDTO(){
    }
    
    public int getIdTarifas(){
        return id_tarifas;
    }
    public void setIdTarifas (int id_tarifas){
        this.id_tarifas = id_tarifas;
    }
    
    public int getIditem(){
        return id_item;
    }
    public void setIditem (int id_item){
        this.id_item = id_item;
    }
   
    public int getIdEmpresa(){
        return id_empresa;
    }
    public void setIdEmpresa (int id_empresa){
        this.id_empresa = id_empresa;
    }
    
    public String getValor(){
        return Valor;
    }
    public void setValor (String Valor){
        this.Valor = Valor;
    }
}
