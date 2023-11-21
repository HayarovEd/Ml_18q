package trust.ggameforsame.online.domain.model.basedto


import com.google.gson.annotations.SerializedName
import trust.ggameforsame.online.domain.model.basedto.AppConfig

data class BaseDto(
    @SerializedName("app_config")
    val appConfig: AppConfig,
)