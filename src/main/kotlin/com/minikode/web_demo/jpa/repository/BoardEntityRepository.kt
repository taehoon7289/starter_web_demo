package com.minikode.web_demo.jpa.repository;

import com.minikode.web_demo.jpa.entity.BoardEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BoardRepository : JpaRepository<BoardEntity, Long> {
}