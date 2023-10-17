package com.pmdm.proyectoexamenkotlin

var costeplat: Double = 5.0

val lista1: List<String> = listOf("Mesa1(2)", "Mesa2(4)", "Mesa3(3)", "Mesa4(2)")

val nombre:String = "Mario"
val hora:String = "12:50"
val dia:Int = 4
val mes:Int = 10
val anyo:Int = 2023
val dispo:Boolean = true

fun costePlatos(coste: Double) {
    print("Coste: ")
    when {
        coste <= 5 -> print("€")
        coste in 5.5..8.0 -> print("€€")
        coste in 8.5..15.0 -> print("€€€")
        coste in 15.5..21.5 -> print("€€€€")
        coste >= 22 -> print("€€€€€")
    }
    println()
}

//En esta funcion de gestionReserva no se como eliminar la mesa exacta que pida el usuario

fun gestionReserva(lista: List<String>) {

    println(lista.toString())

    if (lista.isEmpty()) {
        println("No hay mesas libres")
    } else {
        println("Si hay mesas libres")
        print("Que mesa quieres(Dime su posición en la lista): ")
        val input = readLine()
        val reserva = input?.toInt()
        if (reserva != null) {
            lista.drop(reserva)
        }
    }
}

fun mostrarReserva(nombre: String, hora: String, dia: Int, mes: Int, anyo: Int, dispo: Boolean) {
    println(
        "Reserva confirmada" +
                "\nNombre: $nombre" +
                "\nHora: $hora" +
                "\nFecha: $dia/$mes/$anyo" +
                "\nDisponibilidad: ${
                    if (dispo == true) {
                        "SI"
                    } else {
                        "NO"
                    }
                }"
    )
}
// No he sabido hacer muy bien lo de saber que parametro es nulo y poner el primero que encuentre
fun procesarReserva(nombre: String? = null, hora: String? = null, dia: Int? = null, mes: Int? = null, anyo: Int? = null, dispo: Boolean? = null){

    gestionReserva(lista1)
    println()
    if (nombre != null && hora != null && dia != null && mes != null && anyo != null && dispo != null) {
        mostrarReserva(nombre, hora, dia, mes, anyo, dispo)
        println("Reserva procesada")
    } else {
        "Algun parametro es nulo"
    }
}

fun main() {
    costePlatos(costeplat)
    println()
    procesarReserva(nombre, hora, dia, mes, anyo, dispo)
}

fun oduu(){
    
}
