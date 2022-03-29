package me.dio.apprepositories.data.repositories

import android.os.RemoteException
import kotlinx.coroutines.flow.flow
import me.dio.apprepositories.data.services.GitHubService
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possivel fazer a busca no momento!")
        }
    }
}