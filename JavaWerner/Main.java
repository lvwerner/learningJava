import java . util . Scanner ;
public class Main {
	public static void main ( String args []) {
	// Crie o leitor de teclado
		Scanner leitor = new Scanner ( System . in ) ;
		System . out . println (" Digite o seu nome :") ;
		// Todos os caracteres ate o ENTER sera
			// capturado e salvo na variavel nome
			String nome = leitor . nextLine () ;
			System . out . println ("Seu nome : "+ nome ) ;
}
}
