package com.projeto.nee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.*;
import android.view.View.OnClickListener;
import android.widget.*;
import conexao.sql.Conector;

public class Tela1 extends Activity implements OnClickListener {

	// Conexao 1
	Connection conectar = Conector.getConnection();
	EditText login;
	EditText senha;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela1);

		// Componentes
		login = (EditText) findViewById(R.id.login);
		senha = (EditText) findViewById(R.id.password);
		Button botao1 = (Button) findViewById(R.id.btnLogar);
		Button botao2 = (Button) findViewById(R.id.btnCadastrar);

		botao1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				TelaNova();
			}
		});

		botao2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				TelaCadastro();

			}
		});

	}

	// Iniciar tela de vagas
	public void TelaNova() {

		TextView c = (TextView) findViewById(R.id.loginStatus);

		if (consulta()) {

			login.setText("");
			senha.setText("");
			c.setText("");

			Intent novaTela = new Intent(this, TelaVaga.class);
			startActivity(novaTela);

		} else {

			c.setText("A senha ou o usuário não existem!");

			new CountDownTimer(3000, 1000) {

				public void onTick(long millisUntilFinished) {

				}

				public void onFinish() {
					TextView c = (TextView) findViewById(R.id.loginStatus);
					c.setText("");
				}
			}.start();

		}
	}

	boolean consulta() {
		boolean ok = false;
		String vSql;

		vSql = "select * from estudante where nome = '" + login.getText().toString() + "' and senha ='"
				+ senha.getText().toString() + "'";
		ResultSet rs = null;
		
		// Conexao 2:
		try {

			java.sql.Statement st = conectar.createStatement();
			rs = st.executeQuery(vSql);

			while (rs.next()) {
				ok = true;
			}

		} catch (SQLException erro) {
			ok = false;
		}

		return ok;
	}

	// Tela de cadastro
	public void TelaCadastro() {

		Intent novaTela = new Intent(this, TelaCadastro.class);
		startActivity(novaTela);
	}

	// Função não utilizada
	@Override
	public void onClick(View v) {

	}

}
