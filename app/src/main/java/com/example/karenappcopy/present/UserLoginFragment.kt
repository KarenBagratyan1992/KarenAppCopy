package com.example.karenappcopy.present

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.karenappcopy.databinding.FragmentUserLoginBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserLoginFragment : Fragment() {

    private var binding: FragmentUserLoginBinding? = null
    private val vm: MainViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentUserLoginBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.sendBtn?.setOnClickListener {
            val login = binding?.loginEditText?.text.toString()
            val password = binding?.passwordEditText?.text.toString()
            vm.save(log = login, pass = password)
        }
        binding?.getBtn?.setOnClickListener {
            vm.get()
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}