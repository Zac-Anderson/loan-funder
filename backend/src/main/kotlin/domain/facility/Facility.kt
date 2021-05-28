package domain.facility

data class Facility(
    val id: Int,
    val bankId: Int,
    val interestRate: Float,
    val amount: Float
)
