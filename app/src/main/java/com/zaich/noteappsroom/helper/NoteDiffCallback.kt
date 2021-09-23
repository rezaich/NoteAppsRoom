package com.zaich.noteappsroom.helper

import android.provider.ContactsContract
import androidx.recyclerview.widget.DiffUtil
import com.zaich.noteappsroom.database.Note

class NoteDiffCallback(private val mOldNoteList: List<Note>,private val mNewNoteList: List<Note> ):DiffUtil.Callback() {
    override fun getOldListSize(): Int = mOldNoteList.size

    override fun getNewListSize(): Int  = mOldNoteList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        mOldNoteList[oldItemPosition].id == mNewNoteList[newItemPosition].id

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldEmployee = mOldNoteList[oldItemPosition]
        val newEmployee = mNewNoteList[newItemPosition]
        return oldEmployee.title == newEmployee.title && oldEmployee.description == newEmployee.description
    }

}