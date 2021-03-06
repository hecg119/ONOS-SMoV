/*
 * Copyright 2017-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.incubator.net.l2monitoring.soam.delay;

import java.time.Instant;

/**
 * Object for representing Delay Measurement Current Stats.
 */
public interface DelayMeasurementStatCurrent extends DelayMeasurementStat {
    /**
     * The time that the current Measurement Interval started.
     * @return The start time as a java Instant
     */
    Instant startTime();

    /**
     * Builder for {@link org.onosproject.incubator.net.l2monitoring.soam.delay.DelayMeasurementStatCurrent}.
     */
    public interface DmStatCurrentBuilder extends DmStatBuilder {
        DmStatCurrentBuilder startTime(Instant startTime);
    }
}
