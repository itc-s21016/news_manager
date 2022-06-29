package jp.ac.it_college.std.s21016.news_manager.domain.repository

import jp.ac.it_college.std.s21016.news_manager.infrastructure.database.record.Users
import org.apache.catalina.User

interface UserRepository {
    fun find(email: String) : Users?
}