package com.example.cookup

import com.example.cookup.models.Customer
import org.springframework.data.mongodb.repository.MongoRepository

interface CustomerRepository : MongoRepository<Customer?, String?> {
    fun findByFirstName(firstName: String?): Customer?
    fun findByLastName(lastName: String?): List<Customer?>?
    override fun deleteAll()
}