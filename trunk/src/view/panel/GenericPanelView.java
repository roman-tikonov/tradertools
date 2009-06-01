/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * JPanelGeneric.java
 *
 * Created on 31.05.2009, 20:56:19
 */

package view.panel;

/**
 *
 * @author е
 */
public abstract class GenericPanelView<T> extends javax.swing.JPanel implements IEntityView<T>{

    protected T data;
    protected boolean Editable;

    /** Creates new form JPanelGeneric */
    public GenericPanelView() {
        initComponents();
        clearData();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean isEditable() {
        return Editable;
    }

    public void setEditable(boolean Editable) {
         this.Editable = Editable;
         //этот метод надо переопределять в потомках
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
        updateDisplay();
    }

//    public void clearData() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//
//    public void updateDisplay() {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
