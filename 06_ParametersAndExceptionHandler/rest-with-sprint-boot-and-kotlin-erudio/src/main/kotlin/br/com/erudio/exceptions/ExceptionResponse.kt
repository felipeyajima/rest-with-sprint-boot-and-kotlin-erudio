package br.com.erudio.exceptions

import java.util.Date

class ExceptionResponse (
    val timestamp: Date,
    // quando colocamos ?, é opcional a entrada de parametro
    val message: String?,
    val details: String
)