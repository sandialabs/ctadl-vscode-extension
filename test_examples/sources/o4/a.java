package o4;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16276a = new a();

    public final File a(Context context) {
        v7.g.f(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        v7.g.e(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }
}
