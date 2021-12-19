package com.example.cookup.models

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Recipe (
    @Id
    val id: ObjectId = ObjectId.get(),
    val recipeName: String,
    val cookingTime: Int,
    val description: String,
    val stepCount: Int,
    val ingredients: List<Ingredient>,
    val utensils: List<Utensil>
)

class Ingredient (
    val ingredientName: String,
    val quantity: Int,
    val unit: UNIT
)

enum class UNIT { kg, ml, tsp}

data class Utensil (val utensilName : String, val quantity: Int )