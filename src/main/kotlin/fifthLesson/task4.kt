package org.example.fifthLesson

fun main()
{
    val registeredLogin = "Zaphod"
    val registeredPassword = "PanGalactic"

    println("Введите имя пользователя:")
    val enteredLogin = readlnOrNull()

    if (enteredLogin != registeredLogin) {
        println("Пользователь не зарегистрирован. Хотите зарегистрироваться?")
        return
    }

    println("Введите пароль:")
    val enteredPassword = readlnOrNull()

    if (enteredPassword == registeredPassword) {
        println(
            """
            [вздыхает...] Ваши данные проверены, и о, чудо, они верны... 
            Пользователь "$registeredLogin", вам разрешено входить на борт корабля "Heart of Gold". 
            Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов... 
            [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.
            """.trimIndent()
        )
    } else {
        println("Пароль неверный. Доступ запрещён.")
    }
}
