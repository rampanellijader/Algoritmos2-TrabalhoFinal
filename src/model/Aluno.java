package model;

public class Aluno {
	
	private String matricula =null;
	private String name = null;
	private String email = null;
	private int idade = 0;
	private String sexo = null;
	private String empresa = null;
	private String cidade = null;

	
	public Aluno(String name, String email, int idade, String cidade) {
		//this.matricula = matricula;
		this.name = name;
		this.email = email;
		//this.sexo = sexo;
		this.idade = idade;
		//this.empresa = empresa;
		this.cidade = cidade;
		
	}
	
	
     
	public Aluno() {
		// TODO Auto-generated constructor stub
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public void setCidade(String cidade) {
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
		public int getIdade() {
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
