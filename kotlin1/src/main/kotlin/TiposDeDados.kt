fun main(){
    //em kotlin, tudo é objeto, isso significa que que todas as variáveis e tipos
//que usamos em kotlin possuem propriedades e métodos;
//São eles:
//Numeros:Inteiros
//Long - 64 bits
//Int - 32 bits
//Short - 16 bits
//Byte - 8 bites
//A propriedade MAX_VALUE retorna o tamanho máximo suportado por cada tip

    println(" o tamanho máximo suportado por um Long é: ${Long.MAX_VALUE}")
    println(" o tamanho máximo suportado por um Int é: ${Int.MAX_VALUE}")
    println(" o tamanho máximo suportado por um Short é: ${Short.MAX_VALUE}")
    println(" o tamanho máximo suportado por um Byte é: ${Byte.MAX_VALUE}")

//Números:Ponto Flutuante
//Double - 64 bits
//Float - 32 bits

    val myFloat:Float=38.49F //valores em ponto flutuante devem vir seguidos da letra "F"
    val myDouble:Double=55.43
    println(myFloat)
    println(myDouble)

    println("o tamanho máximo suportado por um Float é: ${Float.MAX_VALUE}")
    println("o tamanho máximo suportado por um Double é: ${Double.MAX_VALUE}")
    val myLong= 20L
    //valores do tipo Long devem estar junto ao sufixo "L"
    println(myLong)
    val exmploLong:Long = 8 //com o tipo explícito, o uso do "L" não se faz necessário
    val outroLong = 8 //nesse caso,sem o L, será criado um Int
    println("${exmploLong}, ${outroLong}")
//Short: são valores inteiros com a metade do numero de bits:
    val myShort:Short=5
    println("esse é um short, ${myShort}")

//String - é um tipo para você usar quando quer guardar valores em texto,
//tais como uma frase, um nome etc, nelas usamos aspas duplas:
    val meuNome:String = "Luiz Paulo"
    val lastName= "Davis" //por inferência de tipo
    println(meuNome)
    println(lastName)
//também é possivel definir uma string com várias linhas
//para isso, use aspas triplas:
    val textao = """não rimarei a palavra sono
com a incorrespondente palavra outono
rimarei com a palavra
carne"""
    println(textao)
////Char - esse tipo serve para quando quer guardar caracteres:
//em char, usamos aspas simples '':
    val caracter: Char= '@'
    println(caracter)
    val caracter2 = '#'
    println(caracter2)

//Boolean, semelhante ao do Java e de outras linguagens, pode ser true ou false:
    val myTrue:Boolean = true
    val myFalse = false
    println("${myTrue} e ${myFalse}")
}