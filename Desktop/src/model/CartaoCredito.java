package model;

public class CartaoCredito { 
	 
	  private int numCartao; 
	  private int codSeguranca; 
	  private int dataValidade; 
	   
	   
	  public CartaoCredito(int numCartao, int codSeguranca, int dataValidade) { 
	    this.numCartao = numCartao;  
	    this.codSeguranca = codSeguranca;  
	    this.dataValidade = dataValidade; 
	  } 
	   
	  public int getNumCard() { 
	    return numCartao; 
	  } 
	 
	  public int getcodSeguranca() { 
	    return codSeguranca; 
	  } 
	   
	  public int getdataValidade() { 
	    return dataValidade; 
	  } 
	}