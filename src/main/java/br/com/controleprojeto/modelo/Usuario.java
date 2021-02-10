package br.com.controleprojeto.modelo;

import jakarta.persistence.Entity;

@Entity
public class Usuario{

	
	private boolean admin;
	private boolean projetoPlataforma;
	private boolean projetoVirtualizacao;
	private boolean projetoInter;
	private String nomeUser;
	private String senhaUser;
	private String re;
	
	
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public boolean isProjetoPlataforma() {
		return projetoPlataforma;
	}
	public void setProjetoPlataforma(boolean projetoPlataforma) {
		this.projetoPlataforma = projetoPlataforma;
	}
	public boolean isProjetoVirtualizacao() {
		return projetoVirtualizacao;
	}
	public void setProjetoVirtualizacao(boolean projetoVirtualizacao) {
		this.projetoVirtualizacao = projetoVirtualizacao;
	}
	public boolean isProjetoInter() {
		return projetoInter;
	}
	public void setProjetoInter(boolean projetoInter) {
		this.projetoInter = projetoInter;
	}
	public String getNomeUser() {
		return nomeUser;
	}
	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}
	public String getSenhaUser() {
		return senhaUser;
	}
	public void setSenhaUser(String senhaUser) {
		this.senhaUser = senhaUser;
	}
	public String getRe() {
		return re;
	}
	public void setRe(String re) {
		this.re = re;
	}
}
