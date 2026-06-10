package com.noto.app.note;

import android.content.Intent;
import android.service.quicksettings.TileService;
import com.noto.app.components.TransparentActivity;
import com.noto.app.note.QuickNoteTileService;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/note/QuickNoteTileService;", "Landroid/service/quicksettings/TileService;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class QuickNoteTileService extends TileService {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f9367i = 0;

    @Override // android.service.quicksettings.TileService
    public final void onClick() {
        final Intent intent = new Intent("com.noto.intent.action.QUICK_NOTE", null, this, TransparentActivity.class);
        intent.setFlags(268435456);
        unlockAndRun(new Runnable() { // from class: a7.u0
            @Override // java.lang.Runnable
            public final void run() {
                int i10 = QuickNoteTileService.f9367i;
                QuickNoteTileService quickNoteTileService = QuickNoteTileService.this;
                v7.g.f(quickNoteTileService, "this$0");
                Intent intent2 = intent;
                v7.g.f(intent2, "$intent");
                quickNoteTileService.startActivityAndCollapse(intent2);
            }
        });
    }
}
