package me.dio.apprepositories.data.repositories

import kotlinx.coroutines.flow.Flow
import me.dio.apprepositories.data.model.Repo

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}