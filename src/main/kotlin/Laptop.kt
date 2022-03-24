//a kotlin class
class Laptop(brandValue: String, ramValue: Int, year: String) {

    var brand: String = brandValue

    var ram: Int = ramValue

    var builtYear: String = year


    fun provideInformation() {
        println("Our function is running")
        println("Laptop brand $brand")
        println("Laptop ram $ram")
        println("Laptop built year $builtYear")
    }


}

fun main() {
    val laptop = Laptop(brandValue = "Apple", ramValue = 16, year = "2022")
    laptop.provideInformation()
}