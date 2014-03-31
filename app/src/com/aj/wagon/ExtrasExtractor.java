package com.aj.wagon;

import java.lang.reflect.Field;

import android.os.Bundle;

public class ExtrasExtractor extends Extractor {
	private Bundle extras;

	public ExtrasExtractor(Bundle extras) {
		this.extras = extras;
	}

	boolean extractArrayList(Field field, String key, Object instance, boolean itWorked) {
		try {
			field.set(instance, extras.getStringArrayList(key));
		} catch (Exception e) {
			e.printStackTrace();
			itWorked = false;
		}
		return itWorked;
	}

	boolean extractString(Field field, String key, Object instance, boolean itWorked) {
		try {
			field.set(instance, extras.getString(key));
		} catch (Exception e) {
			e.printStackTrace();
			itWorked = false;
		}
		return itWorked;
	}

	boolean extractInt(Field field, String key, Object instance, boolean itWorked) {
		try {
			field.set(instance, extras.getInt(key));
		} catch (Exception e) {
			e.printStackTrace();
			itWorked = false;
		}
		return itWorked;
	}

	boolean extractFloat(Field field, String key, Object instance, boolean itWorked) {
		try {
			field.set(instance, extras.getFloat(key));
		} catch (Exception e) {
			e.printStackTrace();
			itWorked = false;
		}
		return itWorked;
	}

	boolean extractDouble(Field field, String key, Object instance, boolean itWorked) {
		try {
			field.set(instance, extras.getDouble(key));
		} catch (Exception e) {
			e.printStackTrace();
			itWorked = false;
		}
		return itWorked;
	}

	boolean extractLong(Field field, String key, Object instance, boolean itWorked) {
		try {
			field.set(instance, extras.getLong(key));
		} catch (Exception e) {
			e.printStackTrace();
			itWorked = false;
		}
		return itWorked;
	}
}
