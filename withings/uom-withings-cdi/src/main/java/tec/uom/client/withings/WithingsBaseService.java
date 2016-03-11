/*
 * Copyright 2016 Units of Measurement
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tec.uom.client.withings;

import org.agorava.api.oauth.OAuthService;
//import org.agorava.api.rest.Api;
import org.agorava.spi.ProviderApiService;

import tec.uom.client.withings.Withings;

import javax.inject.Inject;

/**
 * @author Werner Keil
 */
public abstract class WithingsBaseService extends ProviderApiService { // implements Api {

    public static String API_ROOT = "https://www.strava.com/api/v3/";

    @Inject
    @Withings
    private OAuthService service;

    @Override
    public String buildAbsoluteUri(String url) {
        return API_ROOT + url;
    }

    @Override
    public OAuthService getService() {
        return service;
    }

//	@Override
	public String getBaseUrl() {
		return API_ROOT;
	}
}
