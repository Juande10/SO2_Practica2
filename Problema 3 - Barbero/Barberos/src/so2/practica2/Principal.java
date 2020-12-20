/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package so2.practica2;

import java.awt.Color;
import java.awt.Label;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Juan de Dios Molina
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setTitle("Problema Barberos - Grupo 10");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        container = new javax.swing.JPanel();
        stateBarber = new javax.swing.JLabel();
        chairStatus = new javax.swing.JLabel();
        panelSillas = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salio = new javax.swing.JLabel();
        work = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        org.jdesktop.layout.GroupLayout jFrame1Layout = new org.jdesktop.layout.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jFrame2Layout = new org.jdesktop.layout.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jFrame3Layout = new org.jdesktop.layout.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout jFrame4Layout = new org.jdesktop.layout.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        container.setBackground(new java.awt.Color(255, 255, 255));

        stateBarber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stateBarber.setText("...");

        chairStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chairStatus.setText("...");

        org.jdesktop.layout.GroupLayout panelSillasLayout = new org.jdesktop.layout.GroupLayout(panelSillas);
        panelSillas.setLayout(panelSillasLayout);
        panelSillasLayout.setHorizontalGroup(
            panelSillasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 66, Short.MAX_VALUE)
        );
        panelSillasLayout.setVerticalGroup(
            panelSillasLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 435, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("Sala de espera");

        salio.setText("Clientes que no entran");

        startButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        startButton.setText("Iniciar");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        stopButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stopButton.setText("Parar");
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Practica 2 - Problema Barberia ");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Juan Molina - 201314412\nOrlando Batres - 201212734\nRicardo Fernandez - 200611606");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/so2/practica2/barberia.png"))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/so2/practica2/silla.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ESTADO DE LA SILLA");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ESTADO DEL BARBERO");

        org.jdesktop.layout.GroupLayout containerLayout = new org.jdesktop.layout.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(containerLayout.createSequentialGroup()
                .addContainerGap()
                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(containerLayout.createSequentialGroup()
                        .add(jLabel3)
                        .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(containerLayout.createSequentialGroup()
                                .add(27, 27, 27)
                                .add(work, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(containerLayout.createSequentialGroup()
                                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(containerLayout.createSequentialGroup()
                                        .add(259, 259, 259)
                                        .add(stopButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(containerLayout.createSequentialGroup()
                                        .add(105, 105, 105)
                                        .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 245, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 245, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                                .add(83, 83, 83)
                                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1)
                                    .add(panelSillas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(containerLayout.createSequentialGroup()
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 165, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(chairStatus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5))
                        .add(52, 52, 52)
                        .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel6)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, stateBarber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(containerLayout.createSequentialGroup()
                        .add(125, 125, 125)
                        .add(salio)
                        .add(120, 120, 120)
                        .add(startButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 115, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(containerLayout.createSequentialGroup()
                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(containerLayout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, containerLayout.createSequentialGroup()
                                .add(0, 0, Short.MAX_VALUE)
                                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel5)
                                    .add(jLabel6))
                                .add(27, 27, 27)
                                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(chairStatus)
                                    .add(stateBarber))
                                .add(113, 113, 113)
                                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(startButton)
                                    .add(stopButton)
                                    .add(salio)))
                            .add(containerLayout.createSequentialGroup()
                                .add(containerLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(panelSillas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(containerLayout.createSequentialGroup()
                                        .add(26, 26, 26)
                                        .add(jLabel2)
                                        .add(18, 18, 18)
                                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(0, 0, Short.MAX_VALUE))))
                    .add(containerLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel3)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 62, Short.MAX_VALUE)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(58, 58, 58)
                        .add(work)))
                .add(68, 68, 68))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(container, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(container, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        //Agregamos los label que simulan las sillas
        Label [] arrSillas = new Label[20];
        panelSillas.setBackground(Color.BLACK);
        for(int x=0; x < 20 ; x++){
            arrSillas[x] = new Label();
            arrSillas[x].setBounds(new Rectangle(10, (x+1)*20, 40, 15));
            //arrSillas[x].setHorizontalAlignment(SwingConstants.CENTER);
            arrSillas[x].setName("lab"+x);
            arrSillas[x].setBackground(Color.WHITE);
            panelSillas.add(arrSillas[x], null);

        }

        controlSillas control = new controlSillas(stateBarber, chairStatus, panelSillas, arrSillas, work);
        estadoBarbero barbero = new estadoBarbero(control, stateBarber, chairStatus, panelSillas, work);

        new Thread(barbero).start();
        new Thread(control).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    int numCliente=0;

                    while(true){
                        Thread.sleep(500); //Taza de llegada
                        if(control.sillasOcupadas<20){
                            salio.setText(" - ");
                            salio.setBackground(Color.WHITE);
                            estadoCliente nuevo = new estadoCliente(control, barbero, ++numCliente, stateBarber, panelSillas);
                            Thread t = new Thread(nuevo);
                            t.start();

                        }else{
                            System.out.println("Llego un cliente y se fue");
                            salio.setText("Cliente no."+numCliente + " \n no entro a la sala de espera \n no cupo.");
                            salio.setBackground(Color.red);
                        }
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }).start();
        this.startButton.setVisible(false);
    }//GEN-LAST:event_startButtonActionPerformed

    
    private void setTextFieldChanged(JTextField txt){
        final JTextField t = txt;
        DocumentListener documentListener = new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent de) {
                changeEnabled(de);
            }

            @Override
            public void removeUpdate(DocumentEvent de) {
                changeEnabled(de);
            }

            @Override
            public void changedUpdate(DocumentEvent de) {
                changeEnabled(de);
            }
        };
        txt.getDocument().addDocumentListener(documentListener);
    }
    
    private void changeEnabled(DocumentEvent event){
        DocumentEvent.EventType type = event.getType();
        startButton.setEnabled(false);
        
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chairStatus;
    private javax.swing.JPanel container;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panelSillas;
    private javax.swing.JLabel salio;
    private javax.swing.JButton startButton;
    private javax.swing.JLabel stateBarber;
    private javax.swing.JButton stopButton;
    private javax.swing.JLabel work;
    // End of variables declaration//GEN-END:variables
}
