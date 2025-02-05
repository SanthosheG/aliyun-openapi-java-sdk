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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDataAPIServiceRequest extends RpcAcsRequest<CreateDataAPIServiceResponse> {
	
	public CreateDataAPIServiceRequest() {
		super("Iot", "2018-01-20", "CreateDataAPIService", "iot");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private List<ResponseParam> responseParams;

	private String originSql;

	private String displayName;

	private String apiPath;

	private List<RequestParam> requestParams;

	private String folderId;

	private String templateSql;

	private String desc;

	public List<ResponseParam> getResponseParams() {
		return this.responseParams;
	}

	public void setResponseParams(List<ResponseParam> responseParams) {
		this.responseParams = responseParams;	
		if (responseParams != null) {
			for (int depth1 = 0; depth1 < responseParams.size(); depth1++) {
				putBodyParameter("ResponseParam." + (depth1 + 1) + ".Name" , responseParams.get(depth1).getName());
				putBodyParameter("ResponseParam." + (depth1 + 1) + ".Type" , responseParams.get(depth1).getType());
				putBodyParameter("ResponseParam." + (depth1 + 1) + ".Required" , responseParams.get(depth1).getRequired());
				putBodyParameter("ResponseParam." + (depth1 + 1) + ".Desc" , responseParams.get(depth1).getDesc());
				putBodyParameter("ResponseParam." + (depth1 + 1) + ".Example" , responseParams.get(depth1).getExample());
			}
		}	
	}

	public String getOriginSql() {
		return this.originSql;
	}

	public void setOriginSql(String originSql) {
		this.originSql = originSql;
		if(originSql != null){
			putQueryParameter("OriginSql", originSql);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	public String getApiPath() {
		return this.apiPath;
	}

	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
		if(apiPath != null){
			putQueryParameter("ApiPath", apiPath);
		}
	}

	public List<RequestParam> getRequestParams() {
		return this.requestParams;
	}

	public void setRequestParams(List<RequestParam> requestParams) {
		this.requestParams = requestParams;	
		if (requestParams != null) {
			for (int depth1 = 0; depth1 < requestParams.size(); depth1++) {
				putBodyParameter("RequestParam." + (depth1 + 1) + ".Name" , requestParams.get(depth1).getName());
				putBodyParameter("RequestParam." + (depth1 + 1) + ".Type" , requestParams.get(depth1).getType());
				putBodyParameter("RequestParam." + (depth1 + 1) + ".Required" , requestParams.get(depth1).getRequired());
				putBodyParameter("RequestParam." + (depth1 + 1) + ".Desc" , requestParams.get(depth1).getDesc());
				putBodyParameter("RequestParam." + (depth1 + 1) + ".Example" , requestParams.get(depth1).getExample());
			}
		}	
	}

	public String getFolderId() {
		return this.folderId;
	}

	public void setFolderId(String folderId) {
		this.folderId = folderId;
		if(folderId != null){
			putQueryParameter("FolderId", folderId);
		}
	}

	public String getTemplateSql() {
		return this.templateSql;
	}

	public void setTemplateSql(String templateSql) {
		this.templateSql = templateSql;
		if(templateSql != null){
			putQueryParameter("TemplateSql", templateSql);
		}
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putQueryParameter("Desc", desc);
		}
	}

	public static class ResponseParam {

		private String name;

		private String type;

		private Boolean required;

		private String desc;

		private String example;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getExample() {
			return this.example;
		}

		public void setExample(String example) {
			this.example = example;
		}
	}

	public static class RequestParam {

		private String name;

		private String type;

		private Boolean required;

		private String desc;

		private String example;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getRequired() {
			return this.required;
		}

		public void setRequired(Boolean required) {
			this.required = required;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public String getExample() {
			return this.example;
		}

		public void setExample(String example) {
			this.example = example;
		}
	}

	@Override
	public Class<CreateDataAPIServiceResponse> getResponseClass() {
		return CreateDataAPIServiceResponse.class;
	}

}
