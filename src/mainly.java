public class mainly {
    public static void main(String[] args) throws Exception {
        IdsAndPasswords idspasswords = new IdsAndPasswords(); 

        ///we are going to fetch the hashmap as an argument into the login page
        LoginPage loginPage = new LoginPage(idspasswords.getLoginInfo());
    }

}
