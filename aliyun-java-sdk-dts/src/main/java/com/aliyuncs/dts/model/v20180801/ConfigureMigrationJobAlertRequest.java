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

package com.aliyuncs.dts.model.v20180801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ConfigureMigrationJobAlertRequest extends RpcAcsRequest<ConfigureMigrationJobAlertResponse> {
	
	public ConfigureMigrationJobAlertRequest() {
		super("Dts", "2018-08-01", "ConfigureMigrationJobAlert", "dts");
	}

	private String errorAlertPhone;

	private String delayAlertPhone;

	private String delayOverSeconds;

	private String delayAlertStatus;

	private String migrationJobId;

	private String errorAlertStatus;

	private String ownerId;

	public String getErrorAlertPhone() {
		return this.errorAlertPhone;
	}

	public void setErrorAlertPhone(String errorAlertPhone) {
		this.errorAlertPhone = errorAlertPhone;
		if(errorAlertPhone != null){
			putQueryParameter("ErrorAlertPhone", errorAlertPhone);
		}
	}

	public String getDelayAlertPhone() {
		return this.delayAlertPhone;
	}

	public void setDelayAlertPhone(String delayAlertPhone) {
		this.delayAlertPhone = delayAlertPhone;
		if(delayAlertPhone != null){
			putQueryParameter("DelayAlertPhone", delayAlertPhone);
		}
	}

	public String getDelayOverSeconds() {
		return this.delayOverSeconds;
	}

	public void setDelayOverSeconds(String delayOverSeconds) {
		this.delayOverSeconds = delayOverSeconds;
		if(delayOverSeconds != null){
			putQueryParameter("DelayOverSeconds", delayOverSeconds);
		}
	}

	public String getDelayAlertStatus() {
		return this.delayAlertStatus;
	}

	public void setDelayAlertStatus(String delayAlertStatus) {
		this.delayAlertStatus = delayAlertStatus;
		if(delayAlertStatus != null){
			putQueryParameter("DelayAlertStatus", delayAlertStatus);
		}
	}

	public String getMigrationJobId() {
		return this.migrationJobId;
	}

	public void setMigrationJobId(String migrationJobId) {
		this.migrationJobId = migrationJobId;
		if(migrationJobId != null){
			putQueryParameter("MigrationJobId", migrationJobId);
		}
	}

	public String getErrorAlertStatus() {
		return this.errorAlertStatus;
	}

	public void setErrorAlertStatus(String errorAlertStatus) {
		this.errorAlertStatus = errorAlertStatus;
		if(errorAlertStatus != null){
			putQueryParameter("ErrorAlertStatus", errorAlertStatus);
		}
	}

	public String getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId);
		}
	}

	@Override
	public Class<ConfigureMigrationJobAlertResponse> getResponseClass() {
		return ConfigureMigrationJobAlertResponse.class;
	}

}
