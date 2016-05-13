package herramientas;

public class Main {

	public static void main(String[] args) {
	herramienta data = new herramienta();
	
	displayGreeting();
	data.display();

	}
	
	private static void displayGreeting(){
		System.out.print("hola vendedores como estamos!\n");
		System.out.print("esta aplicacion muestra los datos de venta\n");
		
		System.out.print("numero 1\n");
	}

}
