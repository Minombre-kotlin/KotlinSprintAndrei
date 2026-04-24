package org.example.Lesson11

class ForumMember(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()

    fun createNewUser(userName: String): ForumMember {
        val newId = members.size + 1
        val newMember = ForumMember(newId, userName)
        members.add(newMember)
        return newMember
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage {
        if (members.any { it.userId == authorId }) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
            return newMessage
        } else {
            error("Пользователь с id $authorId не найден")
        }
    }

    fun printThread() {
        messages.forEach { message ->
            val author = members.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Евгений")
    val user2 = forum.createNewUser("Ольга")

    forum.createNewMessage(user1.userId, "Привет!")
    forum.createNewMessage(user2.userId, "Как дела?")
    forum.createNewMessage(user1.userId, "Всё хорошо!")
    forum.createNewMessage(user2.userId, "Отлично")

    forum.printThread()
}