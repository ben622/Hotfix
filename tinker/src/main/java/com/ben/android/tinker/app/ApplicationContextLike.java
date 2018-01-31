package com.ben.android.tinker.app;

import android.app.Application;
import android.content.Intent;

import com.tencent.tinker.anno.DefaultLifeCycle;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.loader.app.ApplicationLike;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * @author @zhangchuan622@gmail.com
 * @version 1.0
 * @create 2018/1/31
 */
@DefaultLifeCycle(application = ".AppContext", flags = ShareConstants.TINKER_ENABLE_ALL)
public class ApplicationContextLike extends ApplicationLike {
    public ApplicationContextLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        TinkerInstaller.install(this);
    }
}
