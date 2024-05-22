
package modul_8;

import com.mysql.cj.xdevapi.Statement;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modul_8.Koneksi;
public class create1 extends javax.swing.JFrame {
   
  

    public create1() {
        initComponents();
    }

    
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Lihat = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Hapus = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        Update = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        Search = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
    // 
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        Nama = new javax.swing.JTextField();
        Stambuk = new javax.swing.JTextField();
        Kelas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        input = new javax.swing.JButton();
        message = new javax.swing.JLabel();

        create1aultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(70, 57, 156));

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));

        jButton1.setText("Tambah Data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.aw
                
                        t.setText("Lihat Data");
                                dActionListener(new java.awt.event.ActionListener() {
                                ic void actionPerformed
                                LihatActionPerformed    }
        });
                
                        x.swing.GroupLayout jPanel5Layout = new javax.s
                                setLayout(jPanel5La
                                ayout.setHorizontalGrou
                                el5Layout.createParallelGroup(javax.sw    .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Lihat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Lihat)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.aw
                
                        s.setText("Hapus Data");
                                dActionListener(new
                                ic void actionPerfor
                                HapusActionPerformed(evt);    }
        });
                
                        x.swing.GroupLayout jPanel6Layout = new javax.s
                                setLayout(jPanel6La
                                ayout.setHorizontalG
                                el6Layout.createParallelGroup(javax.sw    .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Hapus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(Hapus)
                .addGap(25, 25, 25))
        );

        jPanel7.setBackground(new java.aw
                
                        te.setText("Update Data");
                                ddActionListener(ne
                                ic void actionPerfor
                                UpdateActionPerformed(evt);    }
        });
                
                        x.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                                setLayout(jPanel7Layout);
                                ayout.setHorizontalG
                                el7Layout.createPara    .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Update)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Update)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.a
                
                        ch.setText("Search Data");
                                ddMouseListener(new
                                ic void mouseClicked(
                                SearchMouseClicked(evt);    }
        });
                ch.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.Acti
                                SearchActionPerform
                                
                                
        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Search)
                .addGap(31, 31, 31))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Search)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Lay
                el2.setLayout(jPanel2Layout);
                        el2Layout.setHorizontalGroup(
                                el2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING
                                Group(javax.swing.Gro
                                .addContainerGap()        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, jav
                                .addComponent(jPanel5, javax.swing.Group
                                    .addComponent(j
                                    .addComponent(jPa
                                .addContainerGap()));
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swi
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPan
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        Component(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, ja
                                                ax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLa
                                        PreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                
                                                
                                        Component(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.
                                                wing.GroupLayout.DEFAULT_SIZE, javax.
                                                wing.GroupLayout.PREFERRED_SIZE)
                                        PreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                
                                                
                                        Component(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax
                                                swing.GroupLayout.DEFAULT_SIZE, javax
                                                swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(ja);

                el1.add(jPanel2, java.awt.BorderLayout.LINE_START);
                        
                                setBackground(new 
                                
                                        
                                setBackground(new java.awt.Color(51, 41, 113));
                                
                                        
                                setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                setForeground(new java.awt.Color(255, 255, 255));
                                        
                                setText("SISTEM CREATE,READ,UPDATE,DELETE");
                                
                                        
                                setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                                setForeground(new java.awt.Color(255, 255, 255));
                                        
                                setText("CREATED BY AHMAD MUFLI RAMADHAN(13020220227)");
        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(110, 110, 110))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                    .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.Co
                                .addComponent(jLabel2, javax.swing.Gro
                                .addContainerGap(25, Short.MAX_VALUE))
                                        
                                                
                                                        
                                                        pLayout jPanel3Layou
                                        ayout(jPanel3Layout);
                                                
                                                        tHorizontalGroup(
                                                        t.createParallelGroup(jav    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(99, Sh
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swi
                            .addGap(98, 98, 98))
                                
                                ayout.setVerticalGroup
                                el3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEAD
                                Group(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.cr
                                        ateSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

                el3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                        el3.setText("Masukkan nama :");
                                
                                setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
                                        
                                setText("Masukkan St
        jLabel5.setFont(new java.awt.Fo
                el5.setText("Masukkan Kelas : ");
                        
                                tBackground(new java.awt.Color
                                tFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
                                        input.setForeground(new java.awt.Color(255, 255, 255));
        input.setText("Masukkan");
        input.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputMouseClicked(evt);
            }
        });

        message.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        message.setForeground(new java.awt.Color(51, 255, 51));
        message.setText("   ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Stambuk)
                        .addComponent(Kelas, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                        .addComponent(Nama))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(message, ja
                    .addContainerGap(171, Short.MAX_VALUE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(input)
                                        ContainerGap(javax.swin
                                                g.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                
                                                tVerticalGroup(
                                                        
                                                t.createParallelGrou
                                        p(jPanel9Layout.create
                                        Gap(98, 98, 98)
                                        Component(jLabel3)
                                .addGap(18, 18, 18)
                            .addComponent(Nama, javax.swing.GroupLayout
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                        
                                .addGap(18, 18, 18)
                            .addComponent(Stambuk, javax.swing.GroupLay
                                .addGap(18, 18, 18)
                                .addComponent(jLabel
                                .addGap(18, 18, 18)        .addComponent(Kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.
                    .addComponent(input)
                            .addGap(18, 18, 18)
                                .addComponent(messa
                                .addGap(20, 20, 20))
                                
                                
                                        
                                add(jPanel9, java.a
                                
                                ing.GroupLayout lay
                                ntPane().setLayout(layout);
                                        
                                etHorizontalGroup(
                                ut.createParallelGroup
                                Component(jPanel1, 
                                
                                        
                                etVerticalGroup(
                                        
                                ut.createParallelGro
                                Component(jPanel1, 
                                
                                pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

                void LihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRS
                        read = new Read();
                                ead.setVisible(true);
       read.LoadData();
                AST:event_LihatActionPerformed
                        
                                ate void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        Delete del = new Delete();
        del.setVisible(true);
    }//GEN-LAST:event_HapusActionPerformed

    private void inputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIR ST:event_inputMouseClicked

         Mahasiswa mhs = new Mahasiswa(Nama.getText(),stambuk,Kelas.getText());
       tambahMhs(mhs);
    }                                   
        
        vate void SearchAction
        Search s = new Search();
        s.setVisible(true);
    }                                      
 
    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
      Search search = new Search();
      s earch.setVisible(true);
    }//GEN-LAST:event_SearchMouseClicked
 
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {                                       
      Update up = new Update();  
        p.setVisible(true);
    }// GEN-LAST:event_UpdateActionPerformed
    private java.sql.Connection connection = Koneksi.DBConnection();
    private PreparedStatement statement; 
        
        lic void tambahMhs(Mahasiswa mhs) {
         try {
            String query = "INSERT INTO mahasiswa VALUES (?,?,?)";
            statement = connection.prepareStatement(query); 
              statement.setLong(1, mh
              statement.setString(2, mhs.getNama());
             statement.setString(3, mhs.getKelas());
            statement.executeUpdate();
            message.setText("BERHASIL MENGUPLOAD KE DATABASE"); 
          } catch (SQLException e
              e.printStackTrace();
         } 

    }
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
         
     

            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }  catch (IllegalAccessException ex) {
        // 
          
         *  java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.l
         * gging.Level.SEVERE, null, ex);
        } catch (javax.swi
         * g.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Kelas;
    private javax.swing.JButton Lihat;
    privat e javax.swing.JTextField Nama;
    privat e javax.swing.JButton Search;
    private javax.swing.JTextField Stambuk;
    private javax.swing.JButton Update;
    private javax.swing.JButton input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}
