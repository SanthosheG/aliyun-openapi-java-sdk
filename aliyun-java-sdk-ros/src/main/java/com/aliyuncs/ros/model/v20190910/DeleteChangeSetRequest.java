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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteChangeSetRequest extends RpcAcsRequest<DeleteChangeSetResponse> {
	
	public DeleteChangeSetRequest() {
		super("ROS", "2019-09-10", "DeleteChangeSet", "ROS");
	}

	private String changeSetId;

	public String getChangeSetId() {
		return this.changeSetId;
	}

	public void setChangeSetId(String changeSetId) {
		this.changeSetId = changeSetId;
		if(changeSetId != null){
			putQueryParameter("ChangeSetId", changeSetId);
		}
	}

	@Override
	public Class<DeleteChangeSetResponse> getResponseClass() {
		return DeleteChangeSetResponse.class;
	}

}
