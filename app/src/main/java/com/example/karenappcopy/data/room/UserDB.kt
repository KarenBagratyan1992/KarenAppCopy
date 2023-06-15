package com.example.karenappcopy.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [RoomUserModels::class], version = 1)
abstract class UserDB : RoomDatabase() {
    abstract fun userDao(): Dao

    companion object {
        private var INSTANCE: UserDB? = null
        fun getInstance(context: Context): UserDB {
            return INSTANCE ?: Room.databaseBuilder(
                context.applicationContext,
                UserDB::class.java,
                "UserDB"
            )
                .build().also { INSTANCE=it }
        }
    }

}