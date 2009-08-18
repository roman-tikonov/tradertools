/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FormTransmitter.java
 *
 * Created on 19.02.2009, 23:04:49
 */

package view;

import controller.DataTransmitTool;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import util.PropsUtil;

/**
 *
 * @author е
 */
public class FormTransmitter extends javax.swing.JFrame {

    /** Creates new form FormTransmitter */
    public FormTransmitter() {
        initComponents();        
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Excel", "xls");
        jFileChooser1.setFileFilter(filter);        
        jMenuItemSaveAs.setVisible(false);
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

        jFileChooser1 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListTables = new javax.swing.JList();
        jTextFieldFilePath = new javax.swing.JTextField();
        jButtonChooseFile = new javax.swing.JButton();
        jButtonRun = new javax.swing.JButton();
        jRadioButtonImport = new javax.swing.JRadioButton();
        jRadioButtonExport = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemSaveAs = new javax.swing.JMenuItem();
        jMenuItemQuit = new javax.swing.JMenuItem();
        jMenuEdit = new javax.swing.JMenu();
        jMenuItemUndo = new javax.swing.JMenuItem();
        jMenuItemRedo = new javax.swing.JMenuItem();
        jMenuHelp = new javax.swing.JMenu();
        jMenuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transmitter");

        jListTables.setBorder(javax.swing.BorderFactory.createTitledBorder("Тип документа"));
        jListTables.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Прайс ИП Тихонов", "Прайс Серпухов", "Прайс Виллер", "Счет Виллер", "Счет Серпухов" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jListTables.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jListTables);

        jTextFieldFilePath.setBorder(javax.swing.BorderFactory.createTitledBorder("File Path"));

        jButtonChooseFile.setText("...");
        jButtonChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseFileActionPerformed(evt);
            }
        });

        jButtonRun.setText("Run");

        buttonGroup1.add(jRadioButtonImport);
        jRadioButtonImport.setSelected(true);
        jRadioButtonImport.setText("Import");

        buttonGroup1.add(jRadioButtonExport);
        jRadioButtonExport.setText("Export");

        jMenuFile.setText("File");

        jMenuItemSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSaveAs.setText("Save As...");
        jMenuFile.add(jMenuItemSaveAs);

        jMenuItemQuit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemQuit.setText("Quit");
        jMenuItemQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuitActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemQuit);

        jMenuBar1.add(jMenuFile);

        jMenuEdit.setText("Edit");

        jMenuItemUndo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemUndo.setText("Undo");
        jMenuEdit.add(jMenuItemUndo);

        jMenuItemRedo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRedo.setText("Redo");
        jMenuEdit.add(jMenuItemRedo);

        jMenuBar1.add(jMenuEdit);

        jMenuHelp.setText("Help");

        jMenuItemAbout.setText("About");
        jMenuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAboutActionPerformed(evt);
            }
        });
        jMenuHelp.add(jMenuItemAbout);

        jMenuBar1.add(jMenuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRun, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonImport)
                                    .addComponent(jRadioButtonExport)))
                            .addComponent(jTextFieldFilePath, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonChooseFile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(jRadioButtonExport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonImport)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChooseFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRun)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseFileActionPerformed
        if(jFileChooser1.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            jTextFieldFilePath.setText(jFileChooser1.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_jButtonChooseFileActionPerformed

    private void jMenuItemQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItemQuitActionPerformed

    private void jMenuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAboutActionPerformed
        JOptionPane.showMessageDialog(this, PropsUtil.getProperty("FormTransmitter.About.text"), PropsUtil.getProperty("jMenuItemAbout.text"), JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItemAboutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonChooseFile;
    private javax.swing.JButton jButtonRun;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JList jListTables;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEdit;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenu jMenuHelp;
    private javax.swing.JMenuItem jMenuItemAbout;
    private javax.swing.JMenuItem jMenuItemQuit;
    private javax.swing.JMenuItem jMenuItemRedo;
    private javax.swing.JMenuItem jMenuItemSaveAs;
    private javax.swing.JMenuItem jMenuItemUndo;
    private javax.swing.JRadioButton jRadioButtonExport;
    private javax.swing.JRadioButton jRadioButtonImport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldFilePath;
    // End of variables declaration//GEN-END:variables

    public void addjButtonRunActionListener(ActionListener l)
    {
        jButtonRun.addActionListener(l);
    }
    public void removejButtonRunActionListener(ActionListener l)
    {
        jButtonRun.removeActionListener(l);
    }

    public String getFileName(){
        return jTextFieldFilePath.getText();
    }

    public int getTransmitMode(){
        if (jRadioButtonImport.isSelected())
            return DataTransmitTool.MODE_IMPORT;
        else return DataTransmitTool.MODE_EXPORT;
    }

    public int getDocumentType() {
        return jListTables.getSelectedIndex();
    }
    
    private void loadTextProps() {
        jMenuFile.setText(PropsUtil.getProperty("jMenuFile.text"));
        jMenuItemSaveAs.setText(PropsUtil.getProperty("jMenuItemSaveAs.text"));
        jMenuItemQuit.setText(PropsUtil.getProperty("jMenuItemQuit.text"));
        jMenuEdit.setText(PropsUtil.getProperty("jMenuEdit.text"));      
        jMenuItemUndo.setText(PropsUtil.getProperty("jMenuItemUndo.text"));
        jMenuItemRedo.setText(PropsUtil.getProperty("jMenuItemRedo.text"));
        jMenuHelp.setText(PropsUtil.getProperty("jMenuHelp.text"));
        jMenuItemAbout.setText(PropsUtil.getProperty("jMenuItemAbout.text"));
        jButtonRun.setText(PropsUtil.getProperty("FormTransmitter.jButtonRun.text"));
        jRadioButtonExport.setText(PropsUtil.getProperty("FormTransmitter.jRadioButtonExport.text"));
        jRadioButtonImport.setText(PropsUtil.getProperty("FormTransmitter.jRadioButtonImport.text"));
        this.setTitle(PropsUtil.getProperty("FormTransmitter.title"));

        jMenuItemUndo.setIcon(new ImageIcon(
                getClass().getResource(PropsUtil.getProperty("icon.undo"))));
        jMenuItemRedo.setIcon(new ImageIcon(
                getClass().getResource(PropsUtil.getProperty("icon.redo"))));
        jMenuItemAbout.setIcon(new ImageIcon(
                getClass().getResource(PropsUtil.getProperty("icon.info"))));
        try {
            this.setIconImage(ImageIO.read(new File(PropsUtil.getProperty("icon.hammer"))));
        } catch (IOException ex) {
            Logger.getLogger(FormSupplyList.class.getName()).log(Level.ERROR, null, ex);
        }
    }
}
