package com.wjp.justlean.data.model

data class Page<T>(
    val page: Int,
    val totalCount: Int,
    val totalPage: Int,
    val limit: Int,
    val list: List<T>?
)
