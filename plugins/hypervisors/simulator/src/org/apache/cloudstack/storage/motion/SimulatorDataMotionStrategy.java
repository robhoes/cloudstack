/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.cloudstack.storage.motion;

import com.cloud.agent.api.to.VirtualMachineTO;
import com.cloud.host.Host;
import org.apache.cloudstack.engine.subsystem.api.storage.*;
import org.apache.cloudstack.framework.async.AsyncCompletionCallback;

import java.util.Map;

public class SimulatorDataMotionStrategy implements DataMotionStrategy {
    @Override
    public boolean canHandle(DataObject srcData, DataObject destData) {
        return true;
    }

    @Override
    public boolean canHandle(Map<VolumeInfo, DataStore> volumeMap, Host srcHost, Host destHost) {
        return true;
    }

    @Override
    public Void copyAsync(DataObject srcData, DataObject destData, AsyncCompletionCallback<CopyCommandResult> callback) {
        CopyCommandResult result = new CopyCommandResult("something", null);
        callback.complete(result);
        return null;
    }

    @Override
    public Void copyAsync(Map<VolumeInfo, DataStore> volumeMap, VirtualMachineTO vmTo, Host srcHost, Host destHost, AsyncCompletionCallback<CopyCommandResult> callback) {
        CopyCommandResult result = new CopyCommandResult("something", null);
        callback.complete(result);
        return null;
    }
}
