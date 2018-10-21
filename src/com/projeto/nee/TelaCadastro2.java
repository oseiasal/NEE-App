package com.projeto.nee;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class TelaCadastro2 extends Activity {
	String nomeCompleto, enderecoRua, bairro, cidade, estado, cpf;

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
		EditText login = (EditText) findViewById(R.id.loginNovo);
		EditText senha = (EditText) findViewById(R.id.senhaNova);
		
		Button btnBD = (Button) findViewById(R.id.btnSalvarBd);
		
		
		// Agora pegar os dados acima e mandar para um objeto ou para o banco de dados

	}
}
