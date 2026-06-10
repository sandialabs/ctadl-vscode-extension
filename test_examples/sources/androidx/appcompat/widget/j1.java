package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.emoji2.text.f;
import androidx.emoji2.text.l;
import java.nio.MappedByteBuffer;
import kotlin.collections.EmptyList;
import v2.l;
import y3.f;

/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f978i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f979j;

    public /* synthetic */ j1(int i10, Object obj) {
        this.f978i = i10;
        this.f979j = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = true;
        switch (this.f978i) {
            case 0:
                ((k1) this.f979j).a();
                return;
            case 1:
                ((androidx.biometric.k) this.f979j).f1203d0.f1231x = false;
                return;
            case PreferencesProto$Value.FLOAT_FIELD_NUMBER /* 2 */:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.f979j;
                Class<?> cls = AndroidComposeView.A0;
                v7.g.f(androidComposeView, "this$0");
                androidComposeView.f3589u0 = false;
                MotionEvent motionEvent = androidComposeView.f3577o0;
                v7.g.c(motionEvent);
                if (motionEvent.getActionMasked() != 10) {
                    z10 = false;
                }
                if (z10) {
                    androidComposeView.J(motionEvent);
                    return;
                }
                throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
            case PreferencesProto$Value.INTEGER_FIELD_NUMBER /* 3 */:
                l.b bVar = (l.b) this.f979j;
                synchronized (bVar.f5017d) {
                    if (bVar.f5021h != null) {
                        try {
                            w2.l d5 = bVar.d();
                            int i10 = d5.f18289e;
                            if (i10 == 2) {
                                synchronized (bVar.f5017d) {
                                }
                            }
                            if (i10 == 0) {
                                int i11 = v2.l.f18154a;
                                l.a.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                l.a aVar = bVar.c;
                                Context context = bVar.f5015a;
                                aVar.getClass();
                                Typeface b5 = q2.e.f16877a.b(context, new w2.l[]{d5}, 0);
                                MappedByteBuffer e10 = q2.m.e(bVar.f5015a, d5.f18286a);
                                if (e10 != null && b5 != null) {
                                    try {
                                        l.a.a("EmojiCompat.MetadataRepo.create");
                                        androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(b5, androidx.emoji2.text.m.a(e10));
                                        l.a.b();
                                        l.a.b();
                                        synchronized (bVar.f5017d) {
                                            f.h hVar = bVar.f5021h;
                                            if (hVar != null) {
                                                hVar.b(nVar);
                                            }
                                        }
                                        bVar.b();
                                        return;
                                    } catch (Throwable th) {
                                        int i12 = v2.l.f18154a;
                                        l.a.b();
                                        throw th;
                                    }
                                }
                                throw new RuntimeException("Unable to open file.");
                            }
                            throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                        } catch (Throwable th2) {
                            synchronized (bVar.f5017d) {
                                f.h hVar2 = bVar.f5021h;
                                if (hVar2 != null) {
                                    hVar2.a(th2);
                                }
                                bVar.b();
                                return;
                            }
                        }
                    }
                    return;
                }
            case PreferencesProto$Value.LONG_FIELD_NUMBER /* 4 */:
                y3.h hVar3 = (y3.h) this.f979j;
                v7.g.f(hVar3, "this$0");
                f.c cVar = hVar3.f18851e;
                if (cVar != null) {
                    hVar3.f18849b.c(cVar);
                    return;
                } else {
                    v7.g.l("observer");
                    throw null;
                }
            case 5:
                v7.g.f((y3.i) this.f979j, "this$0");
                EmptyList emptyList = EmptyList.f12981i;
                throw null;
            case 6:
                v7.g.f((y3.k) this.f979j, "this$0");
                throw null;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                h6.n nVar2 = (h6.n) this.f979j;
                boolean isPopupShowing = nVar2.f11476h.isPopupShowing();
                nVar2.t(isPopupShowing);
                nVar2.f11481m = isPopupShowing;
                return;
            default:
                ((com.google.android.material.timepicker.c) this.f979j).k();
                return;
        }
    }
}
