package com.example.MiproyectoFinal

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Laboratorio::class], version = 1)
abstract class DataBaseL() : RoomDatabase() {

    abstract fun obtenerLaboratorio(): Laboratorio


    companion object {

        @Volatile
        private var instance: DataBaseL? = null
        private val junior = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(junior) {
            instance ?: Database(context).also {
                instance = it
            }

        }

        private fun Database(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            DataBaseL::class.java,
            "LaboratorioBD"
        ).build()
    }
}