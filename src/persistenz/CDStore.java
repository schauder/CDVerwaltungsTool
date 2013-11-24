package persistenz;

import java.util.ArrayList;
import java.util.Iterator;

import businessLogic.CD;
import businessLogic.PersistenzMemoryInterface;

public class CDStore implements PersistenzMemoryInterface{
	// REVIEW cdList sollte als List, nicht als ArrayList deklariert werden, da die exakte implementierung keine Rolle spielt
	private ArrayList<CD> cdList;
	
	public CDStore(){
		this.cdList = new ArrayList<CD>();
	}
	
	public void save(CD cd){
		this.cdList.add(cd);
	}
	
	public boolean lookForDuplicate(CD cd){
		// REVIEW hier wäre eine vor each Schleife bessert
		for (Iterator<CD> iterator = cdList.iterator(); iterator.hasNext();) {
			CD object = (CD) iterator.next();
			
			// REVIEW für einen Vergleich auf Gleichheit sollte equals verwendet werden
			if(object.compareTo(cd) == 0){
				return true;
			}
		}
		
		return false;
	}

}
