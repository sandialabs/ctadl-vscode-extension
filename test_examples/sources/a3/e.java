package a3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0003e f174a;

    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f175a;

        public a(ClipData clipData, int i10) {
            this.f175a = new ContentInfo.Builder(clipData, i10);
        }

        @Override // a3.e.b
        public final void a(Uri uri) {
            this.f175a.setLinkUri(uri);
        }

        @Override // a3.e.b
        public final void b(int i10) {
            this.f175a.setFlags(i10);
        }

        @Override // a3.e.b
        public final e build() {
            ContentInfo build;
            build = this.f175a.build();
            return new e(new d(build));
        }

        @Override // a3.e.b
        public final void setExtras(Bundle bundle) {
            this.f175a.setExtras(bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(Uri uri);

        void b(int i10);

        e build();

        void setExtras(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f176a;

        /* renamed from: b  reason: collision with root package name */
        public final int f177b;
        public int c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f178d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f179e;

        public c(ClipData clipData, int i10) {
            this.f176a = clipData;
            this.f177b = i10;
        }

        @Override // a3.e.b
        public final void a(Uri uri) {
            this.f178d = uri;
        }

        @Override // a3.e.b
        public final void b(int i10) {
            this.c = i10;
        }

        @Override // a3.e.b
        public final e build() {
            return new e(new f(this));
        }

        @Override // a3.e.b
        public final void setExtras(Bundle bundle) {
            this.f179e = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements InterfaceC0003e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f180a;

        public d(ContentInfo contentInfo) {
            contentInfo.getClass();
            this.f180a = contentInfo;
        }

        @Override // a3.e.InterfaceC0003e
        public final int j() {
            int source;
            source = this.f180a.getSource();
            return source;
        }

        @Override // a3.e.InterfaceC0003e
        public final ClipData k() {
            ClipData clip;
            clip = this.f180a.getClip();
            return clip;
        }

        @Override // a3.e.InterfaceC0003e
        public final int l() {
            int flags;
            flags = this.f180a.getFlags();
            return flags;
        }

        @Override // a3.e.InterfaceC0003e
        public final ContentInfo m() {
            return this.f180a;
        }

        public final String toString() {
            return "ContentInfoCompat{" + this.f180a + "}";
        }
    }

    /* renamed from: a3.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0003e {
        int j();

        ClipData k();

        int l();

        ContentInfo m();
    }

    /* loaded from: classes.dex */
    public static final class f implements InterfaceC0003e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f181a;

        /* renamed from: b  reason: collision with root package name */
        public final int f182b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f183d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f184e;

        public f(c cVar) {
            ClipData clipData = cVar.f176a;
            clipData.getClass();
            this.f181a = clipData;
            int i10 = cVar.f177b;
            if (i10 >= 0) {
                if (i10 <= 5) {
                    this.f182b = i10;
                    int i11 = cVar.c;
                    if ((i11 & 1) == i11) {
                        this.c = i11;
                        this.f183d = cVar.f178d;
                        this.f184e = cVar.f179e;
                        return;
                    }
                    throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
                }
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }

        @Override // a3.e.InterfaceC0003e
        public final int j() {
            return this.f182b;
        }

        @Override // a3.e.InterfaceC0003e
        public final ClipData k() {
            return this.f181a;
        }

        @Override // a3.e.InterfaceC0003e
        public final int l() {
            return this.c;
        }

        @Override // a3.e.InterfaceC0003e
        public final ContentInfo m() {
            return null;
        }

        public final String toString() {
            String str;
            String valueOf;
            Uri uri;
            String str2;
            StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
            sb.append(this.f181a.getDescription());
            sb.append(", source=");
            int i10 = this.f182b;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    str = String.valueOf(i10);
                                } else {
                                    str = "SOURCE_PROCESS_TEXT";
                                }
                            } else {
                                str = "SOURCE_AUTOFILL";
                            }
                        } else {
                            str = "SOURCE_DRAG_AND_DROP";
                        }
                    } else {
                        str = "SOURCE_INPUT_METHOD";
                    }
                } else {
                    str = "SOURCE_CLIPBOARD";
                }
            } else {
                str = "SOURCE_APP";
            }
            sb.append(str);
            sb.append(", flags=");
            int i11 = this.c;
            if ((i11 & 1) != 0) {
                valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                valueOf = String.valueOf(i11);
            }
            sb.append(valueOf);
            String str3 = "";
            if (this.f183d == null) {
                str2 = "";
            } else {
                str2 = ", hasLinkUri(" + uri.toString().length() + ")";
            }
            sb.append(str2);
            if (this.f184e != null) {
                str3 = ", hasExtras";
            }
            return androidx.activity.e.k(sb, str3, "}");
        }
    }

    public e(InterfaceC0003e interfaceC0003e) {
        this.f174a = interfaceC0003e;
    }

    public final String toString() {
        return this.f174a.toString();
    }
}
