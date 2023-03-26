package br.com.joao.forum.controller

import br.com.joao.forum.model.Topic
import br.com.joao.forum.model.User
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topics")
class TopicController {

    @GetMapping
    fun list(): List<Topic> {
        val topic = Topic(
            id = 1,
            title = "test",
            message = "Testing kotlin",
            user = User (
                id = 1,
                name = "Joao",
                email = "joao@email.com"
            )
        )
        return Arrays.asList(topic, topic, topic)
    }

}