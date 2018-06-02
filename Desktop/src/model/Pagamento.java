package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pagamento {
	private Date hrpagamento;
	private UsuarioPremium Us1;
	
	public Pagamento (Date hrpagamento) {
		this.hrpagamento = hrpagamento;
	}
	
	public String getHrPagamento() {
		this.hrpagamento = new Date();
		SimpleDateFormat D1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return  D1.format(hrpagamento);
	}
}
