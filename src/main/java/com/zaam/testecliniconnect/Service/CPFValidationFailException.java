package com.zaam.testecliniconnect.Service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "CPF não é válido!")
public class CPFValidationFailException extends RuntimeException{
}
