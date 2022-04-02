package com.example.appguarderia.ui.contacto

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.appguarderia.R
import com.example.appguarderia.databinding.FragmentContactoBinding
import com.example.appguarderia.ui.gallery.GalleryViewModel


class ContactoFragment : Fragment() {
    private var _binding: FragmentContactoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val ContactoViewModel =
            ViewModelProvider(this).get(ContactoViewModel::class.java)

        _binding = FragmentContactoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textContacto
        ContactoViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}