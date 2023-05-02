package com.example.localdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ReservationDao {
    @Insert
    void insert(Reservation reservation);

    @Delete
    void delete(Reservation reservation);

    @Update
    void update(Reservation reservation);

    @Query("SELECT * FROM reservations ORDER BY time ASC")
    List<Reservation> getAllReservations();
}

