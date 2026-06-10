package androidx.emoji2.text;

import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.f;
import androidx.emoji2.text.n;
import q2.c;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final f.i f5004a;

    /* renamed from: b  reason: collision with root package name */
    public final n f5005b;
    public final f.d c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f5006a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final n.a f5007b;
        public n.a c;

        /* renamed from: d  reason: collision with root package name */
        public n.a f5008d;

        /* renamed from: e  reason: collision with root package name */
        public int f5009e;

        /* renamed from: f  reason: collision with root package name */
        public int f5010f;

        public a(n.a aVar) {
            this.f5007b = aVar;
            this.c = aVar;
        }

        public final int a(int i10) {
            n.a aVar;
            boolean z10;
            SparseArray<n.a> sparseArray = this.c.f5026a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(i10);
            }
            int i11 = 2;
            if (this.f5006a != 2) {
                if (aVar != null) {
                    this.f5006a = 2;
                    this.c = aVar;
                    this.f5010f = 1;
                } else {
                    b();
                    i11 = 1;
                }
            } else if (aVar != null) {
                this.c = aVar;
                this.f5010f++;
            } else {
                boolean z11 = false;
                if (i10 == 65038) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    if (i10 == 65039) {
                        z11 = true;
                    }
                    if (!z11) {
                        n.a aVar2 = this.c;
                        if (aVar2.f5027b != null) {
                            if (this.f5010f == 1) {
                                if (c()) {
                                    aVar2 = this.c;
                                }
                            }
                            this.f5008d = aVar2;
                            b();
                            i11 = 3;
                        }
                    }
                }
                b();
                i11 = 1;
            }
            this.f5009e = i10;
            return i11;
        }

        public final void b() {
            this.f5006a = 1;
            this.c = this.f5007b;
            this.f5010f = 0;
        }

        public final boolean c() {
            boolean z10;
            boolean z11;
            p3.a c = this.c.f5027b.c();
            int a10 = c.a(6);
            if (a10 != 0 && c.f16751b.get(a10 + c.f16750a) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
            if (this.f5009e == 65039) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                return false;
            }
            return true;
        }
    }

    public j(n nVar, f.i iVar, d dVar) {
        this.f5004a = iVar;
        this.f5005b = nVar;
        this.c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z10) {
        boolean z11;
        k[] kVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
            z11 = false;
            if (z11 && (kVarArr = (k[]) editable.getSpans(selectionStart, selectionEnd, k.class)) != null && kVarArr.length > 0) {
                for (k kVar : kVarArr) {
                    int spanStart = editable.getSpanStart(kVar);
                    int spanEnd = editable.getSpanEnd(kVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
            return false;
        }
        z11 = true;
        if (z11) {
            return false;
        }
        while (r4 < r3) {
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
        if (r6 >= r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(CharSequence charSequence, int i10, int i11, i iVar) {
        short s10;
        boolean z10;
        int i12;
        if (iVar.c == 0) {
            f.d dVar = this.c;
            p3.a c = iVar.c();
            int a10 = c.a(8);
            if (a10 != 0) {
                s10 = c.f16751b.getShort(a10 + c.f16750a);
            } else {
                s10 = 0;
            }
            d dVar2 = (d) dVar;
            dVar2.getClass();
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 23 || s10 <= i13) {
                ThreadLocal<StringBuilder> threadLocal = d.f4977b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb = threadLocal.get();
                sb.setLength(0);
                while (i10 < i11) {
                    sb.append(charSequence.charAt(i10));
                    i10++;
                }
                TextPaint textPaint = dVar2.f4978a;
                String sb2 = sb.toString();
                ThreadLocal<z2.c<Rect, Rect>> threadLocal2 = q2.c.f16874a;
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = c.a.a(textPaint, sb2);
                } else {
                    int length = sb2.length();
                    if (length != 1 || !Character.isWhitespace(sb2.charAt(0))) {
                        float measureText = textPaint.measureText("\udfffd");
                        float measureText2 = textPaint.measureText("m");
                        float measureText3 = textPaint.measureText(sb2);
                        float f10 = 0.0f;
                        if (measureText3 != 0.0f) {
                            if (sb2.codePointCount(0, sb2.length()) > 1) {
                                if (measureText3 <= measureText2 * 2.0f) {
                                    int i14 = 0;
                                    while (i14 < length) {
                                        int charCount = Character.charCount(sb2.codePointAt(i14)) + i14;
                                        f10 += textPaint.measureText(sb2, i14, charCount);
                                        i14 = charCount;
                                    }
                                }
                            }
                            if (measureText3 == measureText) {
                                ThreadLocal<z2.c<Rect, Rect>> threadLocal3 = q2.c.f16874a;
                                z2.c<Rect, Rect> cVar = threadLocal3.get();
                                if (cVar == null) {
                                    cVar = new z2.c<>(new Rect(), new Rect());
                                    threadLocal3.set(cVar);
                                } else {
                                    cVar.f19113a.setEmpty();
                                    cVar.f19114b.setEmpty();
                                }
                                Rect rect = cVar.f19113a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                Rect rect2 = cVar.f19114b;
                                textPaint.getTextBounds(sb2, 0, length, rect2);
                                z10 = !rect.equals(rect2);
                            }
                        }
                    }
                    z10 = true;
                }
                if (!z10) {
                    i12 = 2;
                } else {
                    i12 = 1;
                }
                iVar.c = i12;
            }
            z10 = false;
            if (!z10) {
            }
            iVar.c = i12;
        }
        if (iVar.c != 2) {
            return false;
        }
        return true;
    }
}
