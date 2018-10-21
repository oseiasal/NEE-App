package com.projeto.nee;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import pessoas.Empresa;
import pessoas.Estudante;

public class Tela1 extends Activity implements OnClickListener {

	String user, pass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);

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
	public void TelaNova() {
		// 1º digitar usuario e senha
		// 2º pegar o conteudo e pesquisar no banco de dados
		// 3º se a senha o usuario e a senha estiverem no sistema, então abrir tela de
		// vaga
		TextView login = (TextView) findViewById(R.id.login);
		TextView passwd = (TextView) findViewById(R.id.password);

		String a = login.getText().toString();
		String b = (String) passwd.getText().toString();

		if (a.equals("user") && b.equals("1")) {

			Intent novaTela = new Intent(this, TelaVaga.class);
			startActivity(novaTela);
		}
	}

	// Tela de cadastro
	public void TelaCadastro() {
		// Cria uma nova intenção de abrir a tela
		Intent novaTela = new Intent(this, TelaCadastro.class);
		startActivity(novaTela);
	}

	// Função não utilizada
	@Override
	public void onClick(View v) {

	}

}
