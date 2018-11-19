# JetDB - Super Sonic Shared Preferences

[![](https://jitpack.io/v/Binary-Finery/JetDB.svg)](https://jitpack.io/#Binary-Finery/JetDB)

- min SDK 16 (Android Jellybean 4.1)
- written in Java

Simplified SharedPreferences, do it all in 1 line of code. JetDB goes the extra mile by allowing you to save/retreive ArrayLists and Lists of Objects with a simple, single line of code. It's never been easier.

## Installation

Add this into your root build.gradle file:

```java
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency to your module build.gradle:

```java
dependencies {
	implementation 'com.github.Binary-Finery:JetDB:1.0.1'
}
```

## Example Usage

save List of customs objects:
```java
JetDB.putListOfObjects(context, "usersKey", listObject);
```
get List of custom objects:
```java
List<User> users = JetDB.getListOfObjects(this, "usersKey", User.class);
```
save ArrayList:
```java
JetDB.putStringList(this, listObj, "namesKey");
```
get ArrayList:
```java
ArrayList<String> names = JetDB.getStringList(this, "namesList");
```



