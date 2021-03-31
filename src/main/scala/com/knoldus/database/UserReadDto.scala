package com.knoldus.database

import com.knoldus.Entity.User

import scala.collection.mutable.HashMap

abstract class UserReadDto
{
  var firstUser = User( 1, "Utkarsh" , "utkarshup11@gmail.com" , "Gorakhpur" , 8173864498L)
  var secondUser = User( 2, "Suraj" , "suraj@gmail.com" , "Lucknow" , 8173864488L)


  var users: HashMap[Int, User] = HashMap(
    1 -> firstUser,
    2 -> secondUser
  )

  def getUserById(id: Int): Option[User] = users.get(id)



}
