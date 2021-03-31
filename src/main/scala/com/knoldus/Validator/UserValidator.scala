//Utkarsh.
package com.knoldus.Validator

import com.knoldus.Entity.User
import com.knoldus.database.UserReadDto

class UserValidator {
  def userIsValid(user: User): Boolean = {
    if (
        user.email.matches("^\\S+@\\S+\\.(com|net|org|in)$") &&
        user.id.isValidInt &&
        user.contactNo.isValidLong &&
        user.address.matches("^[a-zA-Z\\\\s]+$"))
      {
        true
      }


    else {
      false
    }

  }


}
