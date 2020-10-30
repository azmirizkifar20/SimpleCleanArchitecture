package org.marproject.mysimplecleanarchitecture.data

import org.marproject.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(
    private val messageDataSource: IMessageDataSource
) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}