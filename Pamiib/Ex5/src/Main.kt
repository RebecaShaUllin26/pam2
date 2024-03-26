
package funcoes
inline fun <T> executarComLog(nomefuncao: String, funcao: () ->T): T {
    println("Entrando no método Snome Funcao...")
    try {
        return funcao()
    } finally{
        println("Retodo SnomeFuncao finalizado...")
    }

}
fun somar(a: Int, b: Int): Int {
    return a + b
}
  fun main(args: Array<String>){
      val resultado = executarComLog("somar") {
          somar (4, 5)
      }
      println(resultado)
  }


