package persistenz;

import java.util.ArrayList;
import java.util.Iterator;

import businessLogic.CD;
import businessLogic.PersistenzMemoryInterface;

public class CDStore implements PersistenzMemoryInterface{
	
	private ArrayList<CD> cdList;
	
	public CDStore(){
		this.cdList = new ArrayList<CD>();
	}
	
	public void save(CD cd){
		this.cdList.add(cd);
	}
	
	public boolean lookForDuplicate(CD cd){
		for (Iterator<CD> iterator = cdList.iterator(); iterator.hasNext();) {
			CD object = (CD) iterator.next();
			
			if(object.compareTo(cd) == 0){
				return true;
			}
		}
		
		return false;
	}

}
