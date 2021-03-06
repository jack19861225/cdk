/*
 * Copyright 2013 Cloudera Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cloudera.cdk.data;

/**
 * <p>
 * Exception thrown for dataset-related failures.
 * </p>
 * <p>
 * Implementations of the {@link Dataset} interface throw this exception if
 * any of their operations fail. This is a runtime (unchecked) exception.
 * </p>
 *
 * @see Dataset
 * @since 0.2.0
 */
public class DatasetException extends RuntimeException {

  public DatasetException() {
    super();
  }

  public DatasetException(String message) {
    super(message);
  }

  public DatasetException(String message, Throwable t) {
    super(message, t);
  }

  public DatasetException(Throwable t) {
    super(t);
  }

}
