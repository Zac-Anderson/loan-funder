package app.loan

import domain.loan.Loan

object LoanCSVTranslator {
    fun translate(row: Map<String, String>) =
        Loan(
            id = row["id"]!!.toInt(),
            amount = row["amount"]!!.toInt(),
            interestRate = row["interest_rate"]!!.toFloat(),
            defaultLikelihood = row["default_likelihood"]!!.toFloat(),
            state = row["state"]!!
        )
}