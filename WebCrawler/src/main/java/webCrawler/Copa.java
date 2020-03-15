package webCrawler;

public class Copa {
	
	public String sede;
	public int ano;
	public String campeao; 
	public String vice;
	public String terceiro;
	public String quarto;
	public int publicoTotal;
	

	public Copa() {
		this.sede = "";
		this.ano = 0;
		this.campeao = "";
		this.vice = "";
		this.terceiro = "";
		this.quarto = "";
		this.publicoTotal = 0;
	}
	
	
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCampeao() {
		return campeao;
	}
	public void setCampeao(String campeao) {
		this.campeao = campeao;
	}
	public String getVice() {
		return vice;
	}
	public void setVice(String vice) {
		this.vice = vice;
	}
	public String getTerceiro() {
		return terceiro;
	}
	public void setTerceiro(String terceiro) {
		this.terceiro = terceiro;
	}
	public String getQuarto() {
		return quarto;
	}
	public void setQuarto(String quarto) {
		this.quarto = quarto;
	}
	public float getPublicoTotal() {
		return publicoTotal;
	}
	public void setPublicoTotal(int publicoTotal) {
		this.publicoTotal = publicoTotal;
	}
	
	
	
}
