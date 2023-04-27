package com.example.MiproyectoFinal

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Computadora(
    val nombre: String = "",
    val modelo: String = ""
) : Serializable {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
