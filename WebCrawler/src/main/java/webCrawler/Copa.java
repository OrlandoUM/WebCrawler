package webCrawler;

public class Copa {
	
	public String sede;
	public String data;
	public String campeao;
	public String vice;
	public String terceiro;
	public String quarto;
	public int mediaPublico;
	

	public Copa() {
		this.sede = "";
		this.data = "";
		this.campeao = "";
		this.vice = "";
		this.terceiro = "";
		this.quarto = "";
		this.mediaPublico = 0;
	}
	
	
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
	public int getMediaPublico() {
		return mediaPublico;
	}
	public void setMediaPublico(int mediaPublico) {
		this.mediaPublico = mediaPublico;
	}
	
	
	
}