package com.example.localdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Reservation.class, Participant.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract ReservationDao reservationDao();
    public abstract ParticipantDao participantDao();
}

