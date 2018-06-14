package model;

public class CartaoCredito { 
	 
	  private String numCartao; 
	  private String codSeguranca; 
	  private String dataValidade; 
	   
	   
	  public CartaoCredito(String numCartao, String codSeguranca, String dataValidade) { 
	    this.numCartao = numCartao;  
	    this.codSeguranca = codSeguranca;  
	    this.dataValidade = dataValidade; 
	  } 
	   
	  public String getNumCard() { 
	    return numCartao; 
	  } 
	 
	  public String getcodSeguranca() { 
	    return codSeguranca; 
	  } 
	   
	  public String getdataValidade() { 
	    return dataValidade; 
	  } 
	}