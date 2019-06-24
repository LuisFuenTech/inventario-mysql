/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import static Vistas.InventarioView.con;
import static Vistas.InventarioView.ps;
import db_connection.DBconnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisFuentes
 */
public class ProductoView extends javax.swing.JFrame {

    public DBconnection conexion;
    public static Connection con;
    public static PreparedStatement ps;
    public static ResultSet rs;
    /**
     * Creates new form ProductoView
     */
    public ProductoView() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Producto_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre_txt = new javax.swing.JTextField();
        cantidad_txt = new javax.swing.JTextField();
        costo_unitario_txt = new javax.swing.JTextField();
        costo_total_txt = new javax.swing.JTextField();
        aceptar_button = new javax.swing.JButton();
        cancelar_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Cantidad:");

        jLabel3.setText("Costo unitario:");

        jLabel4.setText("Costo total:");

        cantidad_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidad_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidad_txtKeyTyped(evt);
            }
        });

        costo_unitario_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                costo_unitario_txtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                costo_unitario_txtKeyTyped(evt);
            }
        });

        costo_total_txt.setEditable(false);

        aceptar_button.setText("Aceptar");
        aceptar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar_buttonActionPerformed(evt);
            }
        });

        cancelar_button.setText("Cancelar");
        cancelar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Producto_panelLayout = new javax.swing.GroupLayout(Producto_panel);
        Producto_panel.setLayout(Producto_panelLayout);
        Producto_panelLayout.setHorizontalGroup(
            Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Producto_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Producto_panelLayout.createSequentialGroup()
                        .addGroup(Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidad_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(Producto_panelLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(costo_unitario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Producto_panelLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(costo_total_txt)))
                    .addGroup(Producto_panelLayout.createSequentialGroup()
                        .addComponent(aceptar_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar_button)))
                .addContainerGap())
        );
        Producto_panelLayout.setVerticalGroup(
            Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Producto_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(costo_unitario_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(costo_total_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(Producto_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar_button)
                    .addComponent(cancelar_button))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Producto_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Producto_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_buttonActionPerformed
        cerrarVentana();
    }//GEN-LAST:event_cancelar_buttonActionPerformed

    private void cantidad_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidad_txtKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0') | (caracter > '9')) & (caracter != '\b') & (caracter != '.')) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_cantidad_txtKeyTyped

    private void costo_unitario_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costo_unitario_txtKeyTyped
        char caracter = evt.getKeyChar();

        // Verificar si la tecla pulsada no es un digito
        if (((caracter < '0') | (caracter > '9')) & (caracter != '\b') & (caracter != '.')) {
            evt.consume();  // ignorar el evento de teclado
        }
    }//GEN-LAST:event_costo_unitario_txtKeyTyped

    private void aceptar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar_buttonActionPerformed
        guardarProducto();
    }//GEN-LAST:event_aceptar_buttonActionPerformed

    private void costo_unitario_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costo_unitario_txtKeyReleased
        calcularTotal();
    }//GEN-LAST:event_costo_unitario_txtKeyReleased

    private void cantidad_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidad_txtKeyReleased
        calcularTotal();
    }//GEN-LAST:event_cantidad_txtKeyReleased

    void guardarProducto(){
        try {
            if(!cantidad_txt.getText().equals("") & !costo_unitario_txt.getText().equals("") & !nombre_txt.getText().equals("")){
            String query = "INSERT INTO producto (nombre_producto, cantidad_producto, costo_unitario_producto, costo_total_producto) VALUES (?,?,?,?)";
            
            conexion = new DBconnection("localhost", "3307", "inventario_db", "root", "Mysql@fuentech2018");
            con = conexion.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, nombre_txt.getText());
            ps.setString(2, cantidad_txt.getText());
            ps.setString(3, costo_unitario_txt.getText());
            ps.setString(4, costo_total_txt.getText());
            
            int notifica = ps.executeUpdate();
            
            if(notifica > 0){
                JOptionPane.showMessageDialog(null, "Producto guardado");
                cerrarVentana();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar persona");
            }
            
            con.close();//Cerrar la conexión
        }            
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductoView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    void calcularTotal() {
        if (!cantidad_txt.getText().equals("") & !costo_unitario_txt.getText().equals("")) {
            double cantidad = Double.parseDouble(cantidad_txt.getText());
            double costoUnitario = Double.parseDouble(costo_unitario_txt.getText());

            System.out.println(cantidad + " " + costoUnitario);

            if (costoUnitario >= 0 & cantidad >= 0) {
                double costoTotal = cantidad * costoUnitario;
                costo_total_txt.setText(String.valueOf(costoTotal));
            }
        } else {
            costo_total_txt.setText("");
        }
    }

    void cerrarVentana() {
        this.hide();
        System.gc();
    }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Producto_panel;
    private javax.swing.JButton aceptar_button;
    private javax.swing.JButton cancelar_button;
    private javax.swing.JTextField cantidad_txt;
    private javax.swing.JTextField costo_total_txt;
    private javax.swing.JTextField costo_unitario_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nombre_txt;
    // End of variables declaration//GEN-END:variables
}
