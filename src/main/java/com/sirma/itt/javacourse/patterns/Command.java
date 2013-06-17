package com.sirma.itt.javacourse.patterns;

/**
 * The base command interface realizing the command pattern.
 */
public interface Command {
	/**
	 * the base execute command executing the certain methods of the reciever
	 * class.
	 */
	void execute();
}
