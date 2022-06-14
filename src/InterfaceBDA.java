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
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Font;

/**
 *
 * @author Émile
 */
public class InterfaceBDA extends javax.swing.JFrame {

	boolean identifiantsImportésHistorique = false;
	ArrayList<String> liste_id_échec;
	boolean autorisationEnregistrées = false;

	/**
	 * Constructeur
	 */
	public InterfaceBDA() {
		initComponents();
		/* Affichage des fenêtres au centre de l'écran */
		setLocationRelativeTo(null);
		frameAutorisations.setLocationRelativeTo(null);
		frameHistorique.setLocationRelativeTo(null);
		/* Affiche les grilles des tableaux */
		tableAutorisations.setShowGrid(true);
		tableHistorique.setShowGrid(true);
		/* Affiche les en-têtes en gras */
		Font policeEnteteTableau = tableAutorisations.getTableHeader().getFont().deriveFont(Font.BOLD);
		tableAutorisations.getTableHeader().setFont(policeEnteteTableau);
		tableHistorique.getTableHeader().setFont(policeEnteteTableau);
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
        frameHistorique = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableHistorique = new javax.swing.JTable();
        btnCreerListeAuto = new javax.swing.JButton();
        btnOuvrirListeAuto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOuvrirHistorique = new javax.swing.JButton();

        frameAutorisations.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frameAutorisations.setTitle("Gestion des autorisations");
        frameAutorisations.setMinimumSize(new java.awt.Dimension(600, 400));
        frameAutorisations.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                frameAutorisationsWindowClosed(evt);
            }
        });

        btnEnregistrerAutorisations.setText("Enregistrer");
        btnEnregistrerAutorisations.setToolTipText("Enregistrer les autorisations dans un fichier");
        btnEnregistrerAutorisations.setMinimumSize(new java.awt.Dimension(105, 30));
        btnEnregistrerAutorisations.setPreferredSize(new java.awt.Dimension(105, 30));
        btnEnregistrerAutorisations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregistrerAutorisationsActionPerformed(evt);
            }
        });

        btnAjouterAutorisation.setText("Ajouter");
        btnAjouterAutorisation.setToolTipText("Ajouter une ligne d'autorisation");
        btnAjouterAutorisation.setMinimumSize(new java.awt.Dimension(105, 30));
        btnAjouterAutorisation.setPreferredSize(new java.awt.Dimension(105, 30));
        btnAjouterAutorisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterAutorisationActionPerformed(evt);
            }
        });

        btnSupprimerAutorisation.setText("Supprimer");
        btnSupprimerAutorisation.setToolTipText("Supprimer une ligne d'autorisation");
        btnSupprimerAutorisation.setMinimumSize(new java.awt.Dimension(105, 30));
        btnSupprimerAutorisation.setPreferredSize(new java.awt.Dimension(105, 30));
        btnSupprimerAutorisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerAutorisationActionPerformed(evt);
            }
        });

        btnImporterAutorisation.setText("Importer");
        btnImporterAutorisation.setToolTipText("Importer des autorisations depuis un historique");
        btnImporterAutorisation.setMinimumSize(new java.awt.Dimension(105, 30));
        btnImporterAutorisation.setPreferredSize(new java.awt.Dimension(105, 30));
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
        tableAutorisations.getAccessibleContext().setAccessibleName("Tableau des autorisations");

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
                .addContainerGap(13, Short.MAX_VALUE))
        );
        frameAutorisationsLayout.setVerticalGroup(
            frameAutorisationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameAutorisationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(frameAutorisationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(frameAutorisationsLayout.createSequentialGroup()
                        .addComponent(btnEnregistrerAutorisations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAjouterAutorisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSupprimerAutorisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImporterAutorisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 202, Short.MAX_VALUE)))
                .addContainerGap())
        );

        frameHistorique.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frameHistorique.setTitle("Consulter l'historique");
        frameHistorique.setMinimumSize(new java.awt.Dimension(600, 400));
        frameHistorique.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                frameHistoriqueWindowClosed(evt);
            }
        });

        tableHistorique.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Heure", "Action", "Détail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHistorique.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableHistorique);
        tableHistorique.getAccessibleContext().setAccessibleName("Tableau de l'historique");

        javax.swing.GroupLayout frameHistoriqueLayout = new javax.swing.GroupLayout(frameHistorique.getContentPane());
        frameHistorique.getContentPane().setLayout(frameHistoriqueLayout);
        frameHistoriqueLayout.setHorizontalGroup(
            frameHistoriqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHistoriqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                .addContainerGap())
        );
        frameHistoriqueLayout.setVerticalGroup(
            frameHistoriqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(frameHistoriqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuration du verrou");
        setMinimumSize(new java.awt.Dimension(600, 400));

        btnCreerListeAuto.setText("Créer une nouvelle liste");
        btnCreerListeAuto.setToolTipText("Commencer une liste d'autorisations à partir de rien");
        btnCreerListeAuto.setMinimumSize(new java.awt.Dimension(182, 30));
        btnCreerListeAuto.setPreferredSize(new java.awt.Dimension(200, 30));
        btnCreerListeAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreerListeAutoActionPerformed(evt);
            }
        });

        btnOuvrirListeAuto.setText("Utiliser une liste existante");
        btnOuvrirListeAuto.setToolTipText("Ouvrir une liste d'autorisation et la modifier");
        btnOuvrirListeAuto.setActionCommand("");
        btnOuvrirListeAuto.setMinimumSize(new java.awt.Dimension(210, 30));
        btnOuvrirListeAuto.setPreferredSize(new java.awt.Dimension(210, 30));
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
        btnOuvrirHistorique.setToolTipText("Ouvrir un fichier d'historique et le consulter");
        btnOuvrirHistorique.setMinimumSize(new java.awt.Dimension(134, 30));
        btnOuvrirHistorique.setPreferredSize(new java.awt.Dimension(150, 30));
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
                        .addComponent(btnCreerListeAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOuvrirListeAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnOuvrirHistorique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOuvrirListeAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreerListeAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOuvrirHistorique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	/**
	 * Vide le tableau des autorisations puis crée une nouvelle ligne vide.
	 * Enfin, affiche la fenêtre des autorisations et cache l'accueil.
	 *
	 * @param evt non utilisé
	 */
    private void btnCreerListeAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreerListeAutoActionPerformed
		DefaultTableModel modèle = (DefaultTableModel) tableAutorisations.getModel();
		/* Suppression des données déjà présentes */
		modèle.setRowCount(0);
		/* Ajoute une ligne pour initialiser*/
		modèle.addRow(new Object[]{null, null});
		frameAutorisations.setVisible(true);
		setVisible(false);
    }//GEN-LAST:event_btnCreerListeAutoActionPerformed
	
	/**
	 * Affiche un sélecteur de fichier, puis appelle
	 * `remplirTableauAutorisations` pour remplir le tableau des autorisations
	 * avec le contenu du fichier sélectionné. Si le fichier choisi est bien un
	 * fichier d'autorisations (<em>id est</em> la méthode auxiliaire renvoie
	 * « Vrai »), finit en affichant la fenêtre des autorisations et en cachant
	 * l’accueil.
	 *
	 * @param evt non utilisé
	 */
    private void btnOuvrirListeAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOuvrirListeAutoActionPerformed
		JFileChooser choix_fichier = new JFileChooser();
		int resultat = choix_fichier.showOpenDialog(null);
		if (resultat == JFileChooser.APPROVE_OPTION) {
			String fichier_choisi = choix_fichier.getSelectedFile().getAbsolutePath();
			boolean succes = false;
			try {
				succes = remplirTableauAutorisations(fichier_choisi);
			} catch (FileNotFoundException ex) {
				JOptionPane.showMessageDialog(null,
						"Impossible d'ouvrir le ficher sélectionné.",
						"Erreur", JOptionPane.ERROR_MESSAGE);
			}
			if (succes) {
				frameAutorisations.setVisible(true);
				setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null,
						"Ce fichier ne semble pas être un fichier d'autorisations.",
						"Erreur", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			System.err.println("Aucun fichier choisi");
		}
    }//GEN-LAST:event_btnOuvrirListeAutoActionPerformed

	/**
	 * Vide le tableau des autorisations, puis le remplit avec le contenu du
	 * fichier : ligne par ligne, les colonnes séparées par une tabulation sont
	 * extraites. Ces colonnes se retrouvent ensuite dans le tableau. Si toutes
	 * les lignes ont bien exactement deux colonnes, le fichier est correct ;
	 * sinon la méthode échoue et renvoit « Faux ».
	 *
	 * @param cheminFichier le chemin du fichier à ouvrir
	 * @return succès de l'opération : le fichier a bien les caractéristiques
	 * d'un fichier d'autorisations
	 * @throws FileNotFoundException Si le fichier sélectionné n'est pas trouvé
	 */
	boolean remplirTableauAutorisations(String cheminFichier) throws FileNotFoundException {
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
			if (sepChaine.length == 2) {
				modèle.addRow(new Object[]{sepChaine[0], sepChaine[1]});
			} else {
				/* N'est pas un fichier d'autorisations si pas 2 colonnes*/
				return false;
			}
		}
		return true;
	}

	/**
	 * Affiche un sélecteur de fichier, puis appelle `remplirTableauHistorique`
	 * pour remplir le tableau de l'historique avec le contenu du fichier
	 * sélectionné. Si le fichier choisi est bien un fichier d'historique (<em>id
	 * est</em> la méthode auxiliaire renvoie « Vrai »), finit en affichant la
	 * fenêtre de l'historique et en cachant l’accueil.
	 *
	 * @param evt non utilisé
	 */
    private void btnOuvrirHistoriqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOuvrirHistoriqueActionPerformed
		JFileChooser choix_fichier = new JFileChooser();
		int resultat = choix_fichier.showOpenDialog(null);
		if (resultat == JFileChooser.APPROVE_OPTION) {
			String fichier_choisi = choix_fichier.getSelectedFile().getAbsolutePath();
			boolean succes = false;
			try {
				succes = remplirTableauHistorique(fichier_choisi);
			} catch (FileNotFoundException ex) {
				JOptionPane.showMessageDialog(null,
						"Impossible d'ouvrir le fichier sélectionné.",
						"Erreur", JOptionPane.ERROR_MESSAGE);
			}
			if (succes) {
				frameHistorique.setVisible(true);
				setVisible(false);
			} else {
				JOptionPane.showMessageDialog(null,
						"Ce fichier ne semble pas être un fichier d'historique.",
						"Erreur", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			System.err.println("Aucun fichier choisi");
		}
    }//GEN-LAST:event_btnOuvrirHistoriqueActionPerformed

	/**
	 * Vide le tableau de l'historique, puis le remplit avec le contenu du
	 * fichier : ligne par ligne, les colonnes séparées par une tabulation sont
	 * extraites. Ces colonnes se retrouvent ensuite dans le tableau. Si toutes
	 * les lignes ont bien exactement trois colonnes, le fichier est correct ;
	 * sinon la méthode échoue et renvoit « Faux ».
	 *
	 * @param cheminFichier le chemin du fichier à ouvrir
	 * @return succès de l'opération : le fichier a bien les caractéristiques
	 * d'un fichier d'historique
	 * @throws FileNotFoundException Si le fichier sélectionnée n'est pas trouvé
	 */
	boolean remplirTableauHistorique(String cheminFichier) throws FileNotFoundException {
		DefaultTableModel modèle = (DefaultTableModel) tableHistorique.getModel();
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
			if (sepChaine.length == 3) {
				modèle.addRow(new Object[]{sepChaine[0], sepChaine[1], sepChaine[2]});
			} else {
				/* Il n'y a pas trois colonnes, ce n'est pas un ficher d'historique */
				return false;
			}
		}
		/* Tout s'est bien passé */
		return true;
	}

	/**
	 * Affiche un sélecteur de fichier pour l'enregistrement. Une fois fait,
	 * valide les modifications en cours et écrit les différentes lignes du
	 * tableau dans le fichier sélectionné selon la spécification du format. Les
	 * lignes entièrement vides sont ignorées. Enfin, change le témoin
	 * d'enregistrement `autorisationEnregistrées` à « Vrai ».
	 *
	 * @param evt non utilisé
	 */
    private void btnEnregistrerAutorisationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregistrerAutorisationsActionPerformed
		JFileChooser choix_fichier = new JFileChooser();
		int resultat = choix_fichier.showSaveDialog(null);
		if (resultat == JFileChooser.APPROVE_OPTION) {
			String fichier_choisi = choix_fichier.getSelectedFile().getAbsolutePath();
			DefaultTableModel modèle = (DefaultTableModel) tableAutorisations.getModel();
			/* Validation des modifications en cours */
			if (tableAutorisations.isEditing()) {
				tableAutorisations.getCellEditor().stopCellEditing();
			}
			try ( FileWriter fichier_destination = new FileWriter(fichier_choisi)) {
				String ligne_actu;
				for (int i = 0; i < modèle.getRowCount(); i++) {
					String identifiantLigne = (String) tableAutorisations.getValueAt(i, 0);
					if (identifiantLigne == null) {
						/* Le pointeur nul est remplacé par une chaîne vide */
						identifiantLigne = "";
					}
					identifiantLigne = identifiantLigne.trim();
					String nomLigne = (String) tableAutorisations.getValueAt(i, 1);
					if (nomLigne == null) {
						nomLigne = "";
					}
					nomLigne = nomLigne.trim();
					if (!(identifiantLigne.isBlank() && nomLigne.isBlank())) {
						/* Si la ligne n'est pas entièrement vide */
						ligne_actu = identifiantLigne + "\t" + nomLigne + "\r\n";
						System.out.print(ligne_actu);
						fichier_destination.write(ligne_actu);
					}
				}
				fichier_destination.close();
				autorisationEnregistrées = true;
			} catch (IOException ex) {
				JOptionPane.showMessageDialog(null,
						"Impossible d'ouvrir le fichier choisi en écriture.",
						"Erreur", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			System.out.println("Aucun fichier choisi");
		}
    }//GEN-LAST:event_btnEnregistrerAutorisationsActionPerformed

	/**
	 * Ajoute une ligne au tableau des autorisations et rend ce même tableau
	 * actif.
	 *
	 * @param evt non utilisé
	 */
    private void btnAjouterAutorisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterAutorisationActionPerformed
		DefaultTableModel modèle = (DefaultTableModel) tableAutorisations.getModel();
		int nombre_lignes = modèle.getRowCount();
		modèle.setRowCount(nombre_lignes + 1);
		// tableAutorisations.editCellAt(nombre_lignes​, 0);
		tableAutorisations.requestFocus();
    }//GEN-LAST:event_btnAjouterAutorisationActionPerformed

	/**
	 * Valide les modifications en cours pour éviter de modifier une cellule
	 * supprimée puis supprime une par une toutes les lignes sélectionnées. Si
	 * le tableau se retrouverait sans lignes, une ligne vide est insérée.
	 * Enfin, la dernière ligne est sélectionnée.
	 *
	 * @param evt non utilisé
	 */
    private void btnSupprimerAutorisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerAutorisationActionPerformed
		if (tableAutorisations.isEditing()) {
			/* Fin de l'édition des cellules, évite de modifier une cellule qui
			n'existe plus */
			tableAutorisations.getCellEditor().stopCellEditing();
		}
		DefaultTableModel modèle = (DefaultTableModel) tableAutorisations.getModel();
		int ligne_sel = tableAutorisations.getSelectedRow();
		while (ligne_sel != -1) {
			if (modèle.getRowCount() > 1) {
				modèle.removeRow(ligne_sel);
				ligne_sel = tableAutorisations.getSelectedRow();
			} else {
				/* Ajoute une ligne vide pour ne pas avoir de tableau vide */
				modèle.addRow(new Object[]{null, null});
				int modelRow = tableAutorisations.convertRowIndexToModel(0);
				modèle.removeRow(modelRow);
				break;
			}
		}
		int ligneMax = modèle.getRowCount() - 1;
		tableAutorisations.setRowSelectionInterval(ligneMax, ligneMax);
    }//GEN-LAST:event_btnSupprimerAutorisationActionPerformed

	/**
	 * Affiche un sélecteur de fichiers pour sélectionner un fichier
	 * d'historique et appelle `listeIdentifiantsDepuisHistorique` pour
	 * récupérer la liste des identifiants non reconnus. Si les identifiants ont
	 * bien été récupérés (le tableau renvoyé n'est pas nul, <em>id est</em> le fichier
	 * sélectionné est bien un fichier d'historique), affiche un dialogue
	 * permettant de sélectionner un des identifiants. Une nouvelle ligne
	 * contenant l'identifiant sélectionné est ajoutée au tableau des
	 * autorisations, et cet identifiant est retiré de la liste (mais pas du
	 * fichier). Pour reproposer le choix du fichier, il faut ouvrir une
	 * nouvelle fenêtre d'autorisations.
	 *
	 * @param evt non utilisé
	 */
    private void btnImporterAutorisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImporterAutorisationActionPerformed
		if (!identifiantsImportésHistorique) {
			liste_id_échec = null;
			JFileChooser choix_fichier = new JFileChooser();
			int resultat = choix_fichier.showOpenDialog(null);
			if (resultat == JFileChooser.APPROVE_OPTION) {
				String fichier_choisi = choix_fichier.getSelectedFile().getAbsolutePath();
				try {
					liste_id_échec = listeIdentifiantsDepuisHistorique(fichier_choisi);
					if (liste_id_échec != null) {
						identifiantsImportésHistorique = true;
					}
				} catch (FileNotFoundException ex) {
					JOptionPane.showMessageDialog(null,
							"Impossible d'ouvrir le ficher sélectionné.",
							"Erreur", JOptionPane.ERROR_MESSAGE);
				}
			} else {
				System.err.println("Aucun fichier choisi");
			}
		}
		if (identifiantsImportésHistorique) {
			String[] tableau_id_échec = liste_id_échec.toArray(String[]::new);
			/* Affiche un dialogue de choix */
			String identifiantSelectionne = (String) JOptionPane.showInputDialog(null,
					"Choisissez un identifiant à importer", "Importation depuis l'historique",
					JOptionPane.PLAIN_MESSAGE, null,
					tableau_id_échec, "");
			liste_id_échec.remove(identifiantSelectionne);
			if (identifiantSelectionne != null) {
				System.out.println(identifiantSelectionne);
				DefaultTableModel modèle = (DefaultTableModel) tableAutorisations.getModel();
				modèle.addRow(new Object[]{identifiantSelectionne, ""});
			}
		}
    }//GEN-LAST:event_btnImporterAutorisationActionPerformed

	/**
	 * Ouvre le fichier en paramètre et le lit. Ligne par ligne, les colonnes
	 * séparées par des tabulations sont extraites. S'il n'y a pas trois
	 * colonnes à chaque ligne, le fichier n'est pas un fichier d'historique et
	 * l'objet nul est renvoyé. Sinon, si la deuxième colonne contient le
	 * mot-clé « ÉCHEC », le contenu de la troisième colonne est ajouté à la
	 * liste s'il n'y est pas déjà présent.
	 *
	 * @param cheminFichier le chemin du fichier à ouvrir
	 * @return la liste des identifiants extraits, null si le fichier n'est pas
	 * un fichier d'historique
	 * @throws FileNotFoundException Si le fichier sélectionné n'est pas trouvé
	 */
	ArrayList<String> listeIdentifiantsDepuisHistorique(String cheminFichier) throws FileNotFoundException {
		ArrayList<String> tableau_id = new ArrayList<>();
		/* Ajout des données du fichier */
		File fichierChoisi = new File(cheminFichier);
		Scanner lecteur = new Scanner(fichierChoisi);
		String ligneLue;
		String[] sepChaine;
		while (lecteur.hasNextLine()) {
			ligneLue = lecteur.nextLine();
			sepChaine = ligneLue.split("\t");
			if (sepChaine.length == 3) {
				/* Les fichiers d'historique ont exactement trois colonnes */
				if (sepChaine[1].equalsIgnoreCase("ÉCHEC")) {
					/* Seuls les évènements marqués comme 'ÉCHEC' nous intéressent ici */
					if (!tableau_id.contains(sepChaine[2])) {
						/* Si le tableau ne contient pas déjà l'identifiant (pas de doublons) */
						tableau_id.add(sepChaine[2]);
					}
				}
			} else {
				/* Il n'y a pas trois colonnes, ce n'est pas un ficher d'historique */
				JOptionPane.showMessageDialog(null,
						"Ce fichier ne semble pas être un fichier d'historique.",
						"Erreur", JOptionPane.ERROR_MESSAGE);
				return null;
			}
		}
		return tableau_id;
	}

	/**
	 * Quand la fenêtre d'autorisations est fermée, réinitialise de témoin
	 * d'importation. Si les données n'ont jamais été enregistrées, propose
	 * d'enregistrer dans un fichier (en faisant appel à la méthode
	 * `btnEnregistrerAutorisationsActionPerformed` pour cela). Enfin,
	 * réinitiale le témoin d'enregistrement et affiche l'accueil.
	 *
	 * @param evt non utilisé
	 */
    private void frameAutorisationsWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_frameAutorisationsWindowClosed
		/* Réinitialise le dialogue d'importation des identifiants depuis l'historique */
		identifiantsImportésHistorique = false;
		if (!autorisationEnregistrées) {
			int choix_enregistrer = JOptionPane.showInternalConfirmDialog(null,
					"Voulez-vous enregister ?", "Vous n'avez pas enregistré",
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (choix_enregistrer == JOptionPane.YES_OPTION) {
				btnEnregistrerAutorisationsActionPerformed(null);
			}
		}
		/* Réinitialise l'état d'enregistrement du fichier une fois fermé */
		autorisationEnregistrées = false;
		setVisible(true);
    }//GEN-LAST:event_frameAutorisationsWindowClosed

	/**
	 * Quand la fenêtre de l'historique est fermée, affiche la fenêtre d'accueil
	 *
	 * @param evt non utilisé
	 */
    private void frameHistoriqueWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_frameHistoriqueWindowClosed
		setVisible(true);
    }//GEN-LAST:event_frameHistoriqueWindowClosed

	/**
	 * La méthode principale qui est à la source de tout
	 *
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Utilisation du thème FlatLaf Light */
		//<editor-fold defaultstate="collapsed" desc="Look and feel setting code">
		try {
			javax.swing.UIManager.setLookAndFeel(new FlatLightLaf());
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println("Impossible de charger le thème");
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(() -> {
			new InterfaceBDA().setVisible(true);
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
    private javax.swing.JFrame frameHistorique;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableAutorisations;
    private javax.swing.JTable tableHistorique;
    // End of variables declaration//GEN-END:variables
}
