package com.minikode.web_demo.jpa.entity

import javax.persistence.*

@Entity
@Table(name = "board", catalog = "minikode", indexes = [])
class BoardEntity(
    title: String,
    description: String,
) {
    constructor() : this(title = "", description = "description") {
        this.title = title
        this.description = description
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var boardId: Long? = null
        private set

    @Column(name = "title", nullable = false)
    var title = title
        private set

    @Column(name = "description", nullable = true)
    var description = description
        private set


}