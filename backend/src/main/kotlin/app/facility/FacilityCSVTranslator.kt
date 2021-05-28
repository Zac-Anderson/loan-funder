package app.facility

import domain.facility.Facility

object FacilityCSVTranslator {
    fun translate(row: Map<String, String>) =
        Facility(
            id = row["id"]!!.toInt(),
            bankId = row["bank_id"]!!.toInt(),
            interestRate = row["interest_rate"]!!.toFloat(),
            amount = row["amount"]!!.toFloat()
        )
}