package domain.loan

data class Loan(
    val id: Int,
    val amount: Int,
    val interestRate: Float,
    val defaultLikelihood: Float,
    val state: String
)
