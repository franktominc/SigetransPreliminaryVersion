package models

/**
  * Created by franktominc on 19/02/16.
  */
case class Address(street: String,
                   number: String,
                   crossRoad: String,
                   neighborhood: Neighborhood,
                   reference: String,
                   geoLocation: GeoLocation
                   )
