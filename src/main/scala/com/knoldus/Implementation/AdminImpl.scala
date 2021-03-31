//Utkarsh.
package com.knoldus.Implementation

import com.knoldus.Entity.{Admin, User}
import com.knoldus.Validator.{AdminValidator, UserValidator}
import com.knoldus.database.AdminReadDto

import scala.collection.mutable
import scala.util.{Failure, Success, Try}

class AdminImpl extends AdminReadDto
{
  val adminValidator = new AdminValidator
  var newHashMapAdmin = new mutable.HashMap[Int, Admin]
  newHashMapAdmin = admins

  //create an Admin
  def createAdmin(admin : Admin): Boolean = {
    if (adminValidator.adminIsValid(admin)) {
      newHashMapAdmin = admins + (admin.id -> admin)
      true
    }
    else {
      false
    }
  }


  //update an admin
  def updateAdmin(id: Int, newName: String , newEmail : String): Boolean = {
    val updateAdmin = Admin(id, newName,newEmail, admins(id).address, admins(id).contactNo)
    Try {
      if (adminValidator.adminIsValid(updateAdmin)) {
        newHashMapAdmin = newHashMapAdmin + (updateAdmin.id -> updateAdmin)
      }
    }
    match {
      case Success(newHashMapAdmin) => true
      case Failure(exception: Exception) => false
    }
  }


    //delete an admin
    def deleteAdmin(id: Int): Boolean = {
      Try {
        newHashMapAdmin = newHashMapAdmin - id
      }
      match {
        case Success(newHashMapAdmin) => true
        case Failure(exception) => false
      }
    }

  //list users
  def listAdmins(): List[Admin] = {
    newHashMapAdmin.values.toList
  }





}
