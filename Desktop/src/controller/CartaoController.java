package controller;

import java.util.HashSet;
import java.util.Set;

import model.CartaoCredito;

public class CartaoController {
	private static Set<CartaoCredito> Cartao = new HashSet<CartaoCredito>();
	
	public static boolean cadastraCartao(String numCartao, String codSeguranca, String dataValidade) {
		if(camposPreenchidos(numCartao, codSeguranca, dataValidade)) {
			return Cartao.add(new CartaoCredito(numCartao, codSeguranca, dataValidade));
		}else {
			return false;
		}
	}
	
	
	public static boolean camposPreenchidos(String numCartao, String codSeguranca, String dataValidade) {
		return(!numCartao.trim().isEmpty() && !codSeguranca.trim().isEmpty() && !dataValidade.trim().isEmpty());
	}

}
