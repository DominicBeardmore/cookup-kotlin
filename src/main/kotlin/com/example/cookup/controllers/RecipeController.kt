package com.example.cookup.controllers

import com.example.cookup.interfaces.RecipeInterface
import com.example.cookup.models.Recipe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api-recipe")
class RecipeController {
    @Autowired
    private val repository: RecipeInterface? = null

    @PostMapping("/save")
    fun save(@RequestBody recipe: Recipe): Recipe? {
        return repository?.save(recipe)
    }

    @GetMapping("/all")
    fun getAll(): MutableList<Recipe?>? {
        var recipes = repository?.findAll()
        return recipes
    }
}