package com.zaich.noteappsroom.ui.main

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.zaich.noteappsroom.database.Note
import com.zaich.noteappsroom.repository.NoteRepository

class MainViewModel(application: Application):ViewModel() {
    private val mNoteRepository:NoteRepository = NoteRepository(application)

    fun getAllNotes():LiveData<List<Note>> = mNoteRepository.getAllNotes()
}