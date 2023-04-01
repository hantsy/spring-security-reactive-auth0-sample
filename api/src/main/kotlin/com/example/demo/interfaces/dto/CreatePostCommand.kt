package com.example.demo.interfaces.dto

import jakarta.validation.constraints.NotBlank

data class CreatePostCommand(
    @NotBlank val title: String,
    @NotBlank val content: String
)
