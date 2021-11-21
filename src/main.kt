fun main() {
    For5()
}

fun For5() {
    print(
        "For5◦\n" +
                ". Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,\n" +
                "0.2, . . . , 1 кг конфет.\n"
    )
    print("Введите цену за КГ : ")
    var kgPrice = readLine()!!.toDouble()

    for (i in 1..10) {
        println("Цена за ${i}00г = ${kgPrice*i/10} руб.")
    }
}
