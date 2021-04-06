fun main(){
    //declarando constantes
//para declararmos constantes em kotlin, usamos a palavra reservada val
    val txt = "olá,tudo bem"
    // vale lembrar que val é uma constante, portanto não posso reatribuir o seu valor
    //txt = "mudando" isso iria gerar um erro como "Val cannot be reassigned"
    println(txt)//exibe "olá,tudo bem"
//declaraão explícita de variável imutavel(val)
//também posso explicitar o tipo da minha constante ao criá-la
    val meuNome : String = "Luiz Paulo"
    println(meuNome)
//obs: note que os nomes das variáveis são escritos seguindo um padrão, esse padrao é
//lowerCamelCase ex: nomeDaFuncao, meu meuSobrenome, firstName, lastName etc
//também posso nomear tanto constantes quanto variáveis da seguinta forma
    val `uma frase legal`:String="tudo vale a pena quando a alma não é pequena"
    println(`uma frase legal`)
//declaração por inferência de tipo
    val `sera que funciona`= "e agora, José?"
    println(`sera que funciona`)

//criando variáveis mutáveis. Aqui, diferente das constantes, eu posso
//reatribuir valores, aqui usamos a palavra reservada var
//declaração por inferência de tipo:
    var num = 10
    num = 20 // reatribuindo valor
    println(num)
//declaração explícita:
    var number:Int = 10
    number = 50 // reatribuindo valor
    println(number)

//o valor das variáveis pode ser reatribuido, mas seu tipo não.
    var meuSobrenome = "Davis"
    // meuSobrenome = 10 //observe que estou tentando atribuir um valor numérico para uma string
    //println(meuNome)//exibe um erro de compilação
//como é de se esperar, o mesmo ocorre com declaração explícita de tipo, veja:
    var diaAniversario:Int = 19
    //diaAniversario = "Davis" //atribuindo string a int
    //println(diaAniversario)//exibe erro de compilação

}

