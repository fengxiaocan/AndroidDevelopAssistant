package com.tlz.debugger.model

/**
 * Created by tomlezen.
 * Data: 2018/1/30.
 * Time: 12:00.
 * @param name 数据库名.
 * @param version 数据库版本号.
 * @param tables 数据库中得所有表.
 */
data class Db(val name: String, val version: Int, val tables: List<TableInfo>)