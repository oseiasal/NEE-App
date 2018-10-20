package com.projeto.nee;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;

/**
 * Classe respons�vel pela tela de login.
 * 
 */

public class Tela1 extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);

		
		TextView user = (TextView) findViewById(R.id.login);

		Button botao1 = (Button) findViewById(R.id.btnLogar);
		botao1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
						
				TelaNova();
				

			}
		});

		Button botao2 = (Button) findViewById(R.id.btnCadastrar);
		
		botao2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				TelaCadastro();

			}
		});
	}

	
	// TODO: Criar login
	protected void TelaNova() {
		// Cria uma nova inten��o de abrir a tela
		Intent novaTela = new Intent(this, TelaVaga.class);
		startActivity(novaTela);
	}

	// Tela de cadastro
	protected void TelaCadastro() {
		// Cria uma nova inten��o de abrir a tela
		Intent novaTela = new Intent(this, TelaCadastro.class);
		startActivity(novaTela);
	}
	
	// Fun��o n�o utilizada
	@Override
	public void onClick(View v) {

	}

}
