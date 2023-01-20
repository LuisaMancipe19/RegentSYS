/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import DAO.TipoItemDAO;
import DAO.DocumentoDAO;
import DAO.EmpresaDAO;
import DAO.EstadoDAO;
import DAO.ItemDAO;
import DAO.ItemEmpresaDAO;
import DAO.UsuariosDAO;
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
public class Controlador {
    
    private EmpresaDAO empresaDAO;
    private TipoItemDAO tipoItemDAO;
    private DocumentoDAO documentoDAO;
    private EstadoDAO estadoDAO;
    private ItemDAO itemDAO;
    private UsuariosDAO usuariosDAO;
    private ItemEmpresaDAO itemEmpresaDAO;
    
   
    
    public boolean insertarEmpresa (EmpresaDTO EmpresaDTO){
        empresaDAO = new EmpresaDAO();
        boolean resultado = empresaDAO.insertarEmpresa(EmpresaDTO);
        return resultado;
    }
    public boolean actualizarEmpresa (EmpresaDTO EmpresaDTO){
        empresaDAO = new EmpresaDAO();
        boolean resultado = empresaDAO.actualizarEmpresa(EmpresaDTO);
        return resultado;
    }
    public EmpresaDTO consultarEmpresa(String Numeronit) {
        empresaDAO = new EmpresaDAO();
        EmpresaDTO EmpresaDTO = empresaDAO.consultarEmpresa(Numeronit);
        return EmpresaDTO;
    }
    public List<EmpresaDTO> consultarListaEmpresa() {
        empresaDAO = new EmpresaDAO();
        List<EmpresaDTO> resultado = empresaDAO.consultarListaEmpresa();
        return resultado;
    }
    public boolean insertarTipoItem (TipoItemDTO TipoItemDTO){
        tipoItemDAO = new TipoItemDAO();
        boolean resultado = tipoItemDAO.insertarTipoItem(TipoItemDTO);
        return resultado;
    }
    public TipoItemDTO consultarTipoItem(String tipoItem) {
        tipoItemDAO = new TipoItemDAO();
        TipoItemDTO TipoItemDTO = tipoItemDAO.consultarItem(tipoItem);
        return TipoItemDTO;
    }
    public List<TipoItemDTO> consultarListaTipoItem() {
        tipoItemDAO = new TipoItemDAO();
        List<TipoItemDTO> resultado = tipoItemDAO.consultarListaItem();
        return resultado;
    }
   
    
    public boolean insertarTipoDocumento (DocumentoDTO DocumentoDTO){
        documentoDAO = new DocumentoDAO();
        boolean resultado = documentoDAO.insertarTipoDocumento(DocumentoDTO);
        return resultado;
    }
    public DocumentoDTO consultarTipoDocumento (String Descripcion) {
        documentoDAO = new DocumentoDAO();
        DocumentoDTO DocumentoDTO = documentoDAO.consultarTipoDocumento(Descripcion);
        return DocumentoDTO;
    }
    public List<DocumentoDTO> consultarlistaTipoDocumento() {
        documentoDAO = new DocumentoDAO();
        List<DocumentoDTO> resultado = documentoDAO.consultarlistaTipoDocumento();
        return resultado;
    }
    
    
    public boolean insertarEstado (EstadoDTO EstadoDTO){
        estadoDAO = new EstadoDAO();
        boolean resultado = estadoDAO.insertarEstado(EstadoDTO);
        return resultado;
    }
    public EstadoDTO consultarEstado(String Descripcion) {
        estadoDAO = new EstadoDAO();
        EstadoDTO EstadoDTO = estadoDAO.consultarEstado(Descripcion);
        return EstadoDTO;
    }
    public List<EstadoDTO> consultarlistaEstado() {
        estadoDAO = new EstadoDAO();
        List<EstadoDTO> resultado = estadoDAO.consultarlistaEstado();
        return resultado;
    }
     
    
    public boolean insertarItem (ItemDTO ItemDTO){
        itemDAO = new ItemDAO();
        boolean resultado = itemDAO.insertarItem(ItemDTO);
        return resultado;
    }
    public boolean actualizarItem (ItemDTO ItemDTO){
        itemDAO = new ItemDAO();
        boolean resultado = itemDAO.actualizarItem(ItemDTO);
        return resultado;
    }
    public ItemDTO consultarItem(String Codigo){
        itemDAO = new ItemDAO();
        ItemDTO ItemDTO = itemDAO.consultarItem(Codigo);
        return ItemDTO;
    }
    public List<ItemDTO> consultarListaItems() {
        itemDAO = new ItemDAO();
        List<ItemDTO> resultado = itemDAO.consultarListaItems();
        return resultado;
    }
     
    /* 
    public boolean insertarLogin(LoginDTO LoginDTO){
        loginDAO = new LoginDAO();
        boolean resultado = loginDAO.insertarLogin(LoginDTO);
        return resultado;
    }
    */ 
    public boolean actualizarLogin (UsuariosDTO UsuariosDTO){
        usuariosDAO = new UsuariosDAO();
        boolean resultado = usuariosDAO.actualizarLogin(UsuariosDTO);
        return resultado;
    }
    public UsuariosDTO consultarLogin (String usuario ,String contraseña) {
        usuariosDAO = new UsuariosDAO();
        UsuariosDTO UsuariosDTO = usuariosDAO.consultarLogin(usuario,contraseña);
        return UsuariosDTO;
    }
    /*
    public UsuariosDTO consultaEstadoUsuario (String usuario ) {
        usuariosDAO = new UsuariosDAO();
        UsuariosDTO UsuariosDTO = usuariosDAO.consultaEstadoUsuario(usuario);
        return UsuariosDTO;
    } 
    */
    public boolean insertarTarifa (ItemEmpresaDTO ItemEmpresaDTO){
        itemEmpresaDAO = new ItemEmpresaDAO();
        boolean resultado = itemEmpresaDAO.insertarTarifa(ItemEmpresaDTO);
        return resultado;
     }
     
     public boolean actualizarTarifa(ItemEmpresaDTO ItemEmpresaDTO){
        itemEmpresaDAO = new ItemEmpresaDAO();
        boolean resultado = itemEmpresaDAO.actualizarTarifa(ItemEmpresaDTO);
        return resultado;
    }
     
     public ItemEmpresaDTO consultarTarifa(String Codigo) {
        itemEmpresaDAO = new ItemEmpresaDAO();
        ItemEmpresaDTO ItemEmpresaDTO = itemEmpresaDAO.consultarTarifa(Codigo);
        return ItemEmpresaDTO;
    }
     
     public List<ItemEmpresaDTO> consultarlistatarifa() {
         itemEmpresaDAO = new ItemEmpresaDAO();
        List<ItemEmpresaDTO> resultado = itemEmpresaDAO.consultarlistatarifa();
        return resultado;
     }
     
     public boolean insertarPersona (UsuariosDTO UsuariosDTO){
        usuariosDAO = new UsuariosDAO();
        boolean resultado = usuariosDAO.insertarPersona(UsuariosDTO);
        return resultado;
     }
     
     public boolean actualizarPersona(UsuariosDTO UsuariosDTO){
        usuariosDAO = new UsuariosDAO();
        boolean resultado = usuariosDAO.actualizarPersona(UsuariosDTO);
        return resultado;
    }
     
     public UsuariosDTO consultarPersona(String documento) {
        usuariosDAO = new UsuariosDAO();
        UsuariosDTO usuariosDTO = usuariosDAO.consultarPersona(documento);
        return usuariosDTO;
    }
     
     public List<UsuariosDTO> consultarListaPersona() {
        usuariosDAO = new UsuariosDAO();
        List<UsuariosDTO> resultado = usuariosDAO.consultarListaPersona();
        return resultado;
    }
}
