/*
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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class RequestServiceOfCloudDBExpertRequest extends RpcAcsRequest<RequestServiceOfCloudDBExpertResponse> {
	
	public RequestServiceOfCloudDBExpertRequest() {
		super("Rds", "2014-08-15", "RequestServiceOfCloudDBExpert", "rds");
	}

	private String serviceRequestType;

	private String serviceRequestParam;

	private String dBInstanceId;

	public String getServiceRequestType() {
		return this.serviceRequestType;
	}

	public void setServiceRequestType(String serviceRequestType) {
		this.serviceRequestType = serviceRequestType;
		if(serviceRequestType != null){
			putQueryParameter("ServiceRequestType", serviceRequestType);
		}
	}

	public String getServiceRequestParam() {
		return this.serviceRequestParam;
	}

	public void setServiceRequestParam(String serviceRequestParam) {
		this.serviceRequestParam = serviceRequestParam;
		if(serviceRequestParam != null){
			putQueryParameter("ServiceRequestParam", serviceRequestParam);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	@Override
	public Class<RequestServiceOfCloudDBExpertResponse> getResponseClass() {
		return RequestServiceOfCloudDBExpertResponse.class;
	}

}
