import java.util.Scanner

class MainPage(name: String) : Page(name) {
    private val list: MutableList<Archive> = mutableListOf()
    override fun showList(scanner: Scanner) {
        navigate(scanner, list)
    }

    override fun create(scanner: Scanner) {
        var archiveName: String
        while (true) {
            println("Введите название нового архива:")
            scanner.nextLine()
            archiveName = scanner.nextLine()
            if (checkEmpty(archiveName)) {
                continue
            } else {
                break
            }
        }
        list.add(Archive(archiveName))
    }
}