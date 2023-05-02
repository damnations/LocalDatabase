package com.example.localdatabase;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ParticipantDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Participant participant);

    @Update
    void update(Participant participant);

    @Delete
    void delete(Participant participant);

    @Query("SELECT * FROM participants WHERE reservation_id = :reservationId")
    LiveData<List<Participant>> getParticipantsByReservationId(int reservationId);
}

