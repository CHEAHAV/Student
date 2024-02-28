/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package SWING;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author HAV
 */
public class University extends javax.swing.JFrame {

    /**
     * Creates new form University
     */
    public University() {
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

        jPanel1 = new javax.swing.JPanel();
        bgsex = new javax.swing.ButtonGroup();
        bgtime = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbF = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cbDeparment = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtClass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbYears = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jcbEvening = new javax.swing.JCheckBox();
        jcbMorning = new javax.swing.JCheckBox();
        jcbAfternoon = new javax.swing.JCheckBox();
        cbUniversity = new javax.swing.JComboBox<>();
        bSort = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bSearch = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        rbM = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbImage = new javax.swing.JLabel();
        bChoosefile = new javax.swing.JButton();
        txtImage = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1262, 800));
        setMinimumSize(new java.awt.Dimension(1262, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Goudy Stout", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMATION STUDENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1250, 44));

        jLabel2.setFont(new java.awt.Font("AKbalthom Kbach", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 69, 215));
        jLabel2.setText("Years");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 70, 50));

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 250, 50));

        jLabel3.setFont(new java.awt.Font("AKbalthom Kbach", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 69, 215));
        jLabel3.setText("Class");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 80, 50));

        jLabel5.setFont(new java.awt.Font("AKbalthom Kbach", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 69, 215));
        jLabel5.setText("Time");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 70, 50));

        bgsex.add(rbF);
        rbF.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        rbF.setForeground(new java.awt.Color(153, 0, 153));
        rbF.setText("Female");
        rbF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFActionPerformed(evt);
            }
        });
        getContentPane().add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 110, 30));

        jLabel6.setFont(new java.awt.Font("AKbalthom Kbach", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 69, 215));
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 110, 50));

        cbDeparment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IT", "ITE", "KHMER", "MATH" }));
        cbDeparment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDeparmentActionPerformed(evt);
            }
        });
        getContentPane().add(cbDeparment, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 250, 50));

        jLabel7.setFont(new java.awt.Font("AKbalthom Kbach", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 69, 215));
        jLabel7.setText("Deparment");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 150, 50));
        getContentPane().add(txtClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 250, 50));

        jLabel8.setFont(new java.awt.Font("AKbalthom Kbach", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 69, 215));
        jLabel8.setText("ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 70, 50));

        cbYears.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year1", "Year2", "Year3", "Year4" }));
        getContentPane().add(cbYears, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 250, 50));

        jLabel9.setFont(new java.awt.Font("AKbalthom Kbach", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 69, 215));
        jLabel9.setText("University");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 130, 50));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 250, 50));

        jLabel10.setFont(new java.awt.Font("AKbalthom Kbach", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 69, 215));
        jLabel10.setText("Sex");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 70, 50));

        bgtime.add(jcbEvening);
        jcbEvening.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jcbEvening.setForeground(new java.awt.Color(51, 51, 255));
        jcbEvening.setText("Evening");
        jcbEvening.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEveningActionPerformed(evt);
            }
        });
        getContentPane().add(jcbEvening, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 120, 30));

        bgtime.add(jcbMorning);
        jcbMorning.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jcbMorning.setForeground(new java.awt.Color(51, 51, 255));
        jcbMorning.setText("Morning");
        jcbMorning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMorningActionPerformed(evt);
            }
        });
        getContentPane().add(jcbMorning, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, 120, 30));

        bgtime.add(jcbAfternoon);
        jcbAfternoon.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jcbAfternoon.setForeground(new java.awt.Color(51, 51, 255));
        jcbAfternoon.setText("Afternoon");
        jcbAfternoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAfternoonActionPerformed(evt);
            }
        });
        getContentPane().add(jcbAfternoon, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 120, 30));

        cbUniversity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUPP", "AEU", "AUPP", "IFL" }));
        cbUniversity.setFocusable(false);
        cbUniversity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUniversityItemStateChanged(evt);
            }
        });
        cbUniversity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUniversityActionPerformed(evt);
            }
        });
        getContentPane().add(cbUniversity, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 250, 50));

        bSort.setBackground(new java.awt.Color(204, 255, 204));
        bSort.setFont(new java.awt.Font("CollegiateFLF", 1, 18)); // NOI18N
        bSort.setForeground(new java.awt.Color(255, 0, 0));
        bSort.setText("Sort");
        getContentPane().add(bSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 660, 110, 50));

        bExit.setBackground(new java.awt.Color(255, 255, 51));
        bExit.setFont(new java.awt.Font("CollegiateFLF", 1, 18)); // NOI18N
        bExit.setForeground(new java.awt.Color(255, 0, 0));
        bExit.setText("Exit");
        getContentPane().add(bExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 660, 90, 50));

        bSave.setBackground(new java.awt.Color(153, 255, 153));
        bSave.setFont(new java.awt.Font("CollegiateFLF", 1, 18)); // NOI18N
        bSave.setForeground(new java.awt.Color(255, 0, 0));
        bSave.setText("Save");
        getContentPane().add(bSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 660, 90, 50));

        bSearch.setBackground(new java.awt.Color(102, 255, 255));
        bSearch.setFont(new java.awt.Font("CollegiateFLF", 1, 18)); // NOI18N
        bSearch.setForeground(new java.awt.Color(255, 0, 0));
        bSearch.setText("Search");
        bSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSearchActionPerformed(evt);
            }
        });
        getContentPane().add(bSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, 110, 50));

        bUpdate.setBackground(new java.awt.Color(153, 153, 255));
        bUpdate.setFont(new java.awt.Font("CollegiateFLF", 1, 18)); // NOI18N
        bUpdate.setForeground(new java.awt.Color(255, 0, 0));
        bUpdate.setText("Update");
        getContentPane().add(bUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 660, 110, 50));

        bgsex.add(rbM);
        rbM.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        rbM.setForeground(new java.awt.Color(153, 0, 153));
        rbM.setText("Male");
        rbM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMActionPerformed(evt);
            }
        });
        getContentPane().add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, 30));

        bgsex.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(153, 0, 153));
        jRadioButton4.setText("Male");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, 30));

        bgsex.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(153, 0, 153));
        jRadioButton5.setText("Male");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, 30));

        bgsex.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(153, 0, 153));
        jRadioButton6.setText("Male");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 80, 30));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Sex", "Address", "Universityt", "Deparment", "Years", "Class", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 1140, 160));

        jLabel11.setFont(new java.awt.Font("AKbalthom Kbach", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 69, 215));
        jLabel11.setText("Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 70, 50));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 250, 50));

        lbImage.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 51, 51)));
        getContentPane().add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 40, 150, 180));

        bChoosefile.setBackground(new java.awt.Color(255, 255, 255));
        bChoosefile.setFont(new java.awt.Font("Freestyle Script", 1, 36)); // NOI18N
        bChoosefile.setForeground(new java.awt.Color(204, 0, 51));
        bChoosefile.setText("Choosefile");
        bChoosefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bChoosefileActionPerformed(evt);
            }
        });
        getContentPane().add(bChoosefile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 230, 150, 60));

        txtImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtImageActionPerformed(evt);
            }
        });
        getContentPane().add(txtImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 140, 60, 0));

        jPanel2.setBackground(new java.awt.Color(128, 159, 180));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -20, 1290, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void rbFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void jcbEveningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEveningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbEveningActionPerformed

    private void jcbMorningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMorningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMorningActionPerformed

    private void jcbAfternoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAfternoonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAfternoonActionPerformed

    private void rbMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void cbUniversityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUniversityItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUniversityItemStateChanged

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void cbUniversityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUniversityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUniversityActionPerformed

    private void cbDeparmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDeparmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbDeparmentActionPerformed

    private void bChoosefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bChoosefileActionPerformed
        // TODO add your handling code here:
        JFileChooser choose = new JFileChooser();
        choose.showOpenDialog(null);
        File file = choose.getSelectedFile();
        String fileName = file.getAbsolutePath();
        txtImage.setText(fileName);
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(fileName);
        Image image = icon.getImage().getScaledInstance(lbImage.getWidth(), lbImage.getHeight(), Image.SCALE_SMOOTH);
        lbImage.setIcon(icon);
    }//GEN-LAST:event_bChoosefileActionPerformed

    private void txtImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtImageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtImageActionPerformed

    private void bSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bSearchActionPerformed

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
            java.util.logging.Logger.getLogger(University.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(University.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(University.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(University.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new University().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton bChoosefile;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bSearch;
    private javax.swing.JButton bSort;
    private javax.swing.JButton bUpdate;
    private javax.swing.ButtonGroup bgsex;
    private javax.swing.ButtonGroup bgtime;
    private javax.swing.JComboBox<String> cbDeparment;
    private javax.swing.JComboBox<String> cbUniversity;
    private javax.swing.JComboBox<String> cbYears;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbAfternoon;
    private javax.swing.JCheckBox jcbEvening;
    private javax.swing.JCheckBox jcbMorning;
    private javax.swing.JLabel lbImage;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
