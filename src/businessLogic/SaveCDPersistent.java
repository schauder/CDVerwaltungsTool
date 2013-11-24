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
		    // REVIEW die Warnung hat durchaus einen Sinn. Da cdFail nicht verwendet wird, kann die Variable und damit die Zuweisung entfallen.
			@SuppressWarnings("unused")
			//REVIEW an dieser Stelle referenziert die businessLogic die gui, ein austauschen der GUI wird dadurch nur schwer möglich. Um der Architektur gerecht zu werden müsste die Methode save einen Rückgabewert haben, der dann von der GUI ausgewertetet wird. Das Äquivalent der folgenden Code Zeile müsste dann dort stehen.
			CreateCDFail cdFail = new CreateCDFail(cdf);
		}
		
	}

}
