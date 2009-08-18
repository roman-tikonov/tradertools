/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormCustomerCreator.java
 *
 * Created on 28.05.2009, 15:30:41
 */

package view.form;

import controller.CustomerManagingTool;
import entity.Customer;

/**
 *
 * @author е
 */
public class FormCustomerCreator extends javax.swing.JFrame
        implements IFormCreator<Customer> {

    /** Creates new form FormCustomerCreator */
    public FormCustomerCreator(int mode) {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//        if (mode == CustomerManagingTool.MODE_SUPPLIERS) {
////            jPanelCustomerFullInfo1.getData().setIsSupplier(true);
//            setTitle("New Supplier");
//        } else {
////            jPanelCustomerFullInfo1.getData().setIsSupplier(false);
////            setTitle("New Client");
//        }
        jPanelCustomerFullInfo1.setEditable(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCustomerFullInfo1 = new view.panel.JPanelCustomerFullInfo();
        jPanelOkCancel1 = new view.JPanelOkCancel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCustomerFullInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(362, Short.MAX_VALUE)
                .addComponent(jPanelOkCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCustomerFullInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelOkCancel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.panel.JPanelCustomerFullInfo jPanelCustomerFullInfo1;
    private view.JPanelOkCancel jPanelOkCancel1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jPanelOkCancel1
     */
    public view.JPanelOkCancel getJPanelOkCancel() {
        return jPanelOkCancel1;
    }

    /**
     * @return the jPanelCustomerFullInfo1
     */
    public view.panel.JPanelCustomerFullInfo getPanel() {
        return jPanelCustomerFullInfo1;
    }

    public Customer getData() {
        return jPanelCustomerFullInfo1.getData();
    }

}
