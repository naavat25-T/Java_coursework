public class SnippetB {
    public void main(String[]args){
int option = 2;

switch (option) {
    case 1:
        System.out.println("Deposit");
        break;

    case 2:
        System.out.println("Withdraw");
        break;

    case 3:
        System.out.println("Balance");
        break;

    default:
        System.out.println("Invalid option.");
}
    }
}