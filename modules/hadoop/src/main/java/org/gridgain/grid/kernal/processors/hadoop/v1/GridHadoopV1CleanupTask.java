/* 
 Copyright (C) GridGain Systems. All Rights Reserved.
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.kernal.processors.hadoop.v1;

import org.apache.hadoop.mapred.*;
import org.gridgain.grid.*;
import org.gridgain.grid.hadoop.*;
import org.gridgain.grid.kernal.processors.hadoop.v2.GridHadoopV2Job;

import java.io.*;

/**
 * Hadoop cleanup task implementation for v1 API.
 */
public class GridHadoopV1CleanupTask extends GridHadoopV1Task {
    /** Abort flag. */
    private boolean abort;

    /**
     * @param taskInfo Task info.
     * @param abort Abort flag.
     */
    public GridHadoopV1CleanupTask(GridHadoopTaskInfo taskInfo, boolean abort) {
        super(taskInfo);

        this.abort = abort;
    }

    /** {@inheritDoc} */
    @Override public void run(GridHadoopTaskContext taskCtx) throws GridException {
        GridHadoopV2Job jobImpl = (GridHadoopV2Job) taskCtx.job();

        JobContext jobCtx = jobImpl.hadoopJobContext();

        try {
            OutputCommitter committer = jobCtx.getJobConf().getOutputCommitter();

            if (abort)
                committer.abortJob(jobCtx, JobStatus.State.FAILED);
            else
                committer.commitJob(jobCtx);
        }
        catch (IOException e) {
            throw new GridException(e);
        }
    }
}