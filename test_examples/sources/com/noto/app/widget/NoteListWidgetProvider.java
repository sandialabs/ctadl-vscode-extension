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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/noto/app/widget/NoteListWidgetProvider;", "Landroid/appwidget/AppWidgetProvider;", "Ldb/a;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListWidgetProvider extends AppWidgetProvider implements db.a {

    /* renamed from: i  reason: collision with root package name */
    public final e f10121i;

    /* renamed from: j  reason: collision with root package name */
    public final e f10122j;

    /* renamed from: k  reason: collision with root package name */
    public final e f10123k;

    public NoteListWidgetProvider() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.f10121i = kotlin.a.a(lazyThreadSafetyMode, new NoteListWidgetProvider$special$$inlined$inject$default$1(this));
        this.f10122j = kotlin.a.a(lazyThreadSafetyMode, new NoteListWidgetProvider$special$$inlined$inject$default$2(this));
        this.f10123k = kotlin.a.a(lazyThreadSafetyMode, new NoteListWidgetProvider$special$$inlined$inject$default$3(this));
    }

    public static final u6.e b(NoteListWidgetProvider noteListWidgetProvider) {
        return (u6.e) noteListWidgetProvider.f10123k.getValue();
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
                m0.b.M0(g10, null, null, new NoteListWidgetProvider$onUpdate$1$1(this, i10, context, appWidgetManager, null), 3);
            }
        }
        super.onUpdate(context, appWidgetManager, iArr);
    }
}
