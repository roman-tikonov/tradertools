/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JPanelBill.java
 *
 * Created on 27.05.2009, 13:37:54
 */

package view.panel;

import entity.Bill;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author е
 */
public class JPanelBill extends javax.swing.JPanel 
        implements IEntityView<Bill> {
    
    private Bill data;
    private boolean Editable;

    /** Creates new form JPanelBill */
    public JPanelBill() {
        initComponents();
        clearData();
        FocusListener fl = new FocusAdapter() {

            @Override
            public void focusLost(FocusEvent e) {
                data.setPurpose(((javax.swing.JTextArea)e.getSource()).getText());
            }
        };
        jTextAreaPurpose.addFocusListener(fl); //изменение Purpose

        fl = new FocusAdapter() {

            @Override
            public void focusLost(FocusEvent e) {
                assert (e.getSource() instanceof javax.swing.JFormattedTextField);
                String s = ((javax.swing.JFormattedTextField)e.getSource()).getText();
                //s.replace(' ', '');
                try {
                    data.setBillSum(new BigDecimal(s));
                }
                catch (NumberFormatException ex) {
                    System.out.println(ex.toString());
                    ((javax.swing.JFormattedTextField)e.getSource()).setText(
                            data.getBillSum().toString());
                }
            }
        };
        jFormattedTextFieldSum.addFocusListener(fl); //изменение BillSum
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelBillNumber = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCreationDate = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextFieldSum = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaPurpose = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelReceiver = new javax.swing.JLabel();
        jLabelSender = new javax.swing.JLabel();

        jLabel1.setText("Платежный документ №");

        jLabelBillNumber.setText("____");

        jLabel3.setText("от");

        jLabelCreationDate.setText("__________");

        jLabel5.setText("Сумма, руб");

        jFormattedTextFieldSum.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
        jFormattedTextFieldSum.setNextFocusableComponent(jTextAreaPurpose);

        jLabel7.setText("Назначение");

        jTextAreaPurpose.setColumns(20);
        jTextAreaPurpose.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jTextAreaPurpose.setLineWrap(true);
        jTextAreaPurpose.setRows(5);
        jTextAreaPurpose.setNextFocusableComponent(jFormattedTextFieldSum);
        jScrollPane1.setViewportView(jTextAreaPurpose);

        jLabel4.setText("Получатель");

        jLabel6.setText("Плательщик");

        jLabelReceiver.setText("___________");

        jLabelSender.setText("___________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBillNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCreationDate))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelReceiver, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSender, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextFieldSum, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelBillNumber)
                    .addComponent(jLabel3)
                    .addComponent(jLabelCreationDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelSender))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelReceiver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldSum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldSum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelBillNumber;
    private javax.swing.JLabel jLabelCreationDate;
    private javax.swing.JLabel jLabelReceiver;
    private javax.swing.JLabel jLabelSender;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaPurpose;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc="Properties">
    public boolean isEditable() {
        return Editable;
    }

    public void setEditable(boolean Editable) {
        this.Editable = Editable;
        jTextAreaPurpose.setEditable(Editable);
        jFormattedTextFieldSum.setEditable(Editable);
    }

    public Bill getData() {
        return data;
    }

    public void setData(Bill data) {
        this.data = data;
        updateDisplay();
    }
    // </editor-fold>

    public void clearData() {
         Bill i = new Bill();
         i.setBillSum(new BigDecimal(0));
         i.setCreationDate(new Date());
         setData(i);
    }

    public void updateDisplay() {
        if (data == null) return;
        if (data.getId() != null)
            jLabelBillNumber.setText(data.getId().toString());
        if (data.getCreationDate() != null)
            jLabelCreationDate.setText(
                    new SimpleDateFormat("dd.MM.yyyy").format(data.getCreationDate()));
        if (data.getBillSum() != null)
            jFormattedTextFieldSum.setText(data.getBillSum().toString());
        else jFormattedTextFieldSum.setText("");
        if (data.getPurpose() != null)
            jTextAreaPurpose.setText(data.getPurpose().toString());
        if (data.getReceiverId() != null)
            jLabelReceiver.setText(data.getReceiverId().toString());
        if (data.getSenderId() != null)
            jLabelSender.setText(data.getSenderId().toString());
    }
}
