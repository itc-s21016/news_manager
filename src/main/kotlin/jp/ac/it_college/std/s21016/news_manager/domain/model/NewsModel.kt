package jp.ac.it_college.std.s21016.news_manager.domain.model

import java.sql.Timestamp

data class NewsModel(
    val id: Long? = null,
    val title: String? = null,
    val categoryId: Long? = null,
    val publishAt: Timestamp? = null,
    val createAt: Timestamp? = null,
    val userId: Long? = null,
    val body: String? = null
)
