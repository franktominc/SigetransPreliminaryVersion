package models

import java.util.Date

/**
  * Created by franktominc on 17/03/16.
  */
case class Involved(name: String,
                    age: Byte,
                    sex: Char,
                    address: Address,
                    mothersName: String,
                    situation: Situation,
                    positionOnTheVehicle: Position,
                    vehicleType: VehicleType,
                    securityCondition: SecurityCondition,
                    injuryLevel: InjuryLevel,
                    probableConduct: ProbableConduct,
                    evolution: Evolution
                   ) {

}

case class Driver(involved: Involved,
                  licensedToDrive: Licensed,
                  driversLicenseLevel: LicenseLevel,
                  firstLicenseDate: Date,
                  licenseExpirationDate: Date
                 ){

}