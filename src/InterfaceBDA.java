/*
 * Copyright © 2022 Émile Royer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Émile
 */
public class InterfaceBDA extends javax.swing.JFrame {

	/**
	 * Creates new form InterfaceBDA
	 */
	public InterfaceBDA() {
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

        frameAutorisations = new javax.swing.JFrame();
        btnEnregistrerAutorisations = new javax.swing.JButton();
        btnAjouterAutorisation = new javax.swing.JButton();
        btnSupprimerAutorisation = new javax.swing.JButton();
        btnImporterAutorisation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAutorisations = new javax.swing.JTable();
        btnCreerListeAuto = new javax.swing.JButton();
        btnOuvrirListeAuto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOuvrirHistorique = new javax.swing.JButton();

        frameAutorisations.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frameAutorisations.setTitle("Gestion des autorisations");
        frameAutorisations.setMinimumSize(new java.awt.Dimension(600, 400));

        btnEnregistrerAutorisations.setText("Enregistrer");
        btnEnregistrerAutorisations.setMinimumSize(new java.awt.Dimension(105, 37));
        btnEnregistrerAutorisations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerAutorisationsActionPerformed(evt);
            }
        });

        btnAjouterAutorisation.setText("Ajouter");
        btnAjouterAutorisation.setMinimumSize(new java.awt.Dimension(105, 37));
        btnAjouterAutorisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterAutorisationActionPerformed(evt);
            }
        });

        btnSupprimerAutorisation.setText("Supprimer");
        btnSupprimerAutorisation.setMinimumSize(new java.awt.Dimension(105, 37));
        btnSupprimerAutorisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerAutorisationActionPerformed(evt);
            }
        });

        btnImporterAutorisation.setText("Importer");
        btnImporterAutorisation.setMinimumSize(new java.awt.Dimension(105, 37));
        btnImporterAutorisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImporterAutorisationActionPerformed(evt);
            }
        });

        tableAutorisations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Identifiant", "Nom"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableAutorisations);

        javax.swing.GroupLayout frameAutorisationsLayout = new javax.swing.GroupLayout(frameAutorisations.getContentPane());
        frameAutorisations.getContentPane().setLayout(frameAutorisationsLayout);
        frameAutorisationsLayout.setHorizontalGroup(
            frameAutorisationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, frameAutorisationsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(frameAutorisationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAjouterAutorisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnregistrerAutorisations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupprimerAutorisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImporterAutorisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        frameAutorisationsLayout.setVerticalGroup(
            frameAutorisationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAutorisationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameAutorisationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(frameAutorisationsLayout.createSequentialGroup()
                        .addComponent(btnEnregistrerAutorisations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAjouterAutorisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSupprimerAutorisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImporterAutorisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuration du verrou");
        setMinimumSize(new java.awt.Dimension(500, 400));

        btnCreerListeAuto.setText("Créer une nouvelle liste");
        btnCreerListeAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerListeAutoActionPerformed(evt);
            }
        });

        btnOuvrirListeAuto.setText("Utiliser une liste existante");
        btnOuvrirListeAuto.setActionCommand("");
        btnOuvrirListeAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOuvrirListeAutoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel1.setText("Gérer les autorisations");

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel2.setText("Consulter l'historique");

        btnOuvrirHistorique.setText("Ouvrir un fichier");
        btnOuvrirHistorique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOuvrirHistoriqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnCreerListeAuto)
                        .addGap(39, 39, 39)
                        .addComponent(btnOuvrirListeAuto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btnOuvrirHistorique)))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreerListeAuto)
                    .addComponent(btnOuvrirListeAuto))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(btnOuvrirHistorique)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreerListeAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerListeAutoActionPerformed
		DefaultTableModel modèle = (DefaultTableModel) tableAutorisations.getModel();
		/* Suppression des données déjà présentes */
		modèle.setRowCount(0);
		/* Ajoute une ligne pour initialiser*/
		modèle.addRow(new Object[]{null, null});
		frameAutorisations.setVisible(true);
		setVisible(false);
    }//GEN-LAST:event_btnCreerListeAutoActionPerformed

    private void btnOuvrirListeAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOuvrirListeAutoActionPerformed
		JFileChooser choix_fichier = new JFileChooser();
		int resultat = choix_fichier.showOpenDialog(null);
		if (resultat == JFileChooser.APPROVE_OPTION) {
			String fichier_choisi = choix_fichier.getSelectedFile().getAbsolutePath();
			try {
				préremplirTableauAutorisations(fichier_choisi);
			} catch (FileNotFoundException ex) {
			}
			frameAutorisations.setVisible(true);
			setVisible(false);
		} else {
			System.out.println("Aucun fichier choisi");
		}
    }//GEN-LAST:event_btnOuvrirListeAutoActionPerformed

	void préremplirTableauAutorisations(String cheminFichier) throws FileNotFoundException {
		DefaultTableModel modèle = (DefaultTableModel) tableAutorisations.getModel();
		/* Suppression des données déjà présentes */
		modèle.setRowCount(0);
		/* Ajout des données du fichier */
		File fichierChoisi = new File(cheminFichier);
		Scanner lecteur = new Scanner(fichierChoisi);
		String ligneLue;
		String[] sepChaine;
		while (lecteur.hasNextLine()) {
			ligneLue = lecteur.nextLine();
			sepChaine = ligneLue.split("\t");
			if (sepChaine.length != 2) {
				/* N'est pas un fichier d'autorisations si pas 2 colonnes*/
			} else {
				modèle.addRow(new Object[]{sepChaine[0], sepChaine[1]});

			}
		}
	}

    private void btnOuvrirHistoriqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOuvrirHistoriqueActionPerformed
		JFileChooser choix_fichier = new JFileChooser();
		int resultat = choix_fichier.showOpenDialog(null);
		if (resultat == JFileChooser.APPROVE_OPTION) {
			String fichier_choisi = choix_fichier.getSelectedFile().getAbsolutePath();
			try {
				throw new FileNotFoundException();
			} catch (FileNotFoundException ex) {
			}
		} else {
			System.out.println("Aucun fichier choisi");
		}
    }//GEN-LAST:event_btnOuvrirHistoriqueActionPerformed

    private void btnEnregistrerAutorisationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerAutorisationsActionPerformed
		JFileChooser choix_fichier = new JFileChooser();
		int resultat = choix_fichier.showOpenDialog(null);
		if (resultat == JFileChooser.APPROVE_OPTION) {
			String fichier_choisi = choix_fichier.getSelectedFile().getAbsolutePath();
			DefaultTableModel modèle = (DefaultTableModel) tableAutorisations.getModel();
			tableAutorisations.editCellAt(0, 0);
			try {
				FileWriter fichier_destination = new FileWriter(fichier_choisi);
				String ligne_actu;
				for (int i = 0; i < modèle.getRowCount(); i++) {
					ligne_actu = modèle.getValueAt(i, 0) + "\t" + modèle.getValueAt(i, 1) + "\n";
					System.out.print(ligne_actu);
					fichier_destination.write(ligne_actu);
				}
				fichier_destination.close();
			} catch (IOException ex) {
			}
			frameAutorisations.dispose();
			setVisible(true);
		} else {
			System.out.println("Aucun fichier choisi");
		}
    }//GEN-LAST:event_btnEnregistrerAutorisationsActionPerformed

    private void btnAjouterAutorisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterAutorisationActionPerformed
		DefaultTableModel modèle = (DefaultTableModel) tableAutorisations.getModel();
		int nombre_lignes = modèle.getRowCount();
		modèle.setRowCount(nombre_lignes + 1);
		tableAutorisations.editCellAt(nombre_lignes​, 0);
		tableAutorisations.requestFocus();
    }//GEN-LAST:event_btnAjouterAutorisationActionPerformed

    private void btnSupprimerAutorisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerAutorisationActionPerformed
		DefaultTableModel modèle = (DefaultTableModel) tableAutorisations.getModel();
		int ligne_sel = tableAutorisations.getSelectedRow();
		while (ligne_sel != -1) {
			if (modèle.getRowCount() > 1) {
				int modelRow = tableAutorisations.convertRowIndexToModel(ligne_sel);
				modèle.removeRow(modelRow);
				ligne_sel = tableAutorisations.getSelectedRow();
			} else {
				modèle.addRow(new Object[]{null, null});
				int modelRow = tableAutorisations.convertRowIndexToModel(0);
				modèle.removeRow(modelRow);
				break;
			}
		}
    }//GEN-LAST:event_btnSupprimerAutorisationActionPerformed

    private void btnImporterAutorisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImporterAutorisationActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_btnImporterAutorisationActionPerformed

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
			java.util.logging.Logger.getLogger(InterfaceBDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(InterfaceBDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(InterfaceBDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(InterfaceBDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new InterfaceBDA().setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouterAutorisation;
    private javax.swing.JButton btnCreerListeAuto;
    private javax.swing.JButton btnEnregistrerAutorisations;
    private javax.swing.JButton btnImporterAutorisation;
    private javax.swing.JButton btnOuvrirHistorique;
    private javax.swing.JButton btnOuvrirListeAuto;
    private javax.swing.JButton btnSupprimerAutorisation;
    private javax.swing.JFrame frameAutorisations;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAutorisations;
    // End of variables declaration//GEN-END:variables
}
