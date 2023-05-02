package com.example.localdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "participants", foreignKeys = @ForeignKey(entity = Reservation.class,
        parentColumns = "id",
        childColumns = "reservation_id",
        onDelete = ForeignKey.CASCADE))
public class Participant {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "reservation_id", index = true)
    private int reservationId;

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "attending")
    private Boolean attendance;
}

