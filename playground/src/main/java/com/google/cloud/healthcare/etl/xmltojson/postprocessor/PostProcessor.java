// Copyright 2020 Google LLC.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.cloud.healthcare.etl.xmltojson.postprocessor;

import java.util.Map;

/** Apply post processing steps into a serialized JSON string * */
public interface PostProcessor {
  /**
   * Method in charge of post process a CCDA json string
   *
   * @param jsonInput json string to be post processed
   * @return json string transformed to be compiant with CCDA release 2
   * @throws PostProcessorException
   */
  public String postProcess(String jsonInput) throws PostProcessorException;

  /**
   * Method in charge of post process a CCDA json string with additional fields
   *
   * @param jsonInput json string to be post processed
   * @param fields map of additional fields to add to the top level JSON
   * @return json string transformed to be compiant with CCDA release 2
   * @throws PostProcessorException
   */
  public String postProcessWithAdditionalFields(String jsonInput, Map<String, String> fields)
      throws PostProcessorException;
}
