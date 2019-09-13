package de.uni.leipzig.H2Oberfleache.presentation;

import de.uni.leipzig.H2Oberfleache.jdbc.DBConnection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDetails {
    public Boolean autoCommit;
    public String dbName;
    public DBConnection connection;
    public String user;
    public String password;
    public Map<String, List<String>> columnname_tables = new HashMap<>();
    public Map<String, String> ober_untertabelle = new HashMap<>();


    public UserDetails(Boolean autoCommit, String dbName, DBConnection connection, String user, String password){
        this.autoCommit = autoCommit;
        this.dbName = dbName;
        this.connection = connection;
        this.user = user;
        this.password = password;
    }
}
