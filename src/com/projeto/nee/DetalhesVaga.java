package com.projeto.nee;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesVaga extends Activity {
	
	String tituloDaVaga, descricaoDaVaga, salario;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detalhes_vaga);
		
		// TODO fazer para as outras TextViews
		tituloDaVaga = getIntent().getExtras().getString("TITULO");
		descricaoDaVaga = getIntent().getExtras().getString("DESCRICAO");
		salario = getIntent().getExtras().getString("SALARIO");
		
		TextView titulo = (TextView) findViewById(R.id.descriDaVaga);
		TextView descri = (TextView) findViewById(R.id.detalhesDaVaga);
		TextView salarioVaga = (TextView) findViewById(R.id.bolsaDaVaga);
		
		titulo.setText(tituloDaVaga);
		descri.setText(descricaoDaVaga);
		salarioVaga.setText(salario);
		
		
	}
}
