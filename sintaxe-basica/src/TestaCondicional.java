
public class TestaCondicional {
	public static void main(String[] args) {
		
		int idade = 16;
		int quantidade =1;
		boolean acompanhado = quantidade >= 2;
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
