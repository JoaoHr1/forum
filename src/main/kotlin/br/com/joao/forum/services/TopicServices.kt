package br.com.joao.forum.services

import br.com.joao.forum.dto.NewTopicForm
import br.com.joao.forum.dto.TopicView
import br.com.joao.forum.dto.UpdateTopicForm
import br.com.joao.forum.mapper.TopicFormMapper
import br.com.joao.forum.mapper.TopicViewMapper
import br.com.joao.forum.model.Topic
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody
import java.util.*
import java.util.stream.Collectors

@Service
class TopicServices(private var topics: List<Topic> = ArrayList(), private val topicViewMapper: TopicViewMapper, private val topicFormMapper: TopicFormMapper) {

    fun list(): List<TopicView> {
        return topics.stream().map { t -> topicViewMapper.map(t)}.collect(
            Collectors.toList())
    }

    fun listById(id: Long): TopicView {
        val t = topics.stream().filter { t -> t.id == id }.findFirst().get()
        return topicViewMapper.map(t)
    }

    fun register(@RequestBody form: NewTopicForm) {
        val topic = topicFormMapper.map(form)
        topic.id = topics.size.toLong() + 1
        topics = topics.plus(topic)
    }

    fun update(form: UpdateTopicForm) {
        val topic = topics.stream().filter { t -> t.id == form.id }.findFirst().get()
        topics = topics.minus(topic).plus(Topic(id = form.id, title = form.title, message = form.message, user = topic.user, answers = topic.answers, status = topic.status, createWhen = topic.createWhen))
    }

    fun delete(id: Long) {
        val topic = topics.stream().filter { t -> t.id == id }.findFirst().get()
        topics = topics.minus(topic)
    }

}

