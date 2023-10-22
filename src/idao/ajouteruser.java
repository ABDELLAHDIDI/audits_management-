/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package idao;

import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author maejj
 */
public class ajouteruser extends javax.swing.JFrame {
   boolean bool = false ;
   Dashboard d = null ; 
   utilisateur ut=null;
    /**
     * Creates new form ajouteruser
     */
    public ajouteruser() {
        initComponents();
    }
        public ajouteruser(Dashboard d) {
        initComponents();
        this.d = d ;
//        Tpays.removeAllItems();
//        Tville.removeAllItems();
//        Tnom.removeAllItems();
         Site s = new Site();
        load_list(s.lister_ord());
      
    }   
        public ajouteruser(Dashboard d,utilisateur ut) {
        initComponents();
        this.d = d ;
        this.ut=ut;
        
         jButton1.setText("Confirmer les modifications");
        
        TRole.setText(ut.role);
        TNom.setText(ut.nom);
        TPrenom.setText(ut.prenom);        
        TEmail.setText(ut.email);
        Tpass.setText(ut.mot_de_passe);
        TMatricule.setText(ut.matricule);
        TMatricule.setEnabled(false);
        Tdepartement.setText(ut.departement);
        TDesactiver.setSelected(ut.desactive);
        
        Tpays.removeAllItems();
        Tville.removeAllItems();
        Tnom.removeAllItems();
         Site s = new Site();
        load_list(s.lister_ord());
       Tpays.setSelectedItem(ut.getSite().getPays());
       Tville.setSelectedItem(ut.getSite().getVille());
       Tnom.setSelectedItem(ut.getSite().getNom());
       
    }
       private boolean exist(){
             Site s = new Site(Tpays.getSelectedItem().toString(),Tville.getSelectedItem().toString(),Tnom.getSelectedItem().toString());
     return  !s.lister_where().isEmpty();
       }

        private void load_list(List<Site> l){
            String a="",b="",c="";
               
             Iterator<Site> it =    l.iterator() ;
     
          while(it.hasNext()){
              Site var = it.next();
              if(!a.equals(var.getPays()))
        Tpays.addItem(var.getPays());
              if(!b.equals(var.getVille()))
        Tville.addItem(var.getVille());
              if(!c.equals(var.getNom()))
        Tnom.addItem(var.getNom());
              a=var.getPays();
              b=var.getVille();
              c=var.getNom();
        }
        
        }
        
           
             
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TRole = new javax.swing.JTextField();
        TNom = new javax.swing.JTextField();
        TPrenom = new javax.swing.JTextField();
        TEmail = new javax.swing.JTextField();
        Tpass = new javax.swing.JTextField();
        TMatricule = new javax.swing.JTextField();
        Tdepartement = new javax.swing.JTextField();
        TDesactiver = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Tpays = new javax.swing.JComboBox<>();
        Tville = new javax.swing.JComboBox<>();
        Tnom = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gestion des utilisateurs ");
        setIconImage(  (new ImageIcon("./img/COFICAB.jpeg")).getImage()

        );
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Nom");

        jLabel2.setText("Role");

        jLabel3.setText("Prenom");

        jLabel4.setText("Email");

        jLabel5.setText("Mot de passe");

        jLabel6.setText("Matricule");

        jLabel7.setText("Departement");

        TRole.setPreferredSize(new java.awt.Dimension(200, 30));
        TRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRoleActionPerformed(evt);
            }
        });

        TNom.setPreferredSize(new java.awt.Dimension(200, 30));

        TPrenom.setPreferredSize(new java.awt.Dimension(200, 30));

        TEmail.setPreferredSize(new java.awt.Dimension(200, 30));

        Tpass.setPreferredSize(new java.awt.Dimension(200, 30));

        TMatricule.setPreferredSize(new java.awt.Dimension(200, 30));

        Tdepartement.setPreferredSize(new java.awt.Dimension(200, 30));

        TDesactiver.setText("Desactiver");
        TDesactiver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TDesactiverActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AJOUTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Site ");

        jLabel9.setText("Pays ");

        jLabel10.setText("Ville ");

        jLabel11.setText("Nom");

        Tpays.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TpaysItemStateChanged(evt);
            }
        });
        Tpays.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TpaysInputMethodTextChanged(evt);
            }
        });
        Tpays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TpaysActionPerformed(evt);
            }
        });

        Tville.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TvilleItemStateChanged(evt);
            }
        });
        Tville.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TvilleInputMethodTextChanged(evt);
            }
        });

        Tnom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TnomItemStateChanged(evt);
            }
        });
        Tnom.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                TnomInputMethodTextChanged(evt);
            }
        });

        jButton2.setText("Réintialer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TPrenom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TRole, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TDesactiver, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tnom, 0, 120, Short.MAX_VALUE)
                                    .addComponent(Tville, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tpays, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(35, 35, 35)
                                .addComponent(Tpass, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(55, 55, 55)
                                .addComponent(TMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(76, 76, 76)
                                .addComponent(TEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36)
                                .addComponent(Tdepartement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(Tpays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Tville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Tnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Tdepartement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(TDesactiver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Tpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TMatricule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TDesactiverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TDesactiverActionPerformed
        // TODO add your handling code here:
        if(bool == true)
            bool = false ;
         else           
        bool = true ;
    }//GEN-LAST:event_TDesactiverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
  if(!exist()){
             JOptionPane.showMessageDialog(null, "\n  Il n'y a pas un site dans cette adresse  !!!!!!!1\n",
                "Information", JOptionPane.INFORMATION_MESSAGE);
             return;
  }
   if(ut != null){
      
       jButton1.revalidate();
       jButton1.repaint();
            iutilisateur a = new iutilisateur();
       try {
                   a.update(new utilisateur(TRole.getText(),TNom.getText(),TPrenom.getText(),
                           TEmail.getText(),Tpass.getText(),TMatricule.getText(),
                Tdepartement.getText(),
                
                
               new Site(Tpays.getSelectedItem().toString(),Tville.getSelectedItem().toString(),Tnom.getSelectedItem().toString())
                           ,bool));
                   
                   
//                       public utilisateur( String role , String  nom , String prenom ,String email , String  mot_de_passe 
//     ,String matricule ,String departement ,Site site ,boolean desactive )
                               
                               
       } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e.getMessage(),
                "Information", JOptionPane.INFORMATION_MESSAGE);
             

       }
        
        
        d.load_utilisateurs();
        d.setEnabled(true);
        ut =null;
        this.dispose();
   }else {
            iutilisateur a = new iutilisateur();
        
        
       
                   a.add(new utilisateur(TRole.getText().toString(),TNom.getText().toString(),TPrenom.getText().toString(),TEmail.getText().toString(),Tpass.getText().toString()
                ,TMatricule.getText().toString(),Tdepartement.getText().toString(),
                
 new Site(Tpays.getSelectedItem().toString(),Tville.getSelectedItem().toString(),Tnom.getSelectedItem().toString())
                
                ,bool));
                   

       
        d.load_utilisateurs();
        d.setEnabled(true);
        this.dispose();
   }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        d.setEnabled(true);
         this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
       
         d.setEnabled(true);
           this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void TRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TRoleActionPerformed

    private void TpaysInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TpaysInputMethodTextChanged
        // TODO add your handling code here:
             Tville.removeAllItems();
        Tnom.removeAllItems();
        load_list((new Site(Tpays.getSelectedItem().toString(),"","")).lister_like());
    }//GEN-LAST:event_TpaysInputMethodTextChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         if(ut != null){
                 TRole.setText(ut.role);
        TNom.setText(ut.nom);
        TPrenom.setText(ut.prenom);        
        TEmail.setText(ut.email);
        Tpass.setText(ut.mot_de_passe);
        TMatricule.setText(ut.matricule);
        Tdepartement.setText(ut.departement);
        TDesactiver.setSelected(ut.desactive);
        
        Tpays.removeAllItems();
        Tville.removeAllItems();
        Tnom.removeAllItems();
         Site s = new Site();
        load_list(s.lister_ord());
       Tpays.setSelectedItem(ut.getSite().getPays());
       Tville.setSelectedItem(ut.getSite().getVille());
       Tnom.setSelectedItem(ut.getSite().getNom());
         }
         else {
        Tpays.removeAllItems();
        Tville.removeAllItems();
        Tnom.removeAllItems();
         Site s = new Site();
        load_list(s.lister_ord());
         }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TvilleInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TvilleInputMethodTextChanged
        // TODO add your handling code here:
//                 
//        Tnom.removeAllItems();
//          load_list((new Site(Tpays.getSelectedItem().toString(),Tville.getSelectedItem().toString(),"")).lister_like());
    }//GEN-LAST:event_TvilleInputMethodTextChanged

    private void TnomInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_TnomInputMethodTextChanged
        // TODO add your handling code here:
//          load_list((new Site(Tpays.getSelectedItem().toString(),Tville.getSelectedItem().toString(),Tnom.getSelectedItem().toString())).lister_like());
    }//GEN-LAST:event_TnomInputMethodTextChanged

    private void TpaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TpaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TpaysActionPerformed

    private void TpaysItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TpaysItemStateChanged
        // TODO add your handling code here:
//         Tville.removeAllItems();
//        Tnom.removeAllItems();
//        load_list((new Site(Tpays.getSelectedItem().toString(),"","")).lister_like());
    }//GEN-LAST:event_TpaysItemStateChanged

    private void TvilleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TvilleItemStateChanged
        // TODO add your handling code here:
//         Tnom.removeAllItems();
//          load_list((new Site(Tpays.getSelectedItem().toString(),Tville.getSelectedItem().toString(),"")).lister_like());
    }//GEN-LAST:event_TvilleItemStateChanged

    private void TnomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TnomItemStateChanged
        // TODO add your handling code here:
//          load_list((new Site(Tpays.getSelectedItem().toString(),Tville.getSelectedItem().toString(),Tnom.getSelectedItem().toString())).lister_like());
    }//GEN-LAST:event_TnomItemStateChanged

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox TDesactiver;
    private javax.swing.JTextField TEmail;
    private javax.swing.JTextField TMatricule;
    private javax.swing.JTextField TNom;
    private javax.swing.JTextField TPrenom;
    private javax.swing.JTextField TRole;
    private javax.swing.JTextField Tdepartement;
    private javax.swing.JComboBox<String> Tnom;
    private javax.swing.JTextField Tpass;
    private javax.swing.JComboBox<String> Tpays;
    private javax.swing.JComboBox<String> Tville;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}