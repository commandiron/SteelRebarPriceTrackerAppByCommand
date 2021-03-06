package com.example.gunluk_demir_fiyati_by_command.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey


data class DemirFiyat(
    val id: Int? = null,
    var bolge: String,
    var fi8Fiyat: String,
    var fi10Fiyat: String,
    var fi1232Fiyat: String,
    var fotoUrl: String
) {
}