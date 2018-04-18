import javax.print.attribute.IntegerSyntax

fun sumarDosNumeros(numeroUno: Int, numeroDos: Int): Int {
    return numeroUno + numeroDos
}

fun main(args: Array<String>) {
    println("Hola Mundo!") //remplaza
    print(sumarDosNumeros(7, 8))
    var nombre: String? = "Jorge"//variable que puede cambiar inicia con var
    var edad: Int = 22
    val edad_actual = 22 // Variable constante no puede ser cambiada
    var casado = false
    nombre = null
    //casado = "Jorge" //duck tipo
    //edad_actual= 29
    when (casado) {
        true -> {
            println("Esta Casado")
        }
        null -> {
            println("Aun no asignado")
        }
        else -> {
            println("No esta Casado")
        }
    }

    val superHeroe = if (casado) {
        "SuperMandarina"
    } else {
        "Superman"
    }
    //templade Strings
    println("superHeroe: ${superHeroe}")
    var jorge = Persona(Integer(22), nombre = "Jorge")
    println(jorge.toString())
    var jorge1 = Persona2(Integer(22), nombre = "Jorge")
    println(jorge1.toString())
    var jorge2 = Persona3(Integer(22), nombre = "Jorge")
    println(jorge2.toString())
}

class Persona {
    lateinit var edadActual: Integer
    var nNombre: String

    //constructor(edad:Any){
    constructor(edad: Integer, nombre: String) {
        iniciar(edad)
        nNombre = nombre
    }

    fun iniciar(edad: Integer) {
        edadActual = edad
    }

    override fun toString(): String {
        return "La edad actual es $edadActual y el nombre es $nNombre"
    }
}

class Persona2(edad: Integer, nombre: String) {
    var nEdad = edad
    var nNombre = nombre
    var ncedula: String? = null
    var nCasado: Boolean? = null

    constructor(edad2: Integer, nombre2: String, cedula: String) : this(edad2, nombre2) {
        ncedula = cedula
    }

    constructor(edad2: Integer, nombre2: String, cedula2: String, casado: Boolean) : this(edad2, nombre2) {
        ncedula = cedula2
        nCasado = casado
    }
    override fun toString(): String {
        return "La edad actual es $nEdad y el nombre es $nNombre , la cedula es $ncedula, el estado civil es $nCasado"
    }
}

class Persona3(edad: Integer, nombre: String) {
    lateinit var nEdad: Integer
    var nNombre = nombre

    init {
        iniciar(edad)
    }

    fun iniciar(edad: Integer) {
        nEdad = edad
    }
    override fun toString(): String {
        return "La edad actual es $nEdad y el nombre es $nNombre"
    }
}

open class Figura(nombre: String) {
    val nNombre = nombre
}

class Cuadrado(nombre: String, valorLado: Integer)
    : Figura(nombre) {
    var nValorLado = valorLado

    override fun toString(): String {
        return "la figura es $nNombre y el valor es $nValorLado"
    }
}