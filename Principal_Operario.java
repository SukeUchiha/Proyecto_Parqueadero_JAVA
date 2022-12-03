/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparqueadero;



/**
 *
 * @author Principal
 */
public class Principal_Operario extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
   
    PanelRegistrarVehiculo panelingresarvehiculo;
    PanelRetirarVehiculo panelretirarvehiculo;
    Op_PanelListarVehiculos panelListarVehiculos;
    Op_PanelConsultarCeldas panelConsultarCeldas;
    Op_PanelActualizacionDatos panelActualizarDatos;
    public Principal_Operario() {
        
        initComponents();
        setSize(990,495);
        panelretirarvehiculo = new PanelRetirarVehiculo();
        panelretirarvehiculo.setBounds(318,0,672,455);
        panelretirarvehiculo.setVisible(false);
        add(panelretirarvehiculo);
        panelConsultarCeldas = new Op_PanelConsultarCeldas();
        panelConsultarCeldas.setBounds(318,0,672,455);
        panelConsultarCeldas.setVisible(false);
        add(panelConsultarCeldas);
        panelListarVehiculos = new Op_PanelListarVehiculos();
        panelListarVehiculos.setBounds(318,0,672,455);
        panelListarVehiculos.setVisible(false);
        add(panelListarVehiculos);
        panelActualizarDatos = new Op_PanelActualizacionDatos();
        panelActualizarDatos.setBounds(318,0,672,455);
        panelActualizarDatos.setVisible(false);
        add(panelActualizarDatos);
        panelingresarvehiculo = new PanelRegistrarVehiculo();
        panelingresarvehiculo.setBounds(318,0,672,455);
        panelingresarvehiculo.setVisible(true);
        add(panelingresarvehiculo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btIngVehiculo = new java.awt.Button();
        btRetVehiculo = new java.awt.Button();
        btLisVehiculo = new java.awt.Button();
        btConsCelda = new java.awt.Button();
        btSalir = new java.awt.Button();
        btActDatos = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setFocusCycleRoot(false);

        PanelMenu.setBackground(new java.awt.Color(63, 63, 63));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoparqueadero/logo-parqueadero.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 102));
        jLabel2.setText("System Engine");

        btIngVehiculo.setBackground(new java.awt.Color(58, 124, 165));
        btIngVehiculo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btIngVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btIngVehiculo.setLabel("Ingresar Vehiculo");
        btIngVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIngVehiculoActionPerformed(evt);
            }
        });

        btRetVehiculo.setBackground(new java.awt.Color(58, 124, 165));
        btRetVehiculo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btRetVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btRetVehiculo.setLabel("Retirar Vehiculo");
        btRetVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRetVehiculoActionPerformed(evt);
            }
        });

        btLisVehiculo.setBackground(new java.awt.Color(58, 124, 165));
        btLisVehiculo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btLisVehiculo.setForeground(new java.awt.Color(255, 255, 255));
        btLisVehiculo.setLabel("Listar Vehiculos");
        btLisVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLisVehiculoActionPerformed(evt);
            }
        });

        btConsCelda.setBackground(new java.awt.Color(58, 124, 165));
        btConsCelda.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btConsCelda.setForeground(new java.awt.Color(255, 255, 255));
        btConsCelda.setLabel("Consultar celdas");
        btConsCelda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsCeldaActionPerformed(evt);
            }
        });

        btSalir.setBackground(new java.awt.Color(255, 0, 0));
        btSalir.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 255, 255));
        btSalir.setLabel("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        btActDatos.setBackground(new java.awt.Color(58, 124, 165));
        btActDatos.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btActDatos.setForeground(new java.awt.Color(255, 255, 255));
        btActDatos.setLabel("Actualizar datos");
        btActDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelMenuLayout = new javax.swing.GroupLayout(PanelMenu);
        PanelMenu.setLayout(PanelMenuLayout);
        PanelMenuLayout.setHorizontalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelMenuLayout.createSequentialGroup()
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btLisVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btIngVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btActDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRetVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );
        PanelMenuLayout.setVerticalGroup(
            PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btIngVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRetVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btLisVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsCelda, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btActDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 673, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIngVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIngVehiculoActionPerformed
        // TODO add your handling code here:
        setSize(990,495);
        panelListarVehiculos.setVisible(false);
        panelretirarvehiculo.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelActualizarDatos.setVisible(false);
        panelingresarvehiculo.setVisible(true);
        
        revalidate();
        repaint();
    }//GEN-LAST:event_btIngVehiculoActionPerformed

    private void btRetVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRetVehiculoActionPerformed
        // TODO add your handling code here:
        setSize(990,495);
        panelListarVehiculos.setVisible(false);
        panelingresarvehiculo.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelActualizarDatos.setVisible(false);
        panelretirarvehiculo.setVisible(true);
        revalidate();
        repaint();
        
        
    }//GEN-LAST:event_btRetVehiculoActionPerformed

    private void btLisVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLisVehiculoActionPerformed
        // TODO add your handling code here:
        setSize(990,495);
        panelingresarvehiculo.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelretirarvehiculo.setVisible(false);
        panelActualizarDatos.setVisible(false);
        panelListarVehiculos.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btLisVehiculoActionPerformed

    private void btConsCeldaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsCeldaActionPerformed
        // TODO add your handling code here:
        setSize(990,495);
        panelListarVehiculos.setVisible(false);
        panelingresarvehiculo.setVisible(false);
        panelretirarvehiculo.setVisible(false);
        panelActualizarDatos.setVisible(false);
        panelConsultarCeldas.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btConsCeldaActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

    private void btActDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActDatosActionPerformed
        setSize(990,495);
        panelListarVehiculos.setVisible(false);
        panelingresarvehiculo.setVisible(false);
        panelretirarvehiculo.setVisible(false);
        panelConsultarCeldas.setVisible(false);
        panelActualizarDatos.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_btActDatosActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_Operario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Operario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Operario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Operario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Operario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelMenu;
    private java.awt.Button btActDatos;
    private java.awt.Button btConsCelda;
    private java.awt.Button btIngVehiculo;
    private java.awt.Button btLisVehiculo;
    private java.awt.Button btRetVehiculo;
    private java.awt.Button btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
