package me.dio.apprepositories.domain

import kotlinx.coroutines.flow.Flow
import me.dio.apprepositories.core.UseCase
import me.dio.apprepositories.data.model.Repo
import me.dio.apprepositories.data.repositories.RepoRepository

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}