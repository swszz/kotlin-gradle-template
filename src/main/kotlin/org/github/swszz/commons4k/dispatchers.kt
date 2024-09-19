package org.github.swszz.commons4k

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExecutorCoroutineDispatcher
import kotlinx.coroutines.asCoroutineDispatcher
import java.util.concurrent.Executors

/**
 *  Dispatcher of ThreadPerTaskExecutor
 */
private val VirtualThreadDispatcher: ExecutorCoroutineDispatcher =
    Executors.newVirtualThreadPerTaskExecutor().asCoroutineDispatcher()

@Suppress("UnusedReceiverParameter")
val Dispatchers.Loom: CoroutineDispatcher
    get() = VirtualThreadDispatcher