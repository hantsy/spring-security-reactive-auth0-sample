package com.example.demo.interfaces.dto

import jakarta.validation.constraints.NotBlank

data class UpdatePostCommand(
    @NotBlank val title: String,
    @NotBlank val content: String
)
