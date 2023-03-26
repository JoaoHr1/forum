package br.com.joao.forum.model

import java.time.LocalDateTime

data class Answer (
    val id: Long?,
    val message: String,
    val CreateWhen: LocalDateTime = LocalDateTime.now(),
    val user: User,
    val topic: Topic
){
}
