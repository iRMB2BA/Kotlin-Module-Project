import java.util.Scanner

class Note(
    name: String,
    private var content: String
) : Page(name) {

    private var input: Int = 0

    private fun read(scanner: Scanner) {
        while (true) {
            println(content)
            println("0. Выйти из просмотра")

            if (isDigit(scanner)) {
                input = scanner.nextInt()
            } else {
                scanner.nextLine()
                continue
            }
            if (hasPoint(0, input)) {
                break
            } else {
                continue
            }
        }
    }

    override fun showList(scanner: Scanner) {
        while (true) {
            println(
                "$name \n" +
                        "0. Посмотреть заметку \n" +
                        "1. Вернуться в предыдущее меню"
            )

            if (isDigit(scanner)) {
                input = scanner.nextInt()
            } else {
                scanner.nextLine()
                continue
            }
            if (hasPoint(1, input)) {
                when (input) {
                    0 -> read(scanner)
                    1 -> break
                }
            } else {
                continue
            }
        }

    }
}