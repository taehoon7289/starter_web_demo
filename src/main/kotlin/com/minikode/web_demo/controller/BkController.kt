package com.minikode.web_demo.controller

import com.minikode.web_demo.jpa.entity.BoardEntity
import com.minikode.web_demo.service.BoardService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/bk")
class BkController(
    private val boardService: BoardService,
) {

    @PostMapping("/")
    fun save(): ResponseEntity<BoardEntity> {
        return ResponseEntity.ok(boardService.saveBoard())
    }

    @GetMapping("/")
    fun find(): ResponseEntity<MutableList<BoardEntity>> {
        return ResponseEntity.ok(boardService.findBoards())
    }
}

