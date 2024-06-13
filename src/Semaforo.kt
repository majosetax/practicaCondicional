fun main() {
    val semaforo = "ambar"

   val mensaje = when (semaforo) {
        "rojo" -> "pare"
        "amarillo", "ambar" -> "espere"
        "verde" -> "siga"
        else -> "invalido color"
    }
    println(mensaje)
}