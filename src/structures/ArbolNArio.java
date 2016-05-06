package structures;

public class ArbolNArio {
	
	private Nodo raiz;
	
	private int indiceRaiz = 0;
	
	public ArbolNArio(){
		this.raiz = new Nodo(null);
	}

	public Nodo adicionarNodo(Nodo nodo){
		this.raiz.resizeListNodes();
		int indexNodo = this.raiz.getListaNodos().length - 1;
		
		Nodo []  newList = this.raiz.getListaNodos();
		newList[indexNodo] = nodo;
		return newList[indexNodo];
	}
	
	public Nodo adicionarNodo(Nodo parent, Nodo nodo){
		parent.resizeListNodes();
		int indexNodo = parent.getListaNodos().length - 1;
		
		Nodo []  newList = parent.getListaNodos();
		newList[indexNodo] = nodo;
		return newList[indexNodo];
	}
	
	
	public int recorrerNodos(Nodo [] lista, int index, int numeroNodos){
		
		
		if( lista == null || index == numeroNodos)
			return -1;
		
		for(Nodo nodo : lista){
			System.out.println(nodo.getValue().toString() + " " + nodo.getSecondValue().toString());
		}
		
		if(lista!=null && lista[index].getListaNodos()!=null && lista[index].getListaNodos().length > 0){
			
			return recorrerNodos(lista[index].getListaNodos(), 0, lista[index].getListaNodos().length);
		}
		else{
			
			indiceRaiz++;
			return recorrerNodos(this.raiz.getListaNodos(), indiceRaiz, this.raiz.getListaNodos().length);
		}
		
		
	}
	
	public void recorrerNodos(){
		indiceRaiz = 0;
		recorrerNodos(this.raiz.getListaNodos(), indiceRaiz, this.raiz.getListaNodos().length);
		
	}

	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
}
