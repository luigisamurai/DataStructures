import structures.ArbolNArio;
import structures.Nodo;

public class Main {

	public static void main(String[] args) {
		
		ArbolNArio raiz = new ArbolNArio();
		Nodo dpt1 = raiz.adicionarNodo(new Nodo("1","Valle"));
		Nodo dpt2 = raiz.adicionarNodo(new Nodo("2","Antioquia"));
		
		Nodo ciudad1 = raiz.adicionarNodo(dpt1, new Nodo("1.1","Cali"));
		Nodo barrio1 = raiz.adicionarNodo(ciudad1, new Nodo("1.1.1","Santa Rita"));
		Nodo barrio2 = raiz.adicionarNodo(ciudad1, new Nodo("1.1.2","Lopez"));
		Nodo barrio3 = raiz.adicionarNodo(ciudad1, new Nodo("1.1.3","Manzanares"));
		
		Nodo ciudad2 = raiz.adicionarNodo(dpt2, new Nodo("2.1","Medellin"));
		Nodo barrio4 = raiz.adicionarNodo(ciudad2, new Nodo("2.1.1","Poblado"));
		Nodo barrio5 = raiz.adicionarNodo(ciudad2, new Nodo("2.1.2","Centro"));
		Nodo barrio6 = raiz.adicionarNodo(ciudad2, new Nodo("2.1.3","Distrito Capital"));
		
		Nodo producto1 = raiz.adicionarNodo(barrio1, new Nodo("1.1.1.1","Arroz"));
		Nodo producto2 = raiz.adicionarNodo(barrio1, new Nodo("1.1.1.2","Azucar"));
		Nodo producto3 = raiz.adicionarNodo(barrio1, new Nodo("1.1.1.3","Cafe"));
		
		Nodo producto4 = raiz.adicionarNodo(barrio4, new Nodo("2.1.1.1","Arroz"));
		Nodo producto5 = raiz.adicionarNodo(barrio4, new Nodo("2.1.1.2","Azucar"));
		Nodo producto6 = raiz.adicionarNodo(barrio4, new Nodo("2.1.1.3","Cafe"));
		
		raiz.recorrerNodos();
		
		System.out.println("");
	}

}
