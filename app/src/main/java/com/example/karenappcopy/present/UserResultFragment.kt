package com.example.karenappcopy.present

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.karenappcopy.R
import com.example.karenappcopy.databinding.FragmentUserResultBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class UserResultFragment : Fragment() {
    private var binding: FragmentUserResultBinding? = null
    private val vm: MainViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user_result, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vm.get()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vm.data.observe(viewLifecycleOwner) { login ->
            binding?.loginTextResultIs?.text = login.login
            vm.data.observe(viewLifecycleOwner) { pass ->
                binding?.passwordTextResultIs?.text = pass.password

            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}