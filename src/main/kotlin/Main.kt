import kotlin.math.roundToInt

fun main() {
    lectures()
}

fun getTemperatureAtAirport(code: String):String = "${(Math.random() * 30).roundToInt() + code.count()} C"

fun lectures() {
    val pairExample = Pair("Tom", "Jerry")
    println(pairExample)

    val mapExample = mapOf("Tom" to "Cat", "Jerry" to "Mouse")
    println("$mapExample\n")

    val airportCode = listOf("LAX", "SFO", "PDX", "SEA")
    println(airportCode)

    val temperatures = airportCode.map {code -> code to getTemperatureAtAirport(code) }

    for (temp in temperatures) {
        println("Airport: ${temp.first}: Temperature: ${temp.second}\n")
    }

    val fruitsMutable: MutableList<String> = mutableListOf("Apple", "Banana", "Grape")
    fruitsMutable.add("Tomato")
    println(fruitsMutable)

    val fruits: List<String> = listOf("Apple", "Banana", "Grape")
    println(fruits)

    println("${fruits.get(1)}, ${fruits[2]}")

    val fruits2 = fruits + "Orange"
    println(fruits2)

    val fruits3 = fruits2 - "Banana"
    println(fruits3)
    println()

    println("***MapOf***")
    val sites = mapOf("google" to "https://www.google.com", "agiledeveloper" to "https://www.agiledeveloper.com")
    println(sites.size) //2

    //Iterate Map
    println(sites.containsKey("agiledeveloper")) //true
    println(sites.containsValue("https://www.agiledeveloper.com")) //true
    println("agiledeveloper" in sites) //true
    println("https://www.agiledeveloper.com" in sites) //false

}

