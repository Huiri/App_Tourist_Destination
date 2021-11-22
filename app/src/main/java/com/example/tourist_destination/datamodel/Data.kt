package com.example.tourist_destination.datamodel

import android.os.Parcel
import android.os.Parcelable
data class Data(val type : Int, val img:Int, val title:String, val sub :String){

    companion object {
        const val TOUR = 0
        const val RES = 1
        const val HOTEL = 2
    }
}
//class Data(val img: Int, val title: String?, val sub: String?) : Parcelable {
//    /* : Parcelable에서 Alt + Enter하여 내용을 implement한다. */
//
//    constructor(parcel: Parcel) : this(
//        parcel.readInt(),
//        parcel.readString(),
//        parcel.readString()) {
//    }
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeInt(img)
//        parcel.writeString(title)
//        parcel.writeString(sub)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<Data> {
//        override fun createFromParcel(parcel: Parcel): Data {
//            return Data(parcel)
//        }
//
//        override fun newArray(size: Int): Array<Data?> {
//            return arrayOfNulls(size)
//        }
//    }
//}
