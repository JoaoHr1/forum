package br.com.joao.forum.mapper

import br.com.joao.forum.dto.TopicView
import br.com.joao.forum.model.Topic
import org.springframework.stereotype.Component

@Component
class TopicViewMapper: Mapper<Topic, TopicView> {

    override fun map(t: Topic): TopicView {
        return TopicView (id = t.id, title = t.title, message = t.message, status = t.status, createWhen = t.createWhen)
    }
}