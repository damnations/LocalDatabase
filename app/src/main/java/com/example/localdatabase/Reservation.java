package com.example.localdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "reservations")
public class Reservation {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "reservationTime")
    private Date reservationTime;

    @ColumnInfo(name = "reservationLength")
    private String reservationLength;

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "hasCompleted")
    private Boolean hasCompleted;
}

