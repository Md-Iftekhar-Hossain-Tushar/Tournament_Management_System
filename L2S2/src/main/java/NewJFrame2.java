
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


public class NewJFrame2 extends javax.swing.JFrame {

    
    public NewJFrame2() {
        initComponents();
        table_update();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        plmatch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        win = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tmtble = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tmname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 55, 59));
        jPanel1.setForeground(new java.awt.Color(243, 243, 14));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(243, 243, 14));
        jLabel1.setText("STANDING TABLE");

        jLabel3.setForeground(new java.awt.Color(243, 243, 14));
        jLabel3.setText("Played Match :");

        jLabel4.setForeground(new java.awt.Color(243, 243, 14));
        jLabel4.setText("Win :");

        edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        tmtble.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TEAM NAME", "PLAYED MATCH", "WIN", "POINT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tmtble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmtbleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tmtble);

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(243, 243, 14));
        jLabel2.setText("Team Name :");

        tmname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tmname)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(plmatch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(win, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 50, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tmname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(plmatch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(win, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(25, 25, 25))
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
                
                for(int a=1;a<c;a++)
                {
                    v.add(rs.getString("TeamName"));
                    v.add(rs.getInt("PlayedMatch"));
                    v.add(rs.getInt("Win"));
                    v.add(rs.getInt("Point"));
                    
                }
                df.addRow(v);
                
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(NewJFrame3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       NewJFrame1 jf1= new NewJFrame1();
        jf1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void tmnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmnameActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        DefaultTableModel Df = (DefaultTableModel)tmtble.getModel();
        int selectedIndex = tmtble.getSelectedRow();
//        
        try {

            String selected = Df.getValueAt(selectedIndex, 0).toString();
            String name = tmname.getText();
            int playedNum = Integer.parseInt(plmatch.getText());
            int winNum = Integer.parseInt(win.getText());
            int point = 3*winNum-(playedNum-winNum);
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/teamdata","root","");
            insert = conn.prepareStatement("update teaminfo set TeamName=?, PlayedMatch=?, Win=?, Point=? where TeamName ='"+selected+"' ");
            insert.setString(1, name);
            insert.setInt(2,playedNum);
            insert.setInt(3,winNum);
            insert.setInt(4,point);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated!");
            table_update();
            
            tmname.setText("");
            plmatch.setText("");
            win.setText("");
            tmname.requestFocus();
//           
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame2.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_editActionPerformed

    private void tmtbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmtbleMouseClicked
        DefaultTableModel df = (DefaultTableModel)tmtble.getModel();
        int selectedindex =tmtble.getSelectedRow();
        tmname.setText(df.getValueAt(selectedindex, 0).toString());
        plmatch.setText(df.getValueAt(selectedindex, 1).toString());
        win.setText(df.getValueAt(selectedindex, 2).toString());
    }//GEN-LAST:event_tmtbleMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton back;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField plmatch;
    private javax.swing.JTextField tmname;
    private javax.swing.JTable tmtble;
    private javax.swing.JTextField win;
    // End of variables declaration//GEN-END:variables
}
