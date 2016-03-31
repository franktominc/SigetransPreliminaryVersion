package models

import play.api.libs.json.Json
import play.libs.Json

/**
  * Created by franktominc on 09/03/16.
  */
sealed trait AccidentType

case object RunningOver extends AccidentType{
  val id: Short = 1
  val description = "Atropelamento"

  override def toString = id + " " + description

}