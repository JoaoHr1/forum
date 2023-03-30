package br.com.joao.forum.controller

import br.com.joao.forum.dto.NewTopicForm
import br.com.joao.forum.dto.TopicView
import br.com.joao.forum.dto.UpdateTopicForm
import br.com.joao.forum.services.TopicServices
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/topics")
class TopicController(private val service: TopicServices) {

    @GetMapping
    fun list(): List<TopicView> {
        return service.list()
    }

    @GetMapping
    @RequestMapping("/{id}")
    fun findById(@PathVariable id: Long): TopicView {
        return service.listById(id)
    }

    @PostMapping
    fun register(@RequestBody @Valid form: NewTopicForm) {
        service.register(form)
    }

    @PutMapping
    fun update(@RequestBody @Valid form: UpdateTopicForm) {
        service.update(form)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) {
        service.delete(id)
    }

}