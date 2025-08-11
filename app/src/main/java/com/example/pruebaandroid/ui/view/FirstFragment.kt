package com.example.pruebaandroid.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.pruebaandroid.databinding.FragmentFirstBinding
import com.example.pruebaandroid.ui.viewmodel.CosaViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val cosaViewModel: CosaViewModel by viewModels()

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cosaViewModel.onCreate()

        cosaViewModel.cosaModel.observe(viewLifecycleOwner, Observer {
            binding.textviewFirst.text = it.name
        })

        cosaViewModel.isLoading.observe(viewLifecycleOwner, Observer {
            binding.loading.isVisible = it
        })

        binding.buttonFirst.setOnClickListener {
            cosaViewModel.randomCosa()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}