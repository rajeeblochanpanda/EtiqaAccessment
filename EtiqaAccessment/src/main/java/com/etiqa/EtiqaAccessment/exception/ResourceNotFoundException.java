package com.etiqa.EtiqaAccessment.exception;

public class ResourceNotFoundException extends RuntimeException {
	/**
		 * 
		 */
	private static final long serialVersionUID = 918405895587732393L;
	String resourceName;
	String fieldName;
	long fieldValue;

	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

}