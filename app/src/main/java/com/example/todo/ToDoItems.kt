package com.example.todo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class ToDoItems(
    @PrimaryKey(autoGenerate = true)
    var id: Int,
    val item: String,
    var displayOrder:Int = 1
) {
    constructor(item: String) : this(id = 0, item = item)
}
