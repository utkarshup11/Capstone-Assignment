//Utkarsh.
package com.knoldus.ValidatorTest

import com.knoldus.Entity.User
import com.knoldus.Validator.UserValidator
import org.scalatest.flatspec.AnyFlatSpec

class UserValidatorTest extends AnyFlatSpec
{
  //scalastyle:off magic.number
  val userValidator = new UserValidator

  "User validator " should " be valid " in
  {
    val user = User(1,"Utkarsh Upadhyay" ,"utkarsh1232@gmail.com" ,"Gkp",12345L)
    assert(userValidator.userIsValid(user))
  }

  "User validator " should " be valid when email is valid  " in
    {
      val user = User(1,"Utkarsh Upadhyay" ,"utkars32@gmail.com" ,"Gkp",12345L)
      assert(userValidator.userIsValid(user))
    }

  "User validator " should " not be valid when email is not valid  " in
    {
      val user = User(1,"Utkarsh Upadhyay" ,"djsd@.com" ,"Gkp",12345L)
      assert(!userValidator.userIsValid(user))
    }

  it should "be containing int value only as a Id " in
  {
    val user = User(1,"Utkarsh Upadhyay" ,"djsd@gmail.com" ,"Gkp",12345L)
    assert(userValidator.userIsValid(user))
  }
}


