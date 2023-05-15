package estado_civil;

public class Teste {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("dudu");
		pessoa.setNome_mae("andrea");
		pessoa.setNome_pai("francisco");
		pessoa.setDia(15);
		pessoa.setMes(07);
		pessoa.setAno(2003);
		pessoa.setNacionalidade(Nacionalidade.BR);
		pessoa.setEstado_civil(Estado_civil.CASADO);
		pessoa.setSexo(Sexo.MASCULINO);
		
		System.out.println("O nome é: " + pessoa.getNome());	
		System.out.println("O nome da mae é: " + pessoa.getNome_pai());
		System.out.println("O nome do pai é: " + pessoa.getNome_mae());
		System.out.println("Nasceu em: " + pessoa.getDia() + "/" + pessoa.getMes() + "/" + pessoa.getAno());
		System.out.println("Nacionalidade: " + pessoa.getNacionalidade());
		System.out.println("Sexo: " + pessoa.getSexo());
		System.out.println("Estado civil: " + pessoa.getEstado_civil() + "(a)");
		
	}
	
}
