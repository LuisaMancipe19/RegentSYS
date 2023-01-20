/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fachada;

import Controlador.Controlador;
import DTO.EmpresaDTO;
import DTO.TipoItemDTO;
import DTO.DocumentoDTO;
import DTO.EstadoDTO;
import DTO.ItemDTO;
import DTO.ItemEmpresaDTO;
import DTO.UsuariosDTO;
import java.util.List;

/**
 *
 * @author Auxfacturacion
 */
public class Fachada {
    private Controlador controlador;

    public Fachada() {
        controlador = new Controlador();
    }

    
    public boolean insertarEmpresa(EmpresaDTO EmpresaDTO) {
        return controlador.insertarEmpresa(EmpresaDTO);
    }   
    public boolean actualizarEmpresa (EmpresaDTO EmpresaDTO){
        return controlador.actualizarEmpresa(EmpresaDTO);
    }
    public EmpresaDTO consultarEmpresa(String Numeronit) {
        return controlador.consultarEmpresa(Numeronit);
    }
    public List<EmpresaDTO> consultarListaEmpresa(){
        return controlador.consultarListaEmpresa();
    }

    
    public boolean insertarTipoItem(TipoItemDTO TipoItemDTO) {
        return controlador.insertarTipoItem(TipoItemDTO);
    }
    public TipoItemDTO consultarTipoItem(String tipoItem) {
        return controlador.consultarTipoItem(tipoItem);
    }
    public List<TipoItemDTO> consultarListaTipoItem(){
        return controlador.consultarListaTipoItem();
    }
    
    
    public boolean insertarTipoDocumento(DocumentoDTO DocumentoDTO) {
        return controlador.insertarTipoDocumento(DocumentoDTO);
    }
    public DocumentoDTO consultarTipoDocumento(String Descripcion) {
        return controlador.consultarTipoDocumento(Descripcion);
    }
    public List<DocumentoDTO> consultarlistaTipoDocumento(){
        return controlador.consultarlistaTipoDocumento();
    }
    
    
    public boolean insertarEstado(EstadoDTO EstadoDTO) {
        return controlador.insertarEstado(EstadoDTO);
    }
    public EstadoDTO consultarEstado (String Descripcion) {
        return controlador.consultarEstado(Descripcion);       
    }
    public List<EstadoDTO> consultarlistaEstado(){
        return controlador.consultarlistaEstado();
    }
    
    
    public boolean insertarItem (ItemDTO ItemDTO){
        return controlador.insertarItem(ItemDTO);
    }
    public boolean actualizarItem (ItemDTO ItemDTO){
        return controlador.actualizarItem(ItemDTO);
    }
    public ItemDTO consultarItem(String Codigo) {
        return controlador.consultarItem(Codigo);
    }
    public List<ItemDTO> consultarListaItems() {
        return controlador.consultarListaItems();
    }
    
   
    public UsuariosDTO consultarLogin (String usuario ,String contraseña) {
        return controlador.consultarLogin(usuario,contraseña);
    }
    public boolean actualizarLogin (UsuariosDTO UsuariosDTO){
        return controlador.actualizarLogin(UsuariosDTO);
    }
    /*
    public UsuariosDTO consultaEstadoUsuario (String usuario) {
        return controlador.consultaEstadoUsuario(usuario);
    }
    */
    public boolean insertarTarifa (ItemEmpresaDTO ItemEmpresaDTO){
        return controlador.insertarTarifa(ItemEmpresaDTO);
    }
    public boolean actualizarTarifa(ItemEmpresaDTO ItemEmpresaDTO){
        return controlador.actualizarTarifa(ItemEmpresaDTO);
    }
    public ItemEmpresaDTO consultarTarifa(String Codigo) {
        return controlador.consultarTarifa(Codigo);
    }
    
    
    public List<ItemEmpresaDTO> consultarlistatarifa() {
        return controlador.consultarlistatarifa();
    }
    
    public boolean insertarPersona (UsuariosDTO UsuariosDTO){
        return controlador.insertarPersona(UsuariosDTO);
    }
    public boolean actualizarPersona (UsuariosDTO UsuariosDTO){
        return controlador.actualizarPersona(UsuariosDTO);
    }
    public UsuariosDTO consultarPersona(String documento) {
        return controlador.consultarPersona(documento);
    }
    public List<UsuariosDTO> consultarListaPersona() {
        return controlador.consultarListaPersona();
    }
}
