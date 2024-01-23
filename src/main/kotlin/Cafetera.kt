class Cafetera(var ubicacion:String) {
    var capacidadMax:Int = 1000
    var cantidadAct :Int = 0

    constructor(ubicacion: String, capacidadMax:Int) : this(ubicacion) {
        this.capacidadMax = capacidadMax
        this.cantidadAct = this.capacidadMax
    }

    constructor(ubicacion: String, capacidadMax:Int, cantidadAct:Int) : this(ubicacion) {
        if (cantidadAct > capacidadMax)  {
            this.cantidadAct = this.capacidadMax
        } else {
            this.capacidadMax = capacidadMax
            this.cantidadAct = cantidadAct
        }
    }

    fun llenar() {
        this.cantidadAct = this.capacidadMax
    }

    fun servirTaza(taza:Taza) {
        if (this.cantidadAct < taza.capacidad) {
            taza.llenar(this.cantidadAct)
            this.cantidadAct = 0
        } else {
            this.cantidadAct -= taza.capacidad
            taza.llenar()
        }
    }

    fun vaciar() {
        this.cantidadAct = 0
    }

    fun agregarCafe(cant:Int = 200) {
        if (this.cantidadAct + cant > this.capacidadMax) this.cantidadAct = this.capacidadMax
        else this.cantidadAct += cant
    }

    override fun toString(): String {
        return "Cafeteria (Ubicación = ${this.ubicacion}, Capacidad = ${this.capacidadMax} c.c, Cantidad = ${this.cantidadAct} c.c.)"
    }
}