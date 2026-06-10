package d0;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.m;
import com.noto.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e extends ViewGroup {

    /* renamed from: i  reason: collision with root package name */
    public final int f10353i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f10354j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f10355k;

    /* renamed from: l  reason: collision with root package name */
    public final m f10356l;

    /* renamed from: m  reason: collision with root package name */
    public int f10357m;

    public e(Context context) {
        super(context);
        this.f10353i = 5;
        ArrayList arrayList = new ArrayList();
        this.f10354j = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f10355k = arrayList2;
        this.f10356l = new m();
        setClipChildren(false);
        f fVar = new f(context);
        addView(fVar);
        arrayList.add(fVar);
        arrayList2.add(fVar);
        this.f10357m = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
