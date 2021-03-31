//Utkarsh.
package com.knoldus.ImplTest

import com.knoldus.Entity.Admin
import com.knoldus.Implementation.AdminImpl
import org.scalatest.flatspec.AnyFlatSpec

class AdminImplTest extends AnyFlatSpec
{
  //scalastyle:off magic.number
  val adminImpl = new AdminImpl

  "Admin" should "be created when it is valid " in
    {
      assert(adminImpl.createAdmin(Admin(3,"newAdmin" , "admin@gmail.com" , "Noida" ,12345L)))
    }

  "Admin" should "not be created when email is not valid " in
    {
      assert( ! adminImpl.createAdmin(Admin(3,"newAdmin" , "admin@com" , "Noida" ,12345L)))
    }


  //update Admin test
  "Admin" should "be updated when everything  is valid " in
  {
    assert(adminImpl.updateAdmin(2,"Ashish","ash@gmail.com"))
  }


  "Admin" should "not be updated when everything  is not  valid " in
    {
      assert( adminImpl.updateAdmin(1,"Naman" , "hi@.com"))
    }

  //delete user
  "Admin " should "be deleted when found " in
    {
      assert(adminImpl.deleteAdmin(1))
    }




}
