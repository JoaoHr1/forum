package br.com.joao.forum.mapper

interface Mapper<T, U> {
    fun map(t: T): U
}
