package org.baeldung.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason="unauthorized")
public class ForbiddenException extends RuntimeException {}