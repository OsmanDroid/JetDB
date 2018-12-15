package spencerstudios.com.jetdblib;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class JetDB {


    public static void putStringList(Context ctx, ArrayList<String> list, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();
    }

    public static ArrayList<String> getStringList(Context ctx, String key) {
        ArrayList<String> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if (json.isEmpty()) {
            list = new ArrayList<>();
        } else {
            Type type = new TypeToken<ArrayList<String>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }
        return list;
    }

    //-------------------------- List<Integer> ----------------//

    public static void putIntList(Context ctx, ArrayList<Integer> list, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();
    }

    public static ArrayList<Integer> getIntList(Context ctx, String key) {
        ArrayList<Integer> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Integer>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }
        return list;
    }


    //-------------------------- List<Double> ----------------//

    public static void putDoubleList(Context ctx, ArrayList<Double> list, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();
    }

    public static ArrayList<Double> getDoubleList(Context ctx, String key) {
        ArrayList<Double> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Double>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }
        return list;
    }


    //-------------------------- List<Float> ----------------//


    public static void putFloatList(Context ctx, ArrayList<Float> list, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();     // This line is IMPORTANT !!!
    }

    public static ArrayList<Float> getFloatList(Context ctx, String key) {
        ArrayList<Float> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");

        if(json.isEmpty()){
            list = new ArrayList<>();
        }else {
            Type type = new TypeToken<ArrayList<Float>>() {
            }.getType();
            list = gson.fromJson(json, type);
        }
        return list;
    }


    //-------------------------- List<Boolean> ----------------//


    public static void putBooleanList(Context ctx, ArrayList<Boolean> list, String key) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = prefs.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json);
        editor.apply();     // This line is IMPORTANT !!!
    }

    public static ArrayList<Boolean> getBooleanList(Context ctx, String key) {
        ArrayList<Boolean> list;
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        Gson gson = new Gson();
        String json = prefs.getString(key, "");
        if(json.isEmpty()){
            list = new ArrayList<>();
        }else{
            Type type = new TypeToken<ArrayList<Boolean>>() {
            }.getType();
           list = gson.fromJson(json, type);
        }
        return list;
    }


    //-------------------------- List<Custom> ----------------//


    public static <T> void putListOfObjects(Context ctx, List<T> list, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        editor.putString(key, json).apply();
    }

    public static <T> List<T> getListOfObjects(Context ctx, Class<T> t, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        String content = db.getString(key, "");
        List<T> list;
        Gson gson = new Gson();
        if (content.isEmpty()) {
            list = new ArrayList<>();
        } else {
            Type type = TypeToken.getParameterized(List.class, t).getType();
            list = gson.fromJson(content, type);
        }
        return list;
    }

    //-----------------------string----------------------------------------//

    public static String getString(Context ctx, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        return db.getString(key, "");
    }

    public static void putString(Context ctx, String value, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        editor.putString(key, value).apply();
    }

    //-----------------------int----------------------------------------//

    public static int getInt(Context ctx, String key, int defaultValue) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        return db.getInt(key, defaultValue);
    }

    public static void putInt(Context ctx, int value, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        editor.putInt(key, value).apply();
    }

    //-----------------------float----------------------------------------//

    public static double getFloat(Context ctx, String key, float defaultValue) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        return db.getFloat(key, defaultValue);
    }

    public static void putFloat(Context ctx, float value, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        editor.putFloat(key, value).apply();
    }

    //-----------------------long----------------------------------------//

    public static double getLong(Context ctx, String key, long defaultValue) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        return db.getLong(key, defaultValue);
    }

    public static void putLong(Context ctx, long value, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        editor.putLong(key, value).apply();
    }

    //-----------------------boolean----------------------------------------//

    public static boolean getBoolean(Context ctx, String key, boolean defaultValue) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        return db.getBoolean(key, defaultValue);
    }

    public static void putBoolean(Context ctx, boolean value, String key) {
        SharedPreferences db = PreferenceManager.getDefaultSharedPreferences(ctx);
        SharedPreferences.Editor editor = db.edit();
        editor.putBoolean(key, value).apply();
    }
}
