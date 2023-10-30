package com.etiqa.EtiqaAccessment.exception;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class BaseException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private HttpStatus status;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private LocalDateTime timestamp;
	
	private String error;
	
	private String message;
	
	private String info;
	
	private Map<String, Object> details;

	
	public BaseException(HttpStatus status) {		
	    this();
	    this.status = status;
	}

	BaseException(HttpStatus status, Throwable ex) {
	    this();
	    this.status = status;
	    this.message = "Unexpected error";
	    this.error = ex.getLocalizedMessage();
	}

	BaseException(HttpStatus status, String message, Throwable ex) {
	    this();
	    this.status = status;
	    this.message = message;
	    this.error = ex.getLocalizedMessage();
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public Map<String, Object> getDetails() {
		return details;
	}

	public void setDetails(Map<String, Object> details) {
		this.details = details;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}