package app.covenant

import domain.covenant.Covenant

object CovenantCSVTranslator {
    fun translate(row: Map<String, String>) =
        Covenant(
            bankId = row["bank_id"]!!.toInt(),
            facilityId = checkNull(row["facility_id"])?.toInt(),
            maxDefaultLikelihood = checkNull(row["max_default_likelihood"])?.toFloat(),
            bannedState = checkNull(row["banned_state"])
        )

    private fun checkNull(value: String?): String? {
        if (value == "") return null
        return value
    }
}