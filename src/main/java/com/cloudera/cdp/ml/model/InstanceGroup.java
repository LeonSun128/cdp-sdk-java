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
import com.cloudera.cdp.ml.model.Autoscaling;
import com.cloudera.cdp.ml.model.RootVolume;
import java.util.*;

/**
 * Contains the necessary info for an instance group.
 **/
@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-08-21T14:31:31.858-07:00")
public class InstanceGroup  {

  /**
   * The auto scaling configuration.
   **/
  private Autoscaling autoscaling = null;

  /**
   * The networking rules for the ingress.
   **/
  private List<String> ingressRuless = new ArrayList<String>();

  /**
   * The initial number of instance node.
   **/
  private Integer instanceCount = null;

  /**
   * The tier of the instance i.e. on-demand/spot.
   **/
  private String instanceTier = null;

  /**
   * The cloud provider instance type for the node instance.
   **/
  private String instanceType = null;

  /**
   * The unique name of the instance group.
   **/
  private String name = null;

  /**
   * The root volume of the instance.
   **/
  private RootVolume rootVolume = null;

  /**
   * Getter for autoscaling.
   * The auto scaling configuration.
   **/
  @JsonProperty("autoscaling")
  public Autoscaling getAutoscaling() {
    return autoscaling;
  }

  /**
   * Setter for autoscaling.
   * The auto scaling configuration.
   **/
  public void setAutoscaling(Autoscaling autoscaling) {
    this.autoscaling = autoscaling;
  }

  /**
   * Getter for ingressRuless.
   * The networking rules for the ingress.
   **/
  @JsonProperty("ingressRuless")
  public List<String> getIngressRuless() {
    return ingressRuless;
  }

  /**
   * Setter for ingressRuless.
   * The networking rules for the ingress.
   **/
  public void setIngressRuless(List<String> ingressRuless) {
    this.ingressRuless = ingressRuless;
  }

  /**
   * Getter for instanceCount.
   * The initial number of instance node.
   **/
  @JsonProperty("instanceCount")
  public Integer getInstanceCount() {
    return instanceCount;
  }

  /**
   * Setter for instanceCount.
   * The initial number of instance node.
   **/
  public void setInstanceCount(Integer instanceCount) {
    this.instanceCount = instanceCount;
  }

  /**
   * Getter for instanceTier.
   * The tier of the instance i.e. on-demand/spot.
   **/
  @JsonProperty("instanceTier")
  public String getInstanceTier() {
    return instanceTier;
  }

  /**
   * Setter for instanceTier.
   * The tier of the instance i.e. on-demand/spot.
   **/
  public void setInstanceTier(String instanceTier) {
    this.instanceTier = instanceTier;
  }

  /**
   * Getter for instanceType.
   * The cloud provider instance type for the node instance.
   **/
  @JsonProperty("instanceType")
  public String getInstanceType() {
    return instanceType;
  }

  /**
   * Setter for instanceType.
   * The cloud provider instance type for the node instance.
   **/
  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }

  /**
   * Getter for name.
   * The unique name of the instance group.
   **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Setter for name.
   * The unique name of the instance group.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter for rootVolume.
   * The root volume of the instance.
   **/
  @JsonProperty("rootVolume")
  public RootVolume getRootVolume() {
    return rootVolume;
  }

  /**
   * Setter for rootVolume.
   * The root volume of the instance.
   **/
  public void setRootVolume(RootVolume rootVolume) {
    this.rootVolume = rootVolume;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceGroup instanceGroup = (InstanceGroup) o;
    if (!Objects.equals(this.autoscaling, instanceGroup.autoscaling)) {
      return false;
    }
    if (!Objects.equals(this.ingressRuless, instanceGroup.ingressRuless)) {
      return false;
    }
    if (!Objects.equals(this.instanceCount, instanceGroup.instanceCount)) {
      return false;
    }
    if (!Objects.equals(this.instanceTier, instanceGroup.instanceTier)) {
      return false;
    }
    if (!Objects.equals(this.instanceType, instanceGroup.instanceType)) {
      return false;
    }
    if (!Objects.equals(this.name, instanceGroup.name)) {
      return false;
    }
    if (!Objects.equals(this.rootVolume, instanceGroup.rootVolume)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoscaling, ingressRuless, instanceCount, instanceTier, instanceType, name, rootVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceGroup {\n");
    sb.append("    autoscaling: ").append(toIndentedString(autoscaling)).append("\n");
    sb.append("    ingressRuless: ").append(toIndentedString(ingressRuless)).append("\n");
    sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
    sb.append("    instanceTier: ").append(toIndentedString(instanceTier)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rootVolume: ").append(toIndentedString(rootVolume)).append("\n");
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
