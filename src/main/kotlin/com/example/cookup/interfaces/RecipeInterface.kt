package com.example.cookup.interfaces
import com.example.cookup.models.Recipe
import org.springframework.data.mongodb.repository.MongoRepository

interface RecipeInterface : MongoRepository<Recipe?, String?>{}