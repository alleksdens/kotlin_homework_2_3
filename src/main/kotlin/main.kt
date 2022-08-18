fun main() {
    val lastOrder = 1005
    val currentOrder = 10005
    val isUserMusicFan = true
    val stdDiscount = 100

    val firstDiscount = if ((1000 < lastOrder) && (lastOrder <= 10000)) {
        currentOrder - stdDiscount
    } else if (lastOrder > 10000) {
        currentOrder - currentOrder / 100 * 5
    } else currentOrder

    val totalDiscount = if (isUserMusicFan) {
        firstDiscount - firstDiscount / 100
    } else firstDiscount
    println("Покупка на сумму: $currentOrder рублей ->")
    println("После применения всех скидок: $totalDiscount рублей")
}