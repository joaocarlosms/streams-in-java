package challenge2;

public class Person {
	private Integer id;
	private String nome;
	private String email;
	private String cpf;
	private Integer idade;
	
	public Person(Integer id, String nome, String email, String cpf, Integer idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public Person() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getidade() {
		return idade;
	}

	public void setidade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + nome + ", email=" + email + ", cpf=" + cpf + ", idade=" + idade + "]";
	}
}
