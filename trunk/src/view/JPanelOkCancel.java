/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JPanelOkCancel.java
 *
 * Created on 21.04.2009, 23:55:31
 */

package view;

import java.awt.event.ActionListener;
import util.PropsUtil;

/**
 *
 * @author е
 */
public class JPanelOkCancel extends javax.swing.JPanel {

    /** Creates new form JPanelOkCancel */
    public JPanelOkCancel() {
        initComponents();
        loadTextProps();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(158, 24));

        jButtonOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/icons/tick_circle.png"))); // NOI18N
        jButtonOk.setText("OK");

        jButtonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/icons/minus_circle.png"))); // NOI18N
        jButtonCancel.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButtonOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    // End of variables declaration//GEN-END:variables

    public void addOkActionListener(ActionListener l)
    {
        jButtonOk.addActionListener(l);
    }
    public void removeOkActionListener(ActionListener l)
    {
        jButtonOk.removeActionListener(l);
    }

    public void addCancelActionListener(ActionListener l)
    {
        jButtonCancel.addActionListener(l);
    }
    public void removeCancelActionListener(ActionListener l)
    {
        jButtonCancel.removeActionListener(l);
    }

    private void loadTextProps() {
        jButtonOk.setText(PropsUtil.getProperty("Ok.text"));
        jButtonCancel.setText(PropsUtil.getProperty("Cancel.text"));
    }
}
