package decorator.example.third;

public class Main {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        String path = "C:\\Users\\mattr\\OneDrive\\JAVA\\Udemy\\Design Patterns\\Course\\src\\main\\java\\decorator\\example\\third\\OutputDemo.txt";

        DataSourceDecorator encoded = new EncryptionDecorator(new FileDataSource(path));
        DataSource plain = new FileDataSource(path);

        encoded.writeData(salaryRecords);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
