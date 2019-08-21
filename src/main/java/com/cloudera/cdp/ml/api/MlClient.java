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

package com.cloudera.cdp.ml.api;

import javax.ws.rs.core.GenericType;
import com.cloudera.cdp.CdpClientException;
import com.cloudera.cdp.authentication.credentials.CdpCredentials;
import com.cloudera.cdp.client.CdpClient;
import com.cloudera.cdp.client.CdpClientConfiguration;
import com.cloudera.cdp.ml.model.CreateWorkspaceRequest;
import com.cloudera.cdp.ml.model.CreateWorkspaceResponse;
import com.cloudera.cdp.ml.model.DeleteWorkspaceRequest;
import com.cloudera.cdp.ml.model.DeleteWorkspaceResponse;
import com.cloudera.cdp.ml.model.Error;
import com.cloudera.cdp.ml.model.ListWorkspacesRequest;
import com.cloudera.cdp.ml.model.ListWorkspacesResponse;
import com.cloudera.cdp.ml.model.UpgradeWorkspaceRequest;
import com.cloudera.cdp.ml.model.UpgradeWorkspaceResponse;

@javax.annotation.Generated(value = "com.cloudera.cdp.client.codegen.CdpSDKJavaCodegen", date = "2019-08-21T14:31:31.858-07:00")
public class MlClient extends CdpClient {

  public static final String SERVICE_NAME = "api";

  public MlClient(
      CdpCredentials credentials,
      String endPoint,
      CdpClientConfiguration clientConfiguration) {
    super(credentials, endPoint, clientConfiguration);
  }

  /**
   * Create a Cloudera Machine Learning workspace.
   * @param input
   * @return CreateWorkspaceResponse
   */
  public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling createWorkspace");
     }
    return this.invokeAPI("/api/v1/ml/createWorkspace", input, new GenericType<CreateWorkspaceResponse>(){});
  }

  /**
   * Delete Cloudera Machine Learning Workspace.
   * @param input
   * @return DeleteWorkspaceResponse
   */
  public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling deleteWorkspace");
     }
    return this.invokeAPI("/api/v1/ml/deleteWorkspace", input, new GenericType<DeleteWorkspaceResponse>(){});
  }

  /**
   * List Cloudera Machine Learnings workspaces.
   * @param input
   * @return ListWorkspacesResponse
   */
  public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling listWorkspaces");
     }
    return this.invokeAPI("/api/v1/ml/listWorkspaces", input, new GenericType<ListWorkspacesResponse>(){});
  }

  /**
   * Upgrade Cloudera Machine Learning workspace.
   * @param input
   * @return UpgradeWorkspaceResponse
   */
  public UpgradeWorkspaceResponse upgradeWorkspace(UpgradeWorkspaceRequest input) {
     if (input == null) {
        throw new CdpClientException("Missing the required parameter 'input' when calling upgradeWorkspace");
     }
    return this.invokeAPI("/api/v1/ml/upgradeWorkspace", input, new GenericType<UpgradeWorkspaceResponse>(){});
  }
}