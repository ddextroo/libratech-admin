/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package libratech.dashboard;
import java.awt.Color;
import java.awt.Font;
import libratech.design.RoundedPanel;
/**
 *
 * @author Lenovo
 */
public class deleteconfirmation extends javax.swing.JPanel {

    /**
     * Creates new form deleteconfirmation
     */
    public deleteconfirmation() {
        initComponents();
        initFont();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deleteconfirmationlabel = new javax.swing.JLabel();
        txt = new javax.swing.JTextPane();
        cancellabel2 = new libratech.design.MyButtonborder();
        confirmlabel = new libratech.design.MyButtonborderless();

        deleteconfirmationlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteconfirmationlabel.setText("Delete Confirmation");

        txt.setText("Are you sure you want to delete?\n\n\tThis action cannot be undone.");
        txt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        cancellabel2.setForeground(new java.awt.Color(23, 23, 23));
        cancellabel2.setText("Cancel");

        confirmlabel.setForeground(new java.awt.Color(224, 224, 224));
        confirmlabel.setText("Confirm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteconfirmationlabel))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancellabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(confirmlabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(deleteconfirmationlabel)
                .addGap(18, 18, 18)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancellabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private libratech.design.MyButtonborder cancellabel2;
    private libratech.design.MyButtonborderless confirmlabel;
    private javax.swing.JLabel deleteconfirmationlabel;
    private javax.swing.JTextPane txt;
    // End of variables declaration//GEN-END:variables
public void initFont() {
        deleteconfirmationlabel.setFont(new Font("Poppins Regular", Font.BOLD, 20));
        confirmlabel.setFont(new Font("Poppins Regular", Font.BOLD, 20));
        cancellabel2.setFont(new Font("Poppins Regular", Font.BOLD, 20));
        
    }
}