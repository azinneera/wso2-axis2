/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.axis2.rmi.metadata;

import junit.framework.TestCase;
import org.apache.axis2.rmi.Configurator;
import org.apache.axis2.rmi.exception.MetaDataPopulateException;
import org.apache.axis2.rmi.metadata.impl.TypeImpl;
import org.apache.axis2.rmi.metadata.service.dto.ChildClass;

import java.util.HashMap;
import java.util.Map;


public class TypeTest extends TestCase {

    public void testChildClass() {

        Configurator configurator = new Configurator();
        Map processedTypeMap = new HashMap();

        Type type = new TypeImpl(ChildClass.class);
        try {
            type.populateMetaData(configurator,processedTypeMap);
        } catch (MetaDataPopulateException e) {
            fail();
        }
    }
}
