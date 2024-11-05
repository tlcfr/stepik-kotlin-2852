package ru.tlcfr.stepik.kotlin2852.module_1

class Client(val personalInfo: PersonalInfo?)

class PersonalInfo(val email: String?)

interface Mailer {
    fun sendMessage(email: String, message: String)
}

fun sendMessageToClient(client: Client?, message: String?, mailer: Mailer) {
    val email = client?.personalInfo?.email

    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}
