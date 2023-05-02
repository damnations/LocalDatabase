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
public interface ReservationDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Reservation reservation);

    @Update
    void update(Reservation reservation);

    @Delete
    void delete(Reservation reservation);

    @Query("SELECT * FROM reservations ORDER BY reservationTime ASC")
    LiveData<List<Reservation>> getAllReservations();

    @Query("SELECT * FROM reservations WHERE id = :reservationId")
    LiveData<Reservation> getReservationById(int reservationId);
}


