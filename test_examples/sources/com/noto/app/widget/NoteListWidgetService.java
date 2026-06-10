package com.noto.app.widget;

import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViewsService;
import kotlin.Metadata;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/widget/NoteListWidgetService;", "Landroid/widget/RemoteViewsService;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteListWidgetService extends RemoteViewsService {
    @Override // android.widget.RemoteViewsService
    public final RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        Context applicationContext = getApplicationContext();
        g.e(applicationContext, "applicationContext");
        return new NoteListRemoteViewsFactory(applicationContext, intent);
    }
}
