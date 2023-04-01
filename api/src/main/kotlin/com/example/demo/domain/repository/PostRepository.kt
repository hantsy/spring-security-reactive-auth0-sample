package com.example.demo.domain.repository

import com.example.demo.domain.model.Post
import com.example.demo.domain.model.Status
import com.example.demo.interfaces.dto.PostSummary
import java.util.*
import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.data.repository.kotlin.CoroutineSortingRepository

interface PostRepository :
        CoroutineCrudRepository<Post, UUID>, CoroutineSortingRepository<Post, UUID> {
    fun findByTitleContains(title: String): Flow<PostSummary>
    fun findByStatus(status: Status): Flow<Post>
}
