public class Principal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Cientifica objCalculadora = new Cientifica();

		System.out.print("A soma e: " + objCalculadora.soma(3,5));
		System.out.print("\nA subtracao e: " + objCalculadora.subtracao(9,6));
		System.out.print("\nA multiplicacao e: " + objCalculadora.multiplicacao(5,4));
		System.out.print("\nA divisao e: " + objCalculadora.divisao(9,3));
		System.out.print("\nA raiz e: " + objCalculadora.raiz(9));
	}

}