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
public class DescribeResourceTypeDetailRequest extends RoaAcsRequest<DescribeResourceTypeDetailResponse> {
	
	public DescribeResourceTypeDetailRequest() {
		super("ROS", "2015-09-01", "DescribeResourceTypeDetail", "ROS");
		setUriPattern("/resource_types/[TypeName]");
		setMethod(MethodType.GET);
	}

	private String typeName;

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
		if(typeName != null){
			putPathParameter("TypeName", typeName);
		}
	}

	@Override
	public Class<DescribeResourceTypeDetailResponse> getResponseClass() {
		return DescribeResourceTypeDetailResponse.class;
	}

}
