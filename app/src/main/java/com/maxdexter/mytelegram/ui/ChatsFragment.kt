package com.maxdexter.mytelegram.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.maxdexter.mytelegram.R
import com.maxdexter.mytelegram.databinding.FragmentChatsBinding


class ChatsFragment : Fragment() {
    private lateinit var binding: FragmentChatsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_chats, container, false)



        return binding.root
    }


}