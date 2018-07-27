package id.bandros.wisataalambandung.model

import java.io.Serializable

data class WisataModel (
        val nama: String,
        val deskripsi: String,
        val alamat: String,
        val sumber: String,
        val lat: Double,
        val lon: Double,
        val phone: String,
        val foto: Array<WisataFotoModel>
)

data class WisataFotoModel (
        val foto: Int
)