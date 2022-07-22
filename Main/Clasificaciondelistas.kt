//Nombre: Sebastian Juarez 21471
// No tocar esta clase ---
data class ItemData(
    var originalPos: Int,
    var originalValue: Any,
	var type: String? = null,
    var info: String? = null
)
// -----------------------

fun main() {
    val result = processList(listOf(25, "Hola", null, false))
    println(result)
}
    

fun processList(inputList: List<Any?>?): List<ItemData>? { 
    val llist = ArrayList<ItemData>()
    if (inputList == null) return null
    for((index, i) in inputList.withIndex()){
       if (i != null){
        val itemData:ItemData = when (i) {
            is String -> ItemData(index, i, "Cadena", "L" + i.length)
            is Int -> 
                when {
                   	i%10 == 0 -> ItemData(index, i, "Entero", "M10")
                	i%5 == 0 -> ItemData(index, i, "Entero", "M5")
                	i%2 == 0 -> ItemData(index, i, "Entero", "M2")
                    else -> ItemData(index, i, "Entero", null)}
            is Boolean -> ItemData(index, i, "Booleano", if (i) "Verdadero" else "Falso")
            else -> ItemData(index, i, null, null)}
           llist.add(itemData)}}
    return llist}