
public class Gerente extends Funcionario implements Autenticavel{
	private int senha = 123;
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha!=senha){
			System.out.println("Senha Incorreta!");
			return false;
		} 
		System.out.println("Senha Correta!");
		return true;
	}

}
