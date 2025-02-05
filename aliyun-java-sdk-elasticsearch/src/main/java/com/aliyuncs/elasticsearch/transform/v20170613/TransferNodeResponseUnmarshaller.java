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

package com.aliyuncs.elasticsearch.transform.v20170613;

import com.aliyuncs.elasticsearch.model.v20170613.TransferNodeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class TransferNodeResponseUnmarshaller {

	public static TransferNodeResponse unmarshall(TransferNodeResponse transferNodeResponse, UnmarshallerContext _ctx) {
		
		transferNodeResponse.setRequestId(_ctx.stringValue("TransferNodeResponse.RequestId"));
		transferNodeResponse.setCode(_ctx.stringValue("TransferNodeResponse.Code"));
		transferNodeResponse.setMessage(_ctx.stringValue("TransferNodeResponse.Message"));
		transferNodeResponse.setResult(_ctx.booleanValue("TransferNodeResponse.Result"));
	 
	 	return transferNodeResponse;
	}
}