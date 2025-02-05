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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class UpdateStackRequest extends RpcAcsRequest<UpdateStackResponse> {
	
	public UpdateStackRequest() {
		super("ROS", "2019-09-10", "UpdateStack", "ROS");
	}

	private String stackPolicyDuringUpdateURL;

	private String clientToken;

	private String templateBody;

	private String stackId;

	private Boolean disableRollback;

	private Long timeoutInMinutes;

	private Boolean usePreviousParameters;

	private String templateURL;

	private String stackPolicyDuringUpdateBody;

	private String stackPolicyURL;

	private List<Parameters> parameterss;

	private String stackPolicyBody;

	public String getStackPolicyDuringUpdateURL() {
		return this.stackPolicyDuringUpdateURL;
	}

	public void setStackPolicyDuringUpdateURL(String stackPolicyDuringUpdateURL) {
		this.stackPolicyDuringUpdateURL = stackPolicyDuringUpdateURL;
		if(stackPolicyDuringUpdateURL != null){
			putQueryParameter("StackPolicyDuringUpdateURL", stackPolicyDuringUpdateURL);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getTemplateBody() {
		return this.templateBody;
	}

	public void setTemplateBody(String templateBody) {
		this.templateBody = templateBody;
		if(templateBody != null){
			putQueryParameter("TemplateBody", templateBody);
		}
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		if(stackId != null){
			putQueryParameter("StackId", stackId);
		}
	}

	public Boolean getDisableRollback() {
		return this.disableRollback;
	}

	public void setDisableRollback(Boolean disableRollback) {
		this.disableRollback = disableRollback;
		if(disableRollback != null){
			putQueryParameter("DisableRollback", disableRollback.toString());
		}
	}

	public Long getTimeoutInMinutes() {
		return this.timeoutInMinutes;
	}

	public void setTimeoutInMinutes(Long timeoutInMinutes) {
		this.timeoutInMinutes = timeoutInMinutes;
		if(timeoutInMinutes != null){
			putQueryParameter("TimeoutInMinutes", timeoutInMinutes.toString());
		}
	}

	public Boolean getUsePreviousParameters() {
		return this.usePreviousParameters;
	}

	public void setUsePreviousParameters(Boolean usePreviousParameters) {
		this.usePreviousParameters = usePreviousParameters;
		if(usePreviousParameters != null){
			putQueryParameter("UsePreviousParameters", usePreviousParameters.toString());
		}
	}

	public String getTemplateURL() {
		return this.templateURL;
	}

	public void setTemplateURL(String templateURL) {
		this.templateURL = templateURL;
		if(templateURL != null){
			putQueryParameter("TemplateURL", templateURL);
		}
	}

	public String getStackPolicyDuringUpdateBody() {
		return this.stackPolicyDuringUpdateBody;
	}

	public void setStackPolicyDuringUpdateBody(String stackPolicyDuringUpdateBody) {
		this.stackPolicyDuringUpdateBody = stackPolicyDuringUpdateBody;
		if(stackPolicyDuringUpdateBody != null){
			putQueryParameter("StackPolicyDuringUpdateBody", stackPolicyDuringUpdateBody);
		}
	}

	public String getStackPolicyURL() {
		return this.stackPolicyURL;
	}

	public void setStackPolicyURL(String stackPolicyURL) {
		this.stackPolicyURL = stackPolicyURL;
		if(stackPolicyURL != null){
			putQueryParameter("StackPolicyURL", stackPolicyURL);
		}
	}

	public List<Parameters> getParameterss() {
		return this.parameterss;
	}

	public void setParameterss(List<Parameters> parameterss) {
		this.parameterss = parameterss;	
		if (parameterss != null) {
			for (int depth1 = 0; depth1 < parameterss.size(); depth1++) {
				putQueryParameter("Parameters." + (depth1 + 1) + ".ParameterValue" , parameterss.get(depth1).getParameterValue());
				putQueryParameter("Parameters." + (depth1 + 1) + ".ParameterKey" , parameterss.get(depth1).getParameterKey());
			}
		}	
	}

	public String getStackPolicyBody() {
		return this.stackPolicyBody;
	}

	public void setStackPolicyBody(String stackPolicyBody) {
		this.stackPolicyBody = stackPolicyBody;
		if(stackPolicyBody != null){
			putQueryParameter("StackPolicyBody", stackPolicyBody);
		}
	}

	public static class Parameters {

		private String parameterValue;

		private String parameterKey;

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public String getParameterKey() {
			return this.parameterKey;
		}

		public void setParameterKey(String parameterKey) {
			this.parameterKey = parameterKey;
		}
	}

	@Override
	public Class<UpdateStackResponse> getResponseClass() {
		return UpdateStackResponse.class;
	}

}
