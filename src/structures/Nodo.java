package structures;

/*
 * @ClassName : Nodo 
 * Responsibility : Objecto que representa un nodo de la lista
 * Auhor: Luis ALberto Bolaños
 * Created: 11-dic-2015
 * Modified by:
 * Modified:
 */
public class Nodo {
	
	/*
	 * Almacena el valor o dato
	 */
	private Object value;
	
	
	/*
	 * Almacena el valor o dato
	 */
	private Object secondValue;

	/*
	 * Almacena el nodo derecho o siguiente
	 */
	private Nodo nodoDerecho;
	
	
	private Nodo [] listaNodos;
	
	
	/*
	 * Almacena el nodo izquierdp o anterior
	 */
	private Nodo nodoIzquierdo;
	
	// Constructor
	public Nodo(Object value){
		this.value = value;
	}
	
	/*
	 * Constructor del para almacenar dos elementos
	 */
	public Nodo(Object value, Object secondValue){
		this.value = value;
		this.secondValue = secondValue;
	}
	
	/*
	 * Ajusta el tamaño de la lista, 
	 */
	public void resizeListNodes(){
		Nodo [] listaTemporal = listaNodos==null ? new Nodo[0] : listaNodos.clone();
		listaNodos  =  new Nodo[listaTemporal.length + 1];
		for (int i = 0; i < listaTemporal.length; i++) {
			listaNodos[i] = listaTemporal[i];
		}
	}
	
	public void addToList(Nodo nodo){
		resizeListNodes();
		listaNodos[listaNodos.length - 1] = nodo;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Nodo getNodoDerecho() {
		return nodoDerecho;
	}

	public void setNodoDerecho(Nodo nodoDerecho) {
		this.nodoDerecho = nodoDerecho;
	}

	public Object getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(Object secondValue) {
		this.secondValue = secondValue;
	}

	public Nodo getNodoIzquierdo() {
		return nodoIzquierdo;
	}

	public void setNodoIzquierdo(Nodo nodoIzquierdo) {
		this.nodoIzquierdo = nodoIzquierdo;
	}

	public Nodo[] getListaNodos() {
		return listaNodos;
	}

	public void setListaNodos(Nodo[] listaNodos) {
		this.listaNodos = listaNodos;
	}
	
	
	
}
