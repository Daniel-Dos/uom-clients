/*
 * Copyright 2015 Units of Measurement
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

package tec.uom.client.fitbit.model.activity;

import javax.measure.Quantity;
import javax.measure.quantity.Length;

/**
 * Created by IntelliJ IDEA.
 * User: Anakar Parida
 * Date: 5/2/15
 * Time: 7:16 PM
 */
public class ActivityDistance {
    private final String activity;
    private final Quantity<Length> distance;

    public ActivityDistance(String activity, Quantity<Length> distance) {
        this.activity = activity;
        this.distance = distance;
    }

    public String getActivity() {
        return activity;
    }

    public Quantity<Length> getDistance() {
        return distance;
    }
}
