package com.example.karenappcopy.data

import com.example.karenappcopy.data.room.Dao
import com.example.karenappcopy.data.room.RoomUserModels
import com.example.karenappcopy.domain.ModelDomain.UserDomainModels
import com.example.karenappcopy.domain.repository.Repository

class RepoImpl(private val dao: Dao) : Repository {

    override suspend fun saveUser(user: UserDomainModels) {
        dao.insert(RoomUserModels(login = user.login, password = user.password, id = 1))
    }

    override suspend fun getUser(): UserDomainModels {
        val log = dao.getUsers().login
        val pass = dao.getUsers().password
        val result = UserDomainModels(login = log.toString(), password = pass.toString(), id = 1)
        return result

    }


}