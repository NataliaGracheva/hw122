fun main() {
    var likes1 = 32
    printLikes(likes1)
    var likes2 = 61
    printLikes(likes2)
}

fun printLikes(likes: Int) {
    if (likes == 1 || likes >= 21 && likes % 10 == 1) println("Понравилось $likes человеку")
    else println("Понравилось $likes людям")
}