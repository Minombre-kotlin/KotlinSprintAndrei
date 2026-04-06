package org.example.lesson11

class User(

    val avatar: String,
    val nickname: String,
    var speakerStatus: String,

    ) {

}

class Room(

    val cover: String,
    val name: String,
    val participantsList: MutableList<User>,

    ) {
    fun addParticipantInRoom(user: User) {

        participantsList.add(user)

    }

    fun updateParticipantStatus(spikerStatus: String, nickname: String) {

        val user = participantsList.find { it.nickname == nickname }
        user?.speakerStatus = spikerStatus
    }
}

fun main() {

    val user1 = User(
        avatar = "панда",
        nickname = "Евгений",
        speakerStatus = "Разговаривает"
    )

    val user2 = User(
        avatar = "пума",
        nickname = "Ольга",
        speakerStatus = "Микрофон выключен"
    )

    val user3 = User(
        avatar = "пёсель",
        nickname = "Good Doggie",
        speakerStatus = "Пользователь заглушен"
    )

    val room1 = Room(
        cover = "Домик",
        name = "Домашняя комната",
        participantsList = mutableListOf(user1, user2, user3)
    )
}