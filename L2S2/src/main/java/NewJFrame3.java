
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class NewJFrame3 extends javax.swing.JFrame {

    public NewJFrame3() {
        initComponents();
        table_update();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmtble = new javax.swing.JTable();
        addteamtf = new javax.swing.JTextField();
        addteamb = new javax.swing.JButton();
        removeteamb = new javax.swing.JButton();
        dltteamtf = new javax.swing.JTextField();
        back = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(0, 204, 204));

        jPanel1.setBackground(new java.awt.Color(0, 55, 59));
        jPanel1.setForeground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 243, 14));
        jLabel1.setText("MANAGE TEAMS");

        tmtble.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tmtble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TEAM NAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tmtble.setAlignmentX(2.0F);
        tmtble.setAlignmentY(2.0F);
        tmtble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmtbleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tmtble);

        addteamtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addteamtfActionPerformed(evt);
            }
        });

        addteamb.setText("ADD TEAM");
        addteamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addteambActionPerformed(evt);
            }
        });

        removeteamb.setText("REMOVE TEAM");
        removeteamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeteambActionPerformed(evt);
            }
        });

        dltteamtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltteamtfActionPerformed(evt);
            }
        });

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addteamb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removeteamb, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addteamtf, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dltteamtf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addteamb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addteamtf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removeteamb, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dltteamtf, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back)
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(814, 537));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        NewJFrame1 jf1= new NewJFrame1();
        jf1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    Connection conn ;
    PreparedStatement insert;
    
    private void table_update()
    {
        int c;
        
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/teamdata","root","");
            insert = conn.prepareStatement("select * from teaminfo");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss =rs.getMetaData();
            c= rss.getColumnCount();
            DefaultTableModel df = (DefaultTableModel)tmtble.getModel();
            
            df.setRowCount(0);
            
            while(rs.next())
            {
                Vector v= new Vector();
                v.add(rs.getString("TeamName"));
                df.addRow(v);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame3.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    private void addteambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addteambActionPerformed
        String x=addteamtf.getText();
        
        try {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/teamdata","root","");
            insert = conn.prepareStatement("INSERT INTO teaminfo(TeamName,PlayedMatch,Win,Point,PlayersName)VALUES(?,?,?,?,?)");
            insert.setString(1, x);
            insert.setInt(2, 0);
            insert.setInt(3, 0);
            insert.setInt(4,0);
            insert.setString(5,"0");
            
            JOptionPane.showMessageDialog(this,"record added");
            insert.executeUpdate();
            addteamtf.setText("");
            table_update();
            
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame3.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       
    }//GEN-LAST:event_addteambActionPerformed

    private void addteamtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addteamtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addteamtfActionPerformed

    private void tmtbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmtbleMouseClicked
        DefaultTableModel df = (DefaultTableModel)tmtble.getModel();
        int selectedindex =tmtble.getSelectedRow();
        dltteamtf.setText(df.getValueAt(selectedindex, 0).toString());
    }//GEN-LAST:event_tmtbleMouseClicked

    private void removeteambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeteambActionPerformed
        DefaultTableModel df = (DefaultTableModel)tmtble.getModel();
        int selectedindex =tmtble.getSelectedRow();
        
        try {
            
            String selected = df.getValueAt(selectedindex, 0).toString();
            df.removeRow(selectedindex);
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/teamdata","root","");
            insert = conn.prepareStatement("delete from teaminfo where TeamName ='"+selected+"' ");
            
            insert.executeUpdate();
            table_update();
            JOptionPane.showMessageDialog(this,"record deleted");
            dltteamtf.setText("");
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeteambActionPerformed

    private void dltteamtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltteamtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dltteamtfActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addteamb;
    public javax.swing.JTextField addteamtf;
    public javax.swing.JButton back;
    public javax.swing.JTextField dltteamtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeteamb;
    public javax.swing.JTable tmtble;
    // End of variables declaration//GEN-END:variables
}
