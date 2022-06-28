package jp.ac.it_college.std.s21016.news_manager.domain.repository

import jp.ac.it_college.std.s21016.news_manager.domain.model.NewsWithCategoryModel

interface NewsRepository {
    fun findAllWithCategory(): List<NewsWithCategoryModel>

    fun findWithCategory(id: Long): NewsWithCategoryModel?
}