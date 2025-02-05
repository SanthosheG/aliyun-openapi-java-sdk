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

package com.aliyuncs.ros.model.v20150901;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceDetailRequest extends RoaAcsRequest<DescribeResourceDetailResponse> {
	
	public DescribeResourceDetailRequest() {
		super("ROS", "2015-09-01", "DescribeResourceDetail", "ROS");
		setUriPattern("/stacks/[StackName]/[StackId]/resources/[ResourceName]");
		setMethod(MethodType.GET);
	}

	private String stackId;

	private String stackName;

	private String resourceName;

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putPathParameter("StackId", stackId);
		}
	}

	public String getStackName() {
		return this.stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
		if(stackName != null){
			putPathParameter("StackName", stackName);
		}
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
		if(resourceName != null){
			putPathParameter("ResourceName", resourceName);
		}
	}

	@Override
	public Class<DescribeResourceDetailResponse> getResponseClass() {
		return DescribeResourceDetailResponse.class;
	}

}
