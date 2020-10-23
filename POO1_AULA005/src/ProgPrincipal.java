
public class ProgPrincipal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Pessoa objPessoa = new Pessoa();
		objPessoa.setNome("Com encapsulamento");
		objPessoa.setIdade(12);

		System.out.println("Nome:" + objPessoa.getNome());
		System.out.println("Idade" + objPessoa.getIdade());

	}

}
