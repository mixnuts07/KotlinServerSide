open class Animal(private val name: String) {
    fun showName() = println("Name Is $name")
    open fun cries() = println("")
}