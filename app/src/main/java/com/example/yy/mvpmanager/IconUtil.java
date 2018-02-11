package com.example.yy.mvpmanager;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by yy on 2018/2/11.
 * 描述：
 */

public class IconUtil {
    public static final String ACTIVITY_ALIAS_1 = "com.example.yy.mvpmanager.ActivityAlias1";
    public static final String ACTIVITY_ALIAS_2 = "com.example.yy.mvpmanager.ActivityAlias2";

    public static void setIcon(String activity_alias, Context context) {
        PackageManager pm = context.getPackageManager();
        // 使ACTIVITY_ALIAS_1失效
        pm.setComponentEnabledSetting(
                new ComponentName(context, ACTIVITY_ALIAS_1),
                ACTIVITY_ALIAS_1.equals(activity_alias) ? PackageManager.COMPONENT_ENABLED_STATE_ENABLED
                        : PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP);
        // 使ACTIVITY_ALIAS_2生效
        pm.setComponentEnabledSetting(
                new ComponentName(context, ACTIVITY_ALIAS_2),
                ACTIVITY_ALIAS_2.equals(activity_alias) ? PackageManager.COMPONENT_ENABLED_STATE_ENABLED
                        : PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                PackageManager.DONT_KILL_APP);
    }
}
