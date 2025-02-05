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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.vs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ContinuousAdjustRequest extends RpcAcsRequest<ContinuousAdjustResponse> {
	
	public ContinuousAdjustRequest() {
		super("vs", "2018-12-12", "ContinuousAdjust", "vs");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String focus;

	private String id;

	private String iris;

	private Long ownerId;

	public String getFocus() {
		return this.focus;
	}

	public void setFocus(String focus) {
		this.focus = focus;
		if(focus != null){
			putQueryParameter("Focus", focus);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public String getIris() {
		return this.iris;
	}

	public void setIris(String iris) {
		this.iris = iris;
		if(iris != null){
			putQueryParameter("Iris", iris);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<ContinuousAdjustResponse> getResponseClass() {
		return ContinuousAdjustResponse.class;
	}

}
