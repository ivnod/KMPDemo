package com.dbs.sgmb.kmpdemo.shared

interface Filter {
    fun getProdCodes(): List<String>
    fun getJointIndicator(): String
}