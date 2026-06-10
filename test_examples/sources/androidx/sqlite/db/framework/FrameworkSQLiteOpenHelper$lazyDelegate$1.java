package androidx.sqlite.db.framework;

import android.content.Context;
import android.os.Build;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import u7.a;
import v7.g;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "invoke"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
/* loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper$lazyDelegate$1 extends Lambda implements a<FrameworkSQLiteOpenHelper.OpenHelper> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ FrameworkSQLiteOpenHelper f6091j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper$lazyDelegate$1(FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        super(0);
        this.f6091j = frameworkSQLiteOpenHelper;
    }

    @Override // u7.a
    public final FrameworkSQLiteOpenHelper.OpenHelper k0() {
        FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        int i10 = Build.VERSION.SDK_INT;
        FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = this.f6091j;
        if (i10 >= 23 && frameworkSQLiteOpenHelper.f6071j != null && frameworkSQLiteOpenHelper.f6073l) {
            Context context = frameworkSQLiteOpenHelper.f6070i;
            g.f(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            g.e(noBackupFilesDir, "context.noBackupFilesDir");
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.f6070i, new File(noBackupFilesDir, frameworkSQLiteOpenHelper.f6071j).getAbsolutePath(), new FrameworkSQLiteOpenHelper.a(), frameworkSQLiteOpenHelper.f6072k, frameworkSQLiteOpenHelper.f6074m);
        } else {
            openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.f6070i, frameworkSQLiteOpenHelper.f6071j, new FrameworkSQLiteOpenHelper.a(), frameworkSQLiteOpenHelper.f6072k, frameworkSQLiteOpenHelper.f6074m);
        }
        openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.f6075o);
        return openHelper;
    }
}
