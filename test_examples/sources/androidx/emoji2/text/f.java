package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.Spanned;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f4980i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static volatile f f4981j;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f4982a;

    /* renamed from: b  reason: collision with root package name */
    public final p.d f4983b;
    public volatile int c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4984d;

    /* renamed from: e  reason: collision with root package name */
    public final a f4985e;

    /* renamed from: f  reason: collision with root package name */
    public final g f4986f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4987g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.emoji2.text.d f4988h;

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile j f4989b;
        public volatile n c;

        public a(f fVar) {
            super(fVar);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final f f4990a;

        public b(f fVar) {
            this.f4990a = fVar;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f4991a;

        /* renamed from: b  reason: collision with root package name */
        public int f4992b = 0;
        public final androidx.emoji2.text.d c = new androidx.emoji2.text.d();

        public c(g gVar) {
            this.f4991a = gVar;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a() {
        }

        public void b() {
        }
    }

    /* renamed from: androidx.emoji2.text.f$f  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0038f implements Runnable {

        /* renamed from: i  reason: collision with root package name */
        public final ArrayList f4993i;

        /* renamed from: j  reason: collision with root package name */
        public final int f4994j;

        public RunnableC0038f(List list, int i10, Throwable th) {
            if (list != null) {
                this.f4993i = new ArrayList(list);
                this.f4994j = i10;
                return;
            }
            throw new NullPointerException("initCallbacks cannot be null");
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = this.f4993i;
            int size = arrayList.size();
            int i10 = 0;
            if (this.f4994j != 1) {
                while (i10 < size) {
                    ((e) arrayList.get(i10)).a();
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                ((e) arrayList.get(i10)).b();
                i10++;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(n nVar);
    }

    /* loaded from: classes.dex */
    public static class i {
    }

    public f(EmojiCompatInitializer.a aVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4982a = reentrantReadWriteLock;
        this.c = 3;
        g gVar = aVar.f4991a;
        this.f4986f = gVar;
        int i10 = aVar.f4992b;
        this.f4987g = i10;
        this.f4988h = aVar.c;
        this.f4984d = new Handler(Looper.getMainLooper());
        this.f4983b = new p.d();
        a aVar2 = new a(this);
        this.f4985e = aVar2;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.f4982a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                gVar.a(new androidx.emoji2.text.e(aVar2));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static f a() {
        f fVar;
        boolean z10;
        synchronized (f4980i) {
            fVar = f4981j;
            if (fVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
            }
        }
        return fVar;
    }

    public final int b() {
        this.f4982a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f4982a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z10;
        boolean z11 = true;
        if (this.f4987g == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (b() != 1) {
                z11 = false;
            }
            if (z11) {
                return;
            }
            this.f4982a.writeLock().lock();
            try {
                if (this.c == 0) {
                    return;
                }
                this.c = 0;
                this.f4982a.writeLock().unlock();
                a aVar = this.f4985e;
                f fVar = aVar.f4990a;
                try {
                    fVar.f4986f.a(new androidx.emoji2.text.e(aVar));
                    return;
                } catch (Throwable th) {
                    fVar.d(th);
                    return;
                }
            } finally {
                this.f4982a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f4982a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.f4983b);
            this.f4983b.clear();
            this.f4982a.writeLock().unlock();
            this.f4984d.post(new RunnableC0038f(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.f4982a.writeLock().unlock();
            throw th2;
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        this.f4982a.writeLock().lock();
        try {
            this.c = 1;
            arrayList.addAll(this.f4983b);
            this.f4983b.clear();
            this.f4982a.writeLock().unlock();
            this.f4984d.post(new RunnableC0038f(arrayList, this.c, null));
        } catch (Throwable th) {
            this.f4982a.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e1, code lost:
        if (r3.b(r15, r6, r13, r5.f5008d.f5027b) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e3, code lost:
        if (r0 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00e5, code lost:
        r0 = new androidx.emoji2.text.s((android.text.Spannable) new android.text.SpannableString(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ef, code lost:
        r10 = r5.f5008d.f5027b;
        r3.f5004a.getClass();
        r0.setSpan(new androidx.emoji2.text.p(r10), r6, r13, 33);
        r7 = r7 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145 A[Catch: all -> 0x0175, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015e A[Catch: all -> 0x0175, TRY_LEAVE, TryCatch #0 {all -> 0x0175, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:42:0x0080, B:44:0x0088, B:46:0x008b, B:48:0x008f, B:50:0x009b, B:51:0x009e, B:53:0x00ab, B:56:0x00b3, B:62:0x00cd, B:68:0x00d9, B:71:0x00e5, B:72:0x00ef, B:74:0x0104, B:76:0x010b, B:77:0x0110, B:79:0x011b, B:80:0x0120, B:82:0x0124, B:84:0x012a, B:86:0x012e, B:91:0x0139, B:94:0x0145, B:95:0x014b, B:97:0x015e, B:40:0x0076), top: B:117:0x005a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence f(int i10, int i11, CharSequence charSequence) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        j.a aVar;
        int codePointAt;
        int i12;
        int i13;
        int a10;
        k[] kVarArr;
        boolean z14 = false;
        if (b() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= 0) {
                if (i11 >= 0) {
                    if (i10 <= i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v8.b.k("start should be <= than end", z11);
                    s sVar = null;
                    if (charSequence == null) {
                        return null;
                    }
                    if (i10 <= charSequence.length()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    v8.b.k("start should be < than charSequence length", z12);
                    if (i11 <= charSequence.length()) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    v8.b.k("end should be < than charSequence length", z13);
                    if (charSequence.length() != 0 && i10 != i11) {
                        j jVar = this.f4985e.f4989b;
                        jVar.getClass();
                        boolean z15 = charSequence instanceof o;
                        if (z15) {
                            ((o) charSequence).a();
                        }
                        if (!z15) {
                            try {
                                if (!(charSequence instanceof Spannable)) {
                                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, k.class) <= i11) {
                                        sVar = new s(charSequence);
                                    }
                                    if (sVar != null && (kVarArr = (k[]) sVar.getSpans(i10, i11, k.class)) != null && kVarArr.length > 0) {
                                        for (k kVar : kVarArr) {
                                            int spanStart = sVar.getSpanStart(kVar);
                                            int spanEnd = sVar.getSpanEnd(kVar);
                                            if (spanStart != i11) {
                                                sVar.removeSpan(kVar);
                                            }
                                            i10 = Math.min(spanStart, i10);
                                            i11 = Math.max(spanEnd, i11);
                                        }
                                    }
                                    if (i10 != i11 && i10 < charSequence.length()) {
                                        aVar = new j.a(jVar.f5005b.c);
                                        codePointAt = Character.codePointAt(charSequence, i10);
                                        int i14 = 0;
                                        loop1: while (true) {
                                            i12 = codePointAt;
                                            while (true) {
                                                i13 = i10;
                                                while (i10 < i11 && i14 < Integer.MAX_VALUE) {
                                                    a10 = aVar.a(i12);
                                                    if (a10 == 1) {
                                                        if (a10 != 2) {
                                                            if (a10 == 3) {
                                                                break;
                                                            }
                                                        } else {
                                                            i10 += Character.charCount(i12);
                                                            if (i10 < i11) {
                                                                i12 = Character.codePointAt(charSequence, i10);
                                                            }
                                                        }
                                                    } else {
                                                        i10 = Character.charCount(Character.codePointAt(charSequence, i13)) + i13;
                                                        if (i10 < i11) {
                                                            i12 = Character.codePointAt(charSequence, i10);
                                                        }
                                                    }
                                                }
                                            }
                                            codePointAt = i12;
                                        }
                                        if (aVar.f5006a == 2 && aVar.c.f5027b != null && (aVar.f5010f > 1 || aVar.c())) {
                                            z14 = true;
                                        }
                                        if (z14 && i14 < Integer.MAX_VALUE && !jVar.b(charSequence, i13, i10, aVar.c.f5027b)) {
                                            if (sVar == null) {
                                                sVar = new s(charSequence);
                                            }
                                            androidx.emoji2.text.i iVar = aVar.c.f5027b;
                                            jVar.f5004a.getClass();
                                            sVar.setSpan(new p(iVar), i13, i10, 33);
                                        }
                                        if (sVar != null) {
                                            return z15 ? charSequence : charSequence;
                                        }
                                        Spannable spannable = sVar.f5033j;
                                        if (z15) {
                                            ((o) charSequence).b();
                                        }
                                        return spannable;
                                    }
                                    return charSequence;
                                }
                            } finally {
                                if (z15) {
                                    ((o) charSequence).b();
                                }
                            }
                        }
                        sVar = new s((Spannable) charSequence);
                        if (sVar != null) {
                            while (r7 < r6) {
                            }
                        }
                        if (i10 != i11) {
                            aVar = new j.a(jVar.f5005b.c);
                            codePointAt = Character.codePointAt(charSequence, i10);
                            int i142 = 0;
                            loop1: while (true) {
                                i12 = codePointAt;
                                while (true) {
                                    i13 = i10;
                                    while (i10 < i11) {
                                        a10 = aVar.a(i12);
                                        if (a10 == 1) {
                                        }
                                    }
                                }
                                codePointAt = i12;
                            }
                            if (aVar.f5006a == 2) {
                                z14 = true;
                            }
                            if (z14) {
                                if (sVar == null) {
                                }
                                androidx.emoji2.text.i iVar2 = aVar.c.f5027b;
                                jVar.f5004a.getClass();
                                sVar.setSpan(new p(iVar2), i13, i10, 33);
                            }
                            if (sVar != null) {
                            }
                        }
                        return charSequence;
                    }
                    return charSequence;
                }
                throw new IllegalArgumentException("end cannot be negative");
            }
            throw new IllegalArgumentException("start cannot be negative");
        }
        throw new IllegalStateException("Not initialized yet");
    }

    public final void g(e eVar) {
        if (eVar != null) {
            this.f4982a.writeLock().lock();
            try {
                if (this.c != 1 && this.c != 2) {
                    this.f4983b.add(eVar);
                    return;
                }
                this.f4984d.post(new RunnableC0038f(Arrays.asList(eVar), this.c, null));
                return;
            } finally {
                this.f4982a.writeLock().unlock();
            }
        }
        throw new NullPointerException("initCallback cannot be null");
    }
}
