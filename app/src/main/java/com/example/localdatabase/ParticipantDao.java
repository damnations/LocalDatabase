package com.example.localdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ParticipantDao {
    @Insert
    void insert(Participant participant);

    @Delete
    void delete(Participant participant);

    @Update
    void update(Participant participant);

    @Query("SELECT * FROM participants WHERE reservation_id = :reservationId")
    List<Participant> getParticipantsForReservation(int reservationId);
}

