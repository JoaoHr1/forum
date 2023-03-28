package br.com.joao.forum.services

import br.com.joao.forum.dto.NewTopicDto
import br.com.joao.forum.model.Topic
import br.com.joao.forum.model.User
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody
import java.util.*

@Service
class TopicServices(private var topics: List<Topic> = ArrayList(), private val userService: UserService) {

    fun list(): List<Topic> {
        return topics
    }

    fun listById(id: Long): Topic {
        return topics.stream().filter({t -> t.id == id}).findFirst().get()
    }

    fun register(@RequestBody dto: NewTopicDto) {
        topics = topics.plus(Topic(id = topics.size.toLong() + 1,title = dto.title, message = dto.message, user = userService.findById(dto.idUser)))
    }
}

