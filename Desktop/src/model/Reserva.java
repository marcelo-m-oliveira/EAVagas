package model;
import java.util.Date;

public class Reserva extends Vaga{
	
	private static Date horaRes;
	
	
	public Reserva(Date horaRes, Date tempVaga) {
		super(tempVaga, 0, tempVaga);
		this.horaRes = horaRes;
	}
	
	public static Date gethoraRes() {
		return horaRes;
	}

}
