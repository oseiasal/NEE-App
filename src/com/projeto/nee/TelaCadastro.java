package com.projeto.nee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class TelaCadastro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro1);

		// Botão de avançar a tela
		Button btnNext = (Button) findViewById(R.id.ProximaTela);
		btnNext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Componentes que estão com os dados
				TextView nomeNovoUsuario = (TextView) findViewById(R.id.nomeCadastro);
				TextView enderecoUsuario = (TextView) findViewById(R.id.enderecoCadastro);
				TextView bairroNovoUsuario = (TextView) findViewById(R.id.bairroCadastro);
				TextView cidadeNovoUsuario = (TextView) findViewById(R.id.cidadeCadastro);
				TextView estadoNovoUsuario = (TextView) findViewById(R.id.estadoCadastro);
				TextView cpfNovoUsuario = (TextView) findViewById(R.id.cpfCadastro);

				// Nova Activity
				Intent novaTela = new Intent(TelaCadastro.this, TelaCadastro2.class);
				
				//Passar os dados para a Activity
				novaTela.putExtra("NOME", nomeNovoUsuario.getText().toString());
				novaTela.putExtra("ENDERECO", enderecoUsuario.getText().toString());
				novaTela.putExtra("BAIRRO", bairroNovoUsuario.getText().toString());
				novaTela.putExtra("CIDADE", cidadeNovoUsuario.getText().toString());
				novaTela.putExtra("ESTADO", estadoNovoUsuario.getText().toString());
				novaTela.putExtra("CPF", cpfNovoUsuario.getText().toString());

				// Iniciar a Activity
				startActivity(novaTela);

			}
		});

	}

}
