package mainpackage;

import persistenz.CDStore;
import businessLogic.PersistenzMemoryInterface;
import businessLogic.SaveCDPersistent;
import gui.CreateCDForm;

public class MainClass {
	
	public static void main(String[] args){
		/**
		 * Dient als Injector.
		 */
		PersistenzMemoryInterface pmi = new CDStore();
		SaveCDPersistent scdp = new SaveCDPersistent(pmi);
		CreateCDForm cdForm = new CreateCDForm(scdp);
		cdForm.setVisible(true);
		
	}

}
