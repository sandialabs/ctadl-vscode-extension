package d3;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final c f10389a;

    /* loaded from: classes.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f10390a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f10390a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f10390a = (InputContentInfo) obj;
        }

        @Override // d3.h.c
        public final ClipDescription a() {
            ClipDescription description;
            description = this.f10390a.getDescription();
            return description;
        }

        @Override // d3.h.c
        public final Object b() {
            return this.f10390a;
        }

        @Override // d3.h.c
        public final Uri c() {
            Uri contentUri;
            contentUri = this.f10390a.getContentUri();
            return contentUri;
        }

        @Override // d3.h.c
        public final void d() {
            this.f10390a.requestPermission();
        }

        @Override // d3.h.c
        public final Uri e() {
            Uri linkUri;
            linkUri = this.f10390a.getLinkUri();
            return linkUri;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f10391a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f10392b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f10391a = uri;
            this.f10392b = clipDescription;
            this.c = uri2;
        }

        @Override // d3.h.c
        public final ClipDescription a() {
            return this.f10392b;
        }

        @Override // d3.h.c
        public final Object b() {
            return null;
        }

        @Override // d3.h.c
        public final Uri c() {
            return this.f10391a;
        }

        @Override // d3.h.c
        public final void d() {
        }

        @Override // d3.h.c
        public final Uri e() {
            return this.c;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        ClipDescription a();

        Object b();

        Uri c();

        void d();

        Uri e();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f10389a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public h(a aVar) {
        this.f10389a = aVar;
    }
}
