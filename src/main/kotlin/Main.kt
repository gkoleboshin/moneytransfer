fun main() {
    val amount = 500_050L
    val  calculationCommision = amount/10_000*75
    val commision = if (calculationCommision<3500){3500}else{calculationCommision}
    val commisonRub = commision/100
    val commisionKop = commision%100
    println("Комисия составляет: $commisonRub руб. $commisionKop коп.")
}
