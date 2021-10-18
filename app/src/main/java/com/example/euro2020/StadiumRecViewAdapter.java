package com.example.euro2020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.TransitionManager;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class StadiumRecViewAdapter extends RecyclerView.Adapter<StadiumRecViewAdapter.ViewHolder> {

    private ArrayList<Stadium> stadiums = new ArrayList<>();
    private Context context;

    public StadiumRecViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_stadium,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  StadiumRecViewAdapter.ViewHolder holder, int position) {
        holder.txtStadiumName.setText(stadiums.get(position).getName());
        Glide.with(context)
                .asBitmap()
                .load(stadiums.get(position).getImageUrl())
                .into(holder.imgStadium);
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, stadiums.get(position).getName() +" Selected", Toast.LENGTH_SHORT).show();
            }
        });

        holder.cityText.setText(stadiums.get(position).getCity());
        holder.countryText.setText(stadiums.get(position).getCountry());
        holder.capacityText.setText(stadiums.get(position).getCapacity());


        if (stadiums.get(position).isExpanded()){
            TransitionManager.beginDelayedTransition(holder.parent);
            holder.expandedRelLayout.setVisibility(View.VISIBLE);
            holder.downArrow.setVisibility(View.GONE);
        } else {
            TransitionManager.beginDelayedTransition((holder.parent));
            holder.expandedRelLayout.setVisibility(View.GONE);
            holder.downArrow.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return stadiums.size();
    }

    public void setStadiums(ArrayList<Stadium> stadiums) {
        this.stadiums = stadiums;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private CardView parent;
        private ImageView imgStadium;
        private TextView txtStadiumName;
        private ImageView downArrow, upArrow;
        private RelativeLayout expandedRelLayout, collapsedRelLayout;
        private TextView cityText, countryText, capacityText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            imgStadium = itemView.findViewById(R.id.imgStadium);
            txtStadiumName = itemView.findViewById(R.id.txtStadiumName);
            downArrow = itemView.findViewById(R.id.btnDownArrow);
            upArrow = itemView.findViewById(R.id.btnUpArrow);
            expandedRelLayout = itemView.findViewById(R.id.expandedRelLayout);
            collapsedRelLayout = itemView.findViewById(R.id.collapsedRelLayout);
            cityText = itemView.findViewById(R.id.cityText);
            countryText = itemView.findViewById(R.id.countryText);
            capacityText = itemView.findViewById(R.id.capacityText);

            downArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Stadium stadium = stadiums.get(getAdapterPosition());
                    stadium.setExpanded(!stadium.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

            upArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Stadium stadium = stadiums.get(getAdapterPosition());
                    stadium.setExpanded(!stadium.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
