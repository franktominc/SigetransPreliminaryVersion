package models

/**
  * Created by ftominc on 3/27/16.
  */
case class GeoLocation(latitude: Double, longitude: Double) {
  require(latitude <= 90.0  && latitude >= -90.0)
  require(longitude <= 180 && longitude >= -180)

  def apply(latitude: Double, longitude: Double) = new GeoLocation(latitude, longitude)
}
