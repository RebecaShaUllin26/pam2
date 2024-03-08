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

fun main() {
    println("area do retangulo: ${calcularAreaRetangulo(2.0, 7.0)}")
    println("area do triangulo: ${calcularAreaTriangulo(3.0, 8.0)}")
    println("area do triangulo equilatero: ${calcularAreaTrianguloEquilatero(5.0)}")
    println("area do triangulo isosceles: ${calcularAreaTrianguloIsosceles(4.0, 6.0)}")
    println("area do triangulo escaleno: ${calcularAreaTrianguloEscaleno(3.0, 4.0, 5.0)}")
    println("area da circunferencia: ${calcularAreaCircunferencia(3.0)}")
    println("area do losango: ${calcularAreaLosango(4.0, 6.0)}")
    println("area do trapezio: ${calcularAreaTrapezio(4.0, 6.0, 8.0)}")
}

fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun calcularAreaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    return (lado.pow(2) * Math.sqrt(3.0)) / 4
}

fun calcularAreaTrianguloIsosceles(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun calcularAreaTrianguloEscaleno(a: Double, b: Double, c: Double): Double {
    val p = (a + b + c) / 2
    return Math.sqrt(p * (p - a) * (p - b) * (p - c))
}

fun calcularAreaCircunferencia(raio: Double): Double {
    return Math.PI * raio.pow(2)
}

fun calcularAreaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}

fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2

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



import kotlin.math.pow

fun main() {
    println("area do retangulo: ${calcularAreaRetangulo(2.0, 7.0)}")
    println("area do triangulo: ${calcularAreaTriangulo(3.0, 8.0)}")
    println("area do triangulo equilatero: ${calcularAreaTrianguloEquilatero(5.0)}")
    println("area do triangulo isosceles: ${calcularAreaTrianguloIsosceles(4.0, 6.0)}")
    println("area do triangulo escaleno: ${calcularAreaTrianguloEscaleno(3.0, 4.0, 5.0)}")
    println("area da circunferencia: ${calcularAreaCircunferencia(3.0)}")
    println("area do losango: ${calcularAreaLosango(4.0, 6.0)}")
    println("area do trapezio: ${calcularAreaTrapezio(4.0, 6.0, 8.0)}")
}

fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun calcularAreaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    return (lado.pow(2) * Math.sqrt(3.0)) / 4
}

fun calcularAreaTrianguloIsosceles(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun calcularAreaTrianguloEscaleno(a: Double, b: Double, c: Double): Double {
    val p = (a + b + c) / 2
    return Math.sqrt(p * (p - a) * (p - b) * (p - c))
}

fun calcularAreaCircunferencia(raio: Double): Double {
    return Math.PI * raio.pow(2)
}

fun calcularAreaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}

fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2
