package act.db.util;

/*-
 * #%L
 * ACT Framework
 * %%
 * Copyright (C) 2014 - 2017 ActFramework
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import act.db.TimestampGeneratorBase;
import org.joda.time.LocalTime;

public class JodaLocalTimeTsGenerator extends TimestampGeneratorBase<LocalTime> {
    @Override
    public Class<LocalTime> timestampType() {
        return LocalTime.class;
    }

    @Override
    public LocalTime now() {
        return LocalTime.now();
    }
}
