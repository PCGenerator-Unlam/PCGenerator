package com.example.pcgenerator.repository

import com.example.pcgenerator.models.Ram
import com.example.pcgenerator.models.User

object UsersRepository {
    private val users:MutableList<User> = mutableListOf()

    init{
        addUser("unlam","1234")
    }

   fun addUser(username:String,password:String){
        users.add(User(username,password))
   }

    fun checkValidUser(username: String): Boolean{
        var usersFiltered = users.filter{user -> user.username.equals(username)}
        return usersFiltered.isEmpty()
    }

    fun checkLogIn(username: String, password:String):Boolean{
        return users.filter{user -> user.username == username && user.password == password}.isNotEmpty()
    }
}