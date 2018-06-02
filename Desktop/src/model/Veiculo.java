package model;

public class Veiculo {
	private String placaVeic;
	private String tipoVeic;
	private Pessoa Pe1;
	
	public Veiculo (String placaVeic, String tipoVeic) {
		this.placaVeic = placaVeic; 
		this.tipoVeic = tipoVeic;
	}
	
	public String getPlacaVeic() {
		return placaVeic;
	}
	
	public void setPlacaVeic() {
		
	}
	
	public String getTipoVeic() {
		return tipoVeic;
	}
}
