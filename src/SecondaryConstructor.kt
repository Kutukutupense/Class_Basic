//Primary Constructor
class Insan(var name: String, var yas: Int){

init{
    println("Primary Constructor Çalıştı")
}

    //Secondary Constructor
    constructor(name: String,  yas: Int, meslek: String):this(name,yas){

        println("Secondary Constructor Çalıştı")
    }

}
// Secondary Constructor Syntax
//constructor anahtar kelimesi geldikten sonra primary içindeki parametreler başında val
//ya da var olmadan secondary constructor içine gelir. eğer ekleyeceğimiz yeni bir parametre
// varsa eklenir. zaten yoksa secondary constructor oluşturmaya ne gerek var ? aynı parametrelere farklı bir
// parametre illa da yazılmak  istenmiyorsa primarydeki parametrelerin sırası secondaryde değiştirilerek yazılır.
// yoksa aynı sıra ile aynı parametlerin yazılmasına ide izin vermez
// yani primary de name-yas diye gidiyorsa  secondary constructor da yas-name diye tanımlanabilir.
// burada meslek parametresi eklendi. Sonrasında : dan sonra this kelimesi
// primary constructoru işaret eder ve parantez içinde yine primarynin parametreleri eklenir.


// Secondary Constructor Neden Kullanılır?
// Eğer bir class'ın  içinde farklı şeyler yapacaksak
// ya da aynı class'ı overload edip başka parametreler eklemek ve kullanmak istiyorsak
// secondary constructor oluştururuz.


fun main(){
    var insan1 = Insan("Eylem",35) //Primary Constructor Çalıştı.
    var insan2 = Insan("Eylem",35,"Yazzılım") // Secondary Constructor Çalıştı.
}

// Çıktı Olarak:
// Primary Constructor Çalıştı
// Primary Constructor Çalıştı
// Secondary Constructor Çalıştı
// çıktısı alırız çünkü secondary constructer çalışmadan önce her şekilde
// önce primary constructer da çalışır. yani secondary constructoru çağırsak bile
// secondary constructor bodysi içinde bir kod yazdığımızda  önce primary içindeki işlemleri yapar
// sonra secondary içindekileri yapar. Bu yüzden primary içindeki işlemlerin aynısını secondary içine yazmaya
// gerek yoktur. Yazarsak boşuna 2 kere çalışır.