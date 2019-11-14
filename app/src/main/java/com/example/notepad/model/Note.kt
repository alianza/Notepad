package com.example.notepad.model

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.util.*

@Entity
@Parcelize
data class Note(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") var id: Long? = null,
    @ColumnInfo(name = "title") var title: String,
    @ColumnInfo(name = "lastUpdated") var lastUpdated: Date,
    @ColumnInfo(name = "text") var text: String
) : Parcelable