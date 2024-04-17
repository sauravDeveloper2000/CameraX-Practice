package com.example.cameraxpractice

import android.graphics.Bitmap
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class MainViewModel: ViewModel() {

    var bitmaps = MutableStateFlow<List<Bitmap>>(emptyList())
        private set

    fun onPhotoTake(
        bitmap: Bitmap
    ){
        bitmaps.value += bitmap
    }
}