
public class clsTest {

	public static void main(String[] args) {

		
		clsListaLinkedList objLista = new clsListaLinkedList();
		Integer objInt1,objInt2,objInt3;
		
		objInt1=new Integer(30);
		objInt2=new Integer(50);
		objInt3=new Integer(-4);
		
/*		objLista.insertaFin(objInt1);
		objLista.insertaFin(objInt2);
		objLista.insertaFin(objInt3);
	
		objLista.muestra();
		
		objLista.eliminaFin();
		objLista.eliminaFin();
		objLista.muestra();

		objLista.eliminaFin();
		objLista.eliminaFin();

		objLista.muestra();
	*/	
		
		
		objLista.insertaTope(objInt1);
		objLista.insertaTope(objInt2);
		objLista.insertaTope(objInt3);
	
		objLista.muestra();
		
		objLista.eliminaTope();
		objLista.muestra();
				
		objLista.eliminaTope();
		objLista.eliminaTope();
		objLista.eliminaTope();
		objLista.muestra();
		
		
		
	}

}
