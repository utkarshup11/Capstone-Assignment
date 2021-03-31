//Utkarsh.
package com.knoldus.ValidatorTest

import com.knoldus.Entity.Admin
import com.knoldus.Validator.AdminValidator
import org.scalatest.flatspec.AnyFlatSpec

class AdminValidatorTest extends AnyFlatSpec
{
  //scalastyle:off magic.number
  val adminValidator = new AdminValidator

  "Admin Validator " should " be valid " in
  {
    val admin = Admin(12,"Aman","aman@gmail.com" ,"Delhi",12345L)
    assert(adminValidator.adminIsValid(admin))
  }

  "Admin Validator " should " only be valid when email id of admin is valid  " in
    {
      val admin = Admin(12,"Aman","aman@gmail.com" ,"Delhi",12345L)
      assert(adminValidator.adminIsValid(admin))
    }

  "Admin Validator " should " not be valid when email id of admin is not valid  " in
    {
      val admin = Admin(12,"Aman","aman@.com" ,"Delhi",12345L)
      assert( ! adminValidator.adminIsValid(admin))
    }


}
