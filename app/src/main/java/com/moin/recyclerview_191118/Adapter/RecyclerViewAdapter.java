package com.moin.recyclerview_191118.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moin.recyclerview_191118.Model.Flight;
import com.moin.recyclerview_191118.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<Flight> flightList;

    public RecyclerViewAdapter() {
    }

    public RecyclerViewAdapter(Context context, List<Flight> flightList) {
        this.context = context;
        this.flightList = flightList;
    }



    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        Flight flight = flightList.get(position);
        holder.txtFrom.setText(flight.getFrom());
        holder.txtTo.setText(flight.getTo());
        holder.btnDelete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                flightList.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return flightList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtFrom, txtTo;
        ImageButton btnDelete;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        txtFrom = itemView.findViewById(R.id.From);
        txtTo = itemView.findViewById(R.id.To);
        btnDelete = itemView.findViewById(R.id.btnDelete);


        }


        @Override
        public void onClick(View v) {

        }
    }
}
