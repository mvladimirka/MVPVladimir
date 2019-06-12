package hr.tvz.android.listavladimir;

import android.os.Parcel;
import android.os.Parcelable;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

//@Table(database = Model.class)
public class ModelClass extends BaseModel implements Parcelable {

    @Column
    @PrimaryKey(autoincrement = true)
    public Long id;
    @Column
    public String imageResource;
    @Column
    public String title;
    @Column
    public String body;

    public ModelClass(){
        this.id = null;
        this.imageResource = null;
        this.title = null;
        this.body = null;
    }

    public ModelClass( String title, String body, String imageResource) {
        this.id = null;
        this.imageResource = imageResource;
        this.title = title;
        this.body = body;
    }

    protected ModelClass(Parcel in) {
        id = in.readLong();
        imageResource = in.readString();
        title = in.readString();
        body = in.readString();
    }

    public static final Creator<ModelClass> CREATOR = new Creator<ModelClass>() {
        @Override
        public ModelClass createFromParcel(Parcel in) {
            return new ModelClass(in);
        }

        @Override
        public ModelClass[] newArray(int size) {
            return new ModelClass[size];
        }
    };

    public String getImageResource() {
        return String.valueOf(imageResource);
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }



    @Override
    public int describeContents() {
       // return 0;
        return this.id.hashCode()
                ^ this.imageResource.hashCode()
                ^ this.title.hashCode()
                ^ this.body.hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(id);
        parcel.writeString(imageResource);
        parcel.writeString(title);
        parcel.writeString(body);
    }

    public String imageResource()
    { return imageResource;
    }
}