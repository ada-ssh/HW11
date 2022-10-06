public class New {
    String Login;
    String Password;
    String confirmPassword;

    public static void process(String Login, String Password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if(Login.length() >= 20){
            String message = "Логин слишком длинный!! Повторите попытку.";
            throw new WrongLoginException(message);
        }
        if(Password.length() >= 20 | Password.contains(" ") | !Password.contains("[0-9]")){
            String message = "Пароль не соответствует требованиям!! Повторите попытку.";
            throw new WrongPasswordException(message);
        }
        if(!Password.equals(confirmPassword)) {
            String message = "Пароли не совпадают!";
            throw new WrongPasswordException(message);
        }
    }
}
