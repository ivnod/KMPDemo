package com.dbs.sgmb.kmpdemo

interface Filter {
    fun getProdCodes(): List<String>
    fun getJointIndicator(): String
}