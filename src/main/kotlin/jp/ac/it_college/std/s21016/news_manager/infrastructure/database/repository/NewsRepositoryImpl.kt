package jp.ac.it_college.std.s21016.news_manager.infrastructure.database.repository

import jp.ac.it_college.std.s21016.news_manager.domain.model.CategoryModel
import jp.ac.it_college.std.s21016.news_manager.domain.model.NewsModel
import jp.ac.it_college.std.s21016.news_manager.domain.model.NewsWithCategoryModel
import jp.ac.it_college.std.s21016.news_manager.domain.repository.NewsRepository
import jp.ac.it_college.std.s21016.news_manager.infrastructure.database.mapper.NewsMapper
import jp.ac.it_college.std.s21016.news_manager.infrastructure.database.mapper.NewsWithCategoryMapper
import jp.ac.it_college.std.s21016.news_manager.infrastructure.database.mapper.select
import jp.ac.it_college.std.s21016.news_manager.infrastructure.database.mapper.selectByPrimaryKey
import jp.ac.it_college.std.s21016.news_manager.infrastructure.database.record.NewsWithCategoryRecord
import org.springframework.stereotype.Repository

@Repository
class NewsRepositoryImpl(
    private val newsWithCategoryMapper: NewsWithCategoryMapper,
    private val newsMapper: NewsMapper
) : NewsRepository {
    override fun findAllWithCategory(): List<NewsWithCategoryModel> {
        return newsWithCategoryMapper.select {  }.map { toModel(it) }
    }

    override fun findWithCategory(id: Long): NewsWithCategoryModel? {
        return newsWithCategoryMapper.selectByPrimaryKey(id)?.let { toModel(it) }
    }

    private fun toModel(record: NewsWithCategoryRecord): NewsWithCategoryModel {
        val news = NewsModel(
            record.id!!,
            record.title!!,
            record.body!!,
            record.categoryId!!,
            record.userId!!,
            record.createAt!!,
            record.publishAt!!
        )
        val category = record.id?.let {
            CategoryModel(
                record.id!!,
                record.name!!
            )
        }
        return NewsWithCategoryModel(news, category)
    }
}