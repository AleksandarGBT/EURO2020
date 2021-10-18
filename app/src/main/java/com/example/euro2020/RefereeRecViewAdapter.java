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

public class
RefereeRecViewAdapter extends RecyclerView.Adapter<RefereeRecViewAdapter.ViewHolder> {
    public RefereeRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    private ArrayList<Referee> referees = new ArrayList<>();
    private Context mContext;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_referee,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RefereeRecViewAdapter.ViewHolder holder, int position) {

        holder.txtRefereeName.setText(referees.get(position).getName());
        Glide.with(mContext)
                .asBitmap()
                .load(referees.get(position).getImgUrl())
                .into(holder.imgReferee);
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, referees.get(position).getName() +" Selected", Toast.LENGTH_SHORT).show();
            }
        });

        holder.bornText.setText(referees.get(position).getBorn());
        holder.ageText.setText(referees.get(position).getAge());
        holder.countryText2.setText(referees.get(position).getCountry());


        if (referees.get(position).isExpended2()){
            TransitionManager.beginDelayedTransition(holder.parent);
            holder.expandedRelLayout2.setVisibility(View.VISIBLE);
            holder.downArrow2.setVisibility(View.GONE);
        } else {
            TransitionManager.beginDelayedTransition((holder.parent));
            holder.expandedRelLayout2.setVisibility(View.GONE);
            holder.downArrow2.setVisibility(View.VISIBLE);
        }
    }


    @Override
    public int getItemCount() {
        return referees.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private CardView parent;
        private ImageView imgReferee;
        private TextView txtRefereeName;
        private ImageView downArrow2, upArrow2;
        private RelativeLayout expandedRelLayout2, collapsedRelLayout2;
        private TextView bornText, ageText ,countryText2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            parent = itemView.findViewById(R.id.parent);
            imgReferee = itemView.findViewById(R.id.imgReferee);
            txtRefereeName = itemView.findViewById(R.id.txtRefereeName);
            downArrow2 = itemView.findViewById(R.id.btnDownArrow2);
            upArrow2 = itemView.findViewById(R.id.btnUpArrow2);
            expandedRelLayout2 = itemView.findViewById(R.id.expandedRelLayout2);
            collapsedRelLayout2 = itemView.findViewById(R.id.collapsedRelLayout2);
            bornText = itemView.findViewById(R.id.bornText);
            ageText = itemView.findViewById(R.id.ageText);
            countryText2 = itemView.findViewById(R.id.countryText2);

            downArrow2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Referee referee = referees.get(getAdapterPosition());
                    referee.setExpended2(!referee.isExpended2());
                    notifyItemChanged(getAdapterPosition());
                }
            });

            upArrow2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Referee referee = referees.get(getAdapterPosition());
                    referee.setExpended2(!referee.isExpended2());
                    notifyItemChanged(getAdapterPosition());
                }
            });

        }
    }

    public void setReferees(ArrayList<Referee> referees) {
        this.referees = referees;
        notifyDataSetChanged();
    }

    public Context getmContext() {
        return mContext;
    }
}
