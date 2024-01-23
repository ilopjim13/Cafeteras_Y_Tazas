import java.lang.IllegalArgumentException

class Taza(color:String, capacidad: Int) {
    var color: String = "Blanco"
    var capacidad = 50
    var cantidad:Int = 0
        set(value) {
            field = try {
                require(value < this.capacidad) {"La cantidad de la taza no puede ser mayor a su capaccidad"}
                value
            } catch (e: IllegalArgumentException) {
                this.capacidad
            }
        }
    init {
        this.color = color
        this.capacidad = capacidad
    }



    fun llenar() {
        this.cantidad = this.capacidad
    }

    fun llenar(cant:Int) {
        if (this.cantidad + cant > this.capacidad) this.cantidad = this.capacidad
        else this.cantidad += cant
    }

    override fun toString(): String {
        return "Taza (Color = ${this.color.uppercase()}, Capacidad = ${this.capacidad}c.c, Cantidad = ${this.cantidad}c.c.)"
    }

}