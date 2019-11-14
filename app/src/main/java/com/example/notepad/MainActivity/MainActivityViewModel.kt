package com.example.notepad.MainActivity

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.notepad.data.NoteRepository

class MainActivityViewModel(application: Application) : AndroidViewModel(application) {

    private val noteRepository = NoteRepository(application.applicationContext)

    val note = noteRepository.getNotepad()
}
