package academy.learnprogramming.dependencyinversionprinciple.notinverted;

class MySqlConnection {
    public int connect(){
        return 1;
    }
}

class PasswordReminder {
    private MySqlConnection dbConnection;

    public PasswordReminder(MySqlConnection dbConnection) {
        this.dbConnection = dbConnection;
    }
}

