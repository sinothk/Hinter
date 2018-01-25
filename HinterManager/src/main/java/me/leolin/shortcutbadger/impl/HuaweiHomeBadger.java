package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.content.FileProvider;

import java.util.Arrays;
import java.util.List;

import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/**
 * @author Jason Ling
 */
public class HuaweiHomeBadger implements Badger {

    @Override
    public void executeBadge(Context context, ComponentName componentName, int badgeCount) throws ShortcutBadgeException {
        Bundle localBundle = new Bundle();
        localBundle.putString("package", context.getPackageName());
        localBundle.putString("class", componentName.getClassName());
        localBundle.putInt("badgenumber", badgeCount);

        //獲取系統版本
        int currentApiVersion = android.os.Build.VERSION.SDK_INT;
        if (currentApiVersion < 24) {
            Uri uri = Uri.parse("content://com.huawei.android.launcher.settings/badge/");
            context.getContentResolver().call(uri, "change_badge", null, localBundle);
        } else {
            // 暂无
            Uri uri = Uri.parse("content://com.huawei.android.launcher.settings/badge/").normalizeScheme();
            context.getContentResolver().call(uri, "change_badge", null, localBundle);
        }
    }

    @Override
    public List<String> getSupportLaunchers() {
        return Arrays.asList(
                "com.huawei.android.launcher"
        );
    }
}
