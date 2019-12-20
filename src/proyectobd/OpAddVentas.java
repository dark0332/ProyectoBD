/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class OpAddVentas extends javax.swing.JFrame {

    PreparedStatement ps;
    ResultSet rs;
    Statement s;
    conexion con = new conexion();

    public OpAddVentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAgregarC = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfID = new javax.swing.JTextField();
        txfName = new javax.swing.JTextField();
        txfApellido1 = new javax.swing.JTextField();
        txfApellido2 = new javax.swing.JTextField();
        txfFechaN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cliente1.png"))); // NOI18N

        btnAgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Agregar.png"))); // NOI18N
        btnAgregarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 66, 66));
        jLabel4.setText("ID Venta:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 66, 66));
        jLabel5.setText("Cantidad:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 66, 66));
        jLabel6.setText("ID Producto:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 66, 66));
        jLabel7.setText("ID Cliente:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 66, 66));
        jLabel8.setText("ID Fecha:");

        txfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregarC)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txfFechaN)
                                    .addComponent(txfApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel4))
                                .addGap(126, 126, 126))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txfApellido1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txfID, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(133, 133, 133))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txfApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txfApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txfFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(btnAgregarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCMouseClicked
        String idProducto = txfApellido1.getText().toString();
        String idCliente = txfApellido2.getText().toString();
        String vCantidad = txfName.getText().toString().trim();
        int c1 = 0, c2 = 0, cantidad = 0, vcantidad = 0;
        String cantRes = null;
        //En caso de que el producto este disponible
        try {
            Connection cn = con.getConection();
            //Para establecer el modelo al JTable

            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
            rs = s.executeQuery("SELECT * FROM PRODUCTOS WHERE ID_PRODUCTO = '" + idProducto + "' AND ESTADOPRODU = 'DISPONIBLE'");

            while (rs.next()) {
                c1++;
            }
            System.out.println("contador prov : " + c1);
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //****************************************************************************      
        try {
            Connection cn = con.getConection();
            //Para establecer el modelo al JTable

            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
            rs = s.executeQuery("SELECT * FROM CLIENTES WHERE ID_CLIENTE = '" + idCliente + "' AND ESTADOCLIENT = 'LISTA BLANCA'");

            while (rs.next()) {
                c2++;
            }
            System.out.println("contador cli : " + c2);
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //****************************************************************************
//cantidad restante de producto
        try {
            Connection cn = con.getConection();

            //Para ejecutar la consulta
            s = cn.createStatement();
            //Ejecutamos la consulta y los datos lo almacenamos en un ResultSet
            rs = s.executeQuery("SELECT STOCK FROM PRODUCTOS WHERE ID_PRODUCTO = '" + idProducto + "' AND ESTADOPRODU = 'DISPONIBLE' ");
            //Obteniendo la informacion de las columnas que estan siendo consultadas
            ResultSetMetaData rsMd = rs.getMetaData();
            //La cantidad de columnas que tiene la consulta
            int cantidadColumnas = rsMd.getColumnCount();
            //Establecer como cabezeras el nombre de las colimnas

            //Creando las filas para el JTable
            Object[] fila = new Object[cantidadColumnas];
            while (rs.next()) {

                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);

                }
            }
            cantRes = fila[0] + "";
            System.out.println("Cantidad: " + cantRes);
            rs.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        cantidad = Integer.parseInt(cantRes);
        vcantidad = Integer.parseInt(vCantidad);
        if (cantidad >= vcantidad && c2 > 0 && c1 > 0) {
            //*******************
            ImageIcon icono = new ImageIcon("src/imagenes/Ok.png");
            String insertar = " INSERT INTO VENTAS VALUES(?,?,?,?,?) ";
            String estado = "LISTA BLANCA";
            int Resultado = 0;
            try {
                Connection cn = con.getConection();
                ps = cn.prepareStatement(insertar);
                ps.setString(1, txfID.getText().toString());
                ps.setString(2, txfName.getText().toString());
                ps.setString(3, txfApellido1.getText().toString());
                ps.setString(4, txfApellido2.getText().toString());
                ps.setString(5, txfFechaN.getText().toString());
                Resultado = ps.executeUpdate();
                if (Resultado > 0) {
                    System.out.println("Registro Exitoso");
                    JOptionPane.showMessageDialog(this, "La Venta se agrego correctamente.", "Mensaje", 0, icono);
                    this.dispose();
                } else {
                    System.out.println("No se pudo Registrar");
                }
            } catch (Exception e) {
                System.out.println("Error en Registrar: " + e.getMessage());
                JOptionPane.showMessageDialog(this, "No se pudo agregar La Venta.", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            if (Resultado > 0) {
                String idC = txfID.getText().toString().trim();
                String sendCant = txfName.getText().toString().trim();
                CallableStatement cstm = null;
                boolean resp = true;
                try {
                    Connection cn = con.getConection();
                    cn.setAutoCommit(false);
                    cstm = cn.prepareCall("{Call REDUCIR(?,?)}");
                    cstm.setString(1, idC);
                    cstm.setString(2, sendCant);
                    resp = cstm.execute();
                    cn.commit();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            //*******************
        }else{
            if (cantidad < vcantidad ) {
                JOptionPane.showMessageDialog(this, "No tenemos esa camtidad en stock", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            if (c2 <= 0) {
                JOptionPane.showMessageDialog(this, "El Cliente no esta disponible", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            if (c1 <= 0) {
                JOptionPane.showMessageDialog(this, "El Producto no esta disponible", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAgregarCMouseClicked

    private void txfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfIDActionPerformed

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
            java.util.logging.Logger.getLogger(OpAddVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpAddVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpAddVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpAddVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpAddVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAgregarC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txfApellido1;
    private javax.swing.JTextField txfApellido2;
    private javax.swing.JTextField txfFechaN;
    private javax.swing.JTextField txfID;
    private javax.swing.JTextField txfName;
    // End of variables declaration//GEN-END:variables
}
