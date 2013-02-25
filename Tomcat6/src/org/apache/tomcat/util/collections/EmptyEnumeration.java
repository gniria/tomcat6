/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.tomcat.util.collections;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/**
 * @deprecated
 */
public class EmptyEnumeration implements Enumeration {

    static EmptyEnumeration staticInstance=new EmptyEnumeration();

    public EmptyEnumeration() {
    }

    public static Enumeration getEmptyEnumeration() {
	return staticInstance;
    }
    
    public Object nextElement( ) {
	throw new NoSuchElementException( "EmptyEnumeration");
    }

    public boolean hasMoreElements() {
	return false;
    }
    
}
