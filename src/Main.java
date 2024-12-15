public class Main {
    public static void main(String[] args) throws Exception {
        try {
            validation("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch(WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }

    public static void validation(String login, String password, String confirmPassword){
        if(login.length() > 20 || !login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("You can't have this type of login");
        }
        if (password.length() > 20 || !password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException("You can't have this type of password");
        } else if(!password.equals(confirmPassword)) {
            throw new WrongPasswordException("You typed different passwords");
        }
    }
}
