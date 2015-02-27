/*
 * Copyright 2014 JBoss Inc
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
package org.artificer.common.error;


import org.artificer.common.i18n.Messages;

/**
 * @author Brett Meyer
 */
public class ArtificerNotFoundException extends ArtificerUserException {

    private static final long serialVersionUID = 3266741739558281824L;
    
    public ArtificerNotFoundException() {
        super();
    }

    public ArtificerNotFoundException(String message) {
        super(message);
    }

    public ArtificerNotFoundException(String msg, String stackTrace) {
        super(msg, stackTrace);
    }

    public static ArtificerNotFoundException storedQueryNotFound(String queryName) {
        return new ArtificerNotFoundException(Messages.i18n.format("STOREDQUERY_NOT_FOUND", queryName));
    }

    public static ArtificerNotFoundException contentNotFound(String uuid) {
        return new ArtificerNotFoundException(Messages.i18n.format("CONTENT_NOT_FOUND", uuid));
    }

    public static ArtificerNotFoundException artifactNotFound(String uuid) {
        return new ArtificerNotFoundException(Messages.i18n.format("ARTIFACT_NOT_FOUND", uuid));
    }

    public static ArtificerNotFoundException ontologyNotFound(String ontologyUuid) {
        return new ArtificerNotFoundException(Messages.i18n.format("ONTOLOGY_NOT_FOUND", ontologyUuid));
    }
}
