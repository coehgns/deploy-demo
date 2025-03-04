package com.example.deploydemo.domain.board.service

import com.example.deploydemo.domain.board.domain.Board
import com.example.deploydemo.domain.board.domain.repository.BoardRepository
import com.example.deploydemo.domain.board.presentation.dto.request.CreateBoardRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class CreateBoardService(
    private val boardRepository: BoardRepository
) {
    @Transactional
    fun execute(
        request: CreateBoardRequest
    ) {
        val board = request.run {
            Board(
                title = title,
                content = content
            )
        }

        boardRepository.save(board)
    }
}