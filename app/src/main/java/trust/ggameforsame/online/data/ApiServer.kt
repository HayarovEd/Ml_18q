package trust.ggameforsame.online.data


import trust.ggameforsame.online.domain.model.basedto.BaseDto
import retrofit2.http.GET

interface ApiServer {
    @GET ("game2/db.json")
    suspend fun getDataDb () : BaseDto
}