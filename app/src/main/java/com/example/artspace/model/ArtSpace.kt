package com.example.artspace.model

data class ArtSpace(val imageResId: Int, val desc: String, val auth: String, val onClickListener: () -> Unit) {

}