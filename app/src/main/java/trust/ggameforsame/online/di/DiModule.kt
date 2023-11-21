package trust.ggameforsame.online.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import trust.ggameforsame.online.data.RepositoryServerImpl
import trust.ggameforsame.online.domain.RepositoryServer
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class DiModule {


    @Binds
    @Singleton
    abstract fun bindRepositoryServer(repository: RepositoryServerImpl): RepositoryServer

}