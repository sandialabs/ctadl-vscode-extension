package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Executor;
import ma.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f5571a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final C0041b f5572b = new C0041b();

    /* loaded from: classes.dex */
    public class a implements c {
        @Override // androidx.profileinstaller.b.c
        public final void a(int i10, Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0041b implements c {
        @Override // androidx.profileinstaller.b.c
        public final void a(int i10, Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case i.f16046m /* 9 */:
                default:
                    str = "";
                    break;
                case i.f16047o /* 10 */:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i10, Object obj);
    }

    public static void a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x015f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, Executor executor, c cVar, boolean z10) {
        boolean z11;
        boolean z12;
        int i10;
        AssetFileDescriptor openFd;
        byte[] bArr;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        byte[] bArr2;
        boolean z13;
        ByteArrayOutputStream byteArrayOutputStream;
        boolean z14;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        long readLong = dataInputStream.readLong();
                        dataInputStream.close();
                        z14 = readLong == packageInfo.lastUpdateTime;
                        if (z14) {
                            cVar.a(2, null);
                        }
                    } catch (IOException unused) {
                    }
                    if (!z14) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        return;
                    }
                }
                z14 = false;
                if (!z14) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i11 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            androidx.profileinstaller.a aVar = new androidx.profileinstaller.a(assets, executor, cVar, name, file2);
            byte[] bArr3 = aVar.c;
            if (bArr3 == null) {
                aVar.a(3, Integer.valueOf(i11));
            } else if (file2.canWrite()) {
                aVar.f5568e = true;
                z11 = true;
                if (z11) {
                    return;
                }
                if (aVar.f5568e) {
                    byte[] bArr4 = androidx.profileinstaller.c.f5573a;
                    int i12 = 8;
                    if (bArr3 != null) {
                        try {
                            openFd = assets.openFd("dexopt/baseline.prof");
                        } catch (FileNotFoundException e10) {
                            cVar.a(6, e10);
                        } catch (IOException e11) {
                            cVar.a(7, e11);
                        } catch (IllegalStateException e12) {
                            cVar.a(8, e12);
                        }
                        try {
                            FileInputStream createInputStream = openFd.createInputStream();
                            if (Arrays.equals(bArr4, i.F(4, createInputStream))) {
                                aVar.f5569f = androidx.profileinstaller.c.h(createInputStream, i.F(4, createInputStream), name);
                                createInputStream.close();
                                openFd.close();
                                w3.a[] aVarArr = aVar.f5569f;
                                if (aVarArr != null) {
                                    int i13 = Build.VERSION.SDK_INT;
                                    if (i13 >= 24) {
                                        if (i13 != 24 && i13 != 25) {
                                            switch (i13) {
                                            }
                                            if (z12) {
                                                try {
                                                    openFd = assets.openFd("dexopt/baseline.profm");
                                                    try {
                                                        FileInputStream createInputStream2 = openFd.createInputStream();
                                                        if (Arrays.equals(androidx.profileinstaller.c.f5574b, i.F(4, createInputStream2))) {
                                                            aVar.f5569f = androidx.profileinstaller.c.e(createInputStream2, i.F(4, createInputStream2), bArr3, aVarArr);
                                                            createInputStream2.close();
                                                            openFd.close();
                                                        } else {
                                                            throw new IllegalStateException("Invalid magic");
                                                        }
                                                    } finally {
                                                    }
                                                } catch (FileNotFoundException e13) {
                                                    e = e13;
                                                    i10 = 9;
                                                    cVar.a(i10, e);
                                                } catch (IOException e14) {
                                                    e = e14;
                                                    i10 = 7;
                                                    cVar.a(i10, e);
                                                } catch (IllegalStateException e15) {
                                                    aVar.f5569f = null;
                                                    cVar.a(8, e15);
                                                }
                                            }
                                        }
                                        z12 = true;
                                        if (z12) {
                                        }
                                    }
                                    z12 = false;
                                    if (z12) {
                                    }
                                }
                            } else {
                                throw new IllegalStateException("Invalid magic");
                            }
                        } finally {
                        }
                    }
                    c cVar2 = aVar.f5566b;
                    w3.a[] aVarArr2 = aVar.f5569f;
                    if (aVarArr2 != null && bArr3 != null) {
                        if (aVar.f5568e) {
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                            } catch (IOException e16) {
                                e = e16;
                                i12 = 7;
                                cVar2.a(i12, e);
                                aVar.f5569f = null;
                                bArr = aVar.f5570g;
                                if (bArr != null) {
                                }
                                z13 = false;
                                if (z13) {
                                }
                            } catch (IllegalStateException e17) {
                                e = e17;
                                cVar2.a(i12, e);
                                aVar.f5569f = null;
                                bArr = aVar.f5570g;
                                if (bArr != null) {
                                }
                                z13 = false;
                                if (z13) {
                                }
                            }
                            try {
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr3);
                                if (androidx.profileinstaller.c.j(byteArrayOutputStream, bArr3, aVarArr2)) {
                                    aVar.f5570g = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    aVar.f5569f = null;
                                } else {
                                    cVar2.a(5, null);
                                    aVar.f5569f = null;
                                    byteArrayOutputStream.close();
                                }
                            } catch (Throwable th) {
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } else {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                    }
                    bArr = aVar.f5570g;
                    if (bArr != null) {
                        try {
                            if (aVar.f5568e) {
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr);
                                        try {
                                            fileOutputStream = new FileOutputStream(aVar.f5567d);
                                            try {
                                                try {
                                                    bArr2 = new byte[512];
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    Throwable th4 = th;
                                                    try {
                                                        byteArrayInputStream.close();
                                                    } catch (Throwable th5) {
                                                        th4.addSuppressed(th5);
                                                    }
                                                    throw th4;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (FileNotFoundException e18) {
                                        e = e18;
                                        aVar.a(6, e);
                                        aVar.f5570g = null;
                                        aVar.f5569f = null;
                                        z13 = false;
                                        if (z13) {
                                        }
                                    } catch (IOException e19) {
                                        e = e19;
                                        aVar.a(7, e);
                                        aVar.f5570g = null;
                                        aVar.f5569f = null;
                                        z13 = false;
                                        if (z13) {
                                        }
                                    }
                                } catch (FileNotFoundException e20) {
                                    e = e20;
                                    aVar.a(6, e);
                                    aVar.f5570g = null;
                                    aVar.f5569f = null;
                                    z13 = false;
                                    if (z13) {
                                    }
                                } catch (IOException e21) {
                                    e = e21;
                                    aVar.a(7, e);
                                    aVar.f5570g = null;
                                    aVar.f5569f = null;
                                    z13 = false;
                                    if (z13) {
                                    }
                                }
                                while (true) {
                                    int read = byteArrayInputStream.read(bArr2);
                                    if (read <= 0) {
                                        aVar.a(1, null);
                                        fileOutputStream.close();
                                        byteArrayInputStream.close();
                                        aVar.f5570g = null;
                                        aVar.f5569f = null;
                                        z13 = true;
                                        if (z13) {
                                            return;
                                        }
                                        a(packageInfo, filesDir);
                                        return;
                                    }
                                    try {
                                        fileOutputStream.write(bArr2, 0, read);
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                    th = th8;
                                    Throwable th9 = th;
                                    fileOutputStream.close();
                                    throw th9;
                                }
                            }
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        } finally {
                            aVar.f5570g = null;
                            aVar.f5569f = null;
                        }
                    }
                    z13 = false;
                    if (z13) {
                    }
                } else {
                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                }
            } else {
                aVar.a(4, null);
            }
            z11 = false;
            if (z11) {
            }
        } catch (PackageManager.NameNotFoundException e22) {
            cVar.a(7, e22);
        }
    }
}
