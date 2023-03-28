package br.com.joao.forum.controller

import br.com.joao.forum.dto.NewTopicDto
import br.com.joao.forum.model.Topic
import br.com.joao.forum.model.User
import br.com.joao.forum.services.TopicServices
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/topics")
class TopicController(private val service: TopicServices) {

    @GetMapping
    fun list(): List<Topic> {
        return service.list()
    }

    @GetMapping
    @RequestMapping("/{id}")
    fun findById(@PathVariable id: Long): Topic {
        return service.listById(id)
    }

    @PostMapping
    fun register(@RequestBody dto: NewTopicDto) {
        service.register(dto)
    }
}