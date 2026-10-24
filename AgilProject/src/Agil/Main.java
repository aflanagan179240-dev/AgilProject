
package Agil;

public class Main {

    public static void main(String[] args) {

        IDandPasswords accounts = new IDandPasswords();

        new LoignPageAgil(accounts.getLoginInfo());

    }
}
