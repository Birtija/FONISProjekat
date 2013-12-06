package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import klase.SrpskiUTarzanski;
import klase.TarzanskiUSrpski;

import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.CardLayout;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class KonvertorTUS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KonvertorTUS frame = new KonvertorTUS();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KonvertorTUS() {
		getContentPane().setLayout(new MigLayout("", "[]", "[]"));
		setIconImage(Toolkit.getDefaultToolkit().getImage(KonvertorTUS.class.getResource("/slike/ikona.jpg")));
		setResizable(false);
		setTitle("Konvertor tarzanskog u srpski");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 760, 400);
		contentPane = new JPanel();
		
		contentPane.setBackground(new Color(240, 230, 140));
		contentPane.setForeground(new Color(240, 230, 140));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(new MigLayout("", "[][254.00][178.00,grow][253.00,grow]", "[][87.00][][96.00,grow][50.00,grow][42.00][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Prevodilac iz tarzanskog u srpski i  obrnuto");
		lblNewLabel.setFont(new Font("SimSun-ExtB", Font.BOLD | Font.ITALIC, 22));
		contentPane.add(lblNewLabel, "cell 1 0 3 1,alignx center");
		
		JLabel lblTarzanski = new JLabel("Tarzanski");
		contentPane.add(lblTarzanski, "flowx,cell 1 1");
		
		JLabel lblSrpski = new JLabel("Srpski");
		contentPane.add(lblSrpski, "cell 3 1");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(255, 239, 213), 3));
		contentPane.add(scrollPane, "cell 0 2 2 6,grow");
		
		final JTextArea textArea_Tarzanski = new JTextArea();
		textArea_Tarzanski.setLineWrap(true);
		scrollPane.setViewportView(textArea_Tarzanski);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setViewportBorder(new LineBorder(new Color(255, 235, 205), 3));
		contentPane.add(scrollPane_1, "cell 3 2 1 6,grow");
		
		final JTextArea textArea_Srpski = new JTextArea();
		textArea_Srpski.setLineWrap(true);
		scrollPane_1.setViewportView(textArea_Srpski);
		
		
		

		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, "cell 2 3 1 3,grow");
		
		JLabel lblSlika = new JLabel("");
		lblSlika.setBounds(0, 0, 256, 204);
//		contentPane.add(btn_OtvoriT, "cell 1 9");
		
		
		
		lblSlika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/fonis.jpg")));
		panel.setLayout(null);
		
		
		
		
		final JComboBox comboBox_konvertor = new JComboBox();
		comboBox_konvertor.setBounds(39, 132, 128, 20);
		panel.add(comboBox_konvertor);
		
		comboBox_konvertor.addItem("KonvertujTUS");
		comboBox_konvertor.addItem("KonvertujSUT");
		
       
		
		JButton btnKonvertuj = new JButton("Konvertuj");
		btnKonvertuj.setBounds(39, 11, 128, 23);
		panel.add(btnKonvertuj);
		panel.add(lblSlika);
		btnKonvertuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tekst_tarzanski = textArea_Tarzanski.getText();
				String tekst_srpski = textArea_Srpski.getText();
				TarzanskiUSrpski tus = new TarzanskiUSrpski();
				SrpskiUTarzanski sut = new SrpskiUTarzanski();
				KonvertorTUS k = new KonvertorTUS();
				if (textArea_Srpski.getText().equals("") && textArea_Tarzanski.getText().equals("")){
					JOptionPane.showMessageDialog(
						    k, "Oba polja su prazna .Barem jedno mora da bude popunjeno.");
				}
				if (comboBox_konvertor.getSelectedItem()!=null &&
						comboBox_konvertor.getSelectedItem().equals("KonvertujTUS")){
                     if (textArea_Tarzanski.getText().equals("")&&!(textArea_Srpski.getText().equals(""))){
                    	 JOptionPane.showMessageDialog(
 							    k, "Ne postoji tekst u tarzanskom polju.");
                     }
					String novi =tus.metoda(tekst_tarzanski);
					textArea_Srpski.setText(novi);
				}
				if (comboBox_konvertor.getSelectedItem()!=null &&
						comboBox_konvertor.getSelectedItem().equals("KonvertujSUT")){
					if(textArea_Srpski.getText().equals("")&&!(textArea_Tarzanski.getText().equals(""))){
						JOptionPane.showMessageDialog(
							    k, "Ne postoji tekst u srpskom polju.");
					}
					String novi = sut.metoda(tekst_srpski);
					textArea_Tarzanski.setText(novi);
				}
			}
		});
		
		final JButton btnOtvoriT = new JButton("Otvori tarzanski");
		contentPane.add(btnOtvoriT, "flowx,cell 1 9");
		btnOtvoriT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JFileChooser chooser = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "Txt files", "txt");
			    chooser.setFileFilter(filter);
			    int returnVal = chooser.showOpenDialog(btnOtvoriT);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			       System.out.println("You chose to open this file: " +
			            chooser.getSelectedFile().getName());
			       
			       
			    }
			    TarzanskiUSrpski tus = new TarzanskiUSrpski();
			    textArea_Tarzanski.setText(tus.ispisi(chooser.getSelectedFile()));
			}
		});
		
		JButton btnOtvoriS = new JButton("Otvori srpski");
		btnOtvoriS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
			        "Txt files", "txt");
			    chooser.setFileFilter(filter);
			    int returnVal = chooser.showOpenDialog(btnOtvoriT);
			    if(returnVal == JFileChooser.APPROVE_OPTION) {
			       System.out.println("You chose to open this file: " +
			            chooser.getSelectedFile().getName());
			       
			       
			    }
			    SrpskiUTarzanski sut = new SrpskiUTarzanski();
			    textArea_Srpski.setText(sut.ispisi(chooser.getSelectedFile()));
			}
		});
		
		JButton btnObriši = new JButton("Obriši tekst");
		btnObriši.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_Srpski.setText(null);
				textArea_Tarzanski.setText(null);
			}
		});
		contentPane.add(btnObriši, "cell 2 9,alignx center");
		contentPane.add(btnOtvoriS, "flowx,cell 3 9");
		
		final JButton btnSacuvajT = new JButton("Sacuvaj tarzanski");
		contentPane.add(btnSacuvajT, "cell 1 9");
		

		
		JButton btn_sacuvajSrpski = new JButton("Sacuvaj srpski");
		btn_sacuvajSrpski.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser saver = new JFileChooser("./");  
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
					        "Txt files", "txt");
		        int returnVal = saver.showSaveDialog(btnSacuvajT);  
		        File file = saver.getSelectedFile();  
		        BufferedWriter writer = null;  
		        if (returnVal == JFileChooser.APPROVE_OPTION) {
				 try {
					 
						PrintWriter zapisi1 = new PrintWriter(new BufferedWriter(new FileWriter(file+".txt")));
						
						
						zapisi1.println(textArea_Srpski.getText());
						
					    zapisi1.close();
					   
					} catch (Exception e2) {
						System.out.println("Greska"+e2.getMessage());
					}
				 
		        }
			}
		});
		contentPane.add(btn_sacuvajSrpski, "cell 3 9,alignx center");
		
		JLabel lblNewLabel_1 = new JLabel("( proba : ukucajte Shta je bilo matori ?)");
		contentPane.add(lblNewLabel_1, "cell 1 1");
		btnSacuvajT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser saver = new JFileChooser("./");  
			    FileNameExtensionFilter filter = new FileNameExtensionFilter(
					        "Txt files", "txt");
		        int returnVal = saver.showSaveDialog(btnSacuvajT);  
		        File file = saver.getSelectedFile();  
		        BufferedWriter writer = null;  
		        if (returnVal == JFileChooser.APPROVE_OPTION) {
				 try {
					 
						PrintWriter zapisi1 = new PrintWriter(new BufferedWriter(new FileWriter(file+".txt")));
						
						
						zapisi1.println(textArea_Tarzanski.getText());
						
					    zapisi1.close();
					   
					} catch (Exception e2) {
						System.out.println("Greska"+e2.getMessage());
					}
				 
		        }
			}
		});
	}
}
