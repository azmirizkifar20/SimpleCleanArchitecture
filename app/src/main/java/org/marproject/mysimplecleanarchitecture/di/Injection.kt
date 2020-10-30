package org.marproject.mysimplecleanarchitecture.di

import org.marproject.mysimplecleanarchitecture.data.IMessageDataSource
import org.marproject.mysimplecleanarchitecture.data.MessageDataSource
import org.marproject.mysimplecleanarchitecture.data.MessageRepository
import org.marproject.mysimplecleanarchitecture.domain.IMessageRepository
import org.marproject.mysimplecleanarchitecture.domain.MessageInteractor
import org.marproject.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}
