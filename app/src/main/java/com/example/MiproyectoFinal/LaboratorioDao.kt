package com.example.MiproyectoFinal

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update


@Dao
interface LaboratorioDao {

    @Insert
    suspend fun insertar(laboratorio: Laboratorio)

    @Query("SELECT * FROM laboratorio ORDER BY id DESC")
    suspend fun obtenerLaboratorio(): List<Laboratorio>

    @Update
    suspend fun actualizarL(laboratorio: Laboratorio)

    @Delete
    suspend fun eliminarL(laboratorio: Laboratorio)

}