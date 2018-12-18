package com.example.logonrmlocal.uzapzap.ui.chamadas


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.logonrmlocal.uzapzap.R
import com.example.logonrmlocal.uzapzap.ui.base.BaseFragment



/**
 * A simple [Fragment] subclass.
 *
 */
    class ChamadasFragment : BaseFragment() {
    override fun getTitulo(): Int {
        return R.string.tab_chamada
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chamadas, container, false)
    }


}
