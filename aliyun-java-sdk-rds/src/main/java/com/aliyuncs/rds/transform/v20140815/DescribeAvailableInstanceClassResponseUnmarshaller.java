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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeAvailableInstanceClassResponse;
import com.aliyuncs.rds.model.v20140815.DescribeAvailableInstanceClassResponse.AvailableZone;
import com.aliyuncs.rds.model.v20140815.DescribeAvailableInstanceClassResponse.AvailableZone.SupportedEngines;
import com.aliyuncs.rds.model.v20140815.DescribeAvailableInstanceClassResponse.AvailableZone.SupportedEngines.SupportedEngineVersions;
import com.aliyuncs.rds.model.v20140815.DescribeAvailableInstanceClassResponse.AvailableZone.SupportedEngines.SupportedEngineVersions.SupportedCategorys;
import com.aliyuncs.rds.model.v20140815.DescribeAvailableInstanceClassResponse.AvailableZone.SupportedEngines.SupportedEngineVersions.SupportedCategorys.SupportedStorageTypes;
import com.aliyuncs.rds.model.v20140815.DescribeAvailableInstanceClassResponse.AvailableZone.SupportedEngines.SupportedEngineVersions.SupportedCategorys.SupportedStorageTypes.AvailableResources;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAvailableInstanceClassResponseUnmarshaller {

	public static DescribeAvailableInstanceClassResponse unmarshall(DescribeAvailableInstanceClassResponse describeAvailableInstanceClassResponse, UnmarshallerContext _ctx) {
		
		describeAvailableInstanceClassResponse.setRequestId(_ctx.stringValue("DescribeAvailableInstanceClassResponse.RequestId"));

		List<AvailableZone> availableZones = new ArrayList<AvailableZone>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAvailableInstanceClassResponse.AvailableZones.Length"); i++) {
			AvailableZone availableZone = new AvailableZone();
			availableZone.setRegionId(_ctx.stringValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].RegionId"));
			availableZone.setZoneId(_ctx.stringValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].ZoneId"));
			availableZone.setStatus(_ctx.stringValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].Status"));
			availableZone.setNetworkTypes(_ctx.stringValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].NetworkTypes"));

			List<SupportedEngines> supportedEngine = new ArrayList<SupportedEngines>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine.Length"); j++) {
				SupportedEngines supportedEngines = new SupportedEngines();
				supportedEngines.setEngine(_ctx.stringValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine["+ j +"].Engine"));

				List<SupportedEngineVersions> supportedEngineVersion = new ArrayList<SupportedEngineVersions>();
				for (int k = 0; k < _ctx.lengthValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine["+ j +"].SupportedEngineVersion.Length"); k++) {
					SupportedEngineVersions supportedEngineVersions = new SupportedEngineVersions();
					supportedEngineVersions.setVersion(_ctx.stringValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine["+ j +"].SupportedEngineVersion["+ k +"].Version"));

					List<SupportedCategorys> supportedCategory = new ArrayList<SupportedCategorys>();
					for (int l = 0; l < _ctx.lengthValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine["+ j +"].SupportedEngineVersion["+ k +"].SupportedCategory.Length"); l++) {
						SupportedCategorys supportedCategorys = new SupportedCategorys();
						supportedCategorys.setCategory(_ctx.stringValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine["+ j +"].SupportedEngineVersion["+ k +"].SupportedCategory["+ l +"].Category"));

						List<SupportedStorageTypes> supportedStorageType = new ArrayList<SupportedStorageTypes>();
						for (int m = 0; m < _ctx.lengthValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine["+ j +"].SupportedEngineVersion["+ k +"].SupportedCategory["+ l +"].SupportedStorageType.Length"); m++) {
							SupportedStorageTypes supportedStorageTypes = new SupportedStorageTypes();
							supportedStorageTypes.setStorageType(_ctx.stringValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine["+ j +"].SupportedEngineVersion["+ k +"].SupportedCategory["+ l +"].SupportedStorageType["+ m +"].StorageType"));

							List<AvailableResources> availableResource = new ArrayList<AvailableResources>();
							for (int n = 0; n < _ctx.lengthValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine["+ j +"].SupportedEngineVersion["+ k +"].SupportedCategory["+ l +"].SupportedStorageType["+ m +"].AvailableResource.Length"); n++) {
								AvailableResources availableResources = new AvailableResources();
								availableResources.setDBInstanceClass(_ctx.stringValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine["+ j +"].SupportedEngineVersion["+ k +"].SupportedCategory["+ l +"].SupportedStorageType["+ m +"].AvailableResource["+ n +"].DBInstanceClass"));
								availableResources.setStorageRange(_ctx.stringValue("DescribeAvailableInstanceClassResponse.AvailableZones["+ i +"].SupportedEngine["+ j +"].SupportedEngineVersion["+ k +"].SupportedCategory["+ l +"].SupportedStorageType["+ m +"].AvailableResource["+ n +"].StorageRange"));

								availableResource.add(availableResources);
							}
							supportedStorageTypes.setAvailableResource(availableResource);

							supportedStorageType.add(supportedStorageTypes);
						}
						supportedCategorys.setSupportedStorageType(supportedStorageType);

						supportedCategory.add(supportedCategorys);
					}
					supportedEngineVersions.setSupportedCategory(supportedCategory);

					supportedEngineVersion.add(supportedEngineVersions);
				}
				supportedEngines.setSupportedEngineVersion(supportedEngineVersion);

				supportedEngine.add(supportedEngines);
			}
			availableZone.setSupportedEngine(supportedEngine);

			availableZones.add(availableZone);
		}
		describeAvailableInstanceClassResponse.setAvailableZones(availableZones);
	 
	 	return describeAvailableInstanceClassResponse;
	}
}