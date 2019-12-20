package ir.sematec.sematecandroidbasicaban98;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqliteDbHelper extends SQLiteOpenHelper {

    String TABLE_NAME = "Students";

    public SqliteDbHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_QUERY = "CREATE TABLE " + TABLE_NAME + "("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "name TEXT,"
                + "family TEXT,"
                + "grade INTEGER"
                + ")";

        db.execSQL(CREATE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public void insertStIntoDB(String name, String family, int grade) {

        String INSERT_INTO_DB_QUERY = "INSERT INTO " + TABLE_NAME + "(name,family,grade) VALUES("
                + "'" + name + "',"
                + "'" + family + "',"
                + grade
                + ")";

        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(INSERT_INTO_DB_QUERY);

        db.close();
    }


    public String getStNames() {
        String READ_STUDENTS_NAMES = "SELECT name FROM " + TABLE_NAME;
        String result = "";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(READ_STUDENTS_NAMES, null);

        while (cursor.moveToNext()) {
            result = result + cursor.getString(0) + "\n";
        }

        db.close();
        return result;
    }
}
