package com.noto.app.note;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import db.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/noto/app/note/NoteReminderReceiver;", "Landroid/content/BroadcastReceiver;", "Ldb/a;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoteReminderReceiver extends BroadcastReceiver implements db.a {

    /* renamed from: i  reason: collision with root package name */
    public final m7.e f9189i;

    /* renamed from: j  reason: collision with root package name */
    public final m7.e f9190j;

    /* renamed from: k  reason: collision with root package name */
    public final m7.e f9191k;

    public NoteReminderReceiver() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.f9189i = kotlin.a.a(lazyThreadSafetyMode, new NoteReminderReceiver$special$$inlined$inject$default$1(this));
        this.f9190j = kotlin.a.a(lazyThreadSafetyMode, new NoteReminderReceiver$special$$inlined$inject$default$2(this));
        this.f9191k = kotlin.a.a(lazyThreadSafetyMode, new NoteReminderReceiver$special$$inlined$inject$default$3(this));
    }

    @Override // db.a
    public final org.koin.core.a c() {
        return a.C0108a.a(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Object obj;
        if (context != null) {
            obj = context.getSystemService("notification");
        } else {
            obj = null;
        }
        NotificationManager notificationManager = (NotificationManager) obj;
        if (intent != null) {
            m0.b.h1(EmptyCoroutineContext.f13021i, new NoteReminderReceiver$onReceive$1$1(this, intent.getLongExtra("folder_id", 0L), intent.getLongExtra("note_id", 0L), context, notificationManager, null));
        }
    }
}
