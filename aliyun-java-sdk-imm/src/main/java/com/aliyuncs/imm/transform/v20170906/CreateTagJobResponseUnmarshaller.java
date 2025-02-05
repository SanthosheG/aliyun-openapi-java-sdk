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

package com.aliyuncs.imm.transform.v20170906;

import com.aliyuncs.imm.model.v20170906.CreateTagJobResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTagJobResponseUnmarshaller {

	public static CreateTagJobResponse unmarshall(CreateTagJobResponse createTagJobResponse, UnmarshallerContext _ctx) {
		
		createTagJobResponse.setRequestId(_ctx.stringValue("CreateTagJobResponse.RequestId"));
		createTagJobResponse.setJobId(_ctx.stringValue("CreateTagJobResponse.JobId"));
		createTagJobResponse.setSetId(_ctx.stringValue("CreateTagJobResponse.SetId"));
		createTagJobResponse.setSrcUri(_ctx.stringValue("CreateTagJobResponse.SrcUri"));
		createTagJobResponse.setStatus(_ctx.stringValue("CreateTagJobResponse.Status"));
		createTagJobResponse.setPercent(_ctx.integerValue("CreateTagJobResponse.Percent"));
		createTagJobResponse.setCreateTime(_ctx.stringValue("CreateTagJobResponse.CreateTime"));
		createTagJobResponse.setFinishTime(_ctx.stringValue("CreateTagJobResponse.FinishTime"));
	 
	 	return createTagJobResponse;
	}
}