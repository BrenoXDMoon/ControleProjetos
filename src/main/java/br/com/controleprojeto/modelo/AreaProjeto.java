package br.com.controleprojeto.modelo;

public enum AreaProjeto {
	VIRTUALIZACAO("Virtualizacao"), PLATAFORMA("Plataforma"), INTERCONEXAO("Interconexão");

	private String nome;

	AreaProjeto(String nome) {
		this.setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
