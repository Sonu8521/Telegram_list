import android.os.Parcel
import android.os.Parcelable

class CustomAdapter() : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CustomAdapter> {
        override fun createFromParcel(parcel: Parcel): CustomAdapter {
            return CustomAdapter(parcel)
        }

        override fun newArray(size: Int): Array<CustomAdapter?> {
            return arrayOfNulls(size)
        }
    }
}