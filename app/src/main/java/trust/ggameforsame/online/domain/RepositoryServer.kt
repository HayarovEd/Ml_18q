package trust.ggameforsame.online.domain

import trust.ggameforsame.online.data.Resource
import trust.ggameforsame.online.domain.model.basedto.BaseDto

interface RepositoryServer {
    suspend fun getDataDb() : Resource<BaseDto>
}