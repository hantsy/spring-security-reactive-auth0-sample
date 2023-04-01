package com.example.demo.domain.repository

import com.example.demo.domain.model.Comment
import java.util.*
import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.data.repository.kotlin.CoroutineSortingRepository

interface CommentRepository :
        CoroutineSortingRepository<Comment, UUID>, CoroutineCrudRepository<Comment, UUID> {
    fun findByPostId(id: UUID): Flow<Comment>
}
