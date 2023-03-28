package br.com.joao.forum.dto

import br.com.joao.forum.model.User

data class NewTopicDto(val title: String, val message: String, val idUser: Long) {

}
