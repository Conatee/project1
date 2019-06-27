package com.example.project1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{
    private ArrayList<ContactData> mDataset;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView name, number;

        //ViewHolder
        public MyViewHolder(View view) {
            super(view);
            name = (TextView) view.findViewById(R.id.name);
//            number = (TextView) view.findViewById(R.id.number);
        }
    }

    public RecyclerAdapter(ArrayList<ContactData> myData){
        this.mDataset = myData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, int position) {

        holder.name.setText(mDataset.get(position).getName());
//        holder.number.setText(mDataset.get(position).getNumber());

    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}