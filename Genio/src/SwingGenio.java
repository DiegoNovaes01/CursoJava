/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */import java.awt.FlowLayout;
import java.awt.Font;
 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author diego
 */
public class SwingGenio extends javax.swing.JFrame {

    /** Creates new form SwingGenio */
    public SwingGenio() {
        initComponents();
           lblrandon2.setText("<html>Vou pensar em um valor entre 5 e 1 tente advinhar</html>");

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
        jButton1 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        lblrandon1 = new javax.swing.JLabel();
        lblrandon2 = new javax.swing.JLabel();
        lblrandon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Digite o numero que estou pensando");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jButton1.setText("Advinhe o numero");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 231, -1));

        lblrandon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pngwing.com (1).png"))); // NOI18N
        lblrandon1.setAlignmentX(5.0F);
        lblrandon1.setAlignmentY(5.0F);
        lblrandon1.setAutoscrolls(true);
        lblrandon1.setMaximumSize(new java.awt.Dimension(50, 0));
        lblrandon1.setMinimumSize(new java.awt.Dimension(50, 0));
        lblrandon1.setOpaque(true);
        lblrandon1.setPreferredSize(new java.awt.Dimension(50, 50));
        getContentPane().add(lblrandon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 290));

        lblrandon2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblrandon2.setText("0");
        lblrandon2.setToolTipText("");
        getContentPane().add(lblrandon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 150, 90));

        lblrandon.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego\\Downloads\\DOWNLOAD JAVA\\balao3.png")); // NOI18N
        getContentPane().add(lblrandon, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, -10, 240, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

int n1 = Integer.parseInt(txt1.getText());

double n22 = 1+ Math.random() * (6-1);
int n2 = (int) n22;

String f1 = "<html>Acertou miseravi!!!!</html>";
String f2 = "<html>Errou, eu pensei no numero "+ n2 +"</html>";
String n3 = (n1 == n2)?f1:f2;
lblrandon2.setFont(new Font("ARIAL BLACK", Font.PLAIN, 18));
lblrandon2.setText(n3);





        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SwingGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblrandon;
    private javax.swing.JLabel lblrandon1;
    private javax.swing.JLabel lblrandon2;
    private javax.swing.JTextField txt1;
    // End of variables declaration//GEN-END:variables

}
