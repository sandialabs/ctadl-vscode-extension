package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c {

    /* loaded from: classes.dex */
    public static class a {
        public Signature[] a(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a {
    }

    /* renamed from: androidx.emoji2.text.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0037c extends b {
        @Override // androidx.emoji2.text.c.a
        public final Signature[] a(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0049 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l a(Context context) {
        a bVar;
        ProviderInfo providerInfo;
        w2.e eVar;
        boolean z10;
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            bVar = new C0037c();
        } else {
            bVar = new b();
        }
        PackageManager packageManager = context.getPackageManager();
        v8.b.m(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (it.hasNext()) {
                providerInfo = it.next().providerInfo;
                if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null) {
                    z10 = true;
                    if ((applicationInfo.flags & 1) == 1) {
                        continue;
                        if (z10) {
                            break;
                        }
                    }
                }
                z10 = false;
                continue;
                if (z10) {
                }
            } else {
                providerInfo = null;
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] a10 = bVar.a(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : a10) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new w2.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e10) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e10);
            }
            if (eVar != null) {
                return null;
            }
            return new l(context, eVar);
        }
        eVar = null;
        if (eVar != null) {
        }
    }
}
