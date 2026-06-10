package f7;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import androidx.navigation.m;
import com.noto.R;
import com.noto.app.components.TransparentActivity;
import com.noto.app.domain.model.Icon;
import com.noto.app.util.ModelUtilsKt;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class p {
    public static final void a(NotificationManager notificationManager, Context context) {
        v7.g.f(notificationManager, "<this>");
        v7.g.f(context, "context");
        if (Build.VERSION.SDK_INT >= 26) {
            notificationManager.createNotificationChannel(new NotificationChannel("Reminders", q.f(context, R.string.reminders, new Object[0]), 4));
            notificationManager.createNotificationChannel(new NotificationChannel("Vault", q.f(context, R.string.vault, new Object[0]), 2));
            NotificationChannel notificationChannel = new NotificationChannel("Quick Note", q.f(context, R.string.quick_note, new Object[0]), 4);
            notificationChannel.enableVibration(false);
            notificationChannel.enableLights(false);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public static final PendingIntent b(Context context, long j2, long j10) {
        Bundle n = a1.b.n(new Pair("folder_id", Long.valueOf(j10)), new Pair("note_id", Long.valueOf(j2)), new Pair("selected_note_ids", new long[0]));
        androidx.navigation.m mVar = new androidx.navigation.m(context);
        mVar.c = new androidx.navigation.s(context, new m.a()).c(R.navigation.nav_graph);
        if (mVar.f5508d != 0) {
            mVar.b();
        }
        mVar.f5508d = R.id.noteFragment;
        if (mVar.c != null) {
            mVar.b();
        }
        Intent intent = mVar.f5507b;
        intent.putExtra("android-support-nav:controller:deepLinkExtras", n);
        intent.setComponent(f.d(context));
        return mVar.a().d(h.f10949a);
    }

    public static final void c(NotificationManager notificationManager, TransparentActivity transparentActivity, t6.a aVar, t6.d dVar, Icon icon) {
        int i10;
        v7.g.f(notificationManager, "<this>");
        v7.g.f(transparentActivity, "context");
        v7.g.f(aVar, "folder");
        v7.g.f(dVar, "note");
        long j2 = dVar.f17622b;
        long j10 = dVar.f17621a;
        PendingIntent b5 = b(transparentActivity, j10, j2);
        m2.o oVar = new m2.o(transparentActivity, "Quick Note");
        oVar.f15940e = m2.o.b(q.f(transparentActivity, R.string.note_is_saved, ModelUtilsKt.o(transparentActivity, aVar)));
        oVar.f15942g = b5;
        oVar.f15946k = m2.o.b(ModelUtilsKt.o(transparentActivity, aVar));
        oVar.f15952r = q.b(transparentActivity, q.j(aVar.f17595e));
        oVar.n = true;
        oVar.f15949o = true;
        oVar.f15950p = "status";
        if (icon != null) {
            i10 = q.i(icon);
        } else {
            i10 = R.mipmap.ic_launcher_futuristic;
        }
        Notification notification = oVar.f15956v;
        notification.icon = i10;
        oVar.f15943h = 1;
        notification.vibrate = null;
        notification.sound = null;
        notification.audioStreamType = -1;
        notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        oVar.f15954t = 5000L;
        oVar.c(16);
        oVar.f15947l = ModelUtilsKt.o(transparentActivity, aVar);
        oVar.f15948m = true;
        Notification a10 = oVar.a();
        v7.g.e(a10, "Builder(context, QuickNo…ry(true)\n        .build()");
        notificationManager.notify(ModelUtilsKt.o(transparentActivity, aVar), (int) j10, a10);
    }
}
