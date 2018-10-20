package com.projeto.nee;

import java.io.Serializable;
import java.util.ArrayList;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class Vaga implements OnClickListener, Serializable {
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	public String titulo;
	public String descricao;
	public String salario;
	
	public Vaga(String vaga, String descric, String valor) {
		
		titulo = vaga;
		descricao = descric;
		salario = valor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public String getSalario() {
		return salario;
	}

	@Override
	public void onClick(View v) {
		
		
	}
	


}
