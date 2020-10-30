package org.marproject.mysimplecleanarchitecture

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.marproject.mysimplecleanarchitecture.domain.IMessageRepository
import org.marproject.mysimplecleanarchitecture.domain.MessageEntity
import org.marproject.mysimplecleanarchitecture.domain.MessageInteractor
import org.marproject.mysimplecleanarchitecture.domain.MessageUseCase
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class MessageUseCaseTest {

    private lateinit var messageUseCase: MessageUseCase

    @Mock private lateinit var messageRepository: IMessageRepository

    @Before
    fun setUp() {
        messageUseCase = MessageInteractor(messageRepository)
        val dummyMessage = MessageEntity("Hello $NAME Welcome back euy")
        `when`(messageRepository.getWelcomeMessage(NAME)).thenReturn(dummyMessage)
    }

    @Test fun `should get data fromrepository`() {
        messageUseCase.getMessage(NAME)

        verify(messageRepository).getWelcomeMessage(NAME)
        verifyNoMoreInteractions(messageRepository)
    }

    companion object {
        const val NAME = "Dicoding"
    }
}