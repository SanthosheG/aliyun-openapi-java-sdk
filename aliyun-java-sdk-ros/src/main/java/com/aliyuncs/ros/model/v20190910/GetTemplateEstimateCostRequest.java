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
public class GetTemplateEstimateCostRequest extends RpcAcsRequest<GetTemplateEstimateCostResponse> {
	
	public GetTemplateEstimateCostRequest() {
		super("ROS", "2019-09-10", "GetTemplateEstimateCost", "ROS");
	}

	private String clientToken;

	private String templateBody;

	private List<Parameters> parameterss;

	private String templateURL;

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

	public String getTemplateURL() {
		return this.templateURL;
	}

	public void setTemplateURL(String templateURL) {
		this.templateURL = templateURL;
		if(templateURL != null){
			putQueryParameter("TemplateURL", templateURL);
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
	public Class<GetTemplateEstimateCostResponse> getResponseClass() {
		return GetTemplateEstimateCostResponse.class;
	}

}
