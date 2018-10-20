package com.projeto.nee;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 *  Esta Classe é responsável pela tela de vagas.
 *  
 */

public class TelaVaga extends Activity implements OnItemClickListener {

	//Intent inter = new Intent();
	ArrayList<Vaga> listaDeVagas = new ArrayList<Vaga>();
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_tela1);
		setContentView(R.layout.activity_tela_de_vagas);
		
		// Criar um ArrayList para as vagas e depois adicionar as vagas nesse array
		
		
		listaDeVagas.add(new Vaga("Pedreiro", "Venha trabalhar no PAC do governo Dilma", "R$1205,00"));
		listaDeVagas.add(new Vaga("Eletricista", "Precisamos de eletricistas", "R$1500,00"));
		listaDeVagas.add(new Vaga("Engenheiro", "Venha trabalhar no PAC do governo Dilma", "R$30000,00"));
		listaDeVagas.add(new Vaga("Auxiliar de Reprodução", "Precisamos de você para reproduzir discos", "R$2500,00"));
		
		//Criar um adapter
		VagaAdapter adapter = new VagaAdapter(this, listaDeVagas);
		
		
		//Criar o componente list view e associá-lo			
		ListView listaVaga = new ListView(this);
		listaVaga = (ListView) findViewById(R.id.listViewVagas);
		
		listaVaga.setOnItemClickListener(this);
		
		listaVaga.setAdapter(adapter);
		
	}
	

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// Cria uma nova intenção de abrir a tela 
		
				//listaDeVagas.get(position);
				Intent novaTela = new Intent(this, DetalhesVaga.class);	
				novaTela.putExtra("TITULO", listaDeVagas.get(position).titulo);
				novaTela.putExtra("DESCRICAO", listaDeVagas.get(position).descricao);
				novaTela.putExtra("SALARIO", listaDeVagas.get(position).salario);
				
				startActivity(novaTela);
		
	}
}
