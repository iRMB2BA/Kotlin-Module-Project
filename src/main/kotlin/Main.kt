import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val mainPageRoot = MainPage("Приложение Заметки. Главное меню")
    mainPageRoot.showList(scanner)
}