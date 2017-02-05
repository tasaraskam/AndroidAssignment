package gr.hua.dit.androidappproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Tasos Theocharis on 9/1/2017.
 */

public class DatabaseValues extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "DatabaseValues";
    public static final int DATABASE_VERSION = 1;
    public static final String TABLE_NAME = "Values";
    private static int id;
    public static final int KEY_ID = id;
    public static final String KEY_USERID = "userid";
    private static float longitude;
    public static final float KEY_LONGITUDE = longitude;
    private static float latitude;
    public static final float KEY_LATITUDE = latitude;
    public static final String KEY_DT = "dt";
    public static final String SQL_CREATE_QUERY = "CREATE TABLE "+TABLE_NAME+" ("+
            KEY_ID +" INTEGER(11) PRIMARY KEY AUTOINCREMENT, "+
            KEY_USERID+" VARCHAR(10), "+
            KEY_LONGITUDE+" FLOAT "+
            KEY_LATITUDE+ "FLOAT" +
            KEY_DT+ "VARCHAR(20)"+
            ");";

    public DatabaseValues(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    
    public void insertValues(int id, String userid, float longitude, float latitude, String dt) {
        ContentValues values = new ContentValues();
        values.put(String.valueOf(KEY_ID),id);
        values.put(KEY_USERID, userid);
        values.put(String.valueOf(KEY_LONGITUDE), longitude);
        values.put(String.valueOf(KEY_LATITUDE), latitude);
        values.put(KEY_DT, dt);

    }
}
