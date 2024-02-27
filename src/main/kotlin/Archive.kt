import java.util.Scanner

class Archive(name: String) : Page(name) {
    private val list: MutableList<Note> = mutableListOf()
    override fun showList(scanner: Scanner) {
        navigate(scanner, list)
    }

    override fun create(scanner: Scanner) {
        var noteName: String
        var content: String

        while (true) {
            println("Введите название заметки:")
            scanner.nextLine()
            noteName = scanner.nextLine()
            if (checkEmpty(noteName)) {
                continue
            } else {
                break
            }
        }


        while (true) {
            println("Введите содержание заметки:")
            content = scanner.nextLine()
            if (checkEmpty(content)) {
                continue
            } else {
                break
            }

        }

        list.add(Note(noteName, content))
    }
}