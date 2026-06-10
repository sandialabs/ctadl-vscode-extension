package com.noto.app.widget;

import a1.c;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.noto.R;
import com.noto.app.util.ModelUtilsKt;
import db.a;
import f7.f;
import f7.q;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;
import m0.b;
import m7.e;
import v7.g;

/* loaded from: classes.dex */
public final class FolderRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory, db.a {

    /* renamed from: i  reason: collision with root package name */
    public final Context f10000i;

    /* renamed from: j  reason: collision with root package name */
    public final e f10001j;

    /* renamed from: k  reason: collision with root package name */
    public final e f10002k;

    /* renamed from: l  reason: collision with root package name */
    public final e f10003l;

    /* renamed from: m  reason: collision with root package name */
    public final int f10004m;
    public List<Pair<t6.a, Integer>> n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f10005o;

    /* renamed from: p  reason: collision with root package name */
    public final Integer f10006p;

    public FolderRemoteViewsFactory(Context context, Intent intent) {
        this.f10000i = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.f10001j = kotlin.a.a(lazyThreadSafetyMode, new FolderRemoteViewsFactory$special$$inlined$inject$default$1(this));
        this.f10002k = kotlin.a.a(lazyThreadSafetyMode, new FolderRemoteViewsFactory$special$$inlined$inject$default$2(this));
        this.f10003l = kotlin.a.a(lazyThreadSafetyMode, new FolderRemoteViewsFactory$special$$inlined$inject$default$3(this));
        this.f10004m = intent != null ? intent.getIntExtra("appWidgetId", 0) : 0;
        this.f10005o = true;
        this.f10006p = intent != null ? Integer.valueOf(intent.getIntExtra("WidgetRadius", 0)) : null;
    }

    @Override // db.a
    public final org.koin.core.a c() {
        return a.C0108a.a(this);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        List<Pair<t6.a, Integer>> list = this.n;
        if (list != null) {
            return list.size();
        }
        g.l("folders");
        throw null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i10) {
        List<Pair<t6.a, Integer>> list = this.n;
        if (list != null) {
            return list.get(i10).f12962i.f17592a;
        }
        g.l("folders");
        throw null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i10) {
        int i11;
        int i12;
        List<Pair<t6.a, Integer>> list = this.n;
        if (list != null) {
            Pair<t6.a, Integer> pair = list.get(i10);
            t6.a aVar = pair.f12962i;
            int intValue = pair.f12963j.intValue();
            int j2 = q.j(aVar.f17595e);
            Context context = this.f10000i;
            int b5 = q.b(context, j2);
            if (ModelUtilsKt.u(aVar)) {
                i11 = R.drawable.ic_round_folder_general_24;
            } else {
                i11 = R.drawable.ic_round_folder_24;
            }
            Intent intent = new Intent("com.noto.intent.action.OPEN_FOLDER", (Uri) null);
            intent.putExtra("folder_id", aVar.f17592a);
            intent.setComponent(f.d(context));
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.widget_folder_item);
            remoteViews.setTextViewText(R.id.tv_folder_notes_count, String.valueOf(intValue));
            remoteViews.setTextViewText(R.id.tv_folder_title, ModelUtilsKt.o(context, aVar));
            remoteViews.setContentDescription(R.id.ll, ModelUtilsKt.o(context, aVar));
            remoteViews.setContentDescription(R.id.iv_folder_icon, ModelUtilsKt.o(context, aVar));
            remoteViews.setTextColor(R.id.tv_folder_title, b5);
            remoteViews.setTextColor(R.id.tv_folder_notes_count, b5);
            remoteViews.setImageViewResource(R.id.iv_folder_icon, i11);
            remoteViews.setInt(R.id.iv_folder_icon, "setColorFilter", b5);
            remoteViews.setOnClickFillInIntent(R.id.ll, intent);
            if (this.f10005o) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            remoteViews.setViewVisibility(R.id.tv_folder_notes_count, i12);
            Integer num = this.f10006p;
            if (num != null) {
                remoteViews.setInt(R.id.ll, "setBackgroundResource", c.Q1(num.intValue()));
            }
            return remoteViews;
        }
        g.l("folders");
        throw null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        b.h1(EmptyCoroutineContext.f13021i, new FolderRemoteViewsFactory$onDataSetChanged$1(this, null));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
