package com.noto.app.settings.general;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.noto.app.domain.model.Language;
import com.noto.app.settings.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m7.n;

@Metadata(k = PreferencesProto$Value.INTEGER_FIELD_NUMBER, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LanguageDialogFragment$onCreateView$1$1$1$1$1$1 extends Lambda implements u7.a<n> {

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ LanguageDialogFragment f9756j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Language f9757k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageDialogFragment$onCreateView$1$1$1$1$1$1(LanguageDialogFragment languageDialogFragment, Language language) {
        super(0);
        this.f9756j = languageDialogFragment;
        this.f9757k = language;
    }

    @Override // u7.a
    public final n k0() {
        LanguageDialogFragment languageDialogFragment = this.f9756j;
        ((c) languageDialogFragment.f9752u0.getValue()).p(this.f9757k);
        languageDialogFragment.Z();
        return n.f16010a;
    }
}
