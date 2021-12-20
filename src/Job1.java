import java.io.*;
import java.net.URL;
import java.net.URLConnection;
//995982760:AAG242VgbxQmcJ7OETMBb_YBkR6J3WcbW_A
//1350214150:AAHcf-FMudoA06gO6I3hHI-AlUGuxvYbe2k
public class Job1 {

        public static void main(String[] args) throws IOException {
            sendMessage("1350214150:AAHcf-FMudoA06gO6I3hHI-AlUGuxvYbe2k", "-375366786", "helloWorld");
        }
//https://api.telegram.org/bot1350214150:AAHcf-FMudoA06gO6I3hHI-AlUGuxvYbe2k/sendMessage?chat_id=-375366786&text=helloWorld
    private static void sendMessage(String token, String chat_Id, String message) throws IOException {

        String urlString = "https://api.telegram.org/bot%s/sendMessage?chat_id=%s&text=%s";
        String apiToken = token;
        String chatId = chat_Id;
        String text = message;
        urlString = String.format(urlString, apiToken, chatId, text);
        URL url = new URL(urlString);
        URLConnection conn = url.openConnection();
        StringBuilder sb = new StringBuilder();
        InputStream is = new BufferedInputStream(conn.getInputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String inputLine = "";
        while ((inputLine = br.readLine()) != null) {
            sb.append(inputLine);
        }
        String response = sb.toString();
        System.out.println(response);
    }
}
