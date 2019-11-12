package com.wjp.justlean.data.model

data class NetBase<T>(
    val code: Int,
    val msg: String,
    val data: T?
)