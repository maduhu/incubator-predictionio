/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// All the classes in this folder extends some base classes or the other.
// Not goinig to comment all the files.

package org.apache.predictionio.controller.java

import org.apache.predictionio.controller.EngineParams
import org.apache.predictionio.controller.EngineParamsGenerator

import scala.collection.JavaConversions.asScalaBuffer

/** Define an engine parameter generator in Java
  *
  * Implementations of this abstract class can be supplied to "pio eval" as the second
  * command line argument.
  *
  * @group Evaluation
  */
abstract class JavaEngineParamsGenerator extends EngineParamsGenerator {

  /** Set the list of [[EngineParams]].
    *
    * @param engineParams A list of engine params
    */
  def setEngineParamsList(engineParams: java.util.List[_ <: EngineParams]) {
    engineParamsList = asScalaBuffer(engineParams)
  }
}
