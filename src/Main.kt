interface IntHorse {
    fun makeNoise(noise: String)
    fun runspeed(speed_h: Int)
}

class Horse(var food: String, var location: String) : IntHorse {
    override fun makeNoise(noise: String) {
        println("Лошадь $noise")
    }

    override fun runspeed(speed_h: Int) {
        println("Скорость: $speed_h км/ч")
    }
}

interface IntEagle {
    fun flightAltitude(altitude: Int)
    fun flightSpeed(speed_e: Int)
}

class Eagle(var size: Int, var wingLength: Int) : IntEagle {
    override fun flightAltitude(altitude: Int) {
        println("Высота: $altitude м")
    }

    override fun flightSpeed(speed_e: Int) {
        println("Скорость полёта: $speed_e км/ч")
    }
}

class Pegasus(val name: String, h: IntHorse, e: IntEagle) : IntHorse by h, IntEagle by e

fun main() {
    val horse = Horse("Овёс", "Поле")
    val eagle = Eagle(3, 5)
    val pegasus = Pegasus("Игорь", horse, eagle)
    pegasus.makeNoise("Игого")
    pegasus.runspeed(100)
    pegasus.flightAltitude(100)
    pegasus.flightSpeed(100)
}
