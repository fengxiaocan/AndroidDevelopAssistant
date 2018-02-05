package com.tlz.debugger

import android.content.ContentValues
import com.tlz.debugger.model.TableInfo
import com.tlz.debugger.model.TableWrapper

/**
 * Created by tomlezen.
 * Data: 2018/1/27.
 * Time: 16:00.
 */
interface DataProvider {

  /**
   * 获取数据库列表.
   */
  fun getDatabaseList(): List<String>

  /**
   * 获取数据库中所有表.
   */
  fun getAllTable(databaseName: String): TableWrapper

  /**
   * 执行sql数据查询.
   */
  fun executeQuery(dName: String, tName: String, sql: String): List<Any>

  /**
   * 执行sql命令.
   */
  fun executeSql(dName: String, sql: String): Boolean

  /**
   * 添加行数据.
   */
//  fun addRow(dName: String, tName: String)

  /**
   * 删除行数据.
   */
  fun deleteRow(dName: String, tName: String, where: String): Boolean

  /**
   * 更新行数据.
   */
  fun updateRow(dName: String, tName: String, contentValues: ContentValues, where: String): Boolean

  /**
   * 获取表的基本信息.
   */
  fun getTableInfo(dName: String, tName: String): TableInfo?

  /**
   * 获取表中数据条数.
   */
  fun getTableDataCount(dName: String, tName: String, where: String): Int

}