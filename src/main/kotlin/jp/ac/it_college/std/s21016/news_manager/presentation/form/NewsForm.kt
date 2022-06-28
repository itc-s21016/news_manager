package jp.ac.it_college.std.s21016.news_manager.presentation.form

import jp.ac.it_college.std.s21016.news_manager.domain.model.NewsWithCategoryModel
import java.sql.Timestamp

data class GetNewsListResponse(val newsList: List<NewsInfo>)

data class NewsInfo(
    val title: String,
    val body: String,
    val categoryId: Long,
    val publishAt: Timestamp
){
    constructor(model: NewsWithCategoryModel) : this(
        model.news.title!!, model.news.body!!, model.news.categoryId!!, model.news.publishAt!!
    )
}

data class GetNewsDetailResponse(
    val id: Long,
    val title: String,
    val userId: Long
){
    constructor(model: NewsWithCategoryModel) : this(
        model.news.id!!,
        model.news.title!!,
        model.news.userId!!
    )
}

data class CategoryInfo(
    val
)