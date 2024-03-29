package com.github.bordertech.taskmaster.service;

import java.io.Serializable;

/**
 * Invoke a service interface.
 *
 * @param <S> the criteria type
 * @param <T> the response type
 * @author Jonathan Austin
 * @since 1.0.0
 */
@FunctionalInterface
public interface ServiceAction<S extends Serializable, T extends Serializable> extends Serializable {

	/**
	 * Invoke service call.
	 *
	 * @param criteria the service criteria
	 * @return the service response
	 * @throws Exception if an exception occurs processing the service call
	 */
	T service(final S criteria) throws Exception;

}
