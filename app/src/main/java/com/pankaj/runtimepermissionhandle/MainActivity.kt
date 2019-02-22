package com.pankaj.runtimepermissionhandle

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pankaj.dynamicpermissionhandler.PermissionCallback
import com.pankaj.dynamicpermissionhandler.askPermissions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * To use permission util call askPermission on supportFragmentManager and provide list of
         * permission required
         * */

        supportFragmentManager.askPermissions(
            arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.CAMERA
            ),
            object : PermissionCallback {
                override fun onPermissionGranted() {
                    //Do required operation
                }

                override fun onPermissionDenied(deniedPermissionList: ArrayList<String>) {
                    //Do required operation
                }

                override fun onPermissionDeniedForever() {
                    //Do required operation
                }
            }
        )
    }
}
