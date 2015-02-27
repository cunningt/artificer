/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.artificer.client;

import org.artificer.common.ArtificerException;

/**
 * Exception thrown by the S-RAMP client when an error of some kind is encountered.
 *
 * @author eric.wittmann@redhat.com
 */
public class ArtificerClientException extends ArtificerException {

	private static final long serialVersionUID = -5164848692868850533L;

	/**
	 * Constructor.
	 */
	public ArtificerClientException() {
	}

	/**
	 * Constructor.
	 * @param message
	 */
	public ArtificerClientException(String message) {
		super(message);
	}

	/**
	 * Constructor.
	 * @param message
	 * @param cause
	 */
	public ArtificerClientException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor.
	 * @param cause
	 */
	public ArtificerClientException(Throwable cause) {
		super(cause);
	}

}
