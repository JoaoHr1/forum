package br.com.joao.forum.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

data class NewTopicForm(
    @field:NotEmpty
    @field:Size(min = 5, max = 100)
    val title: String,

    @field:NotEmpty
    @Size(min = 10, max = 2000)
    val message: String,

    @field:NotNull
    val idUser: Long) {

}
