import config.*
import generator.*

fun main() {
    val config = ConfigLoader.loadConfig("config/settings.json")
    val generator = ProceduralGenerator(config)
    val result = generator.generate()
    println(result)
}
