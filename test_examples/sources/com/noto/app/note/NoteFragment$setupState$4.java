package com.noto.app.note;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutManager;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.widget.NestedScrollView;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.R;
import com.noto.app.note.NoteFragment;
import com.noto.app.util.CustomEditText;
import com.noto.app.util.ModelUtilsKt;
import com.noto.app.util.ViewUtilsKt;
import f7.q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import s6.b0;
import u7.r;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u008a@"}, d2 = {"Lt6/d;", "note", "", "isRememberScrollingPosition", "isUndoOrRedo", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@q7.c(c = "com.noto.app.note.NoteFragment$setupState$4", f = "NoteFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NoteFragment$setupState$4 extends SuspendLambda implements r<t6.d, Boolean, Boolean, p7.c<? super m7.n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ t6.d f9098m;
    public /* synthetic */ boolean n;

    /* renamed from: o  reason: collision with root package name */
    public /* synthetic */ boolean f9099o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ NoteFragment f9100p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ b0 f9101q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoteFragment$setupState$4(b0 b0Var, NoteFragment noteFragment, p7.c cVar) {
        super(4, cVar);
        this.f9100p = noteFragment;
        this.f9101q = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0194  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        boolean z10;
        boolean z11;
        Context j2;
        String str;
        Context j10;
        Context j11;
        boolean z12;
        Context j12;
        String str2;
        Object systemService;
        int i10;
        Object systemService2;
        m0.b.n1(obj);
        final t6.d dVar = this.f9098m;
        final boolean z13 = this.n;
        boolean z14 = this.f9099o;
        int i11 = NoteFragment.f9026f0;
        final NoteFragment noteFragment = this.f9100p;
        noteFragment.getClass();
        long j13 = dVar.f17621a;
        String str3 = dVar.f17623d;
        String str4 = dVar.c;
        String str5 = null;
        if (j13 != 0 && ModelUtilsKt.w(dVar) && (j12 = noteFragment.j()) != null) {
            Intent intent = new Intent("com.noto.intent.action.OPEN_NOTE", (Uri) null);
            intent.putExtra("folder_id", dVar.f17622b);
            long j14 = dVar.f17621a;
            intent.putExtra("note_id", j14);
            intent.setComponent(f7.f.d(j12));
            if (ha.i.T0(str4)) {
                str2 = str3;
            } else {
                str2 = str4;
            }
            String valueOf = String.valueOf(j14);
            o2.b bVar = new o2.b();
            bVar.f16219a = j12;
            bVar.f16220b = valueOf;
            bVar.c = new Intent[]{intent};
            bVar.f16222e = str2;
            bVar.f16223f = str2;
            PorterDuff.Mode mode = IconCompat.f4615k;
            bVar.f16225h = IconCompat.b(j12.getResources(), j12.getPackageName(), R.mipmap.ic_note);
            if (!TextUtils.isEmpty(bVar.f16222e)) {
                Intent[] intentArr = bVar.c;
                if (intentArr != null && intentArr.length != 0) {
                    try {
                        ArrayList b5 = o2.d.b(j12);
                        if (Build.VERSION.SDK_INT >= 25) {
                            systemService2 = j12.getSystemService(ShortcutManager.class);
                            i10 = ((ShortcutManager) systemService2).getMaxShortcutCountPerActivity();
                        } else {
                            i10 = 5;
                        }
                        if (b5.size() == i10) {
                            if (!b5.isEmpty()) {
                                b5.remove(a1.c.B0(b5));
                            }
                            b5.add(0, bVar);
                            o2.d.i(j12, b5);
                        } else {
                            o2.d.f(j12, bVar);
                        }
                    } catch (Throwable unused) {
                        if (Build.VERSION.SDK_INT >= 25) {
                            systemService = j12.getSystemService(ShortcutManager.class);
                            ((ShortcutManager) systemService).removeAllDynamicShortcuts();
                        }
                        o2.d.d(j12).b();
                        Iterator it = ((ArrayList) o2.d.c(j12)).iterator();
                        while (it.hasNext()) {
                            ((o2.a) it.next()).getClass();
                        }
                        m7.n nVar = m7.n.f16010a;
                    }
                } else {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
            } else {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
        }
        final b0 b0Var = this.f9101q;
        Editable text = b0Var.f17298e.getText();
        if (text != null && !ha.i.T0(text)) {
            z10 = false;
            CustomEditText customEditText = b0Var.f17297d;
            if (z10) {
                Editable text2 = customEditText.getText();
                if (text2 != null && !ha.i.T0(text2)) {
                    z12 = false;
                    if (z12) {
                        z11 = true;
                        if (!z11 || z14) {
                            CustomEditText customEditText2 = b0Var.f17298e;
                            customEditText2.setText(str4);
                            customEditText.setText(str3);
                            customEditText2.setSelection(str4.length());
                            customEditText.setSelection(str3.length());
                            j2 = noteFragment.j();
                            if (j2 != null) {
                                str = q.e(j2, R.plurals.words_count, ModelUtilsKt.p(str3), Integer.valueOf(ModelUtilsKt.p(str3)));
                            } else {
                                str = null;
                            }
                            b0Var.f17308p.setText(str);
                            j10 = noteFragment.j();
                            if (j10 != null) {
                                str5 = q.e(j10, R.plurals.words_count, ModelUtilsKt.p(str3), Integer.valueOf(ModelUtilsKt.p(str3)));
                            }
                            b0Var.f17309q.setText(str5);
                            j11 = noteFragment.j();
                            if (j11 != null) {
                                b0Var.n.setText(q.f(j11, R.string.created, f7.g.a(dVar.f17625f, j11)));
                                b0Var.f17306m.setText(q.f(j11, R.string.accessed, f7.g.a(dVar.f17630k, j11)));
                            }
                            b0Var.f17303j.post(new Runnable() { // from class: a7.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i12 = NoteFragment.f9026f0;
                                    s6.b0 b0Var2 = b0Var;
                                    v7.g.f(b0Var2, "$this_setupNote");
                                    t6.d dVar2 = dVar;
                                    v7.g.f(dVar2, "$note");
                                    NoteFragment noteFragment2 = noteFragment;
                                    v7.g.f(noteFragment2, "this$0");
                                    boolean z15 = z13;
                                    NestedScrollView nestedScrollView = b0Var2.f17303j;
                                    if (z15) {
                                        nestedScrollView.v(dVar2.f17631l);
                                    }
                                    if (noteFragment2.a0().f351e != -1) {
                                        nestedScrollView.v(noteFragment2.a0().f351e);
                                        boolean z16 = noteFragment2.a0().f352f;
                                        CustomEditText customEditText3 = b0Var2.f17298e;
                                        if (z16 && !noteFragment2.a0().f353g) {
                                            v7.g.e(customEditText3, "etNoteTitle");
                                            noteFragment2.c0(customEditText3, ViewUtilsKt.e(customEditText3, noteFragment2.a0().f351e));
                                            return;
                                        }
                                        boolean z17 = noteFragment2.a0().f352f;
                                        CustomEditText customEditText4 = b0Var2.f17297d;
                                        if (!z17 && noteFragment2.a0().f353g) {
                                            v7.g.e(customEditText4, "etNoteBody");
                                            noteFragment2.c0(customEditText4, ViewUtilsKt.e(customEditText4, noteFragment2.a0().f351e));
                                            return;
                                        }
                                        int ordinal = ((t6.a) noteFragment2.b0().f9270q.getValue()).f17602l.ordinal();
                                        if (ordinal != 0) {
                                            if (ordinal == 1) {
                                                v7.g.e(customEditText3, "etNoteTitle");
                                                noteFragment2.c0(customEditText3, 0);
                                                return;
                                            }
                                            return;
                                        }
                                        v7.g.e(customEditText4, "etNoteBody");
                                        noteFragment2.c0(customEditText4, 0);
                                    }
                                }
                            });
                            noteFragment.b0().f9269p.setValue(Boolean.FALSE);
                        }
                        return m7.n.f16010a;
                    }
                }
                z12 = true;
                if (z12) {
                }
            }
            z11 = false;
            if (!z11) {
            }
            CustomEditText customEditText22 = b0Var.f17298e;
            customEditText22.setText(str4);
            customEditText.setText(str3);
            customEditText22.setSelection(str4.length());
            customEditText.setSelection(str3.length());
            j2 = noteFragment.j();
            if (j2 != null) {
            }
            b0Var.f17308p.setText(str);
            j10 = noteFragment.j();
            if (j10 != null) {
            }
            b0Var.f17309q.setText(str5);
            j11 = noteFragment.j();
            if (j11 != null) {
            }
            b0Var.f17303j.post(new Runnable() { // from class: a7.h
                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = NoteFragment.f9026f0;
                    s6.b0 b0Var2 = b0Var;
                    v7.g.f(b0Var2, "$this_setupNote");
                    t6.d dVar2 = dVar;
                    v7.g.f(dVar2, "$note");
                    NoteFragment noteFragment2 = noteFragment;
                    v7.g.f(noteFragment2, "this$0");
                    boolean z15 = z13;
                    NestedScrollView nestedScrollView = b0Var2.f17303j;
                    if (z15) {
                        nestedScrollView.v(dVar2.f17631l);
                    }
                    if (noteFragment2.a0().f351e != -1) {
                        nestedScrollView.v(noteFragment2.a0().f351e);
                        boolean z16 = noteFragment2.a0().f352f;
                        CustomEditText customEditText3 = b0Var2.f17298e;
                        if (z16 && !noteFragment2.a0().f353g) {
                            v7.g.e(customEditText3, "etNoteTitle");
                            noteFragment2.c0(customEditText3, ViewUtilsKt.e(customEditText3, noteFragment2.a0().f351e));
                            return;
                        }
                        boolean z17 = noteFragment2.a0().f352f;
                        CustomEditText customEditText4 = b0Var2.f17297d;
                        if (!z17 && noteFragment2.a0().f353g) {
                            v7.g.e(customEditText4, "etNoteBody");
                            noteFragment2.c0(customEditText4, ViewUtilsKt.e(customEditText4, noteFragment2.a0().f351e));
                            return;
                        }
                        int ordinal = ((t6.a) noteFragment2.b0().f9270q.getValue()).f17602l.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                v7.g.e(customEditText3, "etNoteTitle");
                                noteFragment2.c0(customEditText3, 0);
                                return;
                            }
                            return;
                        }
                        v7.g.e(customEditText4, "etNoteBody");
                        noteFragment2.c0(customEditText4, 0);
                    }
                }
            });
            noteFragment.b0().f9269p.setValue(Boolean.FALSE);
            return m7.n.f16010a;
        }
        z10 = true;
        CustomEditText customEditText3 = b0Var.f17297d;
        if (z10) {
        }
        z11 = false;
        if (!z11) {
        }
        CustomEditText customEditText222 = b0Var.f17298e;
        customEditText222.setText(str4);
        customEditText3.setText(str3);
        customEditText222.setSelection(str4.length());
        customEditText3.setSelection(str3.length());
        j2 = noteFragment.j();
        if (j2 != null) {
        }
        b0Var.f17308p.setText(str);
        j10 = noteFragment.j();
        if (j10 != null) {
        }
        b0Var.f17309q.setText(str5);
        j11 = noteFragment.j();
        if (j11 != null) {
        }
        b0Var.f17303j.post(new Runnable() { // from class: a7.h
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = NoteFragment.f9026f0;
                s6.b0 b0Var2 = b0Var;
                v7.g.f(b0Var2, "$this_setupNote");
                t6.d dVar2 = dVar;
                v7.g.f(dVar2, "$note");
                NoteFragment noteFragment2 = noteFragment;
                v7.g.f(noteFragment2, "this$0");
                boolean z15 = z13;
                NestedScrollView nestedScrollView = b0Var2.f17303j;
                if (z15) {
                    nestedScrollView.v(dVar2.f17631l);
                }
                if (noteFragment2.a0().f351e != -1) {
                    nestedScrollView.v(noteFragment2.a0().f351e);
                    boolean z16 = noteFragment2.a0().f352f;
                    CustomEditText customEditText32 = b0Var2.f17298e;
                    if (z16 && !noteFragment2.a0().f353g) {
                        v7.g.e(customEditText32, "etNoteTitle");
                        noteFragment2.c0(customEditText32, ViewUtilsKt.e(customEditText32, noteFragment2.a0().f351e));
                        return;
                    }
                    boolean z17 = noteFragment2.a0().f352f;
                    CustomEditText customEditText4 = b0Var2.f17297d;
                    if (!z17 && noteFragment2.a0().f353g) {
                        v7.g.e(customEditText4, "etNoteBody");
                        noteFragment2.c0(customEditText4, ViewUtilsKt.e(customEditText4, noteFragment2.a0().f351e));
                        return;
                    }
                    int ordinal = ((t6.a) noteFragment2.b0().f9270q.getValue()).f17602l.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            v7.g.e(customEditText32, "etNoteTitle");
                            noteFragment2.c0(customEditText32, 0);
                            return;
                        }
                        return;
                    }
                    v7.g.e(customEditText4, "etNoteBody");
                    noteFragment2.c0(customEditText4, 0);
                }
            }
        });
        noteFragment.b0().f9269p.setValue(Boolean.FALSE);
        return m7.n.f16010a;
    }

    @Override // u7.r
    public final Object l0(t6.d dVar, Boolean bool, Boolean bool2, p7.c<? super m7.n> cVar) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        NoteFragment noteFragment = this.f9100p;
        NoteFragment$setupState$4 noteFragment$setupState$4 = new NoteFragment$setupState$4(this.f9101q, noteFragment, cVar);
        noteFragment$setupState$4.f9098m = dVar;
        noteFragment$setupState$4.n = booleanValue;
        noteFragment$setupState$4.f9099o = booleanValue2;
        return noteFragment$setupState$4.k(m7.n.f16010a);
    }
}
