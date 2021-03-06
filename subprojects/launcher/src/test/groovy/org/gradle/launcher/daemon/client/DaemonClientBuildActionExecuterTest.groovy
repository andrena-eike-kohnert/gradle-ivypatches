/*
 * Copyright 2015 the original author or authors.
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

package org.gradle.launcher.daemon.client

import org.gradle.initialization.BuildRequestContext
import org.gradle.internal.invocation.BuildAction
import org.gradle.launcher.exec.BuildActionParameters
import spock.lang.Specification


class DaemonClientBuildActionExecuterTest extends Specification {
    def "wraps daemon client"() {
        given:
        def action = Mock(BuildAction)
        def requestContext = Mock(BuildRequestContext)
        def actionParameters = Mock(BuildActionParameters)
        def client = Mock(DaemonClient)

        when:
        client.execute(action, requestContext, actionParameters)

        then:
        1 * client.execute(action, requestContext, actionParameters)
    }
}
