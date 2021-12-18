package com.example.cookup

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import com.example.cookup.models.Customer
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories


@EnableMongoRepositories
@SpringBootApplication
class CookupApplication
data class Message(val id: String?, val text: String)

fun main(args: Array<String>) {
	runApplication<CookupApplication>(*args)
}


@RestController
class CustomerResource{
	@Autowired
	private val repository: CustomerRepository? = null

	@GetMapping("mongo")
	fun index(): MutableList<Customer?> {
		repository!!.deleteAll()
		val defaultPatientId = ObjectId.get()
		repository.save(Customer(defaultPatientId, "Alice", "Smith"))
		repository.save(Customer(defaultPatientId, "Bob", "Smith"))

		return repository.findAll();
	}
}


@RestController
class MessageResource {
	@GetMapping
	fun index(): List<Message> = listOf(
			Message("1", "Hello!"),
			Message("2", "Bonjour!"),
			Message("3", "Privet!"),
	)
}

