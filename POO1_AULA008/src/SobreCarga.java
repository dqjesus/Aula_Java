public class SobreCarga
{
	public void obterNome (String nome)
	{
		System.out.println("[Apenas nome] - Seu nome �: " + nome);
	}

	public void obterNome (String nome, String sobrenome)
	{
		System.out.println("[Nome Completo] - Seu nome �: " + nome + " " + sobrenome);
	}
}
