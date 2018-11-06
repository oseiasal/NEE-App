package com.projeto.nee;

import java.sql.*;
import java.util.ArrayList;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import conexao.sql.Conector;
import android.widget.ListView;

public class TelaVaga extends Activity implements OnItemClickListener {
	//

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tela_de_vagas);

		// Criar um adapter
		VagaAdapter adapter = new VagaAdapter(this, mode());

		// Criar o componente list view e associá-lo
		ListView listaVaga = new ListView(this);
		listaVaga = (ListView) findViewById(R.id.listViewVagas);
		listaVaga.setOnItemClickListener(this);
		listaVaga.setAdapter(adapter);

	}

	public ArrayList<Vaga> mode() {

		ArrayList<Vaga> listaDeVagas = new ArrayList<Vaga>();

		Connection conectar = Conector.getConnection();
		ResultSet rs = null;

		try {

			Statement stm = conectar.createStatement();
			rs = stm.executeQuery("select * from vagas");

			while (rs.next()) {

				Vaga item = new Vaga();

				item.setTitulo(rs.getString("titulo"));
				item.setDescricao(rs.getString("descricao"));
				item.setSalario(rs.getString("salario"));

				listaDeVagas.add(item);
			}

		} catch (Exception e) {

			Vaga item = new Vaga();
			item.setTitulo("Falhou");
			item.setDescricao("Erro desconhecido");
			listaDeVagas.add(item);

			Log.e("BANCO", "Listar:" + e.getMessage());

		}

		return listaDeVagas;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// Cria uma nova intenção de abrir a tela

		// listaDeVagas.get(position);
		Intent novaTela = new Intent(this, DetalhesVaga.class);
		novaTela.putExtra("TITULO", mode().get(position).titulo);
		novaTela.putExtra("DESCRICAO", mode().get(position).descricao);
		novaTela.putExtra("SALARIO", mode().get(position).salario);

		startActivity(novaTela);

	}
}
