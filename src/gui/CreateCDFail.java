package gui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Dialog, der geöffnet wird, wenn ein Duplicat vorliegt.
 * 
 * @author x3n
 *
 */
public class CreateCDFail extends JOptionPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4659468753605642181L;

	/**
	 * Erzeugt eine Objectinstanz
	 * 
	 * @param jf Frame, der den Dialog geöffnet hat.
	 */
	@SuppressWarnings("static-access")
	public CreateCDFail(JFrame jf) {
		super();
		this.setSize(100, 100);
		this.showMessageDialog(jf,"CD already exists in your library!", "CD save error", JOptionPane.ERROR_MESSAGE);
	}
}
