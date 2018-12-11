package lombok;

@Data
public class Mountain{
    @Getter
    private String name;
    private double longitude;
    private String country;

    public static void main(String[] args) {
        Mountain mountain = new Mountain();

    }
}