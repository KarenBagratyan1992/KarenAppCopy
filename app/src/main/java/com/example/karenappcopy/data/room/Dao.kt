package com.example.karenappcopy.data.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface Dao {
    @Insert(onConflict = OnConflictStrategy.REPLACE, entity = RoomUserModels::class)
    suspend fun insert(user:RoomUserModels)
    @Query("SELECT * FROM ${RoomUserModels.TABLE_NAME}")
    suspend fun getUsers():RoomUserModels
}