package com.mobile.jsn.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.mobile.jsn.jsn13_nukem.R;

import static com.mobile.jsn.jsn13_nukem.R.id.imagem;
import static com.mobile.jsn.jsn13_nukem.R.id.texto_cardview;

/**
 * Created by ADMINIBM on 21/05/2017.
 */

public class RecyclerViewPrincipalAdapter extends RecyclerView.Adapter<RecyclerViewPrincipalAdapter.ViewHolder> {



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_principal, parent, false);

        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder ;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.itemTexto.setText(position);
        holder.itemImagem.setImageResource(position);


    }

    @Override
    public int getItemCount() {
        return 0;
    }


    class ViewHolder extends RecyclerView.ViewHolder{


        public int itemAtual ;
        public ImageView itemImagem ;
        public TextView itemTexto ;

        public ViewHolder(View itemView){
            super(itemView);

            itemImagem = (ImageView) itemView.findViewById(imagem);
            itemTexto = (TextView) itemTexto.findViewById(texto_cardview);





        }

    }


}
