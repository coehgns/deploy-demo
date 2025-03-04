package com.example.deploydemo.domain.board.domain.repository

import com.example.deploydemo.domain.board.domain.Board
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository : JpaRepository<Board, Long>