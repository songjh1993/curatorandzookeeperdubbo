package com.imooc.common.utils;

import org.apache.curator.framework.CuratorFramework;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author abird
 * @date:2019-05-26
 * @Description:
 */
public class ZKCurator {
    private CuratorFramework client = null;

    private static final Logger log = LoggerFactory.getLogger(ZKCurator.class);

    public ZKCurator(CuratorFramework client) {
        this.client = client;
    }

    public void init() {
        client = client.usingNamespace("zk-curator-connector");
    }

    /**
     * 判断zk是否连接
     * @return
     */
    public boolean isZkAlive() {
        return client.isStarted();
    }
}
