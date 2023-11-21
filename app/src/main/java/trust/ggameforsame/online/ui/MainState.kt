package trust.ggameforsame.online.ui

import trust.ggameforsame.online.domain.model.StatusApplication


data class MainState(
    val statusApplication: StatusApplication = StatusApplication.Loading/*Web(url = "https://ya.ru/", offerName = "Offer")*/,
)
