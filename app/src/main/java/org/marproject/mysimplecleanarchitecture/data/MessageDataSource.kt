package org.marproject.mysimplecleanarchitecture.data

import org.marproject.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
            MessageEntity("Hello $name! Welcome to Clean Architecture")
}