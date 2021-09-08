package com.zachtib.counterexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val mutableCounterValue = MutableLiveData(0)

    val counterValue: LiveData<Int>
        get() = mutableCounterValue

    fun incrementPressed() {
        val previousValue = mutableCounterValue.value ?: 0
        val newValue = previousValue + 1
        mutableCounterValue.value = newValue
    }
}