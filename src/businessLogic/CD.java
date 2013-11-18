package businessLogic;

/**
 * Repräsentiert eine CD
 * 
 * @author x3n
 *
 */
public class CD implements Comparable<CD>{
	
	private String title;
	private String interpret;
	
	/**
	 * Erzeugt ein neues CD-Object
	 * 
	 * @param title Titel der CD
	 * @param interpret Interpret der CD
	 */
	public CD(String title, String interpret){
		this.title = title;
		this.interpret = interpret;
	}
	
	@Override
	public int compareTo(CD o) {
		if(this.title.equals(o.title) && this.interpret.equals(o.interpret)){
			return 0;
		}
		
		return 1;
	}
	
	

}
