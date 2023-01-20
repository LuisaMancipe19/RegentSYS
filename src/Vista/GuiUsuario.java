/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DTO.DocumentoDTO;
import DTO.EstadoDTO;
import DTO.UsuariosDTO;
import Fachada.Fachada;
import Utilidades.Validaciones;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Auxfacturacion
 */
public class GuiUsuario extends javax.swing.JFrame {

    
    
    private Fachada fachada;
    private List<DocumentoDTO> listaTipoDocumentoDTO;
    private List<EstadoDTO> listaEstadoDTO;
    
    
    
    
    public GuiUsuario() {
        initComponents();
         this.setLocationRelativeTo(null);
         fachada = new Fachada();
         cargarTipoDocumento();
         cargarListaEstado();
    }
    private void cargarTipoDocumento() {
        listaTipoDocumentoDTO = fachada.consultarlistaTipoDocumento();
        for (DocumentoDTO DocumentoDTO : listaTipoDocumentoDTO) {
            ComboTipoDocumento.addItem(DocumentoDTO.getdescripcionDocumento());
        }
    }
    private void cargarListaEstado(){
        listaEstadoDTO = fachada.consultarlistaEstado();
        for (EstadoDTO EstadoDTO : listaEstadoDTO){
            ComboEstado.addItem(EstadoDTO.getDescripcionEstado());
        }
    }

   

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrimernombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSegundonombre = new javax.swing.JTextField();
        ComboTipoDocumento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtPrimerapellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSegundoapellido = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        txtConfirmarContra = new javax.swing.JPasswordField();
        btnGuardar = new javax.swing.JButton();
        Mensaje = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jConsultarUsuario = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("* Documento:");

        jLabel3.setText("* Primer nombre:");

        jLabel1.setText("* Tipo Documento:");

        jLabel4.setText("  Segundo nombre:");

        ComboTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccine" }));

        jLabel5.setText("* Primer apellido:");

        txtPrimerapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerapellidoActionPerformed(evt);
            }
        });

        jLabel6.setText("  Segundo apellido:");

        jLabel7.setText("* Usuario:");

        jLabel8.setText("*Contraseña:");

        jLabel9.setText("*Confirmar contraseña:  ");

        btnGuardar.setBackground(new java.awt.Color(96, 175, 255));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        Mensaje.setText("Mensaje:");

        jLabel11.setText("*Estado:");

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Mensaje))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrimernombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSegundonombre)
                                    .addComponent(ComboTipoDocumento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrimerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSegundoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtConfirmarContra)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .addComponent(ComboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))))
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ComboTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrimernombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSegundonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrimerapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtSegundoapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtConfirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62)
                .addComponent(Mensaje)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));

        jMenu1.setText("Opciones");

        jConsultarUsuario.setText("Consultar usuario");
        jConsultarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultarUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jConsultarUsuario);

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jConsultarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultarUsuarioActionPerformed
        GuiConsultaUsuario principal = new GuiConsultaUsuario();
            principal.setVisible(true);
            dispose();
    }//GEN-LAST:event_jConsultarUsuarioActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        GuiMenu principal = new GuiMenu();
            principal.setVisible(true);
            dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        String pnombre = txtPrimernombre.getText().trim();
        String snombre = txtSegundonombre.getText().trim();
        String papellido = txtPrimerapellido.getText().trim();
        String sapellido = txtSegundoapellido.getText().trim();
        String numerodocumento = txtDocumento.getText().trim();
        String usuario = txtUsuario.getText().trim();
        String contraseña = txtContraseña.getText().trim();
        String confirmarContraseña = txtConfirmarContra.getText().trim();

        int idTipodocumento = ComboTipoDocumento.getSelectedIndex();
        int idEstado = ComboEstado.getSelectedIndex();

        pnombre = pnombre.toUpperCase();
        snombre = snombre.toUpperCase();
        papellido = papellido.toUpperCase();
        sapellido = sapellido.toUpperCase();
        numerodocumento = numerodocumento.toUpperCase();
        usuario = usuario.toUpperCase();
        contraseña = contraseña.toUpperCase();
        confirmarContraseña = confirmarContraseña.toUpperCase();

        if(idTipodocumento > 0){
            if(numerodocumento != null && numerodocumento.length()>0){
                if(pnombre != null && pnombre.length()>0){
                    if(papellido != null && papellido.length()>0){
                        if(idEstado > 0){
                            if(Validaciones.esNumero(numerodocumento)){
                                if(Validaciones.esTexto(pnombre)){
                                    if(Validaciones.esTexto(snombre)){
                                        if(Validaciones.esTexto(papellido)){
                                            if(Validaciones.esTexto(sapellido)){
                                                if (usuario != null && usuario.length()>0){
                                                    if (contraseña != null && contraseña.length()>0){
                                                        if (confirmarContraseña != null && confirmarContraseña.length()>0){
                                                            if (confirmarContraseña != contraseña){

                                                                UsuariosDTO UsuariosDTO = new UsuariosDTO();

                                                                UsuariosDTO.setNombre1(pnombre);
                                                                UsuariosDTO.setNombre2(snombre);
                                                                UsuariosDTO.setApellido1(papellido);
                                                                UsuariosDTO.setApellido2(sapellido);
                                                                UsuariosDTO.setDocumento(numerodocumento);
                                                                UsuariosDTO.setUsuario(usuario);
                                                                UsuariosDTO.setContraseña(contraseña);

                                                                DocumentoDTO DocumentoDTO = listaTipoDocumentoDTO.get(idTipodocumento-1);
                                                                UsuariosDTO.setIdTipoDocumento(DocumentoDTO.getIdDocumento());

                                                                EstadoDTO EstadoDTO =listaEstadoDTO.get(idEstado-1);
                                                                UsuariosDTO.setIdEstado(EstadoDTO.getIdEstado());

                                                                boolean resultado = fachada.insertarPersona(UsuariosDTO);
                                                                if(resultado){
                                                                    Mensaje.setText("Mensaje: Usuario registrado correctamente!");
                                                                    System.out.println("Usuario registrado correctamente!");

                                                                    txtConfirmarContra.setText("");
                                                                    txtContraseña.setText("");
                                                                    txtDocumento.setText("");
                                                                    txtPrimerapellido.setText("");
                                                                    txtPrimernombre.setText("");
                                                                    txtSegundonombre.setText("");
                                                                    txtSegundoapellido.setText("");
                                                                    txtUsuario.setText("");
                                                                    ComboTipoDocumento.setSelectedIndex(0);
                                                                    ComboEstado.setSelectedIndex(0);
                                                                }else{
                                                                    System.out.println("ERROR AL REGISTRAR LA PERSONA");
                                                                }
                                                            }else{
                                                                JOptionPane.showMessageDialog(this, "las contraseñas no coinciden!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                                                            }
                                                        }else{
                                                            JOptionPane.showMessageDialog(this, "Campo confirmara contraseña vacio!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                                                        }
                                                    }else{
                                                        JOptionPane.showMessageDialog(this, "Campo contraseña vacio!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                                                    }
                                                }else{
                                                    JOptionPane.showMessageDialog(this, "Campo usuario vacio!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                                                }
                                            }else{
                                                JOptionPane.showMessageDialog(this, "El apellido es texto!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                                            }
                                        }else{
                                            JOptionPane.showMessageDialog(this, "El apellido es texto!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                                        }
                                    }else{
                                        JOptionPane.showMessageDialog(this, "El nombre es texto!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(this, "El nombre es texto!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                                }
                            }else{
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "Por favor seleccione el estado!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "Campo primer apellido vacio" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Campo primer nombre vacio" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "campo Numero de documento vacio" , "Alerta!", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Por favor seleccione el tipo de documento!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPrimerapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerapellidoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JComboBox<String> ComboTipoDocumento;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JMenuItem jConsultarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jSalir;
    private javax.swing.JPasswordField txtConfirmarContra;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtPrimerapellido;
    private javax.swing.JTextField txtPrimernombre;
    private javax.swing.JTextField txtSegundoapellido;
    private javax.swing.JTextField txtSegundonombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
