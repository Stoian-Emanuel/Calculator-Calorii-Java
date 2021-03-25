package javaNou1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import java.awt.Choice;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class javaNou1SWING {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					javaNou1SWING window = new javaNou1SWING();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public javaNou1SWING() {
		initialize();
	}

	
	//  Initialize the contents of the frame.
	 
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Deschidere panou central pentru orice tip de monitor  
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setLocation(dimension.width/2-frame.getSize().width/2, dimension.height/2-frame.getSize().height/2);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(new Color(135, 206, 235));
		frame.getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JLabel labelTitlu = new JLabel("Calculator de calorii");
		labelTitlu.setHorizontalAlignment(SwingConstants.CENTER);
		labelTitlu.setFont(new Font("Optima", Font.BOLD, 32));
		labelTitlu.setBounds(75, 15, 325, 29);
		desktopPane.add(labelTitlu);
		
		JLabel labelNume = new JLabel("Nume:");
		labelNume.setHorizontalAlignment(SwingConstants.CENTER);
		labelNume.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		labelNume.setBounds(97, 105, 82, 26);
		desktopPane.add(labelNume);
		
		JLabel labelSexul = new JLabel("Genul");
		labelSexul.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		labelSexul.setBounds(107, 154, 82, 26);
		desktopPane.add(labelSexul);
		
		JLabel labelVarsta =new JLabel("Varsta");
		labelVarsta.setForeground(new Color(0, 0, 0));
		labelVarsta.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		labelVarsta.setBounds(107, 196, 69, 26);
		desktopPane.add(labelVarsta);
		
		JLabel labelGreutate = new JLabel("Greutate(kg)");
		labelGreutate.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		labelGreutate.setBounds(107, 243, 120, 26);
		desktopPane.add(labelGreutate);
		
		JLabel labelInaltime = new JLabel("Inaltime(cm)");
		labelInaltime.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		labelInaltime.setBounds(106, 291, 121, 26);
		desktopPane.add(labelInaltime);
		
		
		
		JLabel labelAfisare = new JLabel("Rezultat: ");
		labelAfisare.setHorizontalAlignment(SwingConstants.CENTER);
		labelAfisare.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		labelAfisare.setBounds(176, 442, 69, 16);
		desktopPane.add(labelAfisare);
		
		JTextPane textNume = new JTextPane();
		textNume.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		textNume.setBounds(191, 106, 151, 25);
		desktopPane.add(textNume);
		
		JTextPane textVarsta = new JTextPane();
		textVarsta.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textVarsta.setBounds(190, 196, 152, 25);
		desktopPane.add(textVarsta);
		
		JTextPane textInaltime = new JTextPane();
		textInaltime.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textInaltime.setBounds(239, 292, 103, 25);
		desktopPane.add(textInaltime);
		
		JTextPane textAfisareRezultat = new JTextPane();
		textAfisareRezultat.setBackground(new Color(135, 206, 235));
		textAfisareRezultat.setBounds(257, 442, 62, 16);
		desktopPane.add(textAfisareRezultat);
		
		
		
		
		Choice choiceGen = new Choice();
		choiceGen.setFont(new Font("Dialog", Font.PLAIN, 20));
		choiceGen.setBounds(185, 162, 166, 16);
		choiceGen.setBackground(new Color(135, 206, 235));
		choiceGen.add("none()");
		choiceGen.add("Masculin");
		choiceGen.add("Feminin");
		desktopPane.add(choiceGen);
		
		JTextPane textKg = new JTextPane();
		textKg.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		textKg.setBounds(239, 243, 103, 26);
		desktopPane.add(textKg);
		
		JLabel lbl_Activitate_Saptamanala = new JLabel("Activitate saptamanala");
		lbl_Activitate_Saptamanala.setForeground(new Color(0, 0, 0));
		lbl_Activitate_Saptamanala.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl_Activitate_Saptamanala.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Activitate_Saptamanala.setBounds(107, 333, 235, 26);
		lbl_Activitate_Saptamanala.setBackground(new Color(0, 191, 255));
		desktopPane.add(lbl_Activitate_Saptamanala);
		
		Choice choice_activitate = new Choice();
		choice_activitate.setFont(new Font("Dialog", Font.PLAIN, 12));
		choice_activitate.setBounds(83, 365, 290, 27);
		choice_activitate.add("none()");
		choice_activitate.add("Munca sedentara si putine alte activitati");
		choice_activitate.add("Munca in picioare sau exercitii usoare 1-3 zile pe saptamana");
		choice_activitate.add("Activitati zilnice moderate sau exercitii 5-6 zile pe saptamana");
		choice_activitate.add("Exercitii intense zi de zi sau munca fizica intensa");
		choice_activitate.add("Munca fizica intensa plus exercitii de peste 3 ori pe saptamana");
		choice_activitate.add("Orice");
		desktopPane.add(choice_activitate);

		
		
		// Calcul
		
		String getKG = textKg.getText();

		
		Button button = new Button("Calculeaza");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Convertire din String in int
				
				int greutate = Integer.parseInt (textKg.getText());
				int inaltime = Integer.parseInt (textInaltime.getText());
				int varsta = Integer.parseInt (textVarsta.getText());
				
				// Calcul calorii pentru barbat si femeie
				
				// Calcul * 1.2
				double calcul_barbat1 = (10* greutate + 6.25 * inaltime - 5 * varsta + 5) * 1.2;
				//Convertire din double in String 
				String rezultat_barbat1 = String.valueOf(calcul_barbat1);
				
				// Calcul * 1.357
				
				double calcul_barbat2 = (10* greutate + 6.25 * inaltime - 5 * varsta + 5) * 1.357;
				//Convertire din double in String 
				String rezultat_barbat2 = String.valueOf(calcul_barbat2);
				
				// Calcul * 1.55
				
				double calcul_barbat3 = (10* greutate + 6.25 * inaltime - 5 * varsta + 5) * 1.55;
				
				//Convertire din double in String 
				String rezultat_barbat3 = String.valueOf(calcul_barbat3);
				
				// Calcul * 1.725
				
				double calcul_barbat4 = (10* greutate + 6.25 * inaltime - 5 * varsta + 5) * 1.725;
				//Convertire din double in String 
				String rezultat_barbat4 = String.valueOf(calcul_barbat4);
				
				// Calcul * 1.9
				
				double calcul_barbat5 = (10* greutate + 6.25 * inaltime - 5 * varsta + 5) * 1.9;
				//Convertire din double in String 
				String rezultat_barbat5 = String.valueOf(calcul_barbat5);
				
				
				
				
				// Calcul * 1.2
				double calcul_femeie1 = (10* greutate + 6.25 * inaltime - 5 * varsta - 161) * 1.2;
				//Convertire din double in String 
				String rezultat_femeie1 = String.valueOf(calcul_femeie1);
				
				// Calcul * 1.357
				
				double calcul_femeie2 = (10* greutate + 6.25 * inaltime - 5 * varsta - 161) * 1.357;
				//Convertire din double in String 
				String rezultat_femeie2 = String.valueOf(calcul_femeie2);
				
				// Calcul * 1.55
				
				double calcul_femeie3 = (10* greutate + 6.25 * inaltime - 5 * varsta - 161) * 1.55;
				
				//Convertire din double in String 
				String rezultat_femeie3 = String.valueOf(calcul_femeie3);
				
				// Calcul * 1.725
				
				double calcul_femeie4 = (10* greutate + 6.25 * inaltime - 5 * varsta - 161) * 1.725;
				//Convertire din double in String 
				String rezultat_femeie4 = String.valueOf(calcul_femeie4);
				
				// Calcul * 1.9
				//
				double calcul_femeie5 = (10* greutate + 6.25 * inaltime - 5 * varsta - 161) * 1.9;
				//Convertire din double in String 
				String rezultat_femeie5 = String.valueOf(calcul_femeie5);
				
				
				// Barbat 
				if ((choiceGen.getSelectedItem() == "Masculin") && (choice_activitate.getSelectedItem() =="Munca sedentara si putine alte activitati")) {
					textAfisareRezultat.setText(rezultat_barbat1);
				}
				
				if((choiceGen.getSelectedItem() == "Masculin") && (choice_activitate.getSelectedItem() =="Munca in picioare sau exercitii usoare 1-3 zile pe saptamana")) {
					textAfisareRezultat.setText(rezultat_barbat2);
				}
				
				if ((choiceGen.getSelectedItem() == "Masculin") && (choice_activitate.getSelectedItem() =="Activitati zilnice moderate sau exercitii 5-6 zile pe saptamana")) {
					textAfisareRezultat.setText(rezultat_barbat3);
				}
				
				if ((choiceGen.getSelectedItem() == "Masculin") && (choice_activitate.getSelectedItem() =="Exercitii intense zi de zi sau munca fizica intensa")) {
					textAfisareRezultat.setText(rezultat_barbat4);
				}
				
				if ((choiceGen.getSelectedItem() == "Masculin") && (choice_activitate.getSelectedItem() =="Munca fizica intensa plus exercitii de peste 3 ori pe saptamana")) {
					textAfisareRezultat.setText(rezultat_barbat5);
				}
				
				
				
				// Femeie
				if ((choiceGen.getSelectedItem() == "Feminin") && (choice_activitate.getSelectedItem() == "Munca sedentara si putine alte activitati")) {
					textAfisareRezultat.setText(rezultat_femeie1);
				}
				
				if ((choiceGen.getSelectedItem() == "Feminin") && (choice_activitate.getSelectedItem() == "Munca in picioare sau exercitii usoare 1-3 zile pe saptamana")) {
					textAfisareRezultat.setText(rezultat_femeie2);
				}
				
				if ((choiceGen.getSelectedItem() == "Feminin") && (choice_activitate.getSelectedItem() == "Activitati zilnice moderate sau exercitii 5-6 zile pe saptamana")){
					textAfisareRezultat.setText(rezultat_femeie3);
				}
				
				if ((choiceGen.getSelectedItem() == "Feminin") && (choice_activitate.getSelectedItem() == "Exercitii intense zi de zi sau munca fizica intensa")) {
					textAfisareRezultat.setText(rezultat_femeie4);
				}
				
				if ((choiceGen.getSelectedItem() == "Feminin") && (choice_activitate.getSelectedItem() == "Munca fizica intensa plus exercitii de peste 3 ori pe saptamana")){
					textAfisareRezultat.setText(rezultat_femeie5);
				}
				
				
				
						
			}
		});
		button.setFont(new Font("Dialog", Font.PLAIN, 15));
		button.setBounds(168, 398, 151, 29);
		desktopPane.add(button);
		
		Button button_reset = new Button("Reset");
		button_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAfisareRezultat.setText("");
				textNume.setText("");
				textVarsta.setText("");
				textInaltime.setText("");
				textKg.setText("");
				
				// Reseteaza selectia de la choice la nivel 0, adica 0 fiind Masculin, 1 fiind Feminin
				
				choiceGen.select(0);
				choice_activitate.select(0);
				
			}
		});
		button_reset.setFont(new Font("Dialog", Font.PLAIN, 15));
		button_reset.setBounds(373, 533, 117, 29);
		desktopPane.add(button_reset);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(85, 56, 303, 3);
		desktopPane.add(panel);
	


		


		
	
	} 
}
		
		