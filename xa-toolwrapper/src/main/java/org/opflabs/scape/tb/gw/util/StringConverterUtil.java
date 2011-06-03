/*
 *  Copyright 2011 IMPACT (www.impact-project.eu)/SCAPE (www.scape-project.eu)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */

package org.opflabs.scape.tb.gw.util;

/**
 * StringConverterUtil
 * @author onbscs
 * @version 0.1
 */
public class StringConverterUtil {

    public static String packageNameToPackagePath(String pn) {
        String pp = pn.replaceAll("\\.", "/");
        return pp;
    }

    public static String varToProp(String var) {
        String prop = var.replaceAll("_", ".").toLowerCase();
        return prop;
    }

    public static String propToVar(String var) {
        String prop = var.replaceAll("\\.", "_").toUpperCase();
        return prop;
    }

    public static String typeToFilename(String var) {
        String ret = var.replaceAll(":", "_").toLowerCase();
        return ret;
    }

}
