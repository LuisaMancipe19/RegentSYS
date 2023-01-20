/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DTO.EstadoDTO;
import DTO.ItemDTO;
import DTO.TipoItemDTO;
import Fachada.Fachada;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Auxfacturacion
 */
public class GuiCrearItem extends javax.swing.JFrame {

    private Fachada fachada; 
    private List<EstadoDTO> listaEstadoDTO;
    private List<TipoItemDTO> listaTipoItem;
    
    public GuiCrearItem() {
        initComponents();
         this.setLocationRelativeTo(null);
         fachada = new Fachada();
         cargarListaEstado();
         cargarListaConcepto();
    }
    
    private void cargarListaEstado(){
        listaEstadoDTO = fachada.consultarlistaEstado();
        for (EstadoDTO EstadoDTO : listaEstadoDTO){
            ComboEstado.addItem(EstadoDTO.getDescripcionEstado());
        }
    }
    
    private void cargarListaConcepto(){
        listaTipoItem = fachada.consultarListaTipoItem();
        for (TipoItemDTO TipoItemDTO :listaTipoItem){
            ComboConcepto.addItem(TipoItemDTO.getDescripcion());
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoitem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDescripcionitem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboConcepto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();
        BtnGuardar = new javax.swing.JButton();
        Mensaje = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jActualizarItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("* Codigo:");

        jLabel2.setText("* Descripcion:");

        jLabel3.setText("*Concepto:");

        ComboConcepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel4.setText("*Estado:");

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        BtnGuardar.setBackground(new java.awt.Color(96, 175, 255));
        BtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        Mensaje.setText("Mensaje: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(39, 39, 39)
                                .addComponent(txtCodigoitem, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcionitem, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ComboConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnGuardar)
                                .addGap(154, 154, 154))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Mensaje)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcionitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(BtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mensaje)
                .addGap(40, 40, 40))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));

        jMenu1.setText("Opciones");

        jMenuItem2.setText("Actualizar item");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jActualizarItem.setText("Salir");
        jActualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActualizarItemActionPerformed(evt);
            }
        });
        jMenu1.add(jActualizarItem);

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

    private void jActualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActualizarItemActionPerformed
        GuiMenu principal = new GuiMenu();
            principal.setVisible(true);
            dispose();
    }//GEN-LAST:event_jActualizarItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        GuiActualizarItem principal = new GuiActualizarItem();
            principal.setVisible(true);
            dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        
        String codigo = txtCodigoitem.getText().trim();
        String descripcion = txtDescripcionitem.getText().trim();
                
          int idEstado = ComboEstado.getSelectedIndex();
          int idConcepto = ComboConcepto.getSelectedIndex();
          
         codigo = codigo.toUpperCase();
         descripcion = descripcion.toUpperCase();
         
         if(idEstado > 0){
             if (idConcepto > 0){
                 if(codigo != null && codigo.length()>0){
                     if(descripcion != null && descripcion.length()>0){
                         
                         ItemDTO ItemDTO = new ItemDTO();
                         
                         ItemDTO.setCodigo(codigo);
                         ItemDTO.setDescripcion(descripcion);
                         
                         EstadoDTO EstadoDTO = listaEstadoDTO.get(idEstado-1);
                         ItemDTO.setIdEstado(EstadoDTO.getIdEstado());
                         
                         TipoItemDTO TipoItemDTO = listaTipoItem.get(idConcepto-1);
                         ItemDTO.setIdTipoItem(TipoItemDTO.getTipoItem());
                         
                         boolean resultado = fachada.insertarItem(ItemDTO);
                            if (resultado){
                            Mensaje.setText("Mensaje: Item registrado correctamente!");    
                            System.out.println("Item registrado correctamente!");
                            txtCodigoitem.setText("");
                            txtDescripcionitem.setText("");
                            ComboEstado.setSelectedIndex(0);
                            ComboConcepto.setSelectedIndex(0);
                                }else{
                                    System.out.println("Error al registrar Item!");
                                    }

                     }else{
                         JOptionPane.showMessageDialog(this, "Campo descripcion no puede ir en blanco!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                     }
                 }else{
                     JOptionPane.showMessageDialog(this, "Campo Codigo no puede ir en blanco!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
                 }
             }else{
                 JOptionPane.showMessageDialog(this, "Por favor seleccione el Concepto!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
             }
         }else{
             JOptionPane.showMessageDialog(this, "Por favor seleccione el Estado!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
         }
                 
    }//GEN-LAST:event_BtnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiCrearItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiCrearItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiCrearItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiCrearItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiCrearItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JComboBox<String> ComboConcepto;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JMenuItem jActualizarItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCodigoitem;
    private javax.swing.JTextField txtDescripcionitem;
    // End of variables declaration//GEN-END:variables
}
