package gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Font;

import javax.swing.JTextArea;

import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

import core.Question;

public class QuestionPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public QuestionPanel(int Number, Question quest) {
		setLayout(null);

		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textArea.setBounds(58, 58, 805, 96);
		add(textArea);

		JTextArea textArea_1 = new JTextArea();
		textArea_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textArea_1.setBounds(89, 194, 775, 35);
		add(textArea_1);

		JTextArea textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textArea_2.setBounds(89, 264, 775, 35);
		add(textArea_2);

		JTextArea textArea_3 = new JTextArea();
		textArea_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textArea_3.setBounds(89, 334, 775, 35);
		add(textArea_3);

		JTextArea textArea_4 = new JTextArea();
		textArea_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textArea_4.setBounds(89, 404, 775, 35);
		add(textArea_4);

		JTextArea textArea_5 = new JTextArea();
		textArea_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textArea_5.setBounds(89, 474, 775, 35);
		add(textArea_5);

		JButton btnResponder = new JButton("Responder");
		btnResponder.setBounds(401, 540, 109, 35);
		btnResponder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showConfirmDialog(null, "Voc� est� certo disto?",
						"Confirma��o", 0);
			}
		});
		btnResponder.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(btnResponder);
		
		textArea.setText(quest.getText());
		
		if (quest.getAnswers().length == 3){
			textArea_3.setVisible(false);
			textArea_5.setVisible(false);
			
			textArea_1.setText(quest.getAnswers()[0]);
			textArea_3.setText(quest.getAnswers()[1]);
			textArea_5.setText(quest.getAnswers()[2]);
		} else if (quest.getAnswers().length == 5){
			textArea_1.setText(quest.getAnswers()[0]);
			textArea_2.setText(quest.getAnswers()[1]);
			textArea_3.setText(quest.getAnswers()[2]);
			textArea_4.setText(quest.getAnswers()[3]);
			textArea_5.setText(quest.getAnswers()[4]);
		}
		textArea.setEditable(false);
		textArea_1.setEditable(false);
		textArea_2.setEditable(false);
		textArea_3.setEditable(false);
		textArea_4.setEditable(false);
		textArea_5.setEditable(false);
		textArea.setAlignmentY(CENTER_ALIGNMENT);
		//textArea_1.setAlignmentX(textArea_1.CENTER_ALIGNMENT);
		//textArea_1.setAlignmentY(textArea_1.CENTER_ALIGNMENT);

		JRadioButton radioButton = new JRadioButton("");
		buttonGroup.add(radioButton);
		radioButton.setBounds(44, 194, 109, 35);
		add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(44, 265, 109, 35);
		add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton("");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(44, 335, 109, 35);
		add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(44, 405, 109, 35);
		add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton("");
		buttonGroup.add(radioButton_4);
		radioButton_4.setBounds(44, 475, 109, 35);
		add(radioButton_4);

		JLabel lblQuesto = new JLabel("Quest\u00E3o " + Number + ":");
		lblQuesto.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuesto.setBounds(25, 22, 184, 25);
		add(lblQuesto);

	}
}
