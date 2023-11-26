/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author ACER
 */
public class PilihGambarComboBox extends javax.swing.JFrame {

    private Container pCardLayout;

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarComboBox() {
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

        buttonPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pilihgambarCB = new javax.swing.JComboBox<>();
        imagePanel = new javax.swing.JPanel();
        graderLabel = new javax.swing.JLabel();
        excaLabel = new javax.swing.JLabel();
        loaderLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        buttonPanel.setBackground(new java.awt.Color(255, 255, 153));
        buttonPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Pilih Gambar");
        buttonPanel.add(jLabel1);

        pilihgambarCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excavator", "Loader", "Grader", " " }));
        pilihgambarCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilihgambarCBItemStateChanged(evt);
            }
        });
        pilihgambarCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihgambarCBActionPerformed(evt);
            }
        });
        buttonPanel.add(pilihgambarCB);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 153)));
        imagePanel.setLayout(new java.awt.CardLayout());

        graderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/Grader.jpg"))); // NOI18N
        imagePanel.add(graderLabel, "2");

        excaLabel.setBackground(new java.awt.Color(102, 255, 204));
        excaLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/Excavator.jpg"))); // NOI18N
        excaLabel.setMaximumSize(new java.awt.Dimension(316, 400));
        excaLabel.setMinimumSize(new java.awt.Dimension(316, 400));
        imagePanel.add(excaLabel, "0");

        loaderLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/Loader.jpg"))); // NOI18N
        imagePanel.add(loaderLabel, "1");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihgambarCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilihgambarCBItemStateChanged
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, String.valueOf(pilihgambarCB.getSelectedIndex()));
    }//GEN-LAST:event_pilihgambarCBItemStateChanged

    private void pilihgambarCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihgambarCBActionPerformed
       
    }//GEN-LAST:event_pilihgambarCBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            PilihGambarComboBox fullFrame = new PilihGambarComboBox();
            GraphicsDevice device =
                    GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
            device.setFullScreenWindow(fullFrame);
            
            fullFrame.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JLabel excaLabel;
    private javax.swing.JLabel graderLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loaderLabel;
    private javax.swing.JComboBox<String> pilihgambarCB;
    // End of variables declaration//GEN-END:variables
}