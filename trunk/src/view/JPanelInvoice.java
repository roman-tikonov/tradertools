/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JPanelInvoice.java
 *
 * Created on 27.02.2009, 19:41:59
 */

package view;

import entity.Invoice;

/**
 *
 * @author е
 */
public class JPanelInvoice extends javax.swing.JPanel {

    private Invoice data;

    /** Creates new form JPanelInvoice */
    public JPanelInvoice() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelInvoiceNumber = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelSum = new javax.swing.JLabel();
        jLabelSumValue = new javax.swing.JLabel();

        jLabelInvoiceNumber.setText("Накладная №");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "№", "Наименование", "Цена", "Кол-во", "Сумма"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabelSum.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSum.setText("Итого:");

        jLabelSumValue.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSumValue.setText("100235р");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(jLabelSum)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelSumValue)
                    .addContainerGap())
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelInvoiceNumber)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelInvoiceNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSum)
                    .addComponent(jLabelSumValue)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelInvoiceNumber;
    private javax.swing.JLabel jLabelSum;
    private javax.swing.JLabel jLabelSumValue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the data
     */
    public Invoice getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Invoice data) {
        this.data = data;
        updateFields();
    }

    protected void updateFields() {
        if (data.getInvoiceSum() != null)
            jLabelSumValue.setText(data.getInvoiceSum().toString());
        jLabelInvoiceNumber.setText(data.getId().toString());
        //getJTable().setModel(); //написать модель для List<InvoiceProduct>
    }

    /**
     * @return the jTable1
     */
    public javax.swing.JTable getJTable() {
        return jTable1;
    }

}