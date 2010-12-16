/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * jFrameNavire.java
 *
 * Created on 22 nov. 2010, 13:14:53
 */

package portnantestp1.vue;

import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import portnantestp1.controleur.Matiere;
import portnantestp1.controleur.Navire;
import portnantestp1.controleur.NavireD;
import portnantestp1.controleur.Ports;

/**
 *
 * @author pierre
 */
public class jFrameNavire extends javax.swing.JFrame {

    /**
     * Var
     */
    private Navire nouveauNavire;

    /** Creates new form jFrameNavire */
    public jFrameNavire() {
        initComponents();
        this.setDefaultCloseOperation(jFrameStockage.DISPOSE_ON_CLOSE);

        // Instance
        nouveauNavire = new Navire();

        // Forme
        lblTypeDangers.setEnabled(false);
        cmbBoxTypeDng.setEnabled(false);

        // Actualisation
        majCmbBoxMat();
    } 

    //######################
    // Methodes principales
    //######################
    public void addFermerListener(ActionListener a)
    {
        btnFermer.addActionListener(a);
    }

    private void majCmbBoxMat()
    {
        List<Matiere> lst = Ports.getListMatieres();
        for(int i=0 ; i<lst.size() ; i++)
        {
            cmbBoxTypeDng.addItem(lst.get(i).getNom());
        }
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
        cmbBoxTypeDng = new javax.swing.JComboBox();
        lblTypeDangers = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBoxNoLloyds = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnEnregistrer = new javax.swing.JButton();
        txtBoxQteFret = new javax.swing.JTextField();
        txtBoxNomNavire = new javax.swing.JTextField();
        txtBoxLibelleFret = new javax.swing.JTextField();
        btnFermer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        chkBoxDangers = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Utopia", 1, 24)); // NOI18N
        jLabel1.setText("Navire");

        cmbBoxTypeDng.setFont(new java.awt.Font("Utopia", 1, 11)); // NOI18N

        lblTypeDangers.setFont(new java.awt.Font("Utopia", 0, 11)); // NOI18N
        lblTypeDangers.setText("Type dangerosité");
        lblTypeDangers.setName("lblQteFret"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Utopia", 0, 11)); // NOI18N
        jLabel2.setText("NoLloyds");
        jLabel2.setName("lblNoLloyds"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Utopia", 0, 11)); // NOI18N
        jLabel3.setText("Nom Navire");
        jLabel3.setName("lblNomNavire"); // NOI18N

        txtBoxNoLloyds.setFont(new java.awt.Font("Utopia", 0, 11)); // NOI18N
        txtBoxNoLloyds.setName("txtBoxNoLloyds"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Utopia", 0, 11)); // NOI18N
        jLabel4.setText("Libellé Fret");
        jLabel4.setName("lblLibelleFret"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Utopia", 0, 11)); // NOI18N
        jLabel5.setText("Quantité Fret");
        jLabel5.setName("lblQteFret"); // NOI18N

        btnEnregistrer.setFont(new java.awt.Font("Utopia", 1, 11)); // NOI18N
        btnEnregistrer.setText("Enregistrer");
        btnEnregistrer.setName("btnEnreg"); // NOI18N
        btnEnregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerActionPerformed(evt);
            }
        });

        txtBoxQteFret.setFont(new java.awt.Font("Utopia", 0, 11)); // NOI18N
        txtBoxQteFret.setName("txtBoxQteF"); // NOI18N

        txtBoxNomNavire.setFont(new java.awt.Font("Utopia", 0, 11)); // NOI18N
        txtBoxNomNavire.setName("txtBoxNomN"); // NOI18N
        txtBoxNomNavire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBoxNomNavireActionPerformed(evt);
            }
        });

        txtBoxLibelleFret.setFont(new java.awt.Font("Utopia", 0, 11)); // NOI18N
        txtBoxLibelleFret.setName("txtBoxLibelleF"); // NOI18N

        btnFermer.setFont(new java.awt.Font("Utopia", 1, 11)); // NOI18N
        btnFermer.setText("Fermer");
        btnFermer.setName("btnEnreg"); // NOI18N
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Utopia", 1, 11)); // NOI18N
        jLabel6.setText("Dangeureux  ?");
        jLabel6.setName("lblQteFret"); // NOI18N

        chkBoxDangers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBoxDangersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTypeDangers)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBoxTypeDng, 0, 186, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkBoxDangers))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addGap(42, 42, 42)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBoxQteFret)
                                .addComponent(txtBoxNoLloyds, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(txtBoxNomNavire, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(txtBoxLibelleFret, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnFermer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEnregistrer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBoxNoLloyds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBoxNomNavire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBoxLibelleFret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBoxQteFret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(chkBoxDangers))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTypeDangers)
                    .addComponent(cmbBoxTypeDng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(btnEnregistrer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFermer)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerActionPerformed
        // TODO add your handling code here:
        if(!txtBoxLibelleFret.getText().isEmpty()
                && !txtBoxNoLloyds.getText().isEmpty()
                && !txtBoxNomNavire.getText().isEmpty()
                && !txtBoxQteFret.getText().isEmpty())
        {
            if((Ports.getNavire(txtBoxNoLloyds.getText())) == null)
            {
                try
                {
                    if(chkBoxDangers.isSelected())
                        nouveauNavire = new NavireD(cmbBoxTypeDng.getSelectedItem().toString());
                    else
                        nouveauNavire = new Navire();

                    nouveauNavire.setLibelleFret(txtBoxLibelleFret.getText());
                    nouveauNavire.setNomNavire(txtBoxNomNavire.getText());
                    nouveauNavire.setNumNavire(txtBoxNoLloyds.getText());
                    nouveauNavire.setQteFret(Integer.parseInt(txtBoxQteFret.getText()));

                    //Ajout du navire a la map
                    Ports.ajoutNavire(nouveauNavire);

                    txtBoxLibelleFret.setText("");
                    txtBoxNoLloyds.setText("");
                    txtBoxNomNavire.setText("");
                    txtBoxQteFret.setText("");
                    chkBoxDangers.setEnabled(false);
                    lblTypeDangers.setEnabled(false);
                    cmbBoxTypeDng.setEnabled(false);
                    
                } 
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane,"Enregistrement echoué !");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane,"Navire deja existant (N° Lloyds)");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,"Veuillez remplir tout les champs pour enregistrer un navire");
        }
}//GEN-LAST:event_btnEnregistrerActionPerformed

    private void txtBoxNomNavireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBoxNomNavireActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_txtBoxNomNavireActionPerformed

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnFermerActionPerformed

    private void chkBoxDangersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBoxDangersActionPerformed
        if(chkBoxDangers.isSelected())
        {
            lblTypeDangers.setEnabled(true);
            cmbBoxTypeDng.setEnabled(true);
        } 
        else
        {
            lblTypeDangers.setEnabled(false);
            cmbBoxTypeDng.setEnabled(false);
        }

    }//GEN-LAST:event_chkBoxDangersActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameNavire().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnregistrer;
    private javax.swing.JButton btnFermer;
    private javax.swing.JCheckBox chkBoxDangers;
    private javax.swing.JComboBox cmbBoxTypeDng;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblTypeDangers;
    private javax.swing.JTextField txtBoxLibelleFret;
    private javax.swing.JTextField txtBoxNoLloyds;
    private javax.swing.JTextField txtBoxNomNavire;
    private javax.swing.JTextField txtBoxQteFret;
    // End of variables declaration//GEN-END:variables

}
