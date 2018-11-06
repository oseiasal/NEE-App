package com.projeto.nee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import conexao.sql.Conector;

public class TelaCadastro2 extends Activity {
	String nomeCompleto, enderecoRua, bairro, cidade, estado, cpf;

	Connection conectar = Conector.getConnection();

	EditText login;
	EditText senha;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro2);

		// Pegar todos os dados da Activity anterior e armazenar em variáveis
		nomeCompleto = getIntent().getExtras().getString("NOME");
		enderecoRua = getIntent().getExtras().getString("ENDERECO");
		bairro = getIntent().getExtras().getString("BAIRRO");
		cidade = getIntent().getExtras().getString("CIDADE");
		estado = getIntent().getExtras().getString("ESTADO");
		cpf = getIntent().getExtras().getString("CPF");

		// Pegar os dados dos campos da tela atual

		EditText instituicao = (EditText) findViewById(R.id.instituicao);
		EditText curso = (EditText) findViewById(R.id.curso);
		EditText semestre = (EditText) findViewById(R.id.semestre);
		EditText dataConclu = (EditText) findViewById(R.id.dataConclui);
		login = (EditText) findViewById(R.id.loginNovo);
		senha = (EditText) findViewById(R.id.senhaNova);

		Button btnBD = (Button) findViewById(R.id.btnSalvarBd);
		btnBD.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				if (gravarNoBD()) {

					Intent novaTela = new Intent(TelaCadastro2.this, Tela1.class);
					startActivity(novaTela);
				}

			}
		});

		Button btnClose = (Button) findViewById(R.id.btnClose);

		btnClose.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent novaTela = new Intent(TelaCadastro2.this, Tela1.class);
				startActivity(novaTela);

			}
		});
	}

	boolean gravarNoBD() {
		boolean ok = false;

		String vSql = "insert into estudante (id_faculdade, nome, telefone, cpf, senha)" + "values (1, '"
				+ login.getText().toString() + "', 46412179," + cpf.toString() + ", '" + senha.getText().toString()
				+ "')";

		ResultSet rs = null;

		try {

			java.sql.Statement st = conectar.createStatement();
			rs = st.executeQuery(vSql);

		} catch (SQLException error) {

		}

		return ok;
	}
}
