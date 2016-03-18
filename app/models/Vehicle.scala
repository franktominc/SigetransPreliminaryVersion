package models

/**
  * Created by franktominc on 17/03/16.
  */
case class Vehicle(licensePlate: String,
                   city: City,
                   state: State,
                   brand: carBrand,
                   model: carModel,
                   degreeOfDamage: Degree
                  ) {

}
