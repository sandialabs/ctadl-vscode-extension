package com.noto.app.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import com.noto.R;
import com.noto.app.domain.model.FilteringType;
import com.noto.app.util.ModelUtilsKt;
import db.a;
import f7.f;
import f7.q;
import ha.i;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.EmptyCoroutineContext;
import m0.b;
import m7.e;
import t6.c;
import t6.d;
import v7.g;
import x6.h0;

/* loaded from: classes.dex */
public final class NoteListRemoteViewsFactory implements RemoteViewsService.RemoteViewsFactory, db.a {

    /* renamed from: i  reason: collision with root package name */
    public final Context f10022i;

    /* renamed from: j  reason: collision with root package name */
    public final e f10023j;

    /* renamed from: k  reason: collision with root package name */
    public final e f10024k;

    /* renamed from: l  reason: collision with root package name */
    public final e f10025l;

    /* renamed from: m  reason: collision with root package name */
    public final e f10026m;
    public final e n;

    /* renamed from: o  reason: collision with root package name */
    public final int f10027o;

    /* renamed from: p  reason: collision with root package name */
    public final long f10028p;

    /* renamed from: q  reason: collision with root package name */
    public t6.a f10029q;

    /* renamed from: r  reason: collision with root package name */
    public List<Long> f10030r;

    /* renamed from: s  reason: collision with root package name */
    public List<h0> f10031s;

    /* renamed from: t  reason: collision with root package name */
    public FilteringType f10032t;

    public NoteListRemoteViewsFactory(Context context, Intent intent) {
        this.f10022i = context;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.f10023j = kotlin.a.a(lazyThreadSafetyMode, new NoteListRemoteViewsFactory$special$$inlined$inject$default$1(this));
        this.f10024k = kotlin.a.a(lazyThreadSafetyMode, new NoteListRemoteViewsFactory$special$$inlined$inject$default$2(this));
        this.f10025l = kotlin.a.a(lazyThreadSafetyMode, new NoteListRemoteViewsFactory$special$$inlined$inject$default$3(this));
        this.f10026m = kotlin.a.a(lazyThreadSafetyMode, new NoteListRemoteViewsFactory$special$$inlined$inject$default$4(this));
        this.n = kotlin.a.a(lazyThreadSafetyMode, new NoteListRemoteViewsFactory$special$$inlined$inject$default$5(this));
        this.f10027o = intent != null ? intent.getIntExtra("appWidgetId", 0) : 0;
        this.f10028p = intent != null ? intent.getLongExtra("folder_id", 0L) : 0L;
    }

    @Override // db.a
    public final org.koin.core.a c() {
        return a.C0108a.a(this);
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        List<h0> list = this.f10031s;
        if (list != null) {
            return list.size();
        }
        g.l("notes");
        throw null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i10) {
        List<h0> list = this.f10031s;
        if (list != null) {
            return list.get(i10).f18683a.f17621a;
        }
        g.l("notes");
        throw null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews getViewAt(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        t6.a aVar;
        Context context = this.f10022i;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.widget_note_item);
        List<h0> list = this.f10031s;
        if (list != null) {
            h0 h0Var = list.get(i10);
            Intent intent = new Intent("com.noto.intent.action.OPEN_NOTE", (Uri) null);
            t6.a aVar2 = this.f10029q;
            if (aVar2 != null) {
                intent.putExtra("folder_id", aVar2.f17592a);
                intent.putExtra("note_id", h0Var.f18683a.f17621a);
                intent.setComponent(f.d(context));
                t6.a aVar3 = this.f10029q;
                if (aVar3 != null) {
                    int b5 = q.b(context, q.j(aVar3.f17595e));
                    remoteViews.removeAllViews(R.id.ll_labels);
                    List<c> list2 = h0Var.f18684b;
                    for (c cVar : list2) {
                        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), (int) R.layout.widget_note_label_item);
                        remoteViews2.setContentDescription(R.id.fl, cVar.c);
                        remoteViews2.setTextViewText(R.id.tv_label, cVar.c);
                        remoteViews2.setInt(R.id.iv_folder_color, "setColorFilter", b5);
                        remoteViews.addView(R.id.ll_labels, remoteViews2);
                    }
                    remoteViews.setOnClickFillInIntent(R.id.ll, intent);
                    d dVar = h0Var.f18683a;
                    remoteViews.setContentDescription(R.id.ll, dVar.c);
                    String str = dVar.c;
                    remoteViews.setTextViewText(R.id.tv_note_title, str);
                    int i16 = 0;
                    remoteViews.setTextViewText(R.id.tv_creation_date, q.f(context, R.string.created, f7.g.a(dVar.f17625f, context)));
                    t6.a aVar4 = this.f10029q;
                    if (aVar4 != null) {
                        if (aVar4.f17601k) {
                            i11 = 0;
                        } else {
                            i11 = 8;
                        }
                        remoteViews.setViewVisibility(R.id.tv_creation_date, i11);
                        if (!i.T0(str)) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        remoteViews.setViewVisibility(R.id.tv_note_title, i12);
                        if (!list2.isEmpty()) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        remoteViews.setViewVisibility(R.id.ll_labels, i13);
                        String str2 = dVar.f17623d;
                        if (!i.T0(str2)) {
                            t6.a aVar5 = this.f10029q;
                            if (aVar5 != null) {
                                if (aVar5.f17598h != 0) {
                                    i14 = 4;
                                    remoteViews.setViewPadding(R.id.tv_note_title, 0, 0, 0, q.d(i14));
                                    if (!i.T0(str)) {
                                        i15 = 0;
                                    } else {
                                        i15 = 4;
                                    }
                                    remoteViews.setViewPadding(R.id.tv_note_body, 0, q.d(i15), 0, 0);
                                    if (i.T0(str)) {
                                        t6.a aVar6 = this.f10029q;
                                        if (aVar6 != null) {
                                            if (aVar6.f17598h == 0) {
                                                remoteViews.setTextViewText(R.id.tv_note_body, ModelUtilsKt.D(str2, 1));
                                                remoteViews.setViewVisibility(R.id.tv_note_body, i16);
                                                return remoteViews;
                                            }
                                        } else {
                                            g.l("folder");
                                            throw null;
                                        }
                                    }
                                    aVar = this.f10029q;
                                    if (aVar == null) {
                                        remoteViews.setTextViewText(R.id.tv_note_body, ModelUtilsKt.D(str2, aVar.f17598h));
                                        t6.a aVar7 = this.f10029q;
                                        if (aVar7 != null) {
                                            if (aVar7.f17598h == 0 || !(!i.T0(str2))) {
                                                i16 = 8;
                                            }
                                            remoteViews.setViewVisibility(R.id.tv_note_body, i16);
                                            return remoteViews;
                                        }
                                        g.l("folder");
                                        throw null;
                                    }
                                    g.l("folder");
                                    throw null;
                                }
                            } else {
                                g.l("folder");
                                throw null;
                            }
                        }
                        i14 = 0;
                        remoteViews.setViewPadding(R.id.tv_note_title, 0, 0, 0, q.d(i14));
                        if (!i.T0(str)) {
                        }
                        remoteViews.setViewPadding(R.id.tv_note_body, 0, q.d(i15), 0, 0);
                        if (i.T0(str)) {
                        }
                        aVar = this.f10029q;
                        if (aVar == null) {
                        }
                    } else {
                        g.l("folder");
                        throw null;
                    }
                } else {
                    g.l("folder");
                    throw null;
                }
            } else {
                g.l("folder");
                throw null;
            }
        } else {
            g.l("notes");
            throw null;
        }
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
        b.h1(EmptyCoroutineContext.f13021i, new NoteListRemoteViewsFactory$onDataSetChanged$1(this, null));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
