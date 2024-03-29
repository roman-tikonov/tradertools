/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormGenericItemEditor.java
 *
 * Created on 19.02.2009, 21:22:31
 */

package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import util.PropsUtil;

/**
 *
 * @author е
 */
public class FormGenericItemEditor extends javax.swing.JFrame {
    public static final int GAP = 10;
    private List<JTextField> TextFields;
    private List<JComboBox> ComboBoxes;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;

    /** Creates new form FormGenericItemEditor */
    public FormGenericItemEditor(int TextFieldsCount, int ComboBoxesCount) {
        super();
        initComponents();
        Dimension d = new Dimension(this.getWidth(), TextFieldsCount*(45 + GAP*2) + GAP*2);
        //this.setPreferredSize(d);
        //setMaximumSize(d);
        setMinimumSize(d);
        TextFields = new ArrayList<JTextField>();
        ComboBoxes = new ArrayList<JComboBox>();
        JComponent c = null;

        JPanel TextBoxesPanel = new JPanel();
        TextBoxesPanel.setLayout(new BoxLayout(TextBoxesPanel, BoxLayout.PAGE_AXIS));
        TextBoxesPanel.setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
        for(int i = 0; i < TextFieldsCount; i++)
        {
            c = new JTextField();
            c.setPreferredSize(new Dimension(100, 45));
            c.setMaximumSize(new Dimension(500,45));
            c.setMinimumSize(new Dimension(100, 45));
            c.setAlignmentX(Component.LEFT_ALIGNMENT);
            TextFields.add((JTextField)c);
            TextBoxesPanel.add(c);
            TextBoxesPanel.add(Box.createVerticalStrut(GAP));
        }
        TextBoxesPanel.add(Box.createVerticalGlue());

        JPanel ComboBoxesPanel = new JPanel();
        ComboBoxesPanel.setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
        ComboBoxesPanel.setLayout(new BoxLayout(ComboBoxesPanel, BoxLayout.PAGE_AXIS));
        for(int i = 0; i < ComboBoxesCount; i++)
        {
            c = new JComboBox();
            c.setPreferredSize(new Dimension(100, 45));
            c.setMaximumSize(new Dimension(500,45));
            c.setMinimumSize(new Dimension(100, 45));
            c.setAlignmentX(Component.LEFT_ALIGNMENT);
            ComboBoxes.add((JComboBox)c);
            ComboBoxesPanel.add(c);
            ComboBoxesPanel.add(Box.createVerticalStrut(GAP));
        }
        ComboBoxesPanel.add(Box.createVerticalGlue());


        JPanel OkCancelPanel = new JPanel();
        OkCancelPanel.setLayout(new BoxLayout(OkCancelPanel, BoxLayout.LINE_AXIS));
        OkCancelPanel.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        OkCancelPanel.setBorder(BorderFactory.createEmptyBorder(0, GAP, GAP, GAP));
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
//        jButtonOk.setMinimumSize(new Dimension(80, 23));
//        jButtonCancel.setMinimumSize(new Dimension(80, 23));
        OkCancelPanel.add(jButtonCancel);
        OkCancelPanel.add(Box.createHorizontalStrut(GAP));
        OkCancelPanel.add(jButtonOk);
        OkCancelPanel.add(Box.createHorizontalGlue());

        Container ContentPane = this.getContentPane();
        ContentPane.setLayout(new BorderLayout(GAP, 0));
        ContentPane.add(TextBoxesPanel, BorderLayout.CENTER);
        ContentPane.add(ComboBoxesPanel, BorderLayout.EAST);
        ContentPane.add(OkCancelPanel, BorderLayout.SOUTH);

        loadTextProps();

        ActionListener l = new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };
        jButtonCancel.addActionListener(l);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public void addjButtonOkActionListener(ActionListener l)
    {
        jButtonOk.addActionListener(l);
    }
    public void removejButtonOkActionListener(ActionListener l)
    {
        jButtonOk.removeActionListener(l);
    }

    /**
     * @return the TextFields
     */
    public List<JTextField> getTextFields() {
        return TextFields;
    }

    /**
     * @return the ComboBoxes
     */
    public List<JComboBox> getComboBoxes() {
        return ComboBoxes;
    }

//    public void PlaceComponentsOnForm()
//    {
//        int space = 15;
//        int compheight = 45;
//        for (int i = 0; i < TextFields.size(); i++)
//            TextFields.get(0).setLocation(space, (space+compheight)*i);
//        for (int i = 0; i < ComboBoxes.size(); i++)
//            ComboBoxes.get(0).setLocation(space, (space+compheight)*(TextFields.size()+i));
//        this.setSize(this.getWidth(), (space+compheight)*(TextFields.size()+ComboBoxes.size()+1) + space);
//    }

    private void loadTextProps() {
        jButtonOk.setText(PropsUtil.getProps().getProperty("Ok.text"));
        jButtonCancel.setText(PropsUtil.getProps().getProperty("Cancel.text"));
    }

}
