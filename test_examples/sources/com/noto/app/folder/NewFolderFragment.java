package com.noto.app.folder;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.material.slider.Slider;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.noto.R;
import com.noto.app.main.SelectFolderDialogFragment;
import com.noto.app.util.ViewUtilsKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import s6.y;
import x6.d0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/noto/app/folder/NewFolderFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NewFolderFragment extends Fragment {

    /* renamed from: f0  reason: collision with root package name */
    public static final /* synthetic */ int f8567f0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final m7.e f8568d0 = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, new NewFolderFragment$special$$inlined$viewModel$default$1(this, new NewFolderFragment$viewModel$2(this)));

    /* renamed from: e0  reason: collision with root package name */
    public final androidx.navigation.f f8569e0 = new androidx.navigation.f(v7.i.a(d0.class), new NewFolderFragment$special$$inlined$navArgs$1(this));

    public static void Z(NewFolderFragment newFolderFragment) {
        String str;
        long j2;
        v7.g.f(newFolderFragment, "this$0");
        Context j10 = newFolderFragment.j();
        if (j10 != null) {
            str = f7.q.f(j10, R.string.select_parent_folder, new Object[0]);
        } else {
            str = null;
        }
        SelectFolderDialogFragment selectFolderDialogFragment = new SelectFolderDialogFragment(new NewFolderFragment$setupListeners$4$1(newFolderFragment));
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("filtered_folder_ids", new long[]{-1, newFolderFragment.a0().f18667a});
        t6.a aVar = (t6.a) a1.b.m(newFolderFragment.b0().f8433l).getValue();
        if (aVar != null) {
            j2 = aVar.f17592a;
        } else {
            j2 = 0;
        }
        pairArr[1] = new Pair("selected_folder_id", Long.valueOf(j2));
        pairArr[2] = new Pair("is_none_enabled", Boolean.TRUE);
        pairArr[3] = new Pair("title", str);
        selectFolderDialogFragment.W(a1.b.n(pairArr));
        selectFolderDialogFragment.f0(newFolderFragment.l(), null);
    }

    public final d0 a0() {
        return (d0) this.f8569e0.getValue();
    }

    public final FolderViewModel b0() {
        return (FolderViewModel) this.f8568d0.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ff, code lost:
        if (r7 != null) goto L84;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z10;
        MaterialTextView materialTextView;
        int i10;
        int i11;
        MaterialToolbar materialToolbar;
        String str;
        Context j2;
        int i12;
        String str2;
        String str3;
        OnBackPressedDispatcher onBackPressedDispatcher;
        String str4;
        v7.g.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.new_folder_fragment, viewGroup, false);
        int i13 = R.id.abl;
        if (((AppBarLayout) a1.b.O(inflate, R.id.abl)) != null) {
            i13 = R.id.btn_create;
            MaterialButton materialButton = (MaterialButton) a1.b.O(inflate, R.id.btn_create);
            if (materialButton != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                TextInputEditText textInputEditText = (TextInputEditText) a1.b.O(inflate, R.id.et);
                if (textInputEditText != null) {
                    if (((LinearLayout) a1.b.O(inflate, R.id.ll)) != null) {
                        NestedScrollView nestedScrollView = (NestedScrollView) a1.b.O(inflate, R.id.nsv);
                        if (nestedScrollView != null) {
                            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) a1.b.O(inflate, R.id.rv);
                            if (epoxyRecyclerView != null) {
                                Slider slider = (Slider) a1.b.O(inflate, R.id.s_note_preview_size);
                                if (slider != null) {
                                    MaterialSwitch materialSwitch = (MaterialSwitch) a1.b.O(inflate, R.id.sw_show_note_creation_date);
                                    if (materialSwitch != null) {
                                        MaterialToolbar materialToolbar2 = (MaterialToolbar) a1.b.O(inflate, R.id.tb);
                                        if (materialToolbar2 != null) {
                                            TextInputLayout textInputLayout = (TextInputLayout) a1.b.O(inflate, R.id.til);
                                            if (textInputLayout != null) {
                                                TabLayout tabLayout = (TabLayout) a1.b.O(inflate, R.id.tl_folder_layout);
                                                if (tabLayout != null) {
                                                    TabLayout tabLayout2 = (TabLayout) a1.b.O(inflate, R.id.tl_new_note_cursor_position);
                                                    if (tabLayout2 != null) {
                                                        TabLayout tabLayout3 = (TabLayout) a1.b.O(inflate, R.id.tl_open_notes_in);
                                                        if (tabLayout3 != null) {
                                                            if (((MaterialTextView) a1.b.O(inflate, R.id.tv_folder_color)) != null) {
                                                                if (((MaterialTextView) a1.b.O(inflate, R.id.tv_folder_layout)) != null) {
                                                                    MaterialTextView materialTextView2 = (MaterialTextView) a1.b.O(inflate, R.id.tv_folder_title);
                                                                    if (materialTextView2 != null) {
                                                                        if (((MaterialTextView) a1.b.O(inflate, R.id.tv_new_note_cursor_position)) != null) {
                                                                            if (((MaterialTextView) a1.b.O(inflate, R.id.tv_note_preview_size)) != null) {
                                                                                if (((MaterialTextView) a1.b.O(inflate, R.id.tv_open_notes_in)) != null) {
                                                                                    MaterialTextView materialTextView3 = (MaterialTextView) a1.b.O(inflate, R.id.tv_parent_folder);
                                                                                    if (materialTextView3 != null) {
                                                                                        MaterialTextView materialTextView4 = (MaterialTextView) a1.b.O(inflate, R.id.tv_parent_folder_option);
                                                                                        if (materialTextView4 != null) {
                                                                                            y yVar = new y(coordinatorLayout, materialButton, textInputEditText, nestedScrollView, epoxyRecyclerView, slider, materialSwitch, materialToolbar2, textInputLayout, tabLayout, tabLayout2, tabLayout3, materialTextView2, materialTextView3, materialTextView4);
                                                                                            f7.c.f(this);
                                                                                            j();
                                                                                            epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(0));
                                                                                            boolean z11 = true;
                                                                                            epoxyRecyclerView.setClipToOutline(true);
                                                                                            epoxyRecyclerView.setEdgeEffectFactory(new f7.e());
                                                                                            if (a0().f18667a != -1) {
                                                                                                z10 = true;
                                                                                            } else {
                                                                                                z10 = false;
                                                                                            }
                                                                                            if (z10) {
                                                                                                materialTextView = materialTextView3;
                                                                                                i10 = 0;
                                                                                            } else {
                                                                                                materialTextView = materialTextView3;
                                                                                                i10 = 8;
                                                                                            }
                                                                                            materialTextView.setVisibility(i10);
                                                                                            if (a0().f18667a == -1) {
                                                                                                z11 = false;
                                                                                            }
                                                                                            if (z11) {
                                                                                                i11 = 0;
                                                                                            } else {
                                                                                                i11 = 8;
                                                                                            }
                                                                                            materialTextView4.setVisibility(i11);
                                                                                            long j10 = a0().f18667a;
                                                                                            if (j10 == 0) {
                                                                                                Context j11 = j();
                                                                                                if (j11 != null) {
                                                                                                    str4 = f7.q.f(j11, R.string.new_folder, new Object[0]);
                                                                                                } else {
                                                                                                    str4 = null;
                                                                                                }
                                                                                                materialToolbar = materialToolbar2;
                                                                                                materialToolbar.setTitle(str4);
                                                                                                textInputEditText.requestFocus();
                                                                                                s c = c();
                                                                                                if (c != null) {
                                                                                                    v7.g.e(coordinatorLayout, "root");
                                                                                                    ViewUtilsKt.v(c, coordinatorLayout);
                                                                                                }
                                                                                                j2 = j();
                                                                                                if (j2 != null) {
                                                                                                    i12 = R.string.create_folder;
                                                                                                    str3 = f7.q.f(j2, i12, new Object[0]);
                                                                                                }
                                                                                                str3 = null;
                                                                                            } else {
                                                                                                materialToolbar = materialToolbar2;
                                                                                                int i14 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
                                                                                                Context j12 = j();
                                                                                                if (i14 == 0) {
                                                                                                    if (j12 != null) {
                                                                                                        str2 = f7.q.f(j12, R.string.edit_folder, new Object[0]);
                                                                                                    } else {
                                                                                                        str2 = null;
                                                                                                    }
                                                                                                    materialToolbar.setTitle(str2);
                                                                                                    textInputLayout.setVisibility(8);
                                                                                                    materialTextView2.setVisibility(8);
                                                                                                    j2 = j();
                                                                                                    if (j2 != null) {
                                                                                                        i12 = R.string.update_folder;
                                                                                                        str3 = f7.q.f(j2, i12, new Object[0]);
                                                                                                    }
                                                                                                    str3 = null;
                                                                                                } else {
                                                                                                    if (j12 != null) {
                                                                                                        str = f7.q.f(j12, R.string.edit_folder, new Object[0]);
                                                                                                    } else {
                                                                                                        str = null;
                                                                                                    }
                                                                                                    materialToolbar.setTitle(str);
                                                                                                    j2 = j();
                                                                                                }
                                                                                            }
                                                                                            materialButton.setText(str3);
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NewFolderFragment$setupState$1(this, yVar, null), b0().k()), ma.i.z(this));
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NewFolderFragment$setupState$2(this, yVar, null), a1.b.m(b0().f8433l)), ma.i.z(this));
                                                                                            kotlinx.coroutines.flow.f.b(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new NewFolderFragment$setupState$3(this, yVar, null), a1.b.m(b0().f8437q)), ma.i.z(this));
                                                                                            materialToolbar.setOnClickListener(new x6.o(2, yVar));
                                                                                            s c10 = c();
                                                                                            if (c10 != null && (onBackPressedDispatcher = c10.f417p) != null) {
                                                                                                a1.b.j(onBackPressedDispatcher, null, new NewFolderFragment$setupListeners$2(this), 3);
                                                                                            }
                                                                                            materialToolbar.setNavigationOnClickListener(new x6.n(3, this));
                                                                                            materialTextView4.setOnClickListener(new o6.c(3, this));
                                                                                            materialButton.setOnClickListener(new a(yVar, 2, this));
                                                                                            v7.g.e(coordinatorLayout, "root");
                                                                                            return coordinatorLayout;
                                                                                        }
                                                                                        i13 = R.id.tv_parent_folder_option;
                                                                                    } else {
                                                                                        i13 = R.id.tv_parent_folder;
                                                                                    }
                                                                                } else {
                                                                                    i13 = R.id.tv_open_notes_in;
                                                                                }
                                                                            } else {
                                                                                i13 = R.id.tv_note_preview_size;
                                                                            }
                                                                        } else {
                                                                            i13 = R.id.tv_new_note_cursor_position;
                                                                        }
                                                                    } else {
                                                                        i13 = R.id.tv_folder_title;
                                                                    }
                                                                } else {
                                                                    i13 = R.id.tv_folder_layout;
                                                                }
                                                            } else {
                                                                i13 = R.id.tv_folder_color;
                                                            }
                                                        } else {
                                                            i13 = R.id.tl_open_notes_in;
                                                        }
                                                    } else {
                                                        i13 = R.id.tl_new_note_cursor_position;
                                                    }
                                                } else {
                                                    i13 = R.id.tl_folder_layout;
                                                }
                                            } else {
                                                i13 = R.id.til;
                                            }
                                        } else {
                                            i13 = R.id.tb;
                                        }
                                    } else {
                                        i13 = R.id.sw_show_note_creation_date;
                                    }
                                } else {
                                    i13 = R.id.s_note_preview_size;
                                }
                            } else {
                                i13 = R.id.rv;
                            }
                        } else {
                            i13 = R.id.nsv;
                        }
                    } else {
                        i13 = R.id.ll;
                    }
                } else {
                    i13 = R.id.et;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i13)));
    }
}
