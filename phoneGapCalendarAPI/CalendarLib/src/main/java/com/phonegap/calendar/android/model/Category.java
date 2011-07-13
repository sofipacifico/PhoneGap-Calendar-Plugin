/*
 * Copyright (c) 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.phonegap.calendar.android.model;

import com.google.api.client.util.Key;

/**
 * Defines the category of the content of the feed.
 * 
 * @since 2.2
 * @author Nicolas Garnier
 */
public class Category {

  @Key("@scheme")
  public String scheme;

  @Key("@term")
  public String term;

  @Override
  public boolean equals(Object category) {
    return (category instanceof Category)
        && (((this.scheme == null) && (((Category) category).scheme == null))
            || (this.scheme.equals(((Category) category).scheme)))
        && (((this.term == null) && (((Category) category).term == null))
            || (this.term.equals(((Category) category).term)));
  }
}