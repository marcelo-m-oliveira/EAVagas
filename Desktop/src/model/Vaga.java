package model;

import java.util.Date;

public class Vaga extends Estacionamento {
	private Date tempVaga;
	
	
	public Vaga (Date tempVaga, int vagas, Date horario) {
		super(horario, vagas);
		this.tempVaga = tempVaga;
	}
	
	public Date getTempVaga() {
		return tempVaga;
	}
}
