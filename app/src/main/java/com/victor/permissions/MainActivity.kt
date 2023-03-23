package com.victor.permissions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.victor.permissions.databinding.MainActivityBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mBinding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = MainActivityBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)

        mBinding.btn.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v == mBinding.btn){
            // TODO 申请权限
        }
    }
}