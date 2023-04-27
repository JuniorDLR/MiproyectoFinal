package com.example.MiproyectoFinal

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity("Laboratorio")
data class Laboratorio(
    val nombre: String = "",
    val ubicacion: String = ""
) : Serializable {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}