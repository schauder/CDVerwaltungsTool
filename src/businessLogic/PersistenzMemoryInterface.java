package businessLogic;

/**
 * Erzeugt die Schnittstelle zu den Persistenzspeichern
 * 
 * @author x3n
 *
 */
public interface PersistenzMemoryInterface {
	
	/**
	 * Speichert eine CD persistent ab.
	 * 
	 * @param cd CD, die abgespeichert werden soll
	 */
	public void save(CD cd);
	
	/**
	 * Sucht nach schon vorhandenen CD's
	 * 
	 * @param cd CD-Object, welches auf duplicat untersucht werden soll
	 * @return true, wenn die CD schon vorhanden ist
	 */
	public boolean lookForDuplicate(CD cd);

}
