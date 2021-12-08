package com.kim.pizzaorderapp_kim

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.kim.pizzaorderapp_kim.Datas.Store
import kotlinx.android.synthetic.main.activity_view_store.*
import java.net.URL

class ViewStoreActivity : BaseActivity() {

    lateinit var mStoreData : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store)
        setupEvents()
        setValues()
    }


    override fun setupEvents() {

        callPhoneBtn.setOnClickListener {

            val myUri = Uri.parse("tel : ${mStoreData.phoneNum}")

            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)
        }
    }

    override fun setValues() {

        mStoreData = intent.getSerializableExtra("storeData") as Store

        Glide.with(mContext).load(mStoreData.logoUrl).into(storeLogoImg)

        storeNameTxt.text = mStoreData.name

        storePhoneNumTxt.text = mStoreData.phoneNum

    }
}
