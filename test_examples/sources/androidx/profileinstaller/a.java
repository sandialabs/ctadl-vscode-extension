package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.biometric.e;
import androidx.profileinstaller.b;
import java.io.File;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f5565a;

    /* renamed from: b  reason: collision with root package name */
    public final b.c f5566b;
    public final byte[] c;

    /* renamed from: d  reason: collision with root package name */
    public final File f5567d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5568e = false;

    /* renamed from: f  reason: collision with root package name */
    public w3.a[] f5569f;

    /* renamed from: g  reason: collision with root package name */
    public byte[] f5570g;

    public a(AssetManager assetManager, Executor executor, b.c cVar, String str, File file) {
        byte[] bArr;
        this.f5565a = executor;
        this.f5566b = cVar;
        this.f5567d = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = w3.c.f18310e;
                    break;
                case 26:
                    bArr = w3.c.f18309d;
                    break;
                case 27:
                    bArr = w3.c.c;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = w3.c.f18308b;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = w3.c.f18307a;
                    break;
            }
            this.c = bArr;
        }
        bArr = null;
        this.c = bArr;
    }

    public final void a(int i10, Serializable serializable) {
        this.f5565a.execute(new e(i10, 1, this, serializable));
    }
}
