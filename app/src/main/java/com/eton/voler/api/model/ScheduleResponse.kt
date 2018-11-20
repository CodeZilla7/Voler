/*
 * MIT License
 *
 * Copyright (c) 2018 Eton Otieno
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.eton.voler.api.model

import com.google.gson.annotations.SerializedName

data class ScheduleResponse(
    @SerializedName("ScheduleResource")
    val resource: ScheduleResource
)

data class ScheduleResource(
    @SerializedName("Schedule")
    val schedules: List<Schedule>,
    @SerializedName("Meta")
    val metaData: Meta
)

data class Schedule(
    @SerializedName("TotalJourney")
    val totalJourney: TotalJourney,
    @SerializedName("Flight")
    val flight: Flight
)

data class TotalJourney(
    @SerializedName("Duration")
    val duration: String
)

data class Flight(
    @SerializedName("Departure")
    val departure: Departure,
    @SerializedName("Arrival")
    val arrival: Arrival,
    @SerializedName("MarketingCarrier")
    val marketingCarrier: MarketingCarrier,
    @SerializedName("OperatingCarrier")
    val operatingCarrier: OperatingCarrier,
    @SerializedName("Equipment")
    val equipment: Equipment,
    @SerializedName("Details")
    val details: Details
)

data class Departure(
    @SerializedName("AirportCode")
    val airportCode: String,
    @SerializedName("ScheduledTimeLocal")
    val scheduledTimeLocal: ScheduledTimeLocal
)

data class ScheduledTimeLocal(
    @SerializedName("DateTime")
    val dateTime: String
)

data class Arrival(
    @SerializedName("AirportCode")
    val airportCode: String,
    @SerializedName("ScheduledTimeLocal")
    val scheduledTimeLocal: ScheduledTimeLocal,
    @SerializedName("Terminal")
    val terminal: Terminal
)

data class Terminal(
    @SerializedName("Name")
    val name: Int
)

data class MarketingCarrier(
    @SerializedName("AirlineID")
    val airlineId: String,
    @SerializedName("FlightNumber")
    val flightNumber: Int
)

data class OperatingCarrier(
    @SerializedName("AirlineId")
    val airlineId: String
)

data class Equipment(
    @SerializedName("AircraftCode")
    val airportCode: String
)

data class Details(
    @SerializedName("Stops")
    val stops: Stops,
    @SerializedName("DaysOfOperation")
    val daysOfOperation: Int,
    @SerializedName("DatePeriod")
    val datePeriod: DatePeriod
)

data class Stops(
    @SerializedName("StopQuantity")
    val stopQuantity: Int
)

data class DatePeriod(
    @SerializedName("Effective")
    val effective: String,
    @SerializedName("Expiration")
    val expiration: String
)

data class Meta(
    @SerializedName("@Version")
    val version: String,
    @SerializedName("Link")
    val links: List<Link>
)

data class Link(
    @SerializedName("@Href")
    val href: String,
    @SerializedName("@Rel")
    val rel: String
)