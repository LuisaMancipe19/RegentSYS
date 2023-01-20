/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DTO.EmpresaDTO;
import DTO.EstadoDTO;
import Fachada.Fachada;
import Utilidades.Validaciones;
import java.util.List;
import javax.swing.JOptionPane;

public class GuiEmpresa extends javax.swing.JFrame {

    private Fachada fachada;
    private List<EstadoDTO> listaEstadoDTO;
    
    
    public GuiEmpresa() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        fachada = new Fachada();
        cargarListaEstado();    
    }
    
    private void cargarListaEstado(){
        listaEstadoDTO = fachada.consultarlistaEstado();
        for (EstadoDTO EstadoDTO : listaEstadoDTO){
            ComboEstado.addItem(EstadoDTO.getDescripcionEstado());
        }
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEmpresa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();
        Mensaje = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jConsultaEmpresa = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("*Nit Empresa:");

        txtNit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNitActionPerformed(evt);
            }
        });

        jLabel2.setText("*Razon social:");

        txtEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpresaActionPerformed(evt);
            }
        });

        jLabel3.setText("*Estado:");

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione" }));

        Mensaje.setText("Mensaje:");

        jButton1.setBackground(new java.awt.Color(96, 175, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/regentSYS1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mensaje)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNit)
                                    .addComponent(txtEmpresa)
                                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 67, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(60, 60, 60))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(Mensaje)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));

        jMenu2.setText("Opciones");

        jConsultaEmpresa.setText("Consultar Empresa");
        jConsultaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaEmpresaActionPerformed(evt);
            }
        });
        jMenu2.add(jConsultaEmpresa);

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jMenu2.add(jSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNitActionPerformed

    private void txtEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpresaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String nit = txtNit.getText().trim();
        String nombreempresa = txtEmpresa.getText().trim();
        
        int idEstado = ComboEstado.getSelectedIndex();
        
        nit = nit.toUpperCase();
        nombreempresa = nombreempresa.toUpperCase();
        
        if(idEstado > 0){
           if(nit != null && nit.length()>0){ 
               if(nombreempresa != null && nombreempresa.length()>0){ 
                   
                   EmpresaDTO EmpresaDTO = new EmpresaDTO();
                   
                   EmpresaDTO.setNit(nit);
                   EmpresaDTO.setDescripcion(nombreempresa);
                   
                   EstadoDTO EstadoDTO = listaEstadoDTO.get(idEstado-1);
                   EmpresaDTO.setIdEstado(EstadoDTO.getIdEstado());
                   
                   boolean resultado = fachada.insertarEmpresa(EmpresaDTO);
                   if (resultado){
                       System.out.println("Empresa registrada correctamente!");
                       Mensaje.setText("Mensaje: Empresa registrada correctamente!");
                       
                       txtEmpresa.setText("");
                       ComboEstado.setSelectedIndex(0);
                   }else{
                       System.out.println("Error al registrar empresa!");
                   }
                   
                   
               }else{
                  JOptionPane.showMessageDialog(this, "Campo razon social no puede ir en blanco!" , "Alerta!", JOptionPane.ERROR_MESSAGE); 
               }
           }else{
               JOptionPane.showMessageDialog(this, "Campo Nit no puede ir en blanco!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
           }
        }else{
            JOptionPane.showMessageDialog(this, "Por favor seleccione el estado!" , "Alerta!", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        GuiMenu principal = new GuiMenu();
            principal.setVisible(true);
            dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jConsultaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaEmpresaActionPerformed
        GuiConsultaEmpresa principal = new GuiConsultaEmpresa();
            principal.setVisible(true);
            dispose();
    }//GEN-LAST:event_jConsultaEmpresaActionPerformed

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
            java.util.logging.Logger.getLogger(GuiEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jConsultaEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jSalir;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtNit;
    // End of variables declaration//GEN-END:variables
}
