public class PreSW2 {
    public static void main(String[] args) {
        String perpetual = "perpetual";  
        String perp = "";   
         
        if (perpetual.length() > 4) 
        {
            perp = perpetual.substring(0, 4);
        } 
        else
        {
            perp = perpetual;
        }
         
        System.out.println(perp);
    } 
}