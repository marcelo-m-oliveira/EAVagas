package model;

public class Veiculos {
	private String placaVeic;
	private String tipoVeic;
	private Pessoas Pe1;
	
	public Veiculos (String placaVeic, String tipoVeic) {
		this.placaVeic = placaVeic; 
		this.tipoVeic = tipoVeic;
	}
	
	public String getPlacaVeic() {
		return placaVeic;
	}
	
	public String getTipoVeic() {
		return tipoVeic;
	}
}
