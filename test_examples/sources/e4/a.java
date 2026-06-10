package e4;

import android.annotation.SuppressLint;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import v7.g;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f10643e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10644a;

    /* renamed from: b  reason: collision with root package name */
    public final File f10645b;
    @SuppressLint({"SyntheticAccessor"})
    public final Lock c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f10646d;

    public a(String str, File file, boolean z10) {
        Lock lock;
        this.f10644a = z10;
        File file2 = new File(file, str.concat(".lck"));
        this.f10645b = file2;
        String absolutePath = file2.getAbsolutePath();
        g.e(absolutePath, "lockFile.absolutePath");
        HashMap hashMap = f10643e;
        synchronized (hashMap) {
            Object obj = hashMap.get(absolutePath);
            if (obj == null) {
                obj = new ReentrantLock();
                hashMap.put(absolutePath, obj);
            }
            lock = (Lock) obj;
        }
        this.c = lock;
    }

    public final void a(boolean z10) {
        this.c.lock();
        if (z10) {
            File file = this.f10645b;
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.f10646d = channel;
            } catch (IOException e10) {
                this.f10646d = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e10);
            }
        }
    }

    public final void b() {
        try {
            FileChannel fileChannel = this.f10646d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.c.unlock();
    }
}
