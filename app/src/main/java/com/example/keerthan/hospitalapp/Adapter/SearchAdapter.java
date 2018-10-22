package com.example.keerthan.hospitalapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.keerthan.hospitalapp.Model.Hospital;
import com.example.keerthan.hospitalapp.R;

import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{
    public TextView name,address,phone;

    public SearchViewHolder(@NonNull View itemView) {
        super(itemView);
        name=(TextView)itemView.findViewById(R.id.hosp_nam);
        address=(TextView)itemView.findViewById(R.id.addres);
        phone=(TextView)itemView.findViewById(R.id.phn_num);


    }
}
public class SearchAdapter  extends RecyclerView.Adapter<SearchViewHolder>{
    private Context context;
    private List<Hospital> hospitals;

    public SearchAdapter(Context context, List<Hospital> hospitals) {
        this.context = context;
        this.hospitals = hospitals;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View itemView =inflater.inflate(R.layout.layout_item,parent,false);
        return new SearchViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        holder.name.setText(hospitals.get(position).getHosp_name());
        holder.address.setText(hospitals.get(position).getAddres());
    }

    @Override
    public int getItemCount() {
        return hospitals.size();
    }
}
