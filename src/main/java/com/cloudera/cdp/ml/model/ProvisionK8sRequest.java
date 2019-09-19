/*
 * Copyright (c) 2018 Cloudera, Inc. All Rights Reserved.
 *
 * Portions Copyright (c) Copyright 2013-2018 Amazon.com, Inc. or its
 * affiliates. All Rights Reserved.
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

package com.cloudera.cdp.ml.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.cloudera.cdp.client.CdpResponse;
import com.cloudera.cdp.ml.model.InstanceGroup;
import com.cloudera.cdp.ml.model.Tag;
import java.util.*;

/**
 * Request object for workspace provision.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-09-19T14:17:02.417-07:00")
public class ProvisionK8sRequest  {

  /**
   * The environment for the workspace to create.
   **/
  private String environmentName = null;

  /**
   * The instance groups.
   **/
  private List<InstanceGroup> instanceGroups = new ArrayList<InstanceGroup>();

  /**
   * Tags to add to the cloud provider resources created. This is in addition to any tags added by Cloudera.
   **/
  private List<Tag> tags = new ArrayList<Tag>();

  /**
   * Getter for environmentName.
   * The environment for the workspace to create.
   **/
  @JsonProperty("environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  /**
   * Setter for environmentName.
   * The environment for the workspace to create.
   **/
  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  /**
   * Getter for instanceGroups.
   * The instance groups.
   **/
  @JsonProperty("instanceGroups")
  public List<InstanceGroup> getInstanceGroups() {
    return instanceGroups;
  }

  /**
   * Setter for instanceGroups.
   * The instance groups.
   **/
  public void setInstanceGroups(List<InstanceGroup> instanceGroups) {
    this.instanceGroups = instanceGroups;
  }

  /**
   * Getter for tags.
   * Tags to add to the cloud provider resources created. This is in addition to any tags added by Cloudera.
   **/
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }

  /**
   * Setter for tags.
   * Tags to add to the cloud provider resources created. This is in addition to any tags added by Cloudera.
   **/
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionK8sRequest provisionK8sRequest = (ProvisionK8sRequest) o;
    if (!Objects.equals(this.environmentName, provisionK8sRequest.environmentName)) {
      return false;
    }
    if (!Objects.equals(this.instanceGroups, provisionK8sRequest.instanceGroups)) {
      return false;
    }
    if (!Objects.equals(this.tags, provisionK8sRequest.tags)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, instanceGroups, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionK8sRequest {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    instanceGroups: ").append(toIndentedString(instanceGroups)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line except the first indented by 4 spaces.
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

