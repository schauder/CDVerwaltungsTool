package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import businessLogic.CD;
import businessLogic.SaveCDPersistent;

public class CreateCDForm extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2109098176311104222L;
	private JTextField titleTextField;
	private JLabel titleLabel;
	private JTextField interpretTextField;
	private JLabel interpretLabel;
	private JButton submitButton;
	private SaveCDPersistent saveCDPersistent;

	/**
	 * Erzeugt die Gui.
	 * 
	 * @param scdp Schnittstelle zum persistenten Speicher.
	 */
	public CreateCDForm(SaveCDPersistent scdp) {
		this.saveCDPersistent = scdp;
		this.setLayout(new GridLayout(3, 2));

		this.titleLabel = new JLabel("Titel:");
		this.add(this.titleLabel);
		this.titleTextField = new JTextField();
		this.add(this.titleTextField);

		this.interpretLabel = new JLabel("Interpret:");
		this.add(this.interpretLabel);
		this.interpretTextField = new JTextField();
		this.add(this.interpretTextField);

		this.submitButton = new JButton("Submit!");
		this.submitButton.addActionListener(new SubmitButtonListener());
		this.add(this.submitButton);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(200, 200);
	}
	
	/**
	 * Gibt das Frame zurück.
	 * @return
	 */
	private JFrame getFrame(){
		return this;
	}

	/**
	 * Verwaltet, was passiert, wenn der SubmitButton geklickt wird.
	 * 
	 * @author x3n
	 *
	 */
	private class SubmitButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			saveCDPersistent.save(new CD(titleTextField.getText(),
					interpretTextField.getText()),getFrame());
		}

	}

}
