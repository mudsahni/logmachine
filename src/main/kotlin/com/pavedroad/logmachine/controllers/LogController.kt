package com.pavedroad.logmachine.controllers

import com.pavedroad.logmachine.logging.LogEvent
import com.pavedroad.logmachine.services.SSEService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class LogController(
    @Autowired val sseService: SSEService
) {

    @PostMapping("/log")
    fun greeting(
        @RequestBody logEvent: LogEvent
    ): ResponseEntity<String> {
        sseService.sendEvent("log-service", logEvent)
    return ResponseEntity.ok().build()
    }

}
