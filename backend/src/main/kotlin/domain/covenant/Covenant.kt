package domain.covenant

data class Covenant(
    val bankId: Int,
    val facilityId: Int?,
    val maxDefaultLikelihood: Float?,
    val bannedState: String?
)
