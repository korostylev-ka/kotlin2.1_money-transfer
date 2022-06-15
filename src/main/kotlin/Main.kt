fun main() {
    //переменная суммы перевода в копейках
    val amount = 2_000_000
    val commission = if (amount * 0.0075 > 3500) (amount * 0.0075).toInt() else 3500
    println("Комиссия за перевод $amount копеек составила $commission копеек")

}