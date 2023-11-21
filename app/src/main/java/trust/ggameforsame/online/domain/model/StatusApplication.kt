package trust.ggameforsame.online.domain.model

import trust.ggameforsame.online.ui.StateOrientation

sealed class StatusApplication {
    object Loading: StatusApplication()
    object NoConnect : StatusApplication()

    class Web (
        val url: String,
        val stateOrientation: StateOrientation
    ): StatusApplication()
}
