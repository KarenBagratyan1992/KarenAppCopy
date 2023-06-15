package com.example.karenappcopy.data.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.karenappcopy.data.room.RoomUserModels.Companion.TABLE_NAME

@Entity(tableName = TABLE_NAME)
data class RoomUserModels(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @ColumnInfo(name = "login")
    val login: String?,
    @ColumnInfo(name = "password")
    val password: String?
) {
    companion object {
        const val TABLE_NAME = "login table name"

    }
}
