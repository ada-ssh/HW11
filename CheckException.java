public class CheckException {

    public static void checkThePresenceOfASequence(String numberOfDoc) throws StringException{
        if(!numberOfDoc.toLowerCase().contains("abc")){
            String message = "Документ не содержит такую последовательность!!";
            throw new StringException(message);
        }
    }

    public static void checkStartFrom555(String numberOfDoc) throws StringException{
        if(!numberOfDoc.startsWith("555")){
            String message = "Документ не начинается с 555!!";
            throw new StringException(message);
        }
    }

    public static void checkEndWith1a2b(String numberOfDoc) throws StringException{
        if(!numberOfDoc.endsWith("1a2b")){
            String message = "Документ не заканчивается на 1a2b!!";
            throw new StringException(message);
        }
    }
}
