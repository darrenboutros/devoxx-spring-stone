package fr.devoxx.spring.stone.utils;

public class NotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(Integer id) {
		super("Could not find stone with position " +id);
	}

	
}
