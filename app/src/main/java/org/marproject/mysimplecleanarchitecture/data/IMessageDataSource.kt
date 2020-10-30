package org.marproject.mysimplecleanarchitecture.data

import org.marproject.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}