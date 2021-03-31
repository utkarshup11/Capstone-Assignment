//Utkarsh.
package com.knoldus.ImplTest

import com.knoldus.Entity.User
import com.knoldus.Implementation.UserImpl
import com.knoldus.Validator.UserValidator
import org.mockito.MockitoSugar.mock
import org.scalatest.flatspec.AnyFlatSpec

import scala.collection.mutable

class UserImplTest extends AnyFlatSpec
{
  //scalastyle:off magic.number

  val userImpl = new UserImpl

  //create USer
  "user" should "be created when it is valid " in
  {
    assert(userImpl.createUser(User(3,"hello" , "hi@gmail.com" , "kdkdk" , 123L)))
  }

  "user" should "not be created when email is not valid " in
    {
      assert( ! userImpl.createUser(User(3,"hello" , "hi@.com" , "kdkdk" , 123L)))
    }


  //update user
  "user" should "be updated when everything  is valid " in
    {
      assert(userImpl.updateUser (2,"Utkarsh","utk@gmail.com"))
    }

  "user" should "not be updated when everything  is not  valid " in
    {
      assert( userImpl.updateUser(1,"Naman" , "hi@.com"))
    }

  //delete user
  "user " should "be deleted when found " in
  {
    assert(userImpl.deleteUser(1))
  }






}
