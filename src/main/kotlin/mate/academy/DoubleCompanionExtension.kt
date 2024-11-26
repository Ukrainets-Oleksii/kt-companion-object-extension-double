package mate.academy

fun Double.Companion.printClassName() {
    println("Class name: ${this::class.qualifiedName}")
}

fun main() {
    Double.printClassName()
}
