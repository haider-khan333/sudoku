package com.example.sudoku.domain

interface IStatisticsRepository {
    suspend fun getStats(
        onSuccess: (UserStatistics) -> Unit,
        onError: (Exception) -> Unit
    )

    suspend fun updateStats(
        time: Long,
        difficulty: Difficulty,
        boundary: Int,
        onSuccess: (UserStatistics) -> Unit,
        onError: (Exception) -> Unit
    )
}