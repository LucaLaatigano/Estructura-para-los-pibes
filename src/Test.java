import java.util.Scanner;
public class Test {
	public static void main(String[] args){

		Scanner entrada=new Scanner(System.in);
		clsDecoText texto;
		texto=new clsDecoText(entrada.next());
		System.out.println(texto.decodificar());
		
		entrada.close();
		
		
	}
}
