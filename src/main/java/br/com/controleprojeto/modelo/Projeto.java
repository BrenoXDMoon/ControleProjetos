package br.com.controleprojeto.modelo;


public class Projeto{

	protected String item;
	protected String subItem;
	protected String responsavel;
	protected String statusAtual;
	protected String previsaoConclusao;
	protected String modificacaoVersaoAnterior;
	private AreaProjeto area;
	
	public String getItem() {
		return item;
	}
	
	public void setItem(String item) {
		this.item = item;
	}
	
	public String getSubItem() {
		return subItem;
	}
	
	public void setSubItem(String subItem) {
		this.subItem = subItem;
	}
	
	public String getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	public String getStatusAtual() {
		return statusAtual;
	}
	
	public void setStatusAtual(String statusAtual) {
		this.statusAtual = statusAtual;
	}
	
	public String getPrevisaoConclusao() {
		return previsaoConclusao;
	}
	
	public void setPrevisaoConclusao(String previsaoConclusao) {
		this.previsaoConclusao = previsaoConclusao;
	}
	
	public String getModificacaoVersaoAnterior() {
		return modificacaoVersaoAnterior;
	}
	
	public void setModificacaoVersaoAnterior(String modificacaoVersaoAnterior) {
		this.modificacaoVersaoAnterior = modificacaoVersaoAnterior;
	}

	public AreaProjeto getArea() {
		return area;
	}

	public void setArea(AreaProjeto area) {
		this.area = area;
	}
	
}
