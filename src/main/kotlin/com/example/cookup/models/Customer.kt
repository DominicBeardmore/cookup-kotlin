package com.example.cookup.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class Customer (
        @Id
        val id: ObjectId = ObjectId.get(),
        val firstName: String,
        val lastName: String,
        val createdDate: LocalDateTime = LocalDateTime.now(),
        val modifiedDate: LocalDateTime = LocalDateTime.now()
)

//class Customer constructor(firstName: String?, lastName: String?) {
//    @Id
//    var id: String? = null
//
//    var firstName: String? = null
//    var lastName: String? = null
//
////    fun Customer(firstName: String?, lastName: String?) {
////        this.firstName = firstName
////        this.lastName = lastName
////    }
//
//    override fun toString(): String {
//        return String.format(
//                "Customer[id=%s, firstName='%s', lastName='%s']",
//                id, firstName, lastName)
//    }
//}