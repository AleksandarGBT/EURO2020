package com.example.euro2020;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
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
import java.util.Collection;
import java.util.List;

public class PlayerRecViewAdapter extends RecyclerView.Adapter<PlayerRecViewAdapter.ViewHolder> implements Filterable {

    private ArrayList<Player> players = new ArrayList<>();
    private Context context;
    private List<Player> allPlayers;

    public PlayerRecViewAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public PlayerRecViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_players,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  PlayerRecViewAdapter.ViewHolder holder, int position) {
        holder.txtPlayerName.setText(players.get(position).getName());

        Glide.with(context)
                .asBitmap()
                .load(players.get(position).getImageUrl())
                .into(holder.imgPlayer);
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, players.get(position).getName() + " Selected", Toast.LENGTH_SHORT).show();
            }
        });

        holder.clubText.setText(players.get(position).getClub());
        holder.countryText.setText(players.get(position).getCountry());
        holder.numberText.setText(players.get(position).getNumber());
        holder.bornText.setText(players.get(position).getBorn());
        holder.ageText.setText(players.get(position).getAge());
        holder.positionText.setText(players.get(position).getPosition());


        if (players.get(position).isExpanded()) {
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
        return players.size();
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
        allPlayers = new ArrayList<>(players);
    }

    @Override
    public Filter getFilter() {
        return filter;
    }
    Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Player> filteredList = new ArrayList<>();

            if (constraint.toString().isEmpty()){
                filteredList.addAll(allPlayers);
            } else {
                for (Player play: allPlayers){
                    if (play.getCountry().toLowerCase().contains(constraint.toString().toLowerCase())) {
                        filteredList.add(play);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values= filteredList;
            return  results;

        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            players.clear();
            players.addAll((Collection<? extends Player>) results.values);
            notifyDataSetChanged();

        }
    };
    public class ViewHolder extends RecyclerView.ViewHolder{

        private CardView parent;
        private ImageView imgPlayer;
        private TextView txtPlayerName;
        private ImageView downArrow, upArrow;
        private RelativeLayout expandedRelLayout, collapsedRelLayout;
        private TextView clubText, countryText, numberText, bornText, ageText, positionText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            imgPlayer = itemView.findViewById(R.id.imgPlayer);
            txtPlayerName = itemView.findViewById(R.id.txtPlayerName);
            downArrow = itemView.findViewById(R.id.btnDownArrow);
            upArrow = itemView.findViewById(R.id.btnUpArrow);
            expandedRelLayout = itemView.findViewById(R.id.expandedRelLayout);
            collapsedRelLayout = itemView.findViewById(R.id.collapsedRelLayout);
            clubText = itemView.findViewById(R.id.clubText);
            countryText = itemView.findViewById(R.id.countryText);
            numberText = itemView.findViewById(R.id.numberText);
            bornText = itemView.findViewById(R.id.bornText);
            ageText = itemView.findViewById(R.id.ageText);
            positionText = itemView.findViewById(R.id.positionText);

            downArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Player player = players.get(getAdapterPosition());
                    player.setExpanded(!player.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });

            upArrow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Player player = players.get(getAdapterPosition());
                    player.setExpanded(!player.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}

