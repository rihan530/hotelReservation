package com.example.hotelreservation

import java.time.LocalDate

data class ReservationList (val people : People, val reservationFee : Int, var checkInDate : LocalDate, var checkOutDate: LocalDate, val reserveRoom: Int)