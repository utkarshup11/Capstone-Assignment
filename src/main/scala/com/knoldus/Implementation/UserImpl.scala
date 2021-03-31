package com.knoldus.Implementation

import com.knoldus.Entity.User
import com.knoldus.Validator.UserValidator
import com.knoldus.database.UserReadDto

import scala.collection.mutable
import scala.util.{Failure, Success, Try}

class UserImpl extends UserReadDto {

  val userValidator = new UserValidator
  var newHashMapUser = new mutable.HashMap[Int, User]()
  newHashMapUser = users

  //create user
  def createUser(user: User): Boolean = {
    if (userValidator.userIsValid(user)) {
      newHashMapUser = users + (user.id -> user)
      true
    }
    else {
      false
    }
  }

  //update user
  def updateUser(id: Int, newName: String , newEmail : String): Boolean = {
    val updateUser = User(id, newName,newEmail, users(id).address, users(id).contactNo)
    Try {
      if (userValidator.userIsValid(updateUser)) {
        newHashMapUser = newHashMapUser + (updateUser.id -> updateUser)
      }
    }
    match {
      case Success(newHashMapUser) => true
      case Failure(exception: Exception) => false
    }
  }

  // delete user
  def deleteUser(id: Int): Boolean = {
    Try {
      newHashMapUser = newHashMapUser - id
    }
    match {
      case Success(newHashMapUser) => true
      case Failure(exception) => false
    }
  }

  //list users
  def listUsers(): List[User] = {
    newHashMapUser.values.toList
  }
}
