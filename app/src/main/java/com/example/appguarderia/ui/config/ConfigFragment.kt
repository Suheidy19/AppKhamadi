package com.example.appguarderia.ui.config

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.appguarderia.R
import com.example.appguarderia.databinding.FragmentConfigBinding
import com.example.appguarderia.ui.gallery.GalleryViewModel

class ConfigFragment : Fragment() {
    private var _binding: FragmentConfigBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ConfigViewModel =
            ViewModelProvider(this).get(ConfigViewModel::class.java)

        _binding = FragmentConfigBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textConfig
        ConfigViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}