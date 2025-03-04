package com.example.deploydemo.domain.board.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity(name = "board")
class Board(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,

    @Column(name = "title")
    var title: String,

    @Column(name = "content")
    var content: String
)