package br.com.joao.forum.model

import java.time.LocalDateTime
import java.util.ArrayList

data class Topic(
    val id: Long? = null,
    val title: String,
    val message: String,
    val createWhen: LocalDateTime = LocalDateTime.now(),
    val status: StatusTopic = StatusTopic.NOTANSWERED,
    val answers: List<Answer> = ArrayList(),
    val user: User

){
}