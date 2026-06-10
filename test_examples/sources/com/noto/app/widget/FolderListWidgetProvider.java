package com.noto.app.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import db.a;
import ja.f0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.internal.l;
import kotlinx.coroutines.scheduling.b;
import m7.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/noto/app/widget/FolderListWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "Ldb/a;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class FolderListWidgetProvider extends AppWidgetProvider implements db.a {

    /* renamed from: i  reason: collision with root package name */
    public final e f9984i;

    /* renamed from: j  reason: collision with root package name */
    public final e f9985j;

    public FolderListWidgetProvider() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.f9984i = kotlin.a.a(lazyThreadSafetyMode, new FolderListWidgetProvider$special$$inlined$inject$default$1(this));
        this.f9985j = kotlin.a.a(lazyThreadSafetyMode, new FolderListWidgetProvider$special$$inlined$inject$default$2(this));
    }

    public static final u6.e b(FolderListWidgetProvider folderListWidgetProvider) {
        return (u6.e) folderListWidgetProvider.f9985j.getValue();
    }

    @Override // db.a
    public final org.koin.core.a c() {
        return a.C0108a.a(this);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        b bVar = f0.f12766a;
        kotlinx.coroutines.internal.e g10 = a1.b.g(l.f15491a.W());
        if (iArr != null) {
            for (int i10 : iArr) {
                m0.b.M0(g10, null, null, new FolderListWidgetProvider$onUpdate$1$1(context, i10, this, appWidgetManager, null), 3);
            }
        }
        super.onUpdate(context, appWidgetManager, iArr);
    }
}
