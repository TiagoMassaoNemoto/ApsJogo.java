/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentação;

import Modelo.Controle;
import Modelo.Upgrades;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Juuuuuusg and Massanemo
 */
public class frmJogo extends javax.swing.JFrame
{
    
    private int count;
    private int countadd;
    private int estagio;
    private int quantUpgrade1;
    private String tipoUpgrade;
    private int quantUpgrade2;
       
    
    
//    int estagio = 0;
//    Timer timer;
//    int valorUpgrade = 2;
//    int countadd = 1;
//    
    public frmJogo()
    {
        initComponents();
        btnUpgrade1.setEnabled(false);
        btnUpgrade2.setEnabled(false);
        btnEvoluir.setVisible(false);
        btnFinish.setVisible(false);
    }
//
//    private void updateCount()
//    {
//        this.lblMoedas.setText("Moedas: " + this.count);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        Image = new javax.swing.JLabel();
        lblMoedas = new javax.swing.JLabel();
        btnUpgrade1 = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        btnEvoluir = new javax.swing.JButton();
        btnUpgrade2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Estagio0.png"))); // NOI18N
        Image.setToolTipText("");
        Image.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        Image.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Image.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ImageMouseClicked(evt);
            }
        });
        getContentPane().add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 510));

        lblMoedas.setText("Moedas:0");
        getContentPane().add(lblMoedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 420, 128, 46));

        btnUpgrade1.setText("<html><big>Terra adubada</big><br><small>Cost:1</small></html>");
        btnUpgrade1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpgrade1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpgrade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 20, 230, 85));

        btnFinish.setText("Finalizar");
        btnFinish.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFinishActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinish, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 305, 230, 90));

        btnEvoluir.setText("Evoluir");
        btnEvoluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEvoluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnEvoluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 180, 80));

        btnUpgrade2.setText("<html><big>Fertilizante</big><br><small>Cost:10</small></html>");
        btnUpgrade2.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnUpgrade2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpgrade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 230, 85));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void ImageMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ImageMouseClicked
    {//GEN-HEADEREND:event_ImageMouseClicked
        Controle controle = new Controle(count, countadd);
        {
            this.count = controle.count;
            //Condição Botão Upgrade
            if (count >= 1 * (int)Math.pow(2,(double)this.quantUpgrade1))
                btnUpgrade1.setEnabled(true);
            
            if (count >= 10 * (int)Math.pow(2,(double)this.quantUpgrade2) && estagio == 1)
                btnUpgrade2.setEnabled(true);
            //Condição Botão Evoluir
            if (count >= 10 && estagio < 1) //Quantidade necessaria de pontos para poder aparecer botão da primeira evolução
                btnEvoluir.setVisible(true);
            
            if (count >= 10 && estagio == 1)//Quantidade necessaria de pontos para poder aparecer botão da segunda evolução
                btnEvoluir.setVisible(true);
            
            if (count < 10 && estagio < 1) //Quantidade necessaria de pontos para poder aparecer botão da primeira evolução
                btnEvoluir.setEnabled(false);
            
            else if (count < 10 && estagio == 1)//Quantidade necessaria de pontos para poder aparecer botão da segunda evolução
                btnEvoluir.setEnabled(false);
            else
                btnEvoluir.setEnabled(true);
            
            //Condição Botão Finalizar
            if (count >= 100 && estagio == 2)//Quantidade necessaria de pontos para poder finalizar
                btnFinish.setVisible(true);
        }
        lblMoedas.setText(controle.ponto);
    }//GEN-LAST:event_ImageMouseClicked

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFinishActionPerformed
    {//GEN-HEADEREND:event_btnFinishActionPerformed
         JOptionPane.showMessageDialog(null, "Obrigado por jogar");
         this.dispose();
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnEvoluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEvoluirActionPerformed
    {//GEN-HEADEREND:event_btnEvoluirActionPerformed
        switch (estagio)
        {
            case 0:
                Image.setIcon(new javax.swing.ImageIcon("..\\ApsJogo.java-master\\src\\Images\\Estagio1.png"));
                estagio = 1;
                btnEvoluir.setVisible(false);
                count = count - 10; //Preço para poder evoluir para o primeiro estagio (tem que estar com o msm valor da condição evoluir 1)
                lblMoedas.setText("Moedas:" + count);
                break;
            case 1:
                Image.setIcon(new javax.swing.ImageIcon("..\\ApsJogo.java-master\\src\\Images\\Estagio2.png"));
                estagio = 2;
                btnEvoluir.setVisible(false);
                count = count - 10; //Preço para poder evoluir para o segundo estagio (tem que estar com o msm valor da condição evoluir 2)
                lblMoedas.setText("Moedas:" + count);
                break;
        }
        if (count <= 1 * (int)Math.pow(2,(double)this.quantUpgrade1))
                btnUpgrade1.setEnabled(false);
        
        if (count <= 10 * (int)Math.pow(2,(double)this.quantUpgrade2))
                btnUpgrade2.setEnabled(false);
        
    }//GEN-LAST:event_btnEvoluirActionPerformed

    private void btnUpgrade1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpgrade1ActionPerformed
    {//GEN-HEADEREND:event_btnUpgrade1ActionPerformed
        this.tipoUpgrade = "Upgrade1";
        Upgrades upgrades = new Upgrades(quantUpgrade1, tipoUpgrade, count, countadd);
        this.quantUpgrade1 = upgrades.quantUpgrade;
        this.countadd = upgrades.countadd;
        this.count = upgrades.count;
        lblMoedas.setText(upgrades.ponto);
        btnUpgrade1.setText("<html>" +  "<big>Terra adubada</big>" + "<br><small>" + "Cost:" + (1 * (int)Math.pow(2,(double)this.quantUpgrade1)) + "</small>" + "</html>");
        
        if (count <= 1 * (int)Math.pow(2,(double)this.quantUpgrade1))
                btnUpgrade1.setEnabled(false);
        
        //Condição Botão Evoluir
            if (count < 10 && estagio < 1) //Quantidade necessaria de pontos para poder aparecer botão da primeira evolução
                btnEvoluir.setEnabled(false);
            
            else if (count < 10 && estagio == 1)//Quantidade necessaria de pontos para poder aparecer botão da segunda evolução
                btnEvoluir.setEnabled(false);
            else
                btnEvoluir.setEnabled(true);
            
    }//GEN-LAST:event_btnUpgrade1ActionPerformed

    private void btnUpgrade2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnUpgrade2ActionPerformed
    {//GEN-HEADEREND:event_btnUpgrade2ActionPerformed
        this.tipoUpgrade = "Upgrade2";
        Upgrades upgrades = new Upgrades(quantUpgrade2, tipoUpgrade, count, countadd);
        this.quantUpgrade2 = upgrades.quantUpgrade;
        this.countadd = upgrades.countadd;
        this.count = upgrades.count;
        lblMoedas.setText(upgrades.ponto);
        btnUpgrade2.setText("<html>" +  "<big>Fertilizante</big>" + "<br><small>" + "Cost:" + (10 * (int)Math.pow(2,(double)this.quantUpgrade2)) + "</small>" + "</html>");
        
        if (count <= 10 * (int)Math.pow(2,(double)this.quantUpgrade2))
                btnUpgrade2.setEnabled(false);
        
        //Condição Botão Evoluir
            if (count < 10 && estagio < 1) //Quantidade necessaria de pontos para poder aparecer botão da primeira evolução
                btnEvoluir.setEnabled(false);
            
            else if (count < 10 && estagio == 1)//Quantidade necessaria de pontos para poder aparecer botão da segunda evolução
                btnEvoluir.setEnabled(false);
            else
                btnEvoluir.setEnabled(true);
            
    }//GEN-LAST:event_btnUpgrade2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {

                new frmJogo().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Image;
    private javax.swing.JButton btnEvoluir;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnUpgrade1;
    private javax.swing.JButton btnUpgrade2;
    private javax.swing.JLabel lblMoedas;
    // End of variables declaration//GEN-END:variables
}
