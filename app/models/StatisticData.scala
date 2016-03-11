package models

/**
  * Created by franktominc on 09/03/16.
  */
case class StatisticData(accidentType: Option[AccidentType],
                         pavementType: Option[PavementType],
                         roadSurface: Option[RoadSurface],
                         accidentClassification: Option[AccidentClassification],
                         roadState: Option[RoadState],
                         roadProfile: Option[RoadProfile],
                         climaticCondition: Option[ClimaticCondition],
                         trafficSignCondition: Option[Condition],
                         trafficPaintCondition: Option[Condition],
                         roadDirection: Option[RoadDirection],
                         visibility: Option[Visibility],
                         zone: Option[Zone],
                         othersInformation: Option[String]
                        ) {

}
