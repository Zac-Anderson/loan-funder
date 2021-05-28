package app.bank

import domain.bank.Bank

object BankCSVTranslator {
    fun translate(row: Map<String, String>) =
        Bank(
            id = row["id"]!!.toInt(),
            name = row["name"]!!
        )
}