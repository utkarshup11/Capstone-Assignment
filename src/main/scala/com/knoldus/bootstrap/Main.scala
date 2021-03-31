//Utkarsh.
package com.knoldus.bootstrap

import com.knoldus.Entity.{Admin, User}
import com.knoldus.Implementation.{AdminImpl, UserImpl}
import com.knoldus.database.UserReadDto

object Main extends  UserReadDto
{
  val userImpl = new UserImpl
  val adminImpl = new AdminImpl
  def main(args: Array[String]): Unit =
  {
    //scalastyle:off magic.number

    //for users
    val newUser =  User(3,"hello" , "hi" , "kdkdk" , 123L)
    //create User
    userImpl.createUser(newUser)
    println("After Adding Users---" + userImpl.newHashMapUser)

    //update user which has id =1
    userImpl.updateUser(1,"Vipul","vipul@gmail.com")
    println("After Updating Users---" + userImpl.newHashMapUser)

    //delete user
   userImpl.deleteUser(2)
    println("After Deleting Users---" + userImpl.newHashMapUser)

    //list all users
    println("After Listing Users---" + userImpl.newHashMapUser)
    println()



    //for admins
    val newAdmin = Admin(3,"newAdmin" , "admin@gmail.com" , "Noida" ,12345L)
    //create Admin
    adminImpl.createAdmin(newAdmin)
    println("After Adding Admin---" + adminImpl.newHashMapAdmin)

    //update admin
   adminImpl.updateAdmin( 2 ,"NewNAme" , "admin.new@gmail.com" )
    println("After Updating Admin  ---" + adminImpl.newHashMapAdmin)

    //delete an Admin
    adminImpl.deleteAdmin(2)
    println("After Deleting Admin---" + adminImpl.newHashMapAdmin)

    //list all admin
    println("List All Admins --- " + adminImpl.listAdmins())

  }

}
