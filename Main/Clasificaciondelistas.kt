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
    var inf: String? = ""
    var tipo: String? = ""
    var cont: Int = 0
    var pos: Int = 0
    
    val llist = ArrayList<ItemData>()
    if (inputList == null) return null
    
    for (i in inputList){
       if (i != null){
        
       pos = cont
       cont = cont + 1 
        
        when (i) {
            is String -> {
                tipo = "Cadena"}
            is Int -> {
                tipo = "Entero"
                if (i%10 == 0){
                    inf = "M10"
                }
                else if (i%5 == 0){
                    inf = "M5"
                }
                else if (i%2 == 0){
                    inf = "M2"
                }
                else{
                    inf = null
                }
            }
            
            is Boolean -> {
                tipo = "Booleano"
                if (i == true){
                    inf = "Verdadero"
                }
                else if(i == false){
                    inf = "Falso"
                }
            }
            else -> {
                tipo = null
                inf = null
            }
  
        }
        val element = ItemData (
            originalPos = pos,
            originalValue = i,
            type = tipo,
            info = inf)
            
        llist.add(element)
    }
     
    


  }
    return llist
}