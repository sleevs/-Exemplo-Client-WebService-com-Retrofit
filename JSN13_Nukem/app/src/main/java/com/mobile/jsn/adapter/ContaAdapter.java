package com.mobile.jsn.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mobile.jsn.entidade.ContaDto;
import com.mobile.jsn.jsn13_nukem.R;

import java.util.ArrayList;

/**
 * Created by ADMINIBM on 01/06/2017.
 */

public class ContaAdapter extends RecyclerView.Adapter<ContaAdapter.ViewHolder> {
    private ArrayList<ContaDto> android;

    public ContaAdapter(ArrayList<ContaDto> android) {

        this.android = android;
    }

    @Override
    public ContaAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_conta, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContaAdapter.ViewHolder viewHolder, int i) {

        viewHolder.nome.setText(android.get(i).getContaNome());
        viewHolder.sobrenome.setText(android.get(i).getContaSobrenome());
        viewHolder.tipo.setText(android.get(i).getContaTipo());
    }

    @Override
    public int getItemCount() {
        return android.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView nome,sobrenome,tipo;
        public ViewHolder(View view) {
            super(view);

            nome = (TextView)view.findViewById(R.id.nome);
            sobrenome = (TextView)view.findViewById(R.id.sobrenome);
            tipo = (TextView)view.findViewById(R.id.tipo);

        }
    }

}