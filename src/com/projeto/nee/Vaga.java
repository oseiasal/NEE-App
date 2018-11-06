package com.projeto.nee;

import java.io.Serializable;
import java.util.ArrayList;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class Vaga implements OnClickListener, Serializable {

	public String titulo;
	public String descricao;
	public String salario;

	public Vaga() {

	}

	public Vaga(String vaga, String descric, String valor) {
		super();
		this.titulo = vaga;
		this.descricao = descric;
		this.salario = valor;
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

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	@Override
	public void onClick(View v) {

	}

}
