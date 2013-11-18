package businessLogic;

import gui.CreateCDFail;

import javax.swing.JFrame;

/**
 * Zuständig für die Speicherung einer CD
 * 
 * @author x3n
 *
 */
public class SaveCDPersistent {
	
	private PersistenzMemoryInterface persistenzMemory;
	
	/**
	 * Erstellt eine Objectinstanz
	 * 
	 * @param pmi
	 */
	public SaveCDPersistent(PersistenzMemoryInterface pmi){
		this.persistenzMemory = pmi;
	}
	
	/**
	 * Speichert die CD in einem Persistenten Speicher
	 * 
	 * @param cd die zu Speichernde CD
	 * @param cdf Das Frame, welches die Savemethode aufgerufen hat
	 */
	public void save(CD cd, JFrame cdf){
		
		if(!this.persistenzMemory.lookForDuplicate(cd)){
			this.persistenzMemory.save(cd);
		} else {
			@SuppressWarnings("unused")
			CreateCDFail cdFail = new CreateCDFail(cdf);
		}
		
	}

}
