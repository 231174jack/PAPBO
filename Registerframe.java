/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Ackyras-Laptop
 */
public class Registerframe extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    /**
     * Creates new form Regiterframe
     */
    public Registerframe() throws SQLException {
        initComponents();
        Konek db=new Konek();
        db.config();
        con =db.con;
        stat =db.stm;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textnama = new javax.swing.JTextField();
        textun = new javax.swing.JTextField();
        textpw = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        textko = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textktp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(227, 132, 1));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        jLabel1.setText("Akun Baru");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(227, 132, 1));
        jLabel3.setText("Nama               :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 80, -1));

        jLabel4.setForeground(new java.awt.Color(227, 132, 1));
        jLabel4.setText("Username       :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 74, -1));

        jLabel5.setForeground(new java.awt.Color(227, 132, 1));
        jLabel5.setText("Password        :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        jPanel2.add(textnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 158, -1));

        textun.setText("Nomor pendaftaran Anda");
        textun.setToolTipText("");
        textun.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textunFocusLost(evt);
            }
        });
        textun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textunMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textunMouseExited(evt);
            }
        });
        textun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textunActionPerformed(evt);
            }
        });
        jPanel2.add(textun, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 158, -1));
        jPanel2.add(textpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 158, -1));

        jButton1.setText("Buat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, -1));

        jLabel6.setForeground(new java.awt.Color(227, 132, 1));
        jLabel6.setText("Kode Otoritas : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        textko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textkoActionPerformed(evt);
            }
        });
        jPanel2.add(textko, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 158, -1));

        jLabel7.setForeground(new java.awt.Color(227, 132, 1));
        jLabel7.setText("*");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(227, 132, 1));
        jLabel2.setText("* Isi 0 jika anda maba");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 219, -1, -1));

        jLabel8.setForeground(new java.awt.Color(227, 132, 1));
        jLabel8.setText("Nomor KTP      :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 74, -1));

        textktp.setToolTipText("");
        textktp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textktpFocusLost(evt);
            }
        });
        textktp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textktpMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textktpMouseExited(evt);
            }
        });
        textktp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textktpActionPerformed(evt);
            }
        });
        jPanel2.add(textktp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 158, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            String sql="select * from akun where username='"+textun.getText()+"'";
            rs=stat.executeQuery(sql);
            if(rs.next()){
                JOptionPane.showMessageDialog(null,"Username telah digunakan, ganti username anda!");
            }else{
                if(textko.getText()=="118140160" && !"0".equals(textko.getText())){
                    JOptionPane.showMessageDialog(null,"Kode Otorisasi Anda Salah! Jika Anda adalah mahasiswa baru, kosongkan bagian Kode Otorisasi!");
                    textko.setText(null);
                }else{
                    sql= "INSERT INTO `akun` (`Nama`,`Nomor KTP`, `Username`, `Password`, `Kode Otoritas`) VALUES ('"+textnama.getText()+"','"+textktp.getText()+"','"+textun.getText()+"','"+textpw.getText()+"','"+textko.getText()+"')";
                    stat.execute(sql);
                    if("118140160".equals(textko.getText())){
                        sql="insert into `admin` (nama,`nomor ktp`)values('"+textnama.getText()+"','"+textktp.getText()+"')";
                        stat.execute(sql);
                        JOptionPane.showMessageDialog(null,"Akun Anda sebagai admin berhasil dibuat...");
                    }else{
                        sql="insert into `mahasiswa` (nama,`nomor ktp`)values('"+textnama.getText()+"','"+textktp.getText()+"')";
                        stat.execute(sql);
                        JOptionPane.showMessageDialog(null,"Akun Anda sebagai mahasiswa berhasil dibuat...");
                    }
                    JOptionPane.showMessageDialog(null,"Anda sudah dapat menggunakan akun anda...");
                    Loginframe lf = new Loginframe();
                    lf.setVisible(true);
                    lf.setLocationRelativeTo(null);
                    this.dispose();
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textunMouseClicked
        // TODO add your handling code here:
        textun.setText(null);
    }//GEN-LAST:event_textunMouseClicked

    private void textunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textunMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textunMouseExited

    private void textunFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textunFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textunFocusLost

    private void textunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textunActionPerformed

    private void textkoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textkoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textkoActionPerformed

    private void textktpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textktpFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textktpFocusLost

    private void textktpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textktpMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_textktpMouseClicked

    private void textktpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textktpMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_textktpMouseExited

    private void textktpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textktpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textktpActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            Loginframe lg=new Loginframe();
            lg.setVisible(true);
            lg.setLocationRelativeTo(null);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Registerframe.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registerframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create  and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Registerframe().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Registerframe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField textko;
    private javax.swing.JTextField textktp;
    private javax.swing.JTextField textnama;
    private javax.swing.JPasswordField textpw;
    private javax.swing.JTextField textun;
    // End of variables declaration//GEN-END:variables
}
