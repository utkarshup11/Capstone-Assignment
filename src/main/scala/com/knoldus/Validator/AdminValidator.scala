//Utkarsh.
package com.knoldus.Validator

import com.knoldus.Entity.Admin
import com.knoldus.database.AdminReadDto

class AdminValidator
{
  def adminIsValid(admin : Admin): Boolean = {
    if (
      admin.address.matches("^[a-zA-Z\\\\s]+$") &&
      admin.email.matches("^\\S+@\\S+\\.(com|net|org|in)$") &&
      admin.id.isValidInt &&
      admin.contactNo.isValidLong &&
      admin.address.matches("^[a-zA-Z\\\\s]+$"))
      {
        true
      }
    else {
      false
    }
  }


}
