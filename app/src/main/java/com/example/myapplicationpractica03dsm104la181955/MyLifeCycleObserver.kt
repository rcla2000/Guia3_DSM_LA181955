package com.example.myapplicationpractica03dsm104la181955

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyLifeCycleObserver : DefaultLifecycleObserver {
    override fun onCreate(lifecycler : LifecycleOwner) {
        super.onCreate(lifecycler)
        Log.d("MyLifeCycleObserver", "onCreate")
    }

    override fun onStart(lifecycler: LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MyLifeCycleObserver", "onStart")
    }

    override fun onPause(lifecycler: LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MyLifeCycleObserver", "onPause")
    }

    override fun onResume(lifecycler: LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MyLifeCycleObserver", "onResume")
    }

    override fun onStop(lifecycler: LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MyLifeCycleObserver", "onStop")
    }

    override fun onDestroy(lifecycler: LifecycleOwner) {
        super.onStart(lifecycler)
        Log.d("MyLifeCycleObserver", "onDestroy")
    }
}