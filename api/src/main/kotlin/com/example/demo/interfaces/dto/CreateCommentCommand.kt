package com.example.demo.interfaces.dto

import jakarta.validation.constraints.NotBlank

data class CreateCommentCommand(
    @NotBlank val content: String
)
