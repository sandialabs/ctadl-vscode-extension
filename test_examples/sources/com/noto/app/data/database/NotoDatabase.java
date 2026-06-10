package com.noto.app.data.database;

import android.content.Context;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import ma.i;
import r6.n;
import r6.u;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/noto/app/data/database/NotoDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "a", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public abstract class NotoDatabase extends RoomDatabase {

    /* renamed from: m  reason: collision with root package name */
    public static final a f7686m = new a();
    public static volatile NotoDatabase n;

    /* loaded from: classes.dex */
    public static final class a {
        public final NotoDatabase a(Context context) {
            g.f(context, "context");
            NotoDatabase notoDatabase = NotoDatabase.n;
            if (notoDatabase == null) {
                synchronized (this) {
                    notoDatabase = NotoDatabase.n;
                    if (notoDatabase == null) {
                        Context applicationContext = context.getApplicationContext();
                        g.e(applicationContext, "context.applicationContext");
                        RoomDatabase.a w10 = i.w(applicationContext, NotoDatabase.class, "Noto Database");
                        w10.a(p6.g.c);
                        NotoDatabase notoDatabase2 = (NotoDatabase) w10.b();
                        NotoDatabase.n = notoDatabase2;
                        notoDatabase = notoDatabase2;
                    }
                }
            }
            return notoDatabase;
        }
    }

    public abstract r6.a r();

    public abstract r6.i s();

    public abstract n t();

    public abstract u u();
}
