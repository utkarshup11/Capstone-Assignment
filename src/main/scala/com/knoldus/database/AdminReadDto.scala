package com.knoldus.database

import com.knoldus.Entity.Admin

import scala.collection.mutable.HashMap

abstract class AdminReadDto
{
  var firstAdmin = Admin( 1, "Rahul" , "utkarshup11@gmail.com" , "Gorakhpur" , 8173864498L)
  var secondAdmin = Admin( 2, "Manish" , "suraj@gmail.com" , "Lucknow" , 8173864488L)


  var admins: HashMap[Int, Admin] = HashMap(
    1 -> firstAdmin,
    2 -> secondAdmin,
  )

  def getAdminById(id: Int): Option[Admin] = admins.get(id)

}
