package com.example.workshop02_bottomnavigationbar.ui.userprofile;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.workshop02_bottomnavigationbar.databinding.FragmentUserProfileBinding;

public class UserProfileFragment extends Fragment {

    private FragmentUserProfileBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        UserProfileViewModel userProfileViewModel =
                new ViewModelProvider(this).get(UserProfileViewModel.class);

        binding = FragmentUserProfileBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textUserProfile; // อ้างอิง ID ที่ถูกต้องจาก fragment_user_profile.xml
        userProfileViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}