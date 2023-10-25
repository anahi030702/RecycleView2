package com.example.recycleview2.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview2.Models.Carro;
import com.example.recycleview2.R;

import java.util.List;

public class CarroAdapter extends RecyclerView.Adapter<CarroAdapter.CarroHolder> {

    private List<Carro> listacarros;

    public CarroAdapter(List<Carro> listacarros){
        this.listacarros = listacarros;
    }

    @NonNull
    @Override
    public CarroAdapter.CarroHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View view = ly.inflate(R.layout.itemcarro, parent, false);

        return new CarroHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarroAdapter.CarroHolder holder, int position) {
        Carro c = listacarros.get(position);
        holder.setdata(c);
    }

    @Override
    public int getItemCount() {
        return listacarros.size();
    }

    public class CarroHolder extends RecyclerView.ViewHolder {

        TextView tvcolor;
        TextView tvmodelo;

        Carro carro;
        public CarroHolder(@NonNull View itemView) {
            super(itemView);

            tvcolor=itemView.findViewById(R.id.tvColor);
            tvmodelo = itemView.findViewById(R.id.tvModelo);

        }

        public void setdata(Carro c) {
            carro = c;
            tvcolor.setText(c.getColor());
            tvmodelo.setText(c.getModelo());
        }
    }
}
