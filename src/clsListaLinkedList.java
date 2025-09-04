
public class clsListaLinkedList {
	private clsNode tope, lista;
	
	clsListaLinkedList(){
		limpiaLista();
	}
	
	boolean estaVacia(){
		return (lista==null);
	}
	

	void limpiaLista(){
		this.tope=this.lista=null;;
	}
	
	
	// inserta elemento a la derecha
	void insertaFin(Object objElemento){
		if (!estaVacia()){
			this.lista.setNextNode(new clsNode(objElemento));
			this.lista=this.lista.getNextNode();
		}else{
			this.tope = this.lista=new clsNode(objElemento);			
		}
	}	

	// elimina elemento ubicado m�s a la derecha
	void eliminaFin(){
		if (!estaVacia()){
			if (this.lista==this.tope){
				// un solo elemento
				limpiaLista();
			}else{
				clsNode temp;
				for (temp=this.tope;temp.getNextNode()!=lista;temp=temp.getNextNode());
				this.lista=temp;
				this.lista.setNextNode(null);			
			}
		}else{
			System.out.println("Error eliminaFin. Lista vacia");			
		}
	}		

	
	// inserta elemento a la izq
	void insertaTope(Object objElemento){
		if (!estaVacia()){
			this.tope = new clsNode(objElemento,this.tope);		
		}else{
			this.tope = this.lista=new clsNode(objElemento);			
		}
	}	

	
	// elimina elemento ubicado m�s a la izq
	void eliminaTope(){
		if (!estaVacia()){
			if (this.lista==this.tope){
				// un solo elemento
				limpiaLista();
			}else{
				this.tope=this.tope.getNextNode();			
			}
		}else{
			System.out.println("Error eliminaTope. Lista vacia");			
		}
	}	
	
	
	void muestra(){
		clsNode temp;		
		if (!estaVacia()){
			temp=this.tope;
			while (temp!=null){
				System.out.println("Elemento " + temp.getNodeInfo().toString());
				temp=temp.getNextNode();
			}			
		}else{
			System.out.println("Error muestra. Lista vacia");
		}		
	}
    public boolean valorEnLista(Object  objElemento) {
        clsNode temp;
        if (!estaVacia()) {
            temp = this.tope;
            while (temp != null) {
                if (temp.getNodeInfo().equals(objElemento)) {
                    return true;
                }
                temp = temp.getNextNode();

            }
        }
        return false;
    }
    public int longitud () {
        clsNode temp;
        int x = 0;
        if (!estaVacia()) {
            temp = this.tope;
            while (temp != null ) {
                x += 1;
                temp = temp.getNextNode();

            }
        }
        return x;
    }

    public void rotar(int cant,String direccion) {
        for (int i = 0;i<cant;i++) {
            if (direccion.equals('d')) {
                clsNode aux = this.tope;
                clsNode ant = aux;
                while(aux.getNextNode() != null) {
                    ant = aux;
                    aux = aux.getNextNode();
                }
                ant.setNextNode(null);
                aux.setNextNode(this.tope);
                this.tope = aux;
            }else {
                clsNode seg = this.tope.getNextNode();
                clsNode ultimo = this.tope;
                while(ultimo.getNextNode() != null) {
                    ultimo = ultimo.getNextNode();
                }
                ultimo.setNextNode(this.tope);
                this.tope.setNextNode(null);
                this.tope = seg;


            }

        }


    }
    public int mayor() {
        if (estaVacia()) {
            throw new IllegalStateException("Error mayor. Lista vacia");
        }
        clsNode temp = this.tope;
        int mayor = ((Integer) temp.getNodeInfo()).intValue();
        temp = temp.getNextNode();
        while (temp != null) {
            int valor = ((Integer) temp.getNodeInfo()).intValue();
            if (valor > mayor) {
                mayor = valor;
            }
            temp = temp.getNextNode();
        }
        return mayor;
    }
    public int menor() {
        if (estaVacia()) {
            throw new IllegalStateException("Error menor. Lista vacia");
        }
        clsNode temp = this.tope;
        int menor = ((Integer) temp.getNodeInfo()).intValue();
        temp = temp.getNextNode();
        while (temp != null) {
            int valor = ((Integer) temp.getNodeInfo()).intValue();
            if (valor < menor) {
                menor = valor;
            }
            temp = temp.getNextNode();
        }
        return menor;
    }

    public void mezclarListas(clsNode lista1){
        clsNode listaAux;


    }



	
	clsNode getTope(){return tope;}
}
