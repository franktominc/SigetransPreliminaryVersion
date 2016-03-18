package models

/**
  * Created by franktominc on 09/03/16.
  */
case class StatisticData(accidentType: AccidentType,
                         pavementType: PavementType,
                         roadSurface: RoadSurface,
                         accidentClassification: AccidentClassification,
                         roadState: RoadState,
                         roadProfile: RoadProfile,
                         climaticCondition: ClimaticCondition,
                         trafficSignCondition: Condition,
                         trafficPaintCondition: Condition,
                         roadDirection: RoadDirection,
                         visibility: Visibility,
                         zone: Zone,
                         probableCause: ProbableCause,
                         othersInformation: String
                        ) {

}
