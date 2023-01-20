/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;



import ConexionBD.ConexionBD;
import Fachada.Fachada;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Auxfacturacion
 */
public class GuiConsultarItems extends javax.swing.JFrame {

    private ConexionBD conexion;
    private Fachada fachada;
    
    public GuiConsultarItems() {
        initComponents();
        this.setLocationRelativeTo(null);
        fachada = new Fachada();
        conexion =new ConexionBD();
    }
    public void Mostrar (String tabla){
        
        String cadenaSQL = "Select item.id_item, item.Codigo_item, item.Descripcion_item, case item.id_tipoItem when '1' then 'MEDICAMENTO' when '2' then 'PROCEDIMIENTO' when '3' then 'PROCEDIMIENTO' end as tipo_item, case item.id_estado when '1' then 'ACTIVO' when '2' then 'INACTIVO' end as estad from item";
        System.out.println(" cadenaSQL "+cadenaSQL);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Codigo");
        model.addColumn("Descripción");
        model.addColumn("Clase");
        model.addColumn("Estado");
        TablaItem.setModel(model);
        
        String [] ItemEmpresaDTO = new String [5];
        try{
            ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
            while(resultadoConsulta.next()){
                   ItemEmpresaDTO [0] =  resultadoConsulta.getString(1);
                   ItemEmpresaDTO [1] =  resultadoConsulta.getString(2);
                   ItemEmpresaDTO [2] =  resultadoConsulta.getString(3);
                   ItemEmpresaDTO [3] =  resultadoConsulta.getString(4);
                   ItemEmpresaDTO [4] =  resultadoConsulta.getString(5);
                   model.addRow(ItemEmpresaDTO);
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar la tabla "+ex.getMessage());
        }
    }
    
    public void Consultar (String tabla){
        
        String cadenaSQL = "Select item.id_item, item.Codigo_item, item.Descripcion_item, case item.id_tipoItem when '1' then 'MEDICAMENTO' when '2' then 'PROCEDIMIENTO' when '3' then 'PROCEDIMIENTO' end as tipo_item, case item.id_estado when '1' then 'ACTIVO' when '2' then 'INACTIVO' end as estad from item where item.Descripcion_item like '%"+txtDescripcion.getText()+"%'";
        System.out.println(" cadenaSQL "+cadenaSQL);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("Codigo");
        model.addColumn("Descripción");
        model.addColumn("Clase");
        model.addColumn("Estado");
        TablaItem.setModel(model);
        
        String [] ItemEmpresaDTO = new String [5];
        try{
            ResultSet resultadoConsulta = conexion.executeQueryStatement(cadenaSQL);
            while(resultadoConsulta.next()){
                   ItemEmpresaDTO [0] =  resultadoConsulta.getString(1);
                   ItemEmpresaDTO [1] =  resultadoConsulta.getString(2);
                   ItemEmpresaDTO [2] =  resultadoConsulta.getString(3);
                   ItemEmpresaDTO [3] =  resultadoConsulta.getString(4);
                   ItemEmpresaDTO [4] =  resultadoConsulta.getString(5);
                   model.addRow(ItemEmpresaDTO);
            }
        }catch(SQLException ex){
            System.out.println("Se genero un error en el metodo consultar la tabla "+ex.getMessage());
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaItem = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Descripción");

        btnBuscar.setBackground(new java.awt.Color(96, 175, 255));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        TablaItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "id", "Codigo", "Descripcion", "tipo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaItem);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 204, 255));

        jMenu1.setText("Opciones");

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

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        GuiMenu principal = new GuiMenu();
            principal.setVisible(true);
            dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Consultar("item");
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiConsultarItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiConsultarItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiConsultarItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiConsultarItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiConsultarItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaItem;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
