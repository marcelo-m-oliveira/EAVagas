package model;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Estacionamento {
	private static final int vagas = 20;
	private static final String nome = "EA Estacionamento";
	private Date horario;
	
	public Estacionamento (Date horario, int vagas) {
		this.horario = horario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVagas() {
		return vagas;
	}
	
	public String getHorario() {
		this.horario = new Date();
		SimpleDateFormat D1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return  D1.format(horario);
	}
		
}


