package com.example.databaseonlineapi.ui.viewModel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.databaseonlineapi.MahasiswaApplication
import com.example.myapplicationdatabase.ui.viewModel.DetailViewModel
import com.example.myapplicationdatabase.ui.viewModel.HomeViewModel


object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(MahasiswaApplication().container.mahasiswaRepository)
        }
        initializer {
            InsertViewModel(MahasiswaApplication().container.mahasiswaRepository)
        }
        initializer {
            DetailViewModel(
                createSavedStateHandle(),
                MahasiswaApplication().container.mahasiswaRepository
            )
        }
        initializer {
            UpdateViewModel(
                createSavedStateHandle(),
                MahasiswaApplication().container.mahasiswaRepository
            )
        }
    }
}
fun CreationExtras.MahasiswaApplication() : MahasiswaApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as MahasiswaApplication)