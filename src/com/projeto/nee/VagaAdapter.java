package com.projeto.nee;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

// Criando um ArrayAdapter customizado para o objeto Vaga
public class VagaAdapter extends ArrayAdapter<Vaga> {
	
	// Construtor do VagaAdapter
	public VagaAdapter(Context context, ArrayList<Vaga> array) {
		super(context, 0, array);	
	}
	
	// Método responsável por carregar os dados no componente 
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View listItemView = convertView;
	        
	        if(listItemView == null) {
	            listItemView = LayoutInflater.from(getContext()).inflate(
	                    R.layout.componente_vaga, parent, false);
	        }
	        
	        // Objeto vaga pegar posição do item
	        Vaga currentVaga = getItem(position);
	        
	        // Criar TextView componente e associá-la ao título da vaga
	        // Depois colocar o conteúdo no componente
	        TextView nameTextView = (TextView) listItemView.findViewById(R.id.titulo_vaga);
	        nameTextView.setText(currentVaga.getTitulo());
	        
	        TextView descricTextView = (TextView) listItemView.findViewById(R.id.descricao_vaga);
	       	descricTextView.setText(currentVaga.getDescricao());
	        
	        TextView salarioView = (TextView) listItemView.findViewById(R.id.salario_vaga);
	        salarioView.setText(currentVaga.getSalario());
	        
	        
	        
		
	        return listItemView;
	}

}
