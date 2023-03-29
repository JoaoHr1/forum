package br.com.joao.forum.mapper

import br.com.joao.forum.dto.NewTopicForm
import br.com.joao.forum.model.Topic
import br.com.joao.forum.services.UserService
import org.springframework.stereotype.Component

@Component
class TopicFormMapper(private val userService: UserService): Mapper<NewTopicForm, Topic> {

    override fun map(t: NewTopicForm): Topic {
        return Topic(title = t.title, message = t.message, user = userService.findById(t.idUser))
    }

}
