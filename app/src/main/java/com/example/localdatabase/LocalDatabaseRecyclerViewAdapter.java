package com.example.localdatabase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LocalDatabaseRecyclerViewAdapter extends RecyclerView.Adapter<LocalDatabaseRecyclerViewAdapter.ViewHolder> {
    private List<Reservation> reservations;
    private OnAddParticipantClickListener onAddParticipantClickListener;

    public LocalDatabaseRecyclerViewAdapter(List<Reservation> reservations, OnAddParticipantClickListener onAddParticipantClickListener) {
        this.reservations = reservations;
        this.onAddParticipantClickListener = onAddParticipantClickListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reservation, parent, false);
        return new ViewHolder(view, onAddParticipantClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Reservation reservation = reservations.get(position);
        holder.titleTextView.setText(reservation.getTitle());
    }

    @Override
    public int getItemCount() {
        return reservations.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTextView;
        private Button addParticipantButtonRecyclerView;

        public ViewHolder(@NonNull View view, OnAddParticipantClickListener onAddParticipantClickListener) {
            super(view);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            addParticipantButtonRecyclerView = itemView.findViewById(R.id.addParticipantButtonRecyclerView);
            addParticipantButtonRecyclerView.setOnClickListener(v -> onAddParticipantClickListener.onAddParticipantClick(getAdapterPosition()));
        }
    }
    public interface OnAddParticipantClickListener {
        void onAddParticipantClick(int position);
    }

}
