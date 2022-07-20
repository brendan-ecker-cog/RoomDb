package com.example.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface PersonDAO {

    @Query("SELECT * FROM PERSON ORDER BY ID")
    List<Person> loadAllPersons();

    @Insert
    void insertPerson(Person person);

    @Update
    void updatePerson(Person person);

    @Delete
    void delete(Person person);

    @Query("SELECT * FROM PERSON WHERE id = :id")
    Person loadPersonById(int id);

    @Query("SELECT * FROM PERSON WHERE name = :name")
    Person loadPersonByName(String name);
}