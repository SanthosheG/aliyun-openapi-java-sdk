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
public class DescribeDBInstanceIPArrayListRequest extends RpcAcsRequest<DescribeDBInstanceIPArrayListResponse> {
	
	public DescribeDBInstanceIPArrayListRequest() {
		super("Rds", "2014-08-15", "DescribeDBInstanceIPArrayList", "rds");
	}

	private Long resourceOwnerId;

	private String ownerAccount;

	private String whitelistNetworkType;

	private String dBInstanceId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getWhitelistNetworkType() {
		return this.whitelistNetworkType;
	}

	public void setWhitelistNetworkType(String whitelistNetworkType) {
		this.whitelistNetworkType = whitelistNetworkType;
		if(whitelistNetworkType != null){
			putQueryParameter("WhitelistNetworkType", whitelistNetworkType);
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
	public Class<DescribeDBInstanceIPArrayListResponse> getResponseClass() {
		return DescribeDBInstanceIPArrayListResponse.class;
	}

}
