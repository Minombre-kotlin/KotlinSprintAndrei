package org.example.Lesson11

class ForumMember private constructor(
    val userID: Int,
    val userName: String,
) {
    class Builder {
        private var userID: Int = 0
        private var userName: String = ""

        fun setUserID(id: Int): Builder {
            this.userID = id
            return this
        }

        fun setUserName(name: String): Builder {
            this.userName = name
            return this
        }

        fun build(): ForumMember {
            return ForumMember(userID, userName)
        }
    }
}

class ForumMessage private constructor(
    val authorId: Int,
    val message: String,
) {
    class Builder {
        private var authorId: Int = 0
        private var message: String = ""

        fun setAuthorId(authorId: Int): Builder {
            this.authorId = authorId
            return this
        }

        fun setMessage(message: String): Builder {
            this.message = message
            return this
        }

        fun build(): ForumMessage {
            return ForumMessage(authorId, message)
        }
    }
}

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()

    fun createNewUser(userName: String): ForumMember {
        val newId = members.size + 1

        val newMember = ForumMember.Builder()
            .setUserID(newId)
            .setUserName(userName)
            .build()
        members.add(newMember)
        return newMember
    }

    fun createNewMessage(authorId: Int, message: String): ForumMessage {
        if (members.any { it.userID == authorId }) {
            val newMessage = ForumMessage.Builder()
                .setAuthorId(authorId)
                .setMessage(message)
                .build()
            messages.add(newMessage)
            return newMessage
        } else {
            error("Пользователь с id $authorId не найден")
        }
    }

    fun printThread() {
        messages.forEach { message ->
            val author = members.find {
                it.userID == message.authorId
            }
            println("${author?.userName}: ${message.message}")
        }
    }
}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Евгений")
    val user2 = forum.createNewUser("Ольга")

    forum.createNewMessage(user1.userID, "Привет!")
    forum.createNewMessage(user2.userID, "Как дела?")

    forum.createNewMessage(user1.userID, "Привет!")
    forum.createNewMessage(user2.userID, "Отлично")
    forum.printThread()
}