package br.com.joao.forum.dto

import br.com.joao.forum.model.StatusTopic
import java.time.LocalDateTime

data class TopicView(val id: Long?, val title: String, val message: String, val status: StatusTopic, val createWhen: LocalDateTime) {

}
