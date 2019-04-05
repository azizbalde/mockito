package fr.ensup.gestionetablissementscolaires.presentation;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.ensup.gestionetablissementscolaires.service.EtudiantService;

public class UserForm extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EtudiantService E;
	private JPanel panel;
	
	private JLabel idLabel;
	private JTextField jtfId;
	
	private JLabel nomLabel;
	private JTextField jtfNom;
	
	private JLabel lblPrenom;
	private JTextField jtfPrenom;
	
	private JLabel lblEmail;
	private JTextField jtfEmail;
	
	private JLabel lblAdresse;
	private JTextField jtfAdresse;
	
	private JLabel lblTel;
	private JTextField jtfTel;
	
	private JButton btnEnregistrer;
	
	public void getFrame() throws Exception{
		E = new EtudiantService();
		panel = new JPanel(new GridLayout(4, 2));
		
		idLabel = new JLabel();
		idLabel.setText("Id :");
		jtfId =  new JTextField();
		jtfId.setPreferredSize(new Dimension(200, 24));
		panel.add(idLabel);
		panel.add(jtfId);
		
		nomLabel = new JLabel();
		nomLabel.setText("Nom :");
		jtfNom = new JTextField();
		jtfNom.setPreferredSize(new Dimension(200, 24));
		panel.add(nomLabel);
		panel.add(jtfNom);
		
		
		lblPrenom = new JLabel("Prenom :");
		jtfPrenom = new JTextField();
		jtfPrenom.setPreferredSize(new Dimension(200, 24));
		panel.add(lblPrenom);
		panel.add(jtfPrenom);
		
		lblEmail = new JLabel("Email :");
		jtfEmail = new JTextField();
		jtfEmail.setPreferredSize(new Dimension(200, 24));
		panel.add(lblEmail);
		panel.add(jtfEmail);
		
		lblAdresse = new JLabel("Adresse :");
		jtfAdresse = new JTextField();
		jtfAdresse.setPreferredSize(new Dimension(200, 24));
		panel.add(lblAdresse);
		panel.add(jtfAdresse);
		
		lblTel = new JLabel("Telephone :");
		jtfTel = new JTextField();
		jtfTel.setPreferredSize(new Dimension(200, 24));
		panel.add(lblTel);
		panel.add(jtfTel);
		
		btnEnregistrer = new JButton();
		btnEnregistrer.setText("Enregistrer");
		//JButton btn = new JButton("DO");
		btnEnregistrer.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				java.util.Date date = new java.util.Date();
				java.sql.Date dateNaissance = new java.sql.Date(date.getTime());
				
				
				try {
					E.creerEtudiant(jtfId.getText(), jtfNom.getText(), jtfPrenom.getText(), jtfEmail.getText(), jtfAdresse.getText(), jtfTel.getText(), dateNaissance);
				
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		panel.add(btnEnregistrer);
		getContentPane().add(panel);
		
		getContentPane().setLayout(new FlowLayout());
		setTitle("Enregistrement");
		setSize(1000, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
}
