package mate.academy

fun Double.Companion.printClassName() {
    print("Class name: ${this::class.qualifiedName}\n")
}
