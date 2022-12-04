package com.minikode.web_demo.service

import com.minikode.web_demo.jpa.entity.BoardEntity
import com.minikode.web_demo.jpa.repository.BoardRepository
import org.springframework.stereotype.Service

@Service
class BoardService(
    private val boardRepository: BoardRepository,
) {

    fun findBoards(): MutableList<BoardEntity> {
        return boardRepository.findAll()
    }

    fun saveBoard(): BoardEntity {
        val boardEntity = BoardEntity(
            title = "블로킹 제목1",
            description = "블로킹 설명11"
        )
        return boardRepository.save(boardEntity)
    }

}