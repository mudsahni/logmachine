package com.pavedroad.logmachine.logging

data class LogEvent(
    val timestamp: String,
    val level: String,
    val logger: String,
    val message: String
)