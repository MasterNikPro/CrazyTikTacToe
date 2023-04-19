package com.nikzakharenko.crazytictactoe.auth.domain


interface RegistrationUseCase {
     fun registration(auth: AuthModel)
}