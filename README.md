package funcoes
fun main(args: Array<String>) {
  for (n in ordenar(38, 3, 456, 8, 51, 1, 88, 73)){
      print("$n")
  }
}
fun ordenar(varag numeros: Int): IntArray{
    return  numeros.sortedArray()
}

package funcoes
Class Operacoes{
fun somar (a: Int; b:Int): Int{
return a + b
}
fun main (args: Array<String>){
println(cale(2, 3, Operacoes()::somar))
println(cale(2, 3, ::somar))
}

package funcoes
fun<E> filtrar(lista: Liat<E>, filtro: (E) -> Boolean:List<E> {
val listaFiltrada = ArrayList<E>()
for(e in lista){
if(filtro(e)){
listaFiltrada.add(e)
}
}
return listaFiltrada
}
fun comTresLetras(nome:String): Boolean {
return nome.length == 3
}
fun main (args: Array<String>){
val nomes = list0f("Ana", "Pedro", "Bia", "Gui", "Rebeca")
println(filtrar(nomes, ::comTresLetras))
}

package funcoes
inline fun transacao( funcao: () -> Unit) {
println("abrindo transção...")
try{
funcao()
} finally {
println("fechando transação")
}
}
fun main(args: Array<String>){
transacao{
println("Executando SQL1...")
println("Executando SQL2...")
println("Executando SQL3...")
}
}

package funcoes
inline fun <T> EexecutarComLog(nomeFuncao: String, funcao: () -> T): T {
println("Entrando no método $nomeFuncao...")
try {
return funcao()
} finally {
println("Metodo $nomeFuncao finalizado...")
}
}
fun somar(a: Int, b: Int): Int {
return a + b  
}
fun main(args: Array<String>) {
val resultado = executarComLog("somar"){
somar(4, 5)
}
println(resultado)
}


///
