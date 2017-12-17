package model;

public class Aluno {
	
	private String matricula;
	private String name;
	private String email;
	private String idade;
	private String sexo;
	private String empresa;
	private String cidade;

	
	public Aluno(String name, String email, String sexo, String idade, String cidade, String matricula, String empresa) {
		this.matricula = matricula;
		this.name = name;
		this.email = email;
		this.sexo = sexo;
		this.idade = idade;
		this.empresa = empresa;
		this.cidade = cidade;
		
	}
	public String getMatricula() {
		return matricula;
	}
	
	public String getName() {
		return name;
	}
	
		public String getEmail() {
		return email;
	}
		public String getIdade() {
			return idade;
	}
		
	public String getSexo() {
		return sexo;
	}
	
	public String getEmpresa() {
		return empresa;
	}
		
	public String getCidade() {
		return cidade;
	}
		
	
	public String toString() {
		return   "Aluno: matrícula:" +matricula+ " nome" + name + " e-mail:" +email+  " idade:"+ idade+ " sexo:"+sexo + " empresa:"+empresa  + " cidade"+cidade;
		
	}
	
}
