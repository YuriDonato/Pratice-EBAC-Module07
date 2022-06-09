package com.example.modulo7tarefaa

/*
* Funcoes de extensao e classes especiais
*   Atividade 1
*       Crie uma funcao de extensao para o tipo primitivo String, que transforma a string em uma
*       lista de strings composta por todas as letras da mesma
*   Atividade 2
*       Crie um enum DayOfWeek que contem todos os dias da semana
*       Associe cada valor do enum a uma string que devera conter o dia da semana ex: MONDAY("monday")
*   Atividade 3
*       Crie um singleton chamado UtilityHelper
*       Crie uma propriedade privada do tipo do enum criado na atividade anterior chamada currentDay
*       Inicialize o valor de currentDay como SUNDAY
*       Crie um metodo setCurrentDay que altera o valor da propriedade currentDay
*       Crie um metodo isWeekend que retorna verdadeiro quando o valor de currentDay é sabado ou domingo
*   Atividade 4
*       Pegue uma instancia do singleton que criamos anteriormente
*       Use o metodo setCurrentday e altere o dia da semana para segundafeira
*       Chame o metodo isWeekend e confira se ele esta retornando falso
*       Pegue uma nova instancia do singleton e usando setCurrentDay altere o dia atual para domingo
*       Chame o metodo isWeekend e confira se agora ele esta retornando verdadeiro
* */
/*
//Atividade 1


fun main() {
    var palavra = "Yara é muito linda"
    palavra.forEach()


}
fun String.forEach(): MutableList<String>{
    var posicao = 0
    var letra:Char
    val quantidadeLetras = this.length

    val listaDeString: MutableList<String> = mutableListOf()

    do{
        letra = this[posicao]
        listaDeString.add(letra.toString())
        println(listaDeString[posicao])
        posicao++
    }while(posicao!=quantidadeLetras)
    return listaDeString

}
*/

/*
//Atividade 2
enum class DayOfWeek(Day: String){
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday")
}*/

/*//Atividade 3
fun main() {
    UtilityHelper.isPrint()
    UtilityHelper.setCurrentDay(DayOfWeek.SATURDAY)
    UtilityHelper.isPrint()
    UtilityHelper.isWeekend()

}
object UtilityHelper{
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY
    private var isweekend: Boolean = false

    fun setCurrentDay(newDayChange: DayOfWeek){
        this.currentDay = newDayChange
    }

    fun isWeekend() {
        isweekend = this.currentDay == DayOfWeek.SATURDAY || this.currentDay == DayOfWeek.SUNDAY
        return println("Fim de semana? $isweekend")
    }

    fun isPrint() = println(currentDay)
}

enum class DayOfWeek(Day: String){
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday")
}*/

/*//Atividade 4
fun main() {
    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    UtilityHelper.isPrint()
    UtilityHelper.isWeekend()
    var novaInstancia = UtilityHelper
    novaInstancia.setCurrentDay(DayOfWeek.SUNDAY)
    novaInstancia.isPrint()
    UtilityHelper.isWeekend()

}
object UtilityHelper{
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY
    private var isWeekend: Boolean = false

    fun setCurrentDay(newDayChange: DayOfWeek){
        this.currentDay = newDayChange
    }

    fun isWeekend() {
        isWeekend = this.currentDay == DayOfWeek.SATURDAY || this.currentDay == DayOfWeek.SUNDAY
        return println("Fim de semana? $isWeekend")
    }

    fun isPrint() = println(currentDay)
}

enum class DayOfWeek(Day: String){
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday")
}
*/
