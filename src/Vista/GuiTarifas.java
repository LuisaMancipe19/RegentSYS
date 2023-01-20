/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import ConexionBD.ConexionBD;
import DTO.EmpresaDTO;
import DTO.ItemDTO;
import DTO.ItemEmpresaDTO;
import Fachada.Fachada;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Auxfacturacion
 */
public class GuiTarifas extends javax.swing.JFrame {

    private ConexionBD conexion;
    private Fachada fachada;
    private ItemEmpresaDTO itemEmpresaDTO;
    private EmpresaDTO empresaDTO;
    private ItemDTO itemDTO;
   
    
    public GuiTarifas() {
        initComponents();
         this.setLocationRelativeTo(null);
         fachada = new Fachada();
         conexion =new ConexionBD();
         
    }
    
    public void Mostrar (String tabla){
        
        String cadenaSQL = "select item.Codigo_item, item.Descripcion_item, empresa.Descripcion_empresa, item_empresa.Tarifas from item inner join item_empresa on item.id_item = item_empresa.id_item inner join empresa on empresa.id_empresa = item_empresa.id_empresa";
        System.out.println(" cadenaSQL "+cadenaSQL);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Codigo");
        model.addColumn("Descripción");
        model.addColumn("Empresa");
        model.addColumn("Tarifa");
        tableTarifas.setModel(model);
        
        String [] ItemEmpresaDTO = new String [4];
        try{
            ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
            while(resultadoConsulta.next()){
                   ItemEmpresaDTO [0] =  resultadoConsulta.getString(1);
                   ItemEmpresaDTO [1] =  resultadoConsulta.getString(2);
                   ItemEmpresaDTO [2] =  resultadoConsulta.getString(3);
                   ItemEmpresaDTO [3] =  resultadoConsulta.getString(4);
                   model.addRow(ItemEmpresaDTO);
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar la tabla "+ex.getMessage());
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoEmpresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoItem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTarifas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTarifas = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        dtnConsultar = new javax.swing.JButton();
        txtDescripcionEmpresa = new javax.swing.JTextField();
        txtcodigoiditem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jConsultaEmpresa = new javax.swing.JMenuItem();
        jConsultaItem = new javax.swing.JMenuItem();
        jSalir = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Codigo Item:");

        txtCodigoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEmpresaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nit empresa:");

        txtCodigoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoItemActionPerformed(evt);
            }
        });

        jLabel3.setText("Tarifa:");

        tableTarifas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripción", "Empresa", "Tarifa"
            }
        ));
        jScrollPane1.setViewportView(tableTarifas);

        btnGuardar.setBackground(new java.awt.Color(96, 175, 255));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        dtnConsultar.setBackground(new java.awt.Color(96, 175, 255));
        dtnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        dtnConsultar.setText("consultar");
        dtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtnConsultarActionPerformed(evt);
            }
        });

        txtDescripcionEmpresa.setEditable(false);
        txtDescripcionEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionEmpresaActionPerformed(evt);
            }
        });

        txtcodigoiditem.setEditable(false);

        jLabel4.setText("Codigo empresa:");

        jLabel5.setText("Codigo Item:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTarifas, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcionEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                            .addComponent(txtcodigoiditem))))
                .addGap(63, 63, 63)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dtnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescripcionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcodigoiditem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar)
                        .addComponent(dtnConsultar))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTarifas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));

        jMenu1.setText("Opciones");

        jConsultaEmpresa.setText("Consultar empresa");
        jConsultaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaEmpresaActionPerformed(evt);
            }
        });
        jMenu1.add(jConsultaEmpresa);

        jConsultaItem.setText("Consultar Item");
        jConsultaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jConsultaItemActionPerformed(evt);
            }
        });
        jMenu1.add(jConsultaItem);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEmpresaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

      String codigo = txtCodigoItem.getText().trim();  
      String empresa = txtCodigoEmpresa.getText().trim();
      String tarifa = txtTarifas.getText().trim();

      tarifa = tarifa.toUpperCase();
      codigo = codigo.toUpperCase();
      empresa = empresa.toUpperCase();
      
        empresaDTO = fachada.consultarEmpresa(empresa);
        if(empresaDTO != null){
            
        ItemEmpresaDTO ItemEmpresaDTO = new ItemEmpresaDTO();
        txtDescripcionEmpresa.setText(empresaDTO.getIdEmpresa());
        }else{
        JOptionPane.showMessageDialog(this, "No se encontro la empresa!", "Error", JOptionPane.ERROR_MESSAGE);
        } 
                   
        itemDTO = fachada.consultarItem(codigo);
        if(itemDTO != null){
                       
        ItemEmpresaDTO ItemEmpresaDTO = new ItemEmpresaDTO();
        txtcodigoiditem.setText(itemDTO.getIditem());              
        }else{
        JOptionPane.showMessageDialog(this, "No se encontro el item!", "Error", JOptionPane.ERROR_MESSAGE);
        }      

       String idempresa = txtDescripcionEmpresa.getText(); 
       String iditem = txtcodigoiditem.getText();
       int Idempresa = Integer.parseInt(idempresa);
       int Iditem = Integer.parseInt(iditem);
        
        
       if(codigo != null && codigo.length()>0){
           if(empresa != null && empresa.length()>0){
               if(tarifa != null && tarifa.length()>0){
                   
                   ItemEmpresaDTO ItemEmpresaDTO = new ItemEmpresaDTO();
                   
                   ItemEmpresaDTO.setIdEmpresa(Idempresa);
                   ItemEmpresaDTO.setIditem(Iditem);
                   ItemEmpresaDTO.setValor(tarifa);
                   
                   boolean resultado = fachada.insertarTarifa(ItemEmpresaDTO);
                   if(resultado){
                       System.out.println("Tarifa Registrada correctamente!");
                       txtCodigoItem.setText("");
                       txtCodigoEmpresa.setText("");
                       txtTarifas.setText("");
                       txtDescripcionEmpresa.setText("");
                       txtTarifas.setText("");
                   }else{
                       System.out.println("ERROR AL REGISTRAR Tarifa");
                   }
               }else{
                  JOptionPane.showMessageDialog(this, "Campo Tarifa vacio!", "Error", JOptionPane.ERROR_MESSAGE); 
               }
           }else{
                   JOptionPane.showMessageDialog(this, "Campo Empresa vacio!", "Error", JOptionPane.ERROR_MESSAGE);
               }
       }else{
            JOptionPane.showMessageDialog(this, "Campo Codigo vacio!", "Error", JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCodigoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoItemActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        GuiMenu principal = new GuiMenu();
            principal.setVisible(true);
            dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void dtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtnConsultarActionPerformed
        Mostrar("tarifas");
    }//GEN-LAST:event_dtnConsultarActionPerformed

    private void jConsultaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaEmpresaActionPerformed
        GuiConsultaEmpresa principal = new GuiConsultaEmpresa();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jConsultaEmpresaActionPerformed

    private void txtDescripcionEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionEmpresaActionPerformed

    private void jConsultaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jConsultaItemActionPerformed
        GuiConsultarItems principal = new GuiConsultarItems();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jConsultaItemActionPerformed

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
            java.util.logging.Logger.getLogger(GuiTarifas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiTarifas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiTarifas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiTarifas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiTarifas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton dtnConsultar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenuItem jConsultaEmpresa;
    private javax.swing.JMenuItem jConsultaItem;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableTarifas;
    private javax.swing.JTextField txtCodigoEmpresa;
    private javax.swing.JTextField txtCodigoItem;
    private javax.swing.JTextField txtDescripcionEmpresa;
    private javax.swing.JTextField txtTarifas;
    private javax.swing.JTextField txtcodigoiditem;
    // End of variables declaration//GEN-END:variables
}
