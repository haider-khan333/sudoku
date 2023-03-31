package com.example.sudoku.common

import kotlin.coroutines.CoroutineContext


interface DispatcherProvider {
    fun provideUIContext(): CoroutineContext
}