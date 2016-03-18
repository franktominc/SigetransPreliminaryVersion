package models

import java.util.Date

import org.joda.time.DateTime

/**
  * Created by franktominc on 19/02/16.
  */
case class CarAccident(CityCode : Short,
                       PartnerCode: Short,
                       Id: BigInt,
                       date: DateTime,
                       address :Address,
                      statisticData: StatisticData,
                       involved :List[Involved],
                       vehicles :List[Vehicle]
                      )
