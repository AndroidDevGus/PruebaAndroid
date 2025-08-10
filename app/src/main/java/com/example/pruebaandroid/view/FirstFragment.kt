package com.example.pruebaandroid.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.pruebaandroid.databinding.FragmentFirstBinding
import com.example.pruebaandroid.viewmodel.QuoteViewModel

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    private val cosaViewModel: QuoteViewModel by viewModels()

    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        cosaViewModel.cosaModel.observe(viewLifecycleOwner, Observer {
            binding.textviewFirst.text = it.name
        })

        binding.buttonFirst.setOnClickListener {
            //findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            cosaViewModel.randomCosa()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}