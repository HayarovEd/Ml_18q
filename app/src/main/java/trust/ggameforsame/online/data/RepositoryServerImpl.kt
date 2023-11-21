package trust.ggameforsame.online.data

import trust.ggameforsame.online.data.Resource.Error
import trust.ggameforsame.online.data.Resource.Success
import trust.ggameforsame.online.domain.RepositoryServer
import trust.ggameforsame.online.domain.model.basedto.BaseDto
import javax.inject.Inject

class RepositoryServerImpl @Inject constructor(
    private val apiServer: ApiServer
) : RepositoryServer {
    override suspend fun getDataDb(): Resource<BaseDto> {
        return try {
            val folder = apiServer.getDataDb()
            Success(
                data = folder
            )
        } catch (e: Exception) {
            e.printStackTrace()
            Error(e.message ?: "An unknown error")
        }
    }
}