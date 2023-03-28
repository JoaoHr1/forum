package br.com.joao.forum.services

import br.com.joao.forum.model.User
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(var users: List<User>){

    init {
        val user = User (
            id = 1,
            name = "Joao",
            email = "joao@gmail.com"
        )
        users = Arrays.asList(user)
    }

    fun findById(id: Long): User {
        return users.stream().filter({i -> id == id}).findFirst().get()
    }
}
