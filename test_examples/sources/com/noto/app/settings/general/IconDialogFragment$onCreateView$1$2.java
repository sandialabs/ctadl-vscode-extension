package com.noto.app.settings.general;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.airbnb.epoxy.m;
import com.noto.app.domain.model.Icon;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.b;
import m7.n;
import q7.c;
import s6.r;
import u7.l;
import u7.p;
import v7.g;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/noto/app/domain/model/Icon;", "selectedIcon", "Lm7/n;", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
@c(c = "com.noto.app.settings.general.IconDialogFragment$onCreateView$1$2", f = "IconDialogFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class IconDialogFragment$onCreateView$1$2 extends SuspendLambda implements p<Icon, p7.c<? super n>, Object> {

    /* renamed from: m  reason: collision with root package name */
    public /* synthetic */ Object f9748m;
    public final /* synthetic */ r n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ IconDialogFragment f9749o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/airbnb/epoxy/m;", "Lm7/n;", "invoke", "(Lcom/airbnb/epoxy/m;)V", "<anonymous>"}, k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0})
    /* renamed from: com.noto.app.settings.general.IconDialogFragment$onCreateView$1$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements l<m, n> {

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Icon f9750j;

        /* renamed from: k  reason: collision with root package name */
        public final /* synthetic */ IconDialogFragment f9751k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Icon icon, IconDialogFragment iconDialogFragment) {
            super(1);
            this.f9750j = icon;
            this.f9751k = iconDialogFragment;
        }

        @Override // u7.l
        public final n U(m mVar) {
            Icon[] values;
            boolean z10;
            m mVar2 = mVar;
            g.f(mVar2, "$this$withModels");
            for (Icon icon : Icon.values()) {
                c7.c cVar = new c7.c();
                cVar.l(icon.name());
                cVar.G(icon);
                if (icon == this.f9750j) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.H(z10);
                cVar.I(new a(icon, this.f9751k));
                mVar2.add(cVar);
            }
            return n.f16010a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconDialogFragment$onCreateView$1$2(r rVar, IconDialogFragment iconDialogFragment, p7.c<? super IconDialogFragment$onCreateView$1$2> cVar) {
        super(2, cVar);
        this.n = rVar;
        this.f9749o = iconDialogFragment;
    }

    @Override // u7.p
    public final Object R(Icon icon, p7.c<? super n> cVar) {
        return ((IconDialogFragment$onCreateView$1$2) a(icon, cVar)).k(n.f16010a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final p7.c<n> a(Object obj, p7.c<?> cVar) {
        IconDialogFragment$onCreateView$1$2 iconDialogFragment$onCreateView$1$2 = new IconDialogFragment$onCreateView$1$2(this.n, this.f9749o, cVar);
        iconDialogFragment$onCreateView$1$2.f9748m = obj;
        return iconDialogFragment$onCreateView$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object k(Object obj) {
        b.n1(obj);
        this.n.f17461a.p0(new AnonymousClass1((Icon) this.f9748m, this.f9749o));
        return n.f16010a;
    }
}
