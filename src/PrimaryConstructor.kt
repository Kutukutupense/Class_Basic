
// Primary Constructor
class ConstructorDog( var name: String,var age: Int,var color: String = "Black",var height: Int) {

    // fonksiyonlardaki gibi default değer verilebilir.
    // burada default olarak rengi siyah verdik ama istersek değiştirebiliriz


    // init bloğu primary constructerın body si yani iki süslü parantez {} arasıdır.
    // init bloğu, Kotlin'de bir sınıfın nesnesi oluşturulduğunda çalıştırılan bir başlangıç bloğudur.
    // Bu blok, sınıfın herhangi bir kodunu çalıştırmak için kullanılabilir
    // ve genellikle nesne oluşturulduğunda yapılması gereken ek işlemleri içerir.
    // init bloğu, sınıfın başlatıcısı (constructor) ile birlikte çalışır.
    // kelime anlamı initializing yani başlatmak,eşlemektir.
    init {
        println("Dog object is being created with the following details:")
        println("Name: $name")
        println("Age: $age")
        println("Color: $color")
        println("Height: $height")
    }

}

fun main(){
    var dog1 = ConstructorDog("Lucky",2,color = "Brown",12)
    dog1.name = "Kamil"
    println(dog1.name)
}

//--------------------------------------------------------------------------------------------

class Kedi(var name: String, var yas: Int){ //1. primary constructor tanımlanırken başına constructor gelmesi gerekmez.

}
class Kedi2 private constructor (var name: String, var yas: Int){

}
//2. ama constructor başına visibility modifiers gelmesi gerekiyorsa constructor diye tanımlanır.